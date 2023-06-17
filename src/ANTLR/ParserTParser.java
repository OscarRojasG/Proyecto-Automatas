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
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, END=6, OUTPUT=7, INPUT=8, IF=9, 
		ELSE=10, DO=11, WHILE=12, FOR=13, VARNAME=14, CHAR=15, INT=16, FLOAT=17, 
		COSENO=18, SENO=19, MAT_SIMBOLS=20, SUMAR=21, RESTAR=22, MULT=23, DIV=24, 
		POW=25, MAYOR=26, MENOR=27, IGUAL=28, DISTINTO=29, OR=30, AND=31, PICHU=32, 
		MEW=33, MEWTWO=34, NUMBER=35, WS=36;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_cons = 2, RULE_declarar = 3, 
		RULE_cadena = 4, RULE_entero = 5, RULE_flotante = 6, RULE_imprimir = 7, 
		RULE_leer = 8, RULE_operacion = 9, RULE_suma = 10, RULE_multiplicacion = 11, 
		RULE_resta = 12, RULE_division = 13, RULE_pow = 14, RULE_cos = 15, RULE_sin = 16, 
		RULE_ciclo = 17, RULE_mientras = 18, RULE_mientrasque = 19, RULE_si = 20, 
		RULE_condicional = 21, RULE_comparacion = 22, RULE_mayor = 23, RULE_menor = 24, 
		RULE_igual = 25, RULE_distinto = 26;
	public static final String[] ruleNames = {
		"program", "statement", "cons", "declarar", "cadena", "entero", "flotante", 
		"imprimir", "leer", "operacion", "suma", "multiplicacion", "resta", "division", 
		"pow", "cos", "sin", "ciclo", "mientras", "mientrasque", "si", "condicional", 
		"comparacion", "mayor", "menor", "igual", "distinto"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dice'", "'es nivel'", "'{'", "'}'", "'empezar combate'", "'combate finalizado'", 
		"'yo te elijo'", "'mote'", "'si'", "'sino'", "'hacer'", "'mientras'", 
		"'para'", null, null, null, null, "'cosmog'", "'sentret'", null, "' es curado por '", 
		"' es atacado por '", "' junto con '", "' debilita '", "' potencia '", 
		null, null, null, null, "'o'", "'y'", "'3,14159'", "'inf'", "'-inf'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "BEGIN", "END", "OUTPUT", "INPUT", "IF", 
		"ELSE", "DO", "WHILE", "FOR", "VARNAME", "CHAR", "INT", "FLOAT", "COSENO", 
		"SENO", "MAT_SIMBOLS", "SUMAR", "RESTAR", "MULT", "DIV", "POW", "MAYOR", 
		"MENOR", "IGUAL", "DISTINTO", "OR", "AND", "PICHU", "MEW", "MEWTWO", "NUMBER", 
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
			setState(54);
			cons();
			setState(55);
			match(BEGIN);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << COSENO) | (1L << SENO))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				operacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				ciclo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				si();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				leer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				imprimir();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				declarar();
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(72);
				declarar();
				}
				}
				setState(77);
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
		enterRule(_localctx, 6, RULE_declarar);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				cadena();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				entero();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
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
		enterRule(_localctx, 8, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VARNAME);
			setState(84);
			match(T__0);
			setState(85);
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
		enterRule(_localctx, 10, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VARNAME);
			setState(88);
			match(T__1);
			setState(89);
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
		enterRule(_localctx, 12, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(VARNAME);
			setState(92);
			match(T__1);
			setState(93);
			match(FLOAT);
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
		enterRule(_localctx, 14, RULE_imprimir);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(OUTPUT);
			setState(97); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(96);
					_la = _input.LA(1);
					if ( !(_la==VARNAME || _la==CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 16, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(INPUT);
			setState(102);
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
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
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
		enterRule(_localctx, 18, RULE_operacion);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				suma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				multiplicacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				resta();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				pow();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				cos();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				sin();
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

	public static class SumaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
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
		enterRule(_localctx, 20, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(VARNAME);
			setState(113);
			match(SUMAR);
			setState(114);
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
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
		enterRule(_localctx, 22, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(VARNAME);
			setState(117);
			match(MULT);
			setState(118);
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

	public static class RestaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
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
		enterRule(_localctx, 24, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(VARNAME);
			setState(121);
			match(RESTAR);
			setState(122);
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

	public static class DivisionContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
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
		enterRule(_localctx, 26, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(VARNAME);
			setState(125);
			match(DIV);
			setState(126);
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

	public static class PowContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode POW() { return getToken(ParserTParser.POW, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
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
		enterRule(_localctx, 28, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(VARNAME);
			setState(129);
			match(POW);
			setState(130);
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
		enterRule(_localctx, 30, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(COSENO);
			setState(133);
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
		enterRule(_localctx, 32, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(SENO);
			setState(136);
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
		enterRule(_localctx, 34, RULE_ciclo);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				mientras();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
		enterRule(_localctx, 36, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHILE);
			setState(143);
			condicional();
			setState(144);
			match(T__2);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << COSENO) | (1L << SENO))) != 0) );
			setState(150);
			match(T__3);
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
		enterRule(_localctx, 38, RULE_mientrasque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(DO);
			setState(153);
			match(T__2);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				statement();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << COSENO) | (1L << SENO))) != 0) );
			setState(159);
			match(T__3);
			setState(160);
			match(WHILE);
			setState(161);
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
		enterRule(_localctx, 40, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IF);
			setState(164);
			condicional();
			setState(165);
			match(T__2);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				statement();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << VARNAME) | (1L << COSENO) | (1L << SENO))) != 0) );
			setState(171);
			match(T__3);
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
		enterRule(_localctx, 42, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			comparacion();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				comparacion();
				}
				}
				setState(180);
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
		enterRule(_localctx, 44, RULE_comparacion);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				igual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
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
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
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
		enterRule(_localctx, 46, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(VARNAME);
			setState(188);
			match(MAYOR);
			setState(189);
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

	public static class MenorContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
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
		enterRule(_localctx, 48, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(VARNAME);
			setState(192);
			match(MENOR);
			setState(193);
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

	public static class IgualContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
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
		enterRule(_localctx, 50, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(VARNAME);
			setState(196);
			match(IGUAL);
			setState(197);
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

	public static class DistintoContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
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
		enterRule(_localctx, 52, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(VARNAME);
			setState(200);
			match(DISTINTO);
			setState(201);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5"+
		"\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\6\td\n\t\r\t\16\te\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"q\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\5"+
		"\23\u008f\n\23\3\24\3\24\3\24\3\24\6\24\u0095\n\24\r\24\16\24\u0096\3"+
		"\24\3\24\3\25\3\25\3\25\6\25\u009e\n\25\r\25\16\25\u009f\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\6\26\u00aa\n\26\r\26\16\26\u00ab\3\26\3\26\3"+
		"\27\3\27\3\27\7\27\u00b3\n\27\f\27\16\27\u00b6\13\27\3\30\3\30\3\30\3"+
		"\30\5\30\u00bc\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\4\3\2\20\21\3\2 !\2\u00c9\28\3\2\2"+
		"\2\4H\3\2\2\2\6M\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fY\3\2\2\2\16]\3\2\2\2"+
		"\20a\3\2\2\2\22g\3\2\2\2\24p\3\2\2\2\26r\3\2\2\2\30v\3\2\2\2\32z\3\2\2"+
		"\2\34~\3\2\2\2\36\u0082\3\2\2\2 \u0086\3\2\2\2\"\u0089\3\2\2\2$\u008e"+
		"\3\2\2\2&\u0090\3\2\2\2(\u009a\3\2\2\2*\u00a5\3\2\2\2,\u00af\3\2\2\2."+
		"\u00bb\3\2\2\2\60\u00bd\3\2\2\2\62\u00c1\3\2\2\2\64\u00c5\3\2\2\2\66\u00c9"+
		"\3\2\2\289\5\6\4\29=\7\7\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2="+
		">\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\b\2\2A\3\3\2\2\2BI\5\24\13\2CI\5$\23"+
		"\2DI\5*\26\2EI\5\22\n\2FI\5\20\t\2GI\5\b\5\2HB\3\2\2\2HC\3\2\2\2HD\3\2"+
		"\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JL\5\b\5\2KJ\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OM\3\2\2\2PT\5\n\6\2QT\5\f\7\2RT"+
		"\5\16\b\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\t\3\2\2\2UV\7\20\2\2VW\7\3\2"+
		"\2WX\7\21\2\2X\13\3\2\2\2YZ\7\20\2\2Z[\7\4\2\2[\\\7\22\2\2\\\r\3\2\2\2"+
		"]^\7\20\2\2^_\7\4\2\2_`\7\23\2\2`\17\3\2\2\2ac\7\t\2\2bd\t\2\2\2cb\3\2"+
		"\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gh\7\n\2\2hi\5\b\5\2i\23"+
		"\3\2\2\2jq\5\26\f\2kq\5\30\r\2lq\5\32\16\2mq\5\36\20\2nq\5 \21\2oq\5\""+
		"\22\2pj\3\2\2\2pk\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\25"+
		"\3\2\2\2rs\7\20\2\2st\7\27\2\2tu\7\20\2\2u\27\3\2\2\2vw\7\20\2\2wx\7\31"+
		"\2\2xy\7\20\2\2y\31\3\2\2\2z{\7\20\2\2{|\7\30\2\2|}\7\20\2\2}\33\3\2\2"+
		"\2~\177\7\20\2\2\177\u0080\7\32\2\2\u0080\u0081\7\20\2\2\u0081\35\3\2"+
		"\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\33\2\2\u0084\u0085\7\22\2\2\u0085"+
		"\37\3\2\2\2\u0086\u0087\7\24\2\2\u0087\u0088\7\20\2\2\u0088!\3\2\2\2\u0089"+
		"\u008a\7\25\2\2\u008a\u008b\7\20\2\2\u008b#\3\2\2\2\u008c\u008f\5&\24"+
		"\2\u008d\u008f\5(\25\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f%"+
		"\3\2\2\2\u0090\u0091\7\16\2\2\u0091\u0092\5,\27\2\u0092\u0094\7\5\2\2"+
		"\u0093\u0095\5\4\3\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\6\2\2\u0099"+
		"\'\3\2\2\2\u009a\u009b\7\r\2\2\u009b\u009d\7\5\2\2\u009c\u009e\5\4\3\2"+
		"\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7\16\2\2"+
		"\u00a3\u00a4\5,\27\2\u00a4)\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7\5"+
		",\27\2\u00a7\u00a9\7\5\2\2\u00a8\u00aa\5\4\3\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\7\6\2\2\u00ae+\3\2\2\2\u00af\u00b4\5.\30\2\u00b0\u00b1"+
		"\t\3\2\2\u00b1\u00b3\5.\30\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5-\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b7\u00bc\5\60\31\2\u00b8\u00bc\5\62\32\2\u00b9\u00bc\5\64\33\2\u00ba"+
		"\u00bc\5\66\34\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00ba\3\2\2\2\u00bc/\3\2\2\2\u00bd\u00be\7\20\2\2\u00be\u00bf"+
		"\7\34\2\2\u00bf\u00c0\7\20\2\2\u00c0\61\3\2\2\2\u00c1\u00c2\7\20\2\2\u00c2"+
		"\u00c3\7\35\2\2\u00c3\u00c4\7\20\2\2\u00c4\63\3\2\2\2\u00c5\u00c6\7\20"+
		"\2\2\u00c6\u00c7\7\36\2\2\u00c7\u00c8\7\20\2\2\u00c8\65\3\2\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\u00cb\7\37\2\2\u00cb\u00cc\7\20\2\2\u00cc\67\3\2"+
		"\2\2\16=HMSep\u008e\u0096\u009f\u00ab\u00b4\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}