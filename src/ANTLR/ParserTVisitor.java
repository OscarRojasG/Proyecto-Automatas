package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(ParserTParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(ParserTParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(ParserTParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(ParserTParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#flotante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlotante(ParserTParser.FlotanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(ParserTParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(ParserTParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(ParserTParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(ParserTParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(ParserTParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientrasque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientrasque(ParserTParser.MientrasqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(ParserTParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(ParserTParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(ParserTParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(ParserTParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(ParserTParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinto(ParserTParser.DistintoContext ctx);
}