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
		String valor = ctx.getChild(2).getText();

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
				}
				else {
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

			if (i < ctx.getChildCount() - 1) System.out.print(" ");
			else System.out.print("\n");
		}

		return visitChildren(ctx);
	}

	private float calcularExpresion(ParseTree expTree) {
		float resultado = 0;
		int i = 0;

		while(i < expTree.getChildCount()) {
			float subresultado = 0;
			String sumaOResta = "Suma"; // Primer término o expresión siempre se suma
			String operacion = null;

			// Recorrer todas las multiplicaciones y divisiones consecutivas
			while(true) {
				// Obtener Término
				ParseTree node = expTree.getChild(i).getChild(0);
				String tokenName = tokenName(node);
				float value = 0;

				// Caso Variable
				if (tokenName.equals("VARNAME")) {
					String text = node.getText();
					Variable variable = mapaVariables.get(text);

					// Variable no existe o es de tipo STRING
					if (variable == null || variable.getTipo() == Tipo.STRING) return 0;
					
					value = variable.getFloatValue();
				}

				// Caso entero o flotante literal
				if (tokenName.equals("INT") || tokenName.equals("FLOAT")) {
					String text = node.getText();
					value = Float.parseFloat(text);
				}

				// Caso función
				if (tokenName.equals("Funcion")) {
					node = node.getChild(0);
					tokenName = tokenName(node);

					if (tokenName.equals("Pow")) value = calcularPotencia(node);
					if (tokenName.equals("Sin")) value = calcularSeno(node);
					if (tokenName.equals("Cos")) value = calcularCoseno(node);
				}

				// Guardar variable inicial en subresultado
				if (operacion == null) subresultado = value;
				else {
					// Multiplicar o dividir términos siguientes
					if (operacion.equals("Multiplicacion")) subresultado *= value;
					if (operacion.equals("Division")) subresultado /= value;
				}

				i++;
				if (i == expTree.getChildCount()) break;

				// Obtener y guardar operación
				node = expTree.getChild(i).getChild(0);
				operacion = tokenName(node);

				if (operacion.equals("Suma") || operacion.equals("Resta")) break;
				i++;
			}

			// Sumar o restar cantidad acumulada
			if (sumaOResta.equals("Suma")) resultado += subresultado;
			if (sumaOResta.equals("Resta")) resultado -= subresultado;

			sumaOResta = operacion;
			i++;
		}

		return resultado;
	}

	private float calcularPotencia(ParseTree tree) {
		ParseTree base = tree.getChild(0);
		ParseTree exp = tree.getChild(2);
		float valorBase, valorExp;

		if (tokenName(base).equals("VARNAME")) {
			Variable varBase = mapaVariables.get(base.getText());
			if (varBase == null || varBase.getTipo() == Tipo.STRING) return 0;
			valorBase = varBase.getFloatValue();
		}
		else valorBase = Util.parseFloat(base.getText());

		if (tokenName(exp).equals("VARNAME")) {
			Variable varExp = mapaVariables.get(exp.getText());
			if (varExp == null || varExp.getTipo() == Tipo.STRING) return 0;
			valorExp = varExp.getFloatValue();
		}
		else valorExp = Util.parseFloat(exp.getText());

		return (float) Math.pow(valorBase, valorExp);
	}

	private float calcularSeno(ParseTree tree) {
		ParseTree node = tree.getChild(1);
		float valor;

		if (tokenName(node).equals("VARNAME")) {
			Variable variable = mapaVariables.get(node.getText());
			if (variable == null || variable.getTipo() == Tipo.STRING) return 0;
			valor = variable.getFloatValue();
		}
		else valor = Util.parseFloat(node.getText());

		return (float) Math.sin(valor);
	}

	private float calcularCoseno(ParseTree tree) {
		ParseTree node = tree.getChild(1);
		float valor;

		if (tokenName(node).equals("VARNAME")) {
			Variable variable = mapaVariables.get(node.getText());
			if (variable == null || variable.getTipo() == Tipo.STRING) return 0;
			valor = variable.getFloatValue();
		}
		else valor = Util.parseFloat(node.getText());

		return (float) Math.cos(valor);
	}

}