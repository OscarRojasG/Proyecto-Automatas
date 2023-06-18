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
		RULE_program = 0, RULE_statement = 1, RULE_cons = 2, RULE_ctes = 3, RULE_declarar = 4, 
		RULE_cadena = 5, RULE_entero = 6, RULE_flotante = 7, RULE_declarar_operacion = 8, 
		RULE_imprimir = 9, RULE_leer = 10, RULE_expresion = 11, RULE_operacion = 12, 
		RULE_termino = 13, RULE_funcion = 14, RULE_suma = 15, RULE_multiplicacion = 16, 
		RULE_resta = 17, RULE_division = 18, RULE_pow = 19, RULE_cos = 20, RULE_sin = 21, 
		RULE_ciclo = 22, RULE_mientras = 23, RULE_mientrasque = 24, RULE_si = 25, 
		RULE_condicional = 26, RULE_comparacion = 27, RULE_mayor = 28, RULE_menor = 29, 
		RULE_igual = 30, RULE_distinto = 31;
	public static final String[] ruleNames = {
		"program", "statement", "cons", "ctes", "declarar", "cadena", "entero", 
		"flotante", "declarar_operacion", "imprimir", "leer", "expresion", "operacion", 
		"termino", "funcion", "suma", "multiplicacion", "resta", "division", "pow", 
		"cos", "sin", "ciclo", "mientras", "mientrasque", "si", "condicional", 
		"comparacion", "mayor", "menor", "igual", "distinto"
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
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
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
			setState(64);
			cons();
			setState(65);
			match(BEGIN);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMAR:
			case RESTAR:
			case MULT:
			case DIV:
				{
				setState(74);
				operacion();
				}
				break;
			case DO:
			case WHILE:
				{
				setState(75);
				ciclo();
				}
				break;
			case IF:
				{
				setState(76);
				si();
				}
				break;
			case INPUT:
				{
				setState(77);
				leer();
				}
				break;
			case OUTPUT:
				{
				setState(78);
				imprimir();
				}
				break;
			case VARNAME:
				{
				setState(79);
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

	public static class ConsContext extends ParserRuleContext {
		public List<DeclararContext> declarar() {
			return getRuleContexts(DeclararContext.class);
		}
		public DeclararContext declarar(int i) {
			return getRuleContext(DeclararContext.class,i);
		}
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(82);
				declarar();
				}
				}
				setState(87);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode PICHU() { return getToken(ParserTParser.PICHU, 0); }
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ctes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 8, RULE_declarar);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				cadena();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				entero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				flotante();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
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
		enterRule(_localctx, 10, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(VARNAME);
			setState(97);
			match(T__0);
			setState(98);
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
		enterRule(_localctx, 12, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(VARNAME);
			setState(101);
			match(T__1);
			setState(102);
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
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
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
		enterRule(_localctx, 14, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VARNAME);
			setState(105);
			match(T__1);
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(106);
				match(FLOAT);
				}
				break;
			case PICHU:
				{
				setState(107);
				ctes();
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
		enterRule(_localctx, 16, RULE_declarar_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VARNAME);
			setState(111);
			match(T__2);
			setState(112);
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
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
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
		enterRule(_localctx, 18, RULE_imprimir);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(OUTPUT);
			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(115);
						match(VARNAME);
						}
						break;
					case 2:
						{
						setState(116);
						match(CHAR);
						}
						break;
					case 3:
						{
						setState(117);
						match(INT);
						}
						break;
					case 4:
						{
						setState(118);
						match(FLOAT);
						}
						break;
					case 5:
						{
						setState(119);
						expresion();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
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
		enterRule(_localctx, 20, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(INPUT);
			setState(125);
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
		enterRule(_localctx, 22, RULE_expresion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			termino();
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					operacion();
					setState(129);
					termino();
					}
					} 
				}
				setState(135);
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
		enterRule(_localctx, 24, RULE_operacion);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				suma();
				}
				break;
			case RESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				resta();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				multiplicacion();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
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
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
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
		enterRule(_localctx, 26, RULE_termino);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(VARNAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				ctes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(FLOAT);
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
		enterRule(_localctx, 28, RULE_funcion);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				pow();
				}
				break;
			case COSENO:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				cos();
				}
				break;
			case SENO:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
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
		enterRule(_localctx, 30, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		enterRule(_localctx, 32, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 34, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 36, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 38, RULE_pow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(POW);
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 40, RULE_cos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(COSENO);
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 42, RULE_sin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(SENO);
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 44, RULE_ciclo);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				mientras();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
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
		enterRule(_localctx, 46, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(WHILE);
			setState(177);
			condicional();
			setState(178);
			match(T__3);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				statement();
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0) );
			setState(184);
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
		enterRule(_localctx, 48, RULE_mientrasque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(DO);
			setState(187);
			match(T__3);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				statement();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0) );
			setState(193);
			match(T__4);
			setState(194);
			match(WHILE);
			setState(195);
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
		enterRule(_localctx, 50, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			condicional();
			setState(199);
			match(T__3);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << SUMAR) | (1L << RESTAR) | (1L << MULT) | (1L << DIV) | (1L << VARNAME))) != 0) );
			setState(205);
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
		enterRule(_localctx, 52, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			comparacion();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(208);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				comparacion();
				}
				}
				setState(214);
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
		enterRule(_localctx, 54, RULE_comparacion);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				igual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
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
		enterRule(_localctx, 56, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expresion();
			setState(222);
			match(MAYOR);
			setState(223);
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
		enterRule(_localctx, 58, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expresion();
			setState(226);
			match(MENOR);
			setState(227);
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
		enterRule(_localctx, 60, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			expresion();
			setState(230);
			match(IGUAL);
			setState(231);
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
		enterRule(_localctx, 62, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			expresion();
			setState(234);
			match(DISTINTO);
			setState(235);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3S\n\3\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6a\n"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\6\13{\n\13\r\13\16\13|\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\16\3\16\3\16\3"+
		"\16\5\16\u008f\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20"+
		"\3\20\5\20\u009b\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\5\30\u00b1\n\30\3\31"+
		"\3\31\3\31\3\31\6\31\u00b7\n\31\r\31\16\31\u00b8\3\31\3\31\3\32\3\32\3"+
		"\32\6\32\u00c0\n\32\r\32\16\32\u00c1\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\6\33\u00cc\n\33\r\33\16\33\u00cd\3\33\3\33\3\34\3\34\3\34\7\34\u00d5"+
		"\n\34\f\34\16\34\u00d8\13\34\3\35\3\35\3\35\3\35\5\35\u00de\n\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\2\2\"\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\4\4"+
		"\2!!#$\3\2\34\35\2\u00f1\2B\3\2\2\2\4R\3\2\2\2\6W\3\2\2\2\bZ\3\2\2\2\n"+
		"`\3\2\2\2\fb\3\2\2\2\16f\3\2\2\2\20j\3\2\2\2\22p\3\2\2\2\24t\3\2\2\2\26"+
		"~\3\2\2\2\30\u0081\3\2\2\2\32\u008e\3\2\2\2\34\u0095\3\2\2\2\36\u009a"+
		"\3\2\2\2 \u009c\3\2\2\2\"\u009e\3\2\2\2$\u00a0\3\2\2\2&\u00a2\3\2\2\2"+
		"(\u00a4\3\2\2\2*\u00a8\3\2\2\2,\u00ab\3\2\2\2.\u00b0\3\2\2\2\60\u00b2"+
		"\3\2\2\2\62\u00bc\3\2\2\2\64\u00c7\3\2\2\2\66\u00d1\3\2\2\28\u00dd\3\2"+
		"\2\2:\u00df\3\2\2\2<\u00e3\3\2\2\2>\u00e7\3\2\2\2@\u00eb\3\2\2\2BC\5\6"+
		"\4\2CG\7\b\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2"+
		"\2\2IG\3\2\2\2JK\7\t\2\2K\3\3\2\2\2LS\5\32\16\2MS\5.\30\2NS\5\64\33\2"+
		"OS\5\26\f\2PS\5\24\13\2QS\5\n\6\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2"+
		"\2\2RP\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2TV\5\n\6\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2X\7\3\2\2\2YW\3\2\2\2Z[\7\36\2\2[\t\3\2\2\2\\a\5\f\7\2"+
		"]a\5\16\b\2^a\5\20\t\2_a\5\22\n\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2"+
		"\2\2a\13\3\2\2\2bc\7!\2\2cd\7\3\2\2de\7\"\2\2e\r\3\2\2\2fg\7!\2\2gh\7"+
		"\4\2\2hi\7#\2\2i\17\3\2\2\2jk\7!\2\2kn\7\4\2\2lo\7$\2\2mo\5\b\5\2nl\3"+
		"\2\2\2nm\3\2\2\2o\21\3\2\2\2pq\7!\2\2qr\7\5\2\2rs\5\32\16\2s\23\3\2\2"+
		"\2tz\7\n\2\2u{\7!\2\2v{\7\"\2\2w{\7#\2\2x{\7$\2\2y{\5\30\r\2zu\3\2\2\2"+
		"zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\25\3\2\2\2~\177\7\13\2\2\177\u0080\5\n\6\2\u0080\27\3\2\2\2\u0081\u0087"+
		"\5\34\17\2\u0082\u0083\5\32\16\2\u0083\u0084\5\34\17\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\31\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008f\5 \21"+
		"\2\u008b\u008f\5$\23\2\u008c\u008f\5\"\22\2\u008d\u008f\5&\24\2\u008e"+
		"\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\33\3\2\2\2\u0090\u0096\5\36\20\2\u0091\u0096\7!\2\2\u0092\u0096"+
		"\5\b\5\2\u0093\u0096\7#\2\2\u0094\u0096\7$\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\35\3\2\2\2\u0097\u009b\5(\25\2\u0098\u009b\5*\26\2\u0099\u009b"+
		"\5,\27\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\37\3\2\2\2\u009c\u009d\7\23\2\2\u009d!\3\2\2\2\u009e\u009f\7\25\2\2\u009f"+
		"#\3\2\2\2\u00a0\u00a1\7\24\2\2\u00a1%\3\2\2\2\u00a2\u00a3\7\26\2\2\u00a3"+
		"\'\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\t\2\2"+
		"\2\u00a7)\3\2\2\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa\t\2\2\2\u00aa+\3\2"+
		"\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\t\2\2\2\u00ad-\3\2\2\2\u00ae\u00b1"+
		"\5\60\31\2\u00af\u00b1\5\62\32\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2"+
		"\2\u00b1/\3\2\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4\5\66\34\2\u00b4\u00b6"+
		"\7\6\2\2\u00b5\u00b7\5\4\3\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\7"+
		"\2\2\u00bb\61\3\2\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00bf\7\6\2\2\u00be\u00c0"+
		"\5\4\3\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\7\17"+
		"\2\2\u00c5\u00c6\5\66\34\2\u00c6\63\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8"+
		"\u00c9\5\66\34\2\u00c9\u00cb\7\6\2\2\u00ca\u00cc\5\4\3\2\u00cb\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7\7\2\2\u00d0\65\3\2\2\2\u00d1\u00d6\58\35"+
		"\2\u00d2\u00d3\t\3\2\2\u00d3\u00d5\58\35\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\67\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00de\5:\36\2\u00da\u00de\5<\37\2\u00db\u00de\5>"+
		" \2\u00dc\u00de\5@!\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de9\3\2\2\2\u00df\u00e0\5\30\r\2\u00e0"+
		"\u00e1\7\30\2\2\u00e1\u00e2\5\30\r\2\u00e2;\3\2\2\2\u00e3\u00e4\5\30\r"+
		"\2\u00e4\u00e5\7\31\2\2\u00e5\u00e6\5\30\r\2\u00e6=\3\2\2\2\u00e7\u00e8"+
		"\5\30\r\2\u00e8\u00e9\7\32\2\2\u00e9\u00ea\5\30\r\2\u00ea?\3\2\2\2\u00eb"+
		"\u00ec\5\30\r\2\u00ec\u00ed\7\33\2\2\u00ed\u00ee\5\30\r\2\u00eeA\3\2\2"+
		"\2\23GRW`nz|\u0087\u008e\u0095\u009a\u00b0\u00b8\u00c1\u00cd\u00d6\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}