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
		OR=26, AND=27, PICHU=28, MEW=29, MEWTWO=30, VARNAME=31, CHAR=32, INT=33, 
		FLOAT=34, WS=35;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_constante = 2, RULE_valor_constante = 3, 
		RULE_pi = 4, RULE_declarar = 5, RULE_cadena = 6, RULE_entero = 7, RULE_flotante = 8, 
		RULE_declarar_operacion = 9, RULE_imprimir = 10, RULE_leer = 11, RULE_expresion = 12, 
		RULE_operacion = 13, RULE_termino = 14, RULE_funcion = 15, RULE_suma = 16, 
		RULE_multiplicacion = 17, RULE_resta = 18, RULE_division = 19, RULE_pow = 20, 
		RULE_cos = 21, RULE_sin = 22, RULE_ciclo = 23, RULE_mientras = 24, RULE_mientrasque = 25, 
		RULE_si = 26, RULE_condicional = 27, RULE_comparacion = 28, RULE_mayor = 29, 
		RULE_menor = 30, RULE_igual = 31, RULE_distinto = 32;
	public static final String[] ruleNames = {
		"program", "statement", "constante", "valor_constante", "pi", "declarar", 
		"cadena", "entero", "flotante", "declarar_operacion", "imprimir", "leer", 
		"expresion", "operacion", "termino", "funcion", "suma", "multiplicacion", 
		"resta", "division", "pow", "cos", "sin", "ciclo", "mientras", "mientrasque", 
		"si", "condicional", "comparacion", "mayor", "menor", "igual", "distinto"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dice'", "'es nivel'", "'es igual a'", "'{'", "'}'", "'empezar combate'", 
		"'combate finalizado'", "'yo te elijo'", "'mote'", "'si'", "'sino'", "'hacer'", 
		"'mientras'", "'para'", "'cosmog'", "'sentret'", "'es curado por'", "'es atacado por'", 
		"'junto con'", "'debilita'", "'potencia'", null, null, null, null, "'o'", 
		"'y'", "'PICHU'", "'inf'", "'-inf'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BEGIN", "END", "OUTPUT", "INPUT", 
		"IF", "ELSE", "DO", "WHILE", "FOR", "COSENO", "SENO", "SUMAR", "RESTAR", 
		"MULT", "DIV", "POW", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "OR", "AND", 
		"PICHU", "MEW", "MEWTWO", "VARNAME", "CHAR", "INT", "FLOAT", "WS"
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(66);
				constante();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(BEGIN);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(73);
				statement();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMAR:
			case RESTAR:
			case MULT:
			case DIV:
				{
				setState(81);
				operacion();
				}
				break;
			case DO:
			case WHILE:
				{
				setState(82);
				ciclo();
				}
				break;
			case IF:
				{
				setState(83);
				si();
				}
				break;
			case INPUT:
				{
				setState(84);
				leer();
				}
				break;
			case OUTPUT:
				{
				setState(85);
				imprimir();
				}
				break;
			case VARNAME:
				{
				setState(86);
				declarar();
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
			setState(89);
			declarar();
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
			setState(91);
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
			setState(93);
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
		public Declarar_operacionContext declarar_operacion() {
			return getRuleContext(Declarar_operacionContext.class,0);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				cadena();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				entero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				flotante();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				declarar_operacion();
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
			setState(101);
			match(VARNAME);
			setState(102);
			match(T__0);
			setState(103);
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
			setState(105);
			match(VARNAME);
			setState(106);
			match(T__1);
			setState(107);
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
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
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
			setState(109);
			match(VARNAME);
			setState(110);
			match(T__1);
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(111);
				match(FLOAT);
				}
				break;
			case PICHU:
				{
				setState(112);
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

	public static class Declarar_operacionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Declarar_operacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclarar_operacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_operacionContext declarar_operacion() throws RecognitionException {
		Declarar_operacionContext _localctx = new Declarar_operacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarar_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(VARNAME);
			setState(116);
			match(T__2);
			setState(117);
			operacion();
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
		enterRule(_localctx, 20, RULE_imprimir);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(OUTPUT);
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(120);
						match(VARNAME);
						}
						break;
					case 2:
						{
						setState(121);
						match(CHAR);
						}
						break;
					case 3:
						{
						setState(122);
						expresion();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(INPUT);
			setState(128);
			declarar();
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
		enterRule(_localctx, 24, RULE_expresion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			termino();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					operacion();
					setState(132);
					termino();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 26, RULE_operacion);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				suma();
				}
				break;
			case RESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				resta();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				multiplicacion();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
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
		enterRule(_localctx, 28, RULE_termino);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(VARNAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
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
		enterRule(_localctx, 30, RULE_funcion);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PICHU:
			case VARNAME:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				pow();
				}
				break;
			case COSENO:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				cos();
				}
				break;
			case SENO:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
		enterRule(_localctx, 32, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 34, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
		enterRule(_localctx, 36, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 38, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 40, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(165);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(166);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(167);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(168);
				valor_constante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			match(POW);
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(172);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(173);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(174);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(175);
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
		enterRule(_localctx, 42, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(COSENO);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(179);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(180);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(181);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(182);
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
		enterRule(_localctx, 44, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(SENO);
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(186);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(187);
				match(FLOAT);
				}
				break;
			case VARNAME:
				{
				setState(188);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(189);
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
		enterRule(_localctx, 46, RULE_ciclo);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				mientras();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
		enterRule(_localctx, 48, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(WHILE);
			setState(197);
			condicional();
			setState(198);
			match(T__3);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0) );
			setState(204);
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
		enterRule(_localctx, 50, RULE_mientrasque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(DO);
			setState(207);
			match(T__3);
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				statement();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0) );
			setState(213);
			match(T__4);
			setState(214);
			match(WHILE);
			setState(215);
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
		enterRule(_localctx, 52, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IF);
			setState(218);
			condicional();
			setState(219);
			match(T__3);
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				statement();
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0) );
			setState(225);
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
		enterRule(_localctx, 54, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			comparacion();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(228);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				comparacion();
				}
				}
				setState(234);
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
		enterRule(_localctx, 56, RULE_comparacion);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				igual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
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
		enterRule(_localctx, 58, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expresion();
			setState(242);
			match(MAYOR);
			setState(243);
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
		enterRule(_localctx, 60, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expresion();
			setState(246);
			match(MENOR);
			setState(247);
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
		enterRule(_localctx, 62, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			expresion();
			setState(250);
			match(IGUAL);
			setState(251);
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
		enterRule(_localctx, 64, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expresion();
			setState(254);
			match(DISTINTO);
			setState(255);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\nt\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\6\f~\n\f\r\f\16\f\177"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0089\n\16\f\16\16\16\u008c\13\16"+
		"\3\17\3\17\3\17\3\17\5\17\u0092\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0099"+
		"\n\20\3\21\3\21\3\21\5\21\u009e\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\5\26\u00ac\n\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00b3\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00ba\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u00c1\n\30\3\31\3\31\5\31\u00c5\n\31\3\32\3\32\3\32\3\32"+
		"\6\32\u00cb\n\32\r\32\16\32\u00cc\3\32\3\32\3\33\3\33\3\33\6\33\u00d4"+
		"\n\33\r\33\16\33\u00d5\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\6\34\u00e0"+
		"\n\34\r\34\16\34\u00e1\3\34\3\34\3\35\3\35\3\35\7\35\u00e9\n\35\f\35\16"+
		"\35\u00ec\13\35\3\36\3\36\3\36\3\36\5\36\u00f2\n\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\3\3\2\34\35\2\u010e\2"+
		"G\3\2\2\2\4Y\3\2\2\2\6[\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fe\3\2\2\2\16g\3"+
		"\2\2\2\20k\3\2\2\2\22o\3\2\2\2\24u\3\2\2\2\26y\3\2\2\2\30\u0081\3\2\2"+
		"\2\32\u0084\3\2\2\2\34\u0091\3\2\2\2\36\u0098\3\2\2\2 \u009d\3\2\2\2\""+
		"\u009f\3\2\2\2$\u00a1\3\2\2\2&\u00a3\3\2\2\2(\u00a5\3\2\2\2*\u00ab\3\2"+
		"\2\2,\u00b4\3\2\2\2.\u00bb\3\2\2\2\60\u00c4\3\2\2\2\62\u00c6\3\2\2\2\64"+
		"\u00d0\3\2\2\2\66\u00db\3\2\2\28\u00e5\3\2\2\2:\u00f1\3\2\2\2<\u00f3\3"+
		"\2\2\2>\u00f7\3\2\2\2@\u00fb\3\2\2\2B\u00ff\3\2\2\2DF\5\6\4\2ED\3\2\2"+
		"\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\7\b\2\2KM\5\4\3"+
		"\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\t\2"+
		"\2R\3\3\2\2\2SZ\5\34\17\2TZ\5\60\31\2UZ\5\66\34\2VZ\5\30\r\2WZ\5\26\f"+
		"\2XZ\5\f\7\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2"+
		"\2Z\5\3\2\2\2[\\\5\f\7\2\\\7\3\2\2\2]^\5\n\6\2^\t\3\2\2\2_`\7\36\2\2`"+
		"\13\3\2\2\2af\5\16\b\2bf\5\20\t\2cf\5\22\n\2df\5\24\13\2ea\3\2\2\2eb\3"+
		"\2\2\2ec\3\2\2\2ed\3\2\2\2f\r\3\2\2\2gh\7!\2\2hi\7\3\2\2ij\7\"\2\2j\17"+
		"\3\2\2\2kl\7!\2\2lm\7\4\2\2mn\7#\2\2n\21\3\2\2\2op\7!\2\2ps\7\4\2\2qt"+
		"\7$\2\2rt\5\b\5\2sq\3\2\2\2sr\3\2\2\2t\23\3\2\2\2uv\7!\2\2vw\7\5\2\2w"+
		"x\5\34\17\2x\25\3\2\2\2y}\7\n\2\2z~\7!\2\2{~\7\"\2\2|~\5\32\16\2}z\3\2"+
		"\2\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\27\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\5\f\7\2\u0083\31\3\2\2\2"+
		"\u0084\u008a\5\36\20\2\u0085\u0086\5\34\17\2\u0086\u0087\5\36\20\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\33\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0092"+
		"\5\"\22\2\u008e\u0092\5&\24\2\u008f\u0092\5$\23\2\u0090\u0092\5(\25\2"+
		"\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\35\3\2\2\2\u0093\u0099\5 \21\2\u0094\u0099\7!\2\2\u0095"+
		"\u0099\7#\2\2\u0096\u0099\7$\2\2\u0097\u0099\5\b\5\2\u0098\u0093\3\2\2"+
		"\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\37\3\2\2\2\u009a\u009e\5*\26\2\u009b\u009e\5,\27\2\u009c"+
		"\u009e\5.\30\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e!\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0#\3\2\2\2\u00a1\u00a2\7"+
		"\25\2\2\u00a2%\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\'\3\2\2\2\u00a5\u00a6"+
		"\7\26\2\2\u00a6)\3\2\2\2\u00a7\u00ac\7#\2\2\u00a8\u00ac\7$\2\2\u00a9\u00ac"+
		"\7!\2\2\u00aa\u00ac\5\b\5\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b2\7\27"+
		"\2\2\u00ae\u00b3\7#\2\2\u00af\u00b3\7$\2\2\u00b0\u00b3\7!\2\2\u00b1\u00b3"+
		"\5\b\5\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3+\3\2\2\2\u00b4\u00b9\7\21\2\2\u00b5\u00ba\7#\2\2"+
		"\u00b6\u00ba\7$\2\2\u00b7\u00ba\7!\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b5"+
		"\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"-\3\2\2\2\u00bb\u00c0\7\22\2\2\u00bc\u00c1\7#\2\2\u00bd\u00c1\7$\2\2\u00be"+
		"\u00c1\7!\2\2\u00bf\u00c1\5\b\5\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1/\3\2\2\2\u00c2\u00c5"+
		"\5\62\32\2\u00c3\u00c5\5\64\33\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2"+
		"\2\u00c5\61\3\2\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\58\35\2\u00c8\u00ca"+
		"\7\6\2\2\u00c9\u00cb\5\4\3\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\7"+
		"\2\2\u00cf\63\3\2\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d3\7\6\2\2\u00d2\u00d4"+
		"\5\4\3\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00d9\7\17"+
		"\2\2\u00d9\u00da\58\35\2\u00da\65\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd"+
		"\58\35\2\u00dd\u00df\7\6\2\2\u00de\u00e0\5\4\3\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\7\7\2\2\u00e4\67\3\2\2\2\u00e5\u00ea\5:\36\2\u00e6\u00e7"+
		"\t\2\2\2\u00e7\u00e9\5:\36\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb9\3\2\2\2\u00ec\u00ea\3\2\2\2"+
		"\u00ed\u00f2\5<\37\2\u00ee\u00f2\5> \2\u00ef\u00f2\5@!\2\u00f0\u00f2\5"+
		"B\"\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2;\3\2\2\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\7\30\2"+
		"\2\u00f5\u00f6\5\32\16\2\u00f6=\3\2\2\2\u00f7\u00f8\5\32\16\2\u00f8\u00f9"+
		"\7\31\2\2\u00f9\u00fa\5\32\16\2\u00fa?\3\2\2\2\u00fb\u00fc\5\32\16\2\u00fc"+
		"\u00fd\7\32\2\2\u00fd\u00fe\5\32\16\2\u00feA\3\2\2\2\u00ff\u0100\5\32"+
		"\16\2\u0100\u0101\7\33\2\2\u0101\u0102\5\32\16\2\u0102C\3\2\2\2\27GNY"+
		"es}\177\u008a\u0091\u0098\u009d\u00ab\u00b2\u00b9\u00c0\u00c4\u00cc\u00d5"+
		"\u00e1\u00ea\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}