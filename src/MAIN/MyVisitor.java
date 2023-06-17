package MAIN;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Locale;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTLexer;
import ANTLR.ParserTParser;
import Variables.Var;
import Variables.VarEntero;
import Variables.VarFlotante;
import Variables.VarString;

public class MyVisitor extends ParserTBaseVisitor<Integer> {
	private HashMap<String, Var> mapaVariables = new HashMap<String, Var>();

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
		VarString varString = new VarString(nombre, valor);
		mapaVariables.put(nombre, varString);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitEntero(ParserTParser.EnteroContext ctx) {
		String nombre = ctx.getChild(0).getText();
		int valor = Integer.parseInt(ctx.getChild(2).getText());

		// Crear variable e insertarla en el mapa
		VarEntero varEntero = new VarEntero(nombre, valor);
		mapaVariables.put(nombre, varEntero);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitFlotante(ParserTParser.FlotanteContext ctx) {
		String nombre = ctx.getChild(0).getText();
		String strVal = ctx.getChild(2).getText();

		// Convertir string a float
		NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
		float valor = 0;

		try {
			Number number = format.parse(strVal);
			valor = number.floatValue();
		} catch(ParseException e) {
			e.printStackTrace();
		}

		// Crear variable e insertarla en el mapa
		VarFlotante varFlotante = new VarFlotante(nombre, valor);
		mapaVariables.put(nombre, varFlotante);

		return visitChildren(ctx);
	}

	@Override
	public Integer visitImprimir(ParserTParser.ImprimirContext ctx) {
		for (int i = 1; i < ctx.getChildCount(); i++) {
			String tokenName = tokenName(ctx.getChild(i));
			String text = ctx.getChild(i).getText();

			// Token es una variable
			if (tokenName.equals("VARNAME")) {
				Var var = mapaVariables.get(text);
				if (var == null) {
					System.out.print("null");
					continue;
				}

				// Obtener valor de la variable como String
				text = var.getString();
			} 
			// Token es un string literal
			else {
				// Quitar comillas
				text = text.substring(1, text.length() - 1);
			}

			// Imprimir token
			System.out.print(text);

			if (i < ctx.getChildCount() - 1) System.out.print(" ");
			else System.out.print("\n");
		}

		return visitChildren(ctx);
	}
}
