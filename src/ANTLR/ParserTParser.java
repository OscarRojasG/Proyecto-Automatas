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
		IF=10, ELSE=11, DO=12, WHILE=13, FOR=14, VARNAME=15, CHAR=16, INT=17, 
		FLOAT=18, COSENO=19, SENO=20, SUMAR=21, RESTAR=22, MULT=23, DIV=24, POW=25, 
		MAYOR=26, MENOR=27, IGUAL=28, DISTINTO=29, OR=30, AND=31, PICHU=32, MEW=33, 
		MEWTWO=34, NUMBER=35, WS=36;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_cons = 2, RULE_ctes = 3, RULE_declarar = 4, 
		RULE_cadena = 5, RULE_entero = 6, RULE_flotante = 7, RULE_declarar_operacion = 8, 
		RULE_imprimir = 9, RULE_leer = 10, RULE_operacion = 11, RULE_operable = 12, 
		RULE_suma = 13, RULE_multiplicacion = 14, RULE_resta = 15, RULE_division = 16, 
		RULE_pow = 17, RULE_cos = 18, RULE_sin = 19, RULE_ciclo = 20, RULE_mientras = 21, 
		RULE_mientrasque = 22, RULE_si = 23, RULE_condicional = 24, RULE_comparacion = 25, 
		RULE_mayor = 26, RULE_menor = 27, RULE_igual = 28, RULE_distinto = 29;
	public static final String[] ruleNames = {
		"program", "statement", "cons", "ctes", "declarar", "cadena", "entero", 
		"flotante", "declarar_operacion", "imprimir", "leer", "operacion", "operable", 
		"suma", "multiplicacion", "resta", "division", "pow", "cos", "sin", "ciclo", 
		"mientras", "mientrasque", "si", "condicional", "comparacion", "mayor", 
		"menor", "igual", "distinto"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dice'", "'es nivel'", "'es igual a'", "'{'", "'}'", "'empezar combate'", 
		"'combate finalizado'", "'yo te elijo'", "'mote'", "'si'", "'sino'", "'hacer'", 
		"'mientras'", "'para'", null, null, null, null, "'cosmog'", "'sentret'", 
		"'es curado por'", "'es atacado por'", "'junto con'", "'debilita'", "'potencia'", 
		null, null, null, null, "'o'", "'y'", "'PICHU'", "'inf'", "'-inf'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BEGIN", "END", "OUTPUT", "INPUT", 
		"IF", "ELSE", "DO", "WHILE", "FOR", "VARNAME", "CHAR", "INT", "FLOAT", 
		"COSENO", "SENO", "SUMAR", "RESTAR", "MULT", "DIV", "POW", "MAYOR", "MENOR", 
		"IGUAL", "DISTINTO", "OR", "AND", "PICHU", "MEW", "MEWTWO", "NUMBER", 
		"WS"
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
			setState(60);
			cons();
			setState(61);
			match(BEGIN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << INT) | (1L << FLOAT) | (1L << COSENO) | (1L << SENO) | (1L << PICHU))) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(70);
				operacion();
				}
				break;
			case 2:
				{
				setState(71);
				ciclo();
				}
				break;
			case 3:
				{
				setState(72);
				si();
				}
				break;
			case 4:
				{
				setState(73);
				leer();
				}
				break;
			case 5:
				{
				setState(74);
				imprimir();
				}
				break;
			case 6:
				{
				setState(75);
				declarar();
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(78);
				declarar();
				}
				}
				setState(83);
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
			setState(84);
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				cadena();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				entero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				flotante();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
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
			setState(92);
			match(VARNAME);
			setState(93);
			match(T__0);
			setState(94);
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
			setState(96);
			match(VARNAME);
			setState(97);
			match(T__1);
			setState(98);
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
			setState(100);
			match(VARNAME);
			setState(101);
			match(T__1);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(102);
				match(FLOAT);
				}
				break;
			case PICHU:
				{
				setState(103);
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
			setState(106);
			match(VARNAME);
			setState(107);
			match(T__2);
			setState(108);
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
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
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
			setState(110);
			match(OUTPUT);
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(111);
						match(VARNAME);
						}
						break;
					case 2:
						{
						setState(112);
						match(CHAR);
						}
						break;
					case 3:
						{
						setState(113);
						match(INT);
						}
						break;
					case 4:
						{
						setState(114);
						match(FLOAT);
						}
						break;
					case 5:
						{
						setState(115);
						operacion();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
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
			setState(120);
			match(INPUT);
			setState(121);
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

	public static class OperacionContext extends ParserRuleContext {
		public List<SumaContext> suma() {
			return getRuleContexts(SumaContext.class);
		}
		public SumaContext suma(int i) {
			return getRuleContext(SumaContext.class,i);
		}
		public List<MultiplicacionContext> multiplicacion() {
			return getRuleContexts(MultiplicacionContext.class);
		}
		public MultiplicacionContext multiplicacion(int i) {
			return getRuleContext(MultiplicacionContext.class,i);
		}
		public List<RestaContext> resta() {
			return getRuleContexts(RestaContext.class);
		}
		public RestaContext resta(int i) {
			return getRuleContext(RestaContext.class,i);
		}
		public List<PowContext> pow() {
			return getRuleContexts(PowContext.class);
		}
		public PowContext pow(int i) {
			return getRuleContext(PowContext.class,i);
		}
		public List<CosContext> cos() {
			return getRuleContexts(CosContext.class);
		}
		public CosContext cos(int i) {
			return getRuleContext(CosContext.class,i);
		}
		public List<SinContext> sin() {
			return getRuleContexts(SinContext.class);
		}
		public SinContext sin(int i) {
			return getRuleContext(SinContext.class,i);
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
		enterRule(_localctx, 22, RULE_operacion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(123);
						suma();
						}
						break;
					case 2:
						{
						setState(124);
						multiplicacion();
						}
						break;
					case 3:
						{
						setState(125);
						resta();
						}
						break;
					case 4:
						{
						setState(126);
						pow();
						}
						break;
					case 5:
						{
						setState(127);
						cos();
						}
						break;
					case 6:
						{
						setState(128);
						sin();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class OperableContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public OperableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperableContext operable() throws RecognitionException {
		OperableContext _localctx = new OperableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(133);
				match(VARNAME);
				}
				break;
			case PICHU:
				{
				setState(134);
				ctes();
				}
				break;
			case INT:
				{
				setState(135);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(136);
				match(FLOAT);
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

	public static class SumaContext extends ParserRuleContext {
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
		}
		public List<TerminalNode> SUMAR() { return getTokens(ParserTParser.SUMAR); }
		public TerminalNode SUMAR(int i) {
			return getToken(ParserTParser.SUMAR, i);
		}
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
		enterRule(_localctx, 26, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			operable();
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				match(SUMAR);
				setState(141);
				operable();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SUMAR );
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
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(ParserTParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(ParserTParser.MULT, i);
		}
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
		enterRule(_localctx, 28, RULE_multiplicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			operable();
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(MULT);
				setState(148);
				operable();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MULT );
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
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
		}
		public List<TerminalNode> RESTAR() { return getTokens(ParserTParser.RESTAR); }
		public TerminalNode RESTAR(int i) {
			return getToken(ParserTParser.RESTAR, i);
		}
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
		enterRule(_localctx, 30, RULE_resta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			operable();
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				match(RESTAR);
				setState(155);
				operable();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RESTAR );
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
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(ParserTParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ParserTParser.DIV, i);
		}
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
		enterRule(_localctx, 32, RULE_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			operable();
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				match(DIV);
				setState(162);
				operable();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIV );
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
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode POW() { return getToken(ParserTParser.POW, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
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
		enterRule(_localctx, 34, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(VARNAME);
			setState(168);
			match(POW);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(169);
				match(INT);
				}
				break;
			case 2:
				{
				setState(170);
				operacion();
				}
				break;
			case 3:
				{
				setState(171);
				match(VARNAME);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
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
		enterRule(_localctx, 36, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(COSENO);
			setState(175);
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

	public static class SinContext extends ParserRuleContext {
		public TerminalNode SENO() { return getToken(ParserTParser.SENO, 0); }
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
		enterRule(_localctx, 38, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(SENO);
			setState(178);
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
		enterRule(_localctx, 40, RULE_ciclo);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				mientras();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
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
		enterRule(_localctx, 42, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(WHILE);
			setState(185);
			condicional();
			setState(186);
			match(T__3);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				statement();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << INT) | (1L << FLOAT) | (1L << COSENO) | (1L << SENO) | (1L << PICHU))) != 0) );
			setState(192);
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
		enterRule(_localctx, 44, RULE_mientrasque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(DO);
			setState(195);
			match(T__3);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << INT) | (1L << FLOAT) | (1L << COSENO) | (1L << SENO) | (1L << PICHU))) != 0) );
			setState(201);
			match(T__4);
			setState(202);
			match(WHILE);
			setState(203);
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
		enterRule(_localctx, 46, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(IF);
			setState(206);
			condicional();
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << INT) | (1L << FLOAT) | (1L << COSENO) | (1L << SENO) | (1L << PICHU))) != 0) );
			setState(213);
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
		enterRule(_localctx, 48, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			comparacion();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217);
				comparacion();
				}
				}
				setState(222);
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
		enterRule(_localctx, 50, RULE_comparacion);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				igual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
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
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
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
		enterRule(_localctx, 52, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			operable();
			setState(230);
			match(MAYOR);
			setState(231);
			operable();
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
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
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
		enterRule(_localctx, 54, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			operable();
			setState(234);
			match(MENOR);
			setState(235);
			operable();
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
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
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
		enterRule(_localctx, 56, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			operable();
			setState(238);
			match(IGUAL);
			setState(239);
			operable();
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
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
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
		enterRule(_localctx, 58, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			operable();
			setState(242);
			match(DISTINTO);
			setState(243);
			operable();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3"+
		"\4\7\4R\n\4\f\4\16\4U\13\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\6\13w\n\13\r\13\16\13x\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\6\r\u0084\n\r\r\r\16\r\u0085\3\16\3\16\3\16\3\16\5\16\u008c"+
		"\n\16\3\17\3\17\3\17\6\17\u0091\n\17\r\17\16\17\u0092\3\20\3\20\3\20\6"+
		"\20\u0098\n\20\r\20\16\20\u0099\3\21\3\21\3\21\6\21\u009f\n\21\r\21\16"+
		"\21\u00a0\3\22\3\22\3\22\6\22\u00a6\n\22\r\22\16\22\u00a7\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00af\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\5\26\u00b9\n\26\3\27\3\27\3\27\3\27\6\27\u00bf\n\27\r\27\16\27\u00c0"+
		"\3\27\3\27\3\30\3\30\3\30\6\30\u00c8\n\30\r\30\16\30\u00c9\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\6\31\u00d4\n\31\r\31\16\31\u00d5\3\31\3\31"+
		"\3\32\3\32\3\32\7\32\u00dd\n\32\f\32\16\32\u00e0\13\32\3\33\3\33\3\33"+
		"\3\33\5\33\u00e6\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\3\3\2 !\2\u0100\2>\3\2\2\2\4N\3\2"+
		"\2\2\6S\3\2\2\2\bV\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16b\3\2\2\2\20f\3\2"+
		"\2\2\22l\3\2\2\2\24p\3\2\2\2\26z\3\2\2\2\30\u0083\3\2\2\2\32\u008b\3\2"+
		"\2\2\34\u008d\3\2\2\2\36\u0094\3\2\2\2 \u009b\3\2\2\2\"\u00a2\3\2\2\2"+
		"$\u00a9\3\2\2\2&\u00b0\3\2\2\2(\u00b3\3\2\2\2*\u00b8\3\2\2\2,\u00ba\3"+
		"\2\2\2.\u00c4\3\2\2\2\60\u00cf\3\2\2\2\62\u00d9\3\2\2\2\64\u00e5\3\2\2"+
		"\2\66\u00e7\3\2\2\28\u00eb\3\2\2\2:\u00ef\3\2\2\2<\u00f3\3\2\2\2>?\5\6"+
		"\4\2?C\7\b\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\7\t\2\2G\3\3\2\2\2HO\5\30\r\2IO\5*\26\2JO\5\60\31\2K"+
		"O\5\26\f\2LO\5\24\13\2MO\5\n\6\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2"+
		"\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PR\5\n\6\2QP\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2T\7\3\2\2\2US\3\2\2\2VW\7\"\2\2W\t\3\2\2\2X]\5\f\7\2Y]\5"+
		"\16\b\2Z]\5\20\t\2[]\5\22\n\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2"+
		"\2\2]\13\3\2\2\2^_\7\21\2\2_`\7\3\2\2`a\7\22\2\2a\r\3\2\2\2bc\7\21\2\2"+
		"cd\7\4\2\2de\7\23\2\2e\17\3\2\2\2fg\7\21\2\2gj\7\4\2\2hk\7\24\2\2ik\5"+
		"\b\5\2jh\3\2\2\2ji\3\2\2\2k\21\3\2\2\2lm\7\21\2\2mn\7\5\2\2no\5\30\r\2"+
		"o\23\3\2\2\2pv\7\n\2\2qw\7\21\2\2rw\7\22\2\2sw\7\23\2\2tw\7\24\2\2uw\5"+
		"\30\r\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xv"+
		"\3\2\2\2xy\3\2\2\2y\25\3\2\2\2z{\7\13\2\2{|\5\n\6\2|\27\3\2\2\2}\u0084"+
		"\5\34\17\2~\u0084\5\36\20\2\177\u0084\5 \21\2\u0080\u0084\5$\23\2\u0081"+
		"\u0084\5&\24\2\u0082\u0084\5(\25\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083"+
		"\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\31"+
		"\3\2\2\2\u0087\u008c\7\21\2\2\u0088\u008c\5\b\5\2\u0089\u008c\7\23\2\2"+
		"\u008a\u008c\7\24\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\33\3\2\2\2\u008d\u0090\5\32\16\2\u008e"+
		"\u008f\7\27\2\2\u008f\u0091\5\32\16\2\u0090\u008e\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\35\3\2\2\2\u0094"+
		"\u0097\5\32\16\2\u0095\u0096\7\31\2\2\u0096\u0098\5\32\16\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\37\3\2\2\2\u009b\u009e\5\32\16\2\u009c\u009d\7\30\2\2\u009d\u009f\5\32"+
		"\16\2\u009e\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a5\5\32\16\2\u00a3\u00a4\7\32\2"+
		"\2\u00a4\u00a6\5\32\16\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8#\3\2\2\2\u00a9\u00aa\7\21\2\2"+
		"\u00aa\u00ae\7\33\2\2\u00ab\u00af\7\23\2\2\u00ac\u00af\5\30\r\2\u00ad"+
		"\u00af\7\21\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3"+
		"\2\2\2\u00af%\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\7\21\2\2\u00b2"+
		"\'\3\2\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\7\21\2\2\u00b5)\3\2\2\2\u00b6"+
		"\u00b9\5,\27\2\u00b7\u00b9\5.\30\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9+\3\2\2\2\u00ba\u00bb\7\17\2\2\u00bb\u00bc\5\62\32\2\u00bc\u00be"+
		"\7\6\2\2\u00bd\u00bf\5\4\3\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\7"+
		"\2\2\u00c3-\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c7\7\6\2\2\u00c6\u00c8"+
		"\5\4\3\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\7\17"+
		"\2\2\u00cd\u00ce\5\62\32\2\u00ce/\3\2\2\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1"+
		"\5\62\32\2\u00d1\u00d3\7\6\2\2\u00d2\u00d4\5\4\3\2\u00d3\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\61\3\2\2\2\u00d9\u00de\5\64\33\2\u00da"+
		"\u00db\t\2\2\2\u00db\u00dd\5\64\33\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\63\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e6\5\66\34\2\u00e2\u00e6\58\35\2\u00e3\u00e6\5"+
		":\36\2\u00e4\u00e6\5<\37\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\65\3\2\2\2\u00e7\u00e8\5\32\16"+
		"\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea\5\32\16\2\u00ea\67\3\2\2\2\u00eb\u00ec"+
		"\5\32\16\2\u00ec\u00ed\7\35\2\2\u00ed\u00ee\5\32\16\2\u00ee9\3\2\2\2\u00ef"+
		"\u00f0\5\32\16\2\u00f0\u00f1\7\36\2\2\u00f1\u00f2\5\32\16\2\u00f2;\3\2"+
		"\2\2\u00f3\u00f4\5\32\16\2\u00f4\u00f5\7\37\2\2\u00f5\u00f6\5\32\16\2"+
		"\u00f6=\3\2\2\2\27CNS\\jvx\u0083\u0085\u008b\u0092\u0099\u00a0\u00a7\u00ae"+
		"\u00b8\u00c0\u00c9\u00d5\u00de\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}