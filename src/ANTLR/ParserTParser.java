package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BEGIN=6, END=7, OUTPUT=8, INPUT=9, 
		IF=10, ELSE=11, DO=12, WHILE=13, FOR=14, COSENO=15, SENO=16, SUMAR=17, 
		RESTAR=18, MULT=19, DIV=20, POW=21, MAYOR=22, MENOR=23, IGUAL=24, DISTINTO=25, 
		OR=26, AND=27, PICHU=28, VARNAME=29, CHAR=30, INT=31, FLOAT=32, WS=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_constante = 2, RULE_valor_constante = 3, 
		RULE_pi = 4, RULE_declarar = 5, RULE_cadena = 6, RULE_entero = 7, RULE_flotante = 8, 
		RULE_asignacion = 9, RULE_terminoVariable = 10, RULE_imprimir = 11, RULE_leer = 12, 
		RULE_expresion = 13, RULE_operacion = 14, RULE_termino = 15, RULE_funcion = 16, 
		RULE_suma = 17, RULE_multiplicacion = 18, RULE_resta = 19, RULE_division = 20, 
		RULE_pow = 21, RULE_cos = 22, RULE_sin = 23, RULE_ciclo = 24, RULE_mientras = 25, 
		RULE_mientrasque = 26, RULE_si = 27, RULE_condicional = 28, RULE_comparacion = 29, 
		RULE_mayor = 30, RULE_menor = 31, RULE_igual = 32, RULE_distinto = 33;
	public static final String[] ruleNames = {
		"program", "statement", "constante", "valor_constante", "pi", "declarar", 
		"cadena", "entero", "flotante", "asignacion", "terminoVariable", "imprimir", 
		"leer", "expresion", "operacion", "termino", "funcion", "suma", "multiplicacion", 
		"resta", "division", "pow", "cos", "sin", "ciclo", "mientras", "mientrasque", 
		"si", "condicional", "comparacion", "mayor", "menor", "igual", "distinto"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'dice'", "'es nivel'", "'{'", "'}'", "'empezar combate'", 
		"'combate finalizado'", "'yo te elijo'", "'mote'", "'si'", "'sino'", "'hacer'", 
		"'mientras'", "'para'", "'cosmog'", "'sentret'", "'es curado por'", "'es atacado por'", 
		"'junto con'", "'debilita'", "'potencia'", null, null, null, null, "'o'", 
		"'y'", "'PICHU'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BEGIN", "END", "OUTPUT", "INPUT", 
		"IF", "ELSE", "DO", "WHILE", "FOR", "COSENO", "SENO", "SUMAR", "RESTAR", 
		"MULT", "DIV", "POW", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "OR", "AND", 
		"PICHU", "VARNAME", "CHAR", "INT", "FLOAT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(68);
				constante();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(BEGIN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case DO:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DO:
				case WHILE:
					{
					setState(83);
					ciclo();
					}
					break;
				case IF:
					{
					setState(84);
					si();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OUTPUT:
			case INPUT:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(87);
					leer();
					}
					break;
				case 2:
					{
					setState(88);
					imprimir();
					}
					break;
				case 3:
					{
					setState(89);
					declarar();
					}
					break;
				case 4:
					{
					setState(90);
					asignacion();
					}
					break;
				}
				setState(93);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstanteContext extends ParserRuleContext {
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			declarar();
			setState(98);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valor_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			pi();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PiContext extends ParserRuleContext {
		public TerminalNode PICHU() { return getToken(ParserTParser.PICHU, 0); }
		public PiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PICHU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclararContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public FlotanteContext flotante() {
			return getRuleContext(FlotanteContext.class,0);
		}
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarar);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				cadena();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				entero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				flotante();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode CHAR() { return getToken(ParserTParser.CHAR, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(VARNAME);
			setState(110);
			match(T__1);
			setState(111);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(VARNAME);
			setState(114);
			match(T__2);
			setState(115);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlotanteContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFlotante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(VARNAME);
			setState(118);
			match(T__2);
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(119);
				match(FLOAT);
				}
				break;
			case 2:
				{
				setState(120);
				expresion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminoVariableContext terminoVariable() {
			return getRuleContext(TerminoVariableContext.class,0);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			terminoVariable();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV))) != 0)) {
				{
				{
				setState(124);
				operacion();
				setState(125);
				termino();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoVariableContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminoVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitTerminoVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoVariableContext terminoVariable() throws RecognitionException {
		TerminoVariableContext _localctx = new TerminoVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_terminoVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(ParserTParser.OUTPUT, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(ParserTParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ParserTParser.CHAR, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(OUTPUT);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(135);
					match(VARNAME);
					}
					break;
				case 2:
					{
					setState(136);
					match(CHAR);
					}
					break;
				case 3:
					{
					setState(137);
					expresion();
					}
					break;
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COSENO) | (1L << SENO) | (1L << PICHU) | (1L << VARNAME) | (1L << CHAR) | (1L << INT) | (1L << FLOAT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ParserTParser.INPUT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(INPUT);
			setState(143);
			match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			termino();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV))) != 0)) {
				{
				{
				setState(146);
				operacion();
				setState(147);
				termino();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operacion);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				suma();
				}
				break;
			case RESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				resta();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				multiplicacion();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				division();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termino);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(VARNAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				valor_constante();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcion);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PICHU:
			case VARNAME:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				pow();
				}
				break;
			case COSENO:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				cos();
				}
				break;
			case SENO:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				sin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode SUMAR() { return getToken(ParserTParser.SUMAR, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(SUMAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicacionContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(ParserTParser.MULT, 0); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(MULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestaContext extends ParserRuleContext {
		public TerminalNode RESTAR() { return getToken(ParserTParser.RESTAR, 0); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(RESTAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(ParserTParser.DIV, 0); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(ParserTParser.POW, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<Valor_constanteContext> valor_constante() {
			return getRuleContexts(Valor_constanteContext.class);
		}
		public Valor_constanteContext valor_constante(int i) {
			return getRuleContext(Valor_constanteContext.class,i);
		}
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(180);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(181);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(182);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(183);
				valor_constante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			match(POW);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(187);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(188);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(189);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(190);
				valor_constante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(COSENO);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(194);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(195);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(196);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(197);
				valor_constante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinContext extends ParserRuleContext {
		public TerminalNode SENO() { return getToken(ParserTParser.SENO, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SENO);
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(201);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(202);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(203);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(204);
				valor_constante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public MientrasqueContext mientrasque() {
			return getRuleContext(MientrasqueContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ciclo);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				mientras();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				mientrasque();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WHILE);
			setState(212);
			condicional();
			setState(213);
			match(T__3);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				statement();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME))) != 0) );
			setState(219);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasqueContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ParserTParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MientrasqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientrasque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientrasque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasqueContext mientrasque() throws RecognitionException {
		MientrasqueContext _localctx = new MientrasqueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mientrasque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(DO);
			setState(222);
			match(T__3);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				statement();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME))) != 0) );
			setState(228);
			match(T__4);
			setState(229);
			match(WHILE);
			setState(230);
			condicional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(IF);
			setState(233);
			condicional();
			setState(234);
			match(T__3);
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				statement();
				}
				}
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME))) != 0) );
			setState(240);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ParserTParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParserTParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			comparacion();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				comparacion();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public MayorContext mayor() {
			return getRuleContext(MayorContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public DistintoContext distinto() {
			return getRuleContext(DistintoContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparacion);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				igual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				distinto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MayorContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(ParserTParser.MAYOR, 0); }
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMayor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			expresion();
			setState(257);
			match(MAYOR);
			setState(258);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenorContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(ParserTParser.MENOR, 0); }
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			expresion();
			setState(261);
			match(MENOR);
			setState(262);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgualContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expresion();
			setState(265);
			match(IGUAL);
			setState(266);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistintoContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DISTINTO() { return getToken(ParserTParser.DISTINTO, 0); }
		public DistintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDistinto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistintoContext distinto() throws RecognitionException {
		DistintoContext _localctx = new DistintoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			expresion();
			setState(269);
			match(DISTINTO);
			setState(270);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\7\2O\n\2\f\2\16"+
		"\2R\13\2\3\2\3\2\3\3\3\3\5\3X\n\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\3\3\3\5\3"+
		"b\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\7\13\u0082"+
		"\n\13\f\13\16\13\u0085\13\13\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u008d\n\r\r\r"+
		"\16\r\u008e\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0098\n\17\f\17\16"+
		"\17\u009b\13\17\3\20\3\20\3\20\3\20\5\20\u00a1\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00a8\n\21\3\22\3\22\3\22\5\22\u00ad\n\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00bb\n\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00c2\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00c9\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\5\31\u00d0\n\31\3\32\3\32\5\32\u00d4\n\32"+
		"\3\33\3\33\3\33\3\33\6\33\u00da\n\33\r\33\16\33\u00db\3\33\3\33\3\34\3"+
		"\34\3\34\6\34\u00e3\n\34\r\34\16\34\u00e4\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\6\35\u00ef\n\35\r\35\16\35\u00f0\3\35\3\35\3\36\3\36\3\36\7"+
		"\36\u00f8\n\36\f\36\16\36\u00fb\13\36\3\37\3\37\3\37\3\37\5\37\u0101\n"+
		"\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\2\2$\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2"+
		"\34\35\2\u011c\2I\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2"+
		"\fm\3\2\2\2\16o\3\2\2\2\20s\3\2\2\2\22w\3\2\2\2\24}\3\2\2\2\26\u0086\3"+
		"\2\2\2\30\u0088\3\2\2\2\32\u0090\3\2\2\2\34\u0093\3\2\2\2\36\u00a0\3\2"+
		"\2\2 \u00a7\3\2\2\2\"\u00ac\3\2\2\2$\u00ae\3\2\2\2&\u00b0\3\2\2\2(\u00b2"+
		"\3\2\2\2*\u00b4\3\2\2\2,\u00ba\3\2\2\2.\u00c3\3\2\2\2\60\u00ca\3\2\2\2"+
		"\62\u00d3\3\2\2\2\64\u00d5\3\2\2\2\66\u00df\3\2\2\28\u00ea\3\2\2\2:\u00f4"+
		"\3\2\2\2<\u0100\3\2\2\2>\u0102\3\2\2\2@\u0106\3\2\2\2B\u010a\3\2\2\2D"+
		"\u010e\3\2\2\2FH\5\6\4\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KI\3\2\2\2LP\7\b\2\2MO\5\4\3\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2QS\3\2\2\2RP\3\2\2\2ST\7\t\2\2T\3\3\2\2\2UX\5\62\32\2VX\58\35\2WU"+
		"\3\2\2\2WV\3\2\2\2Xb\3\2\2\2Y^\5\32\16\2Z^\5\30\r\2[^\5\f\7\2\\^\5\24"+
		"\13\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_`\7\3\2\2`b\3"+
		"\2\2\2aW\3\2\2\2a]\3\2\2\2b\5\3\2\2\2cd\5\f\7\2de\7\3\2\2e\7\3\2\2\2f"+
		"g\5\n\6\2g\t\3\2\2\2hi\7\36\2\2i\13\3\2\2\2jn\5\16\b\2kn\5\20\t\2ln\5"+
		"\22\n\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\r\3\2\2\2op\7\37\2\2pq\7\4\2\2"+
		"qr\7 \2\2r\17\3\2\2\2st\7\37\2\2tu\7\5\2\2uv\7!\2\2v\21\3\2\2\2wx\7\37"+
		"\2\2x{\7\5\2\2y|\7\"\2\2z|\5\34\17\2{y\3\2\2\2{z\3\2\2\2|\23\3\2\2\2}"+
		"\u0083\5\26\f\2~\177\5\36\20\2\177\u0080\5 \21\2\u0080\u0082\3\2\2\2\u0081"+
		"~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\25\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\37\2\2\u0087\27\3"+
		"\2\2\2\u0088\u008c\7\n\2\2\u0089\u008d\7\37\2\2\u008a\u008d\7 \2\2\u008b"+
		"\u008d\5\34\17\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\31\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\37\2\2\u0092\33\3\2\2\2"+
		"\u0093\u0099\5 \21\2\u0094\u0095\5\36\20\2\u0095\u0096\5 \21\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\35\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\5$\23"+
		"\2\u009d\u00a1\5(\25\2\u009e\u00a1\5&\24\2\u009f\u00a1\5*\26\2\u00a0\u009c"+
		"\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\37\3\2\2\2\u00a2\u00a8\5\"\22\2\u00a3\u00a8\7\37\2\2\u00a4\u00a8\7!\2"+
		"\2\u00a5\u00a8\7\"\2\2\u00a6\u00a8\5\b\5\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3"+
		"\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"!\3\2\2\2\u00a9\u00ad\5,\27\2\u00aa\u00ad\5.\30\2\u00ab\u00ad\5\60\31"+
		"\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad#"+
		"\3\2\2\2\u00ae\u00af\7\23\2\2\u00af%\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1"+
		"\'\3\2\2\2\u00b2\u00b3\7\24\2\2\u00b3)\3\2\2\2\u00b4\u00b5\7\26\2\2\u00b5"+
		"+\3\2\2\2\u00b6\u00bb\7!\2\2\u00b7\u00bb\7\"\2\2\u00b8\u00bb\7\37\2\2"+
		"\u00b9\u00bb\5\b\5\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c1\7\27\2\2"+
		"\u00bd\u00c2\7!\2\2\u00be\u00c2\7\"\2\2\u00bf\u00c2\7\37\2\2\u00c0\u00c2"+
		"\5\b\5\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2-\3\2\2\2\u00c3\u00c8\7\21\2\2\u00c4\u00c9\7!\2\2"+
		"\u00c5\u00c9\7\"\2\2\u00c6\u00c9\7\37\2\2\u00c7\u00c9\5\b\5\2\u00c8\u00c4"+
		"\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"/\3\2\2\2\u00ca\u00cf\7\22\2\2\u00cb\u00d0\7!\2\2\u00cc\u00d0\7\"\2\2"+
		"\u00cd\u00d0\7\37\2\2\u00ce\u00d0\5\b\5\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\61\3\2\2\2\u00d1"+
		"\u00d4\5\64\33\2\u00d2\u00d4\5\66\34\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\63\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\u00d7\5:\36\2\u00d7"+
		"\u00d9\7\6\2\2\u00d8\u00da\5\4\3\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\7\7\2\2\u00de\65\3\2\2\2\u00df\u00e0\7\16\2\2\u00e0\u00e2\7\6\2"+
		"\2\u00e1\u00e3\5\4\3\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\7\2\2\u00e7"+
		"\u00e8\7\17\2\2\u00e8\u00e9\5:\36\2\u00e9\67\3\2\2\2\u00ea\u00eb\7\f\2"+
		"\2\u00eb\u00ec\5:\36\2\u00ec\u00ee\7\6\2\2\u00ed\u00ef\5\4\3\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f39\3\2\2\2\u00f4\u00f9\5<\37\2"+
		"\u00f5\u00f6\t\2\2\2\u00f6\u00f8\5<\37\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa;\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u0101\5> \2\u00fd\u0101\5@!\2\u00fe\u0101\5B\"\2"+
		"\u00ff\u0101\5D#\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101=\3\2\2\2\u0102\u0103\5\34\17\2\u0103"+
		"\u0104\7\30\2\2\u0104\u0105\5\34\17\2\u0105?\3\2\2\2\u0106\u0107\5\34"+
		"\17\2\u0107\u0108\7\31\2\2\u0108\u0109\5\34\17\2\u0109A\3\2\2\2\u010a"+
		"\u010b\5\34\17\2\u010b\u010c\7\32\2\2\u010c\u010d\5\34\17\2\u010dC\3\2"+
		"\2\2\u010e\u010f\5\34\17\2\u010f\u0110\7\33\2\2\u0110\u0111\5\34\17\2"+
		"\u0111E\3\2\2\2\32IPW]am{\u0083\u008c\u008e\u0099\u00a0\u00a7\u00ac\u00ba"+
		"\u00c1\u00c8\u00cf\u00d3\u00db\u00e4\u00f0\u00f9\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}