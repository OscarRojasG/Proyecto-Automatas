package MAIN;

import java.util.HashMap;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTLexer;
import ANTLR.ParserTParser;
import Util.Util;
import Variables.Tipo;
import Variables.Variable;

public class MyVisitor extends ParserTBaseVisitor<Integer> {
	private HashMap<String, Variable> mapaVariables = new HashMap<String, Variable>();

	public String tokenName(Object nodo) {
		if (nodo instanceof TerminalNode) {
			TerminalNode nodoTerminal = ((TerminalNode) nodo);
			return ParserTLexer.VOCABULARY.getSymbolicName(nodoTerminal.getSymbol().getType());
		}
		RuleContext nodoTerminal = (RuleContext) nodo;
		String nombre = nodoTerminal.getClass().getSimpleName();
		return nombre.substring(0, nombre.length() - 7);
	}

	@Override
	public Integer visitCadena(ParserTParser.CadenaContext ctx) {
		String nombre = ctx.getChild(0).getText();
		String valor = ctx.getChild(2).getText();

		// Quitar comillas
		valor = valor.substring(1, valor.length() - 1);

		// Crear variable e insertarla en el mapa
		Variable variable = new Variable(nombre, valor, Tipo.STRING);
		mapaVariables.put(nombre, variable);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitEntero(ParserTParser.EnteroContext ctx) {
		String nombre = ctx.getChild(0).getText();
		String valor = ctx.getChild(2).getText();

		// Crear variable e insertarla en el mapa
		Variable variable = new Variable(nombre, valor, Tipo.ENTERO);
		mapaVariables.put(nombre, variable);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitFlotante(ParserTParser.FlotanteContext ctx) {
		String nombre = ctx.getChild(0).getText();
		ParseTree node = ctx.getChild(2);
		String tokenName = tokenName(node);
		String valor = null;

		if (tokenName.equals("FLOAT")) 
			valor = node.getText();
		if (tokenName.equals("Expresion"))
			valor = String.valueOf(calcularExpresion(node));

		Variable variable = new Variable(nombre, valor, Tipo.FLOTANTE);
		mapaVariables.put(nombre, variable);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitImprimir(ParserTParser.ImprimirContext ctx) {
		for (int i = 1; i < ctx.getChildCount(); i++) {
			String tokenName = tokenName(ctx.getChild(i));
			String text = ctx.getChild(i).getText();

			// Token es una variable
			if (tokenName.equals("VARNAME")) {
				Variable variable = mapaVariables.get(text);
				if (variable == null) {
					text = "null";
				} else {
					text = variable.getStrValue();
				}
			}
			// Token es una expresión matemática
			else if (tokenName.equals("Expresion")) {
				text = String.valueOf(calcularExpresion(ctx.getChild(i)));
			}
			// Token es un string literal
			else {
				text = text.substring(1, text.length() - 1); // Quitar comillas
			}

			// Imprimir token
			System.out.print(text);

			if (i < ctx.getChildCount() - 1)
				System.out.print(" ");
			else
				System.out.print("\n");
		}

		return visitChildren(ctx);
	}

	@Override
	public Integer visitAsignacion(ParserTParser.AsignacionContext ctx) {
		String nombre = ctx.getChild(0).getText();
		Variable variable = mapaVariables.get(nombre);
		if (variable == null || variable.getTipo() == Tipo.STRING)
			return visitChildren(ctx);

		float nuevoValor = calcularExpresion(ctx);
		variable.setValor(nuevoValor);

		return visitChildren(ctx);
	}

	private float calcularExpresion(ParseTree expTree) {
		String sumaOResta = "Suma"; // Primer término o expresión siempre se suma
		float resultado = 0;
		int i = 0;

		while (i < expTree.getChildCount()) {
			float subresultado = 0;
			String operacion = null;

			// Recorrer todas las multiplicaciones y divisiones consecutivas
			while (true) {
				// Obtener Término
				ParseTree node = expTree.getChild(i).getChild(0);
				float value = obtenerValorTermino(node);

				// Guardar variable inicial en subresultado
				if (operacion == null)
					subresultado = value;
				else {
					// Multiplicar o dividir términos siguientes
					if (operacion.equals("Multiplicacion"))
						subresultado *= value;
					if (operacion.equals("Division"))
						subresultado /= value;
				}

				i++;
				if (i == expTree.getChildCount())
					break;

				// Obtener y guardar operación
				node = expTree.getChild(i).getChild(0);
				operacion = tokenName(node);

				if (operacion.equals("Suma") || operacion.equals("Resta"))
					break;
				i++;
			}

			// Sumar o restar cantidad acumulada
			if (sumaOResta.equals("Suma"))
				resultado += subresultado;
			if (sumaOResta.equals("Resta"))
				resultado -= subresultado;

			sumaOResta = operacion;
			i++;
		}

		return resultado;
	}

	private float calcularPotencia(ParseTree tree) {
		ParseTree base = tree.getChild(0);
		ParseTree exp = tree.getChild(2);
		float valorBase = obtenerValorTermino(base);
		float valorExp = obtenerValorTermino(exp);

		return (float) Math.pow(valorBase, valorExp);
	}

	private float calcularSeno(ParseTree tree) {
		ParseTree node = tree.getChild(1);
		float valor = obtenerValorTermino(node);
		return (float) Math.sin(valor);
	}

	private float calcularCoseno(ParseTree tree) {
		ParseTree node = tree.getChild(1);
		float valor = obtenerValorTermino(node);
		return (float) Math.cos(valor);
	}

	private float obtenerValorTermino(ParseTree node) {
		String tokenName = tokenName(node);

		// Caso variable
		if (tokenName.equals("VARNAME")) {
			Variable variable = mapaVariables.get(node.getText());
			if (variable == null || variable.getTipo() == Tipo.STRING)
				return 0;
			return variable.getNumericValue();
		}

		// Caso constante predefinida
		if (tokenName.equals("Valor_constante")) {
			tokenName = tokenName(node.getChild(0));
			return obtenerValorConstante(tokenName);
		}

		// Caso entero o flotante literal
		if (tokenName.equals("INT") || tokenName(node).equals("FLOAT")) {
			return Util.parseFloat(node.getText());
		}

		// Caso función
		if (tokenName.equals("Funcion")) {
			node = node.getChild(0);
			tokenName = tokenName(node);

			if (tokenName.equals("Pow"))
				return calcularPotencia(node);
			if (tokenName.equals("Sin"))
				return calcularSeno(node);
			if (tokenName.equals("Cos"))
				return calcularCoseno(node);
		}

		return 0;
	}

	private float obtenerValorConstante(String name) {
		switch (name) {
			case "Pi":
				return (float) Math.PI;
		}
		return 0;
	}

}