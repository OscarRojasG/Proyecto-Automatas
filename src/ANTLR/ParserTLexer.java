package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "BEGIN", "END", "OUTPUT", "INPUT", 
		"IF", "ELSE", "DO", "WHILE", "FOR", "COSENO", "SENO", "SUMAR", "RESTAR", 
		"MULT", "DIV", "POW", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "OR", "AND", 
		"PICHU", "MEW", "MEWTWO", "VARNAME", "CHAR", "INT", "FLOAT", "WS"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u01b0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0109\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0125\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0145\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0161\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \6 \u018a\n \r \16 \u018b\3!\3!\7!\u0190\n!\f!\16!\u0193"+
		"\13!\3!\3!\3\"\5\"\u0198\n\"\3\"\6\"\u019b\n\"\r\"\16\"\u019c\3#\6#\u01a0"+
		"\n#\r#\16#\u01a1\3#\3#\6#\u01a6\n#\r#\16#\u01a7\3$\6$\u01ab\n$\r$\16$"+
		"\u01ac\3$\3$\3\u0191\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u01ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\3I\3\2\2\2\5N\3\2\2\2\7W\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2"+
		"\rf\3\2\2\2\17v\3\2\2\2\21\u0089\3\2\2\2\23\u0095\3\2\2\2\25\u009a\3\2"+
		"\2\2\27\u009d\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3\2\2\2\35\u00b1\3\2\2"+
		"\2\37\u00b6\3\2\2\2!\u00bd\3\2\2\2#\u00c5\3\2\2\2%\u00d3\3\2\2\2\'\u00e2"+
		"\3\2\2\2)\u00ec\3\2\2\2+\u00f5\3\2\2\2-\u0108\3\2\2\2/\u0124\3\2\2\2\61"+
		"\u0144\3\2\2\2\63\u0160\3\2\2\2\65\u0175\3\2\2\2\67\u0177\3\2\2\29\u0179"+
		"\3\2\2\2;\u017f\3\2\2\2=\u0183\3\2\2\2?\u0189\3\2\2\2A\u018d\3\2\2\2C"+
		"\u0197\3\2\2\2E\u019f\3\2\2\2G\u01aa\3\2\2\2IJ\7f\2\2JK\7k\2\2KL\7e\2"+
		"\2LM\7g\2\2M\4\3\2\2\2NO\7g\2\2OP\7u\2\2PQ\7\"\2\2QR\7p\2\2RS\7k\2\2S"+
		"T\7x\2\2TU\7g\2\2UV\7n\2\2V\6\3\2\2\2WX\7g\2\2XY\7u\2\2YZ\7\"\2\2Z[\7"+
		"k\2\2[\\\7i\2\2\\]\7w\2\2]^\7c\2\2^_\7n\2\2_`\7\"\2\2`a\7c\2\2a\b\3\2"+
		"\2\2bc\7}\2\2c\n\3\2\2\2de\7\177\2\2e\f\3\2\2\2fg\7g\2\2gh\7o\2\2hi\7"+
		"r\2\2ij\7g\2\2jk\7|\2\2kl\7c\2\2lm\7t\2\2mn\7\"\2\2no\7e\2\2op\7q\2\2"+
		"pq\7o\2\2qr\7d\2\2rs\7c\2\2st\7v\2\2tu\7g\2\2u\16\3\2\2\2vw\7e\2\2wx\7"+
		"q\2\2xy\7o\2\2yz\7d\2\2z{\7c\2\2{|\7v\2\2|}\7g\2\2}~\7\"\2\2~\177\7h\2"+
		"\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7k\2\2\u0084\u0085\7|\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7f\2\2\u0087\u0088\7q\2\2\u0088\20\3\2\2\2\u0089\u008a\7{\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008c\7\"\2\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2"+
		"\2\u008e\u008f\7\"\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0093\7l\2\2\u0093\u0094\7q\2\2\u0094\22\3\2\2\2\u0095\u0096"+
		"\7o\2\2\u0096\u0097\7q\2\2\u0097\u0098\7v\2\2\u0098\u0099\7g\2\2\u0099"+
		"\24\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c\7k\2\2\u009c\26\3\2\2\2\u009d"+
		"\u009e\7u\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7q\2\2"+
		"\u00a1\30\3\2\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7"+
		"e\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\7o\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0\34\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7"+
		"t\2\2\u00b4\u00b5\7c\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7i\2\2\u00bc \3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2"+
		"\u00c3\u00c4\7v\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7u"+
		"\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7\"\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7t\2"+
		"\2\u00d2$\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7"+
		"\"\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7c\2\2\u00d9"+
		"\u00da\7e\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7q\2\2"+
		"\u00dd\u00de\7\"\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7l\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7\"\2\2\u00e8"+
		"\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7p\2\2\u00eb(\3\2\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7k\2\2"+
		"\u00f0\u00f1\7n\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4"+
		"\7c\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7e\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u00fd\7c\2\2\u00fd,\3\2\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7u\2\2\u0100\u0101\7\"\2\2\u0101\u0102\7f\2\2\u0102\u0109\7g\2"+
		"\2\u0103\u0104\7v\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7i\2\2\u0107\u0109\7c\2\2\u0108\u00fe\3\2\2\2\u0108\u0103\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\7o\2\2\u010b\u010c\7c\2\2\u010c\u010d\7{\2"+
		"\2\u010d\u010e\7q\2\2\u010e\u010f\7t\2\2\u010f\u0110\7\"\2\2\u0110\u0111"+
		"\7p\2\2\u0111\u0112\7k\2\2\u0112\u0113\7x\2\2\u0113\u0114\7g\2\2\u0114"+
		"\u0115\7n\2\2\u0115\u0116\7\"\2\2\u0116\u0117\7s\2\2\u0117\u0118\7w\2"+
		"\2\u0118\u0119\7g\2\2\u0119.\3\2\2\2\u011a\u011b\7g\2\2\u011b\u011c\7"+
		"u\2\2\u011c\u011d\7\"\2\2\u011d\u011e\7f\2\2\u011e\u0125\7g\2\2\u011f"+
		"\u0120\7v\2\2\u0120\u0121\7g\2\2\u0121\u0122\7p\2\2\u0122\u0123\7i\2\2"+
		"\u0123\u0125\7c\2\2\u0124\u011a\3\2\2\2\u0124\u011f\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\7o\2\2\u0127\u0128\7g\2\2\u0128\u0129\7p\2\2\u0129"+
		"\u012a\7q\2\2\u012a\u012b\7t\2\2\u012b\u012c\7\"\2\2\u012c\u012d\7p\2"+
		"\2\u012d\u012e\7k\2\2\u012e\u012f\7x\2\2\u012f\u0130\7g\2\2\u0130\u0131"+
		"\7n\2\2\u0131\u0132\7\"\2\2\u0132\u0133\7s\2\2\u0133\u0134\7w\2\2\u0134"+
		"\u0135\7g\2\2\u0135\60\3\2\2\2\u0136\u0137\7g\2\2\u0137\u0138\7u\2\2\u0138"+
		"\u0139\7\"\2\2\u0139\u013a\7f\2\2\u013a\u013b\7g\2\2\u013b\u0145\7n\2"+
		"\2\u013c\u013d\7v\2\2\u013d\u013e\7g\2\2\u013e\u013f\7p\2\2\u013f\u0140"+
		"\7i\2\2\u0140\u0141\7c\2\2\u0141\u0142\7\"\2\2\u0142\u0143\7g\2\2\u0143"+
		"\u0145\7n\2\2\u0144\u0136\3\2\2\2\u0144\u013c\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\7o\2\2\u0147\u0148\7k\2\2\u0148\u0149\7u\2\2\u0149\u014a"+
		"\7o\2\2\u014a\u014b\7q\2\2\u014b\u014c\7\"\2\2\u014c\u014d\7p\2\2\u014d"+
		"\u014e\7k\2\2\u014e\u014f\7x\2\2\u014f\u0150\7g\2\2\u0150\u0151\7n\2\2"+
		"\u0151\u0152\7\"\2\2\u0152\u0153\7s\2\2\u0153\u0154\7w\2\2\u0154\u0155"+
		"\7g\2\2\u0155\62\3\2\2\2\u0156\u0157\7g\2\2\u0157\u0158\7u\2\2\u0158\u0159"+
		"\7\"\2\2\u0159\u015a\7f\2\2\u015a\u0161\7g\2\2\u015b\u015c\7v\2\2\u015c"+
		"\u015d\7g\2\2\u015d\u015e\7p\2\2\u015e\u015f\7i\2\2\u015f\u0161\7c\2\2"+
		"\u0160\u0156\3\2\2\2\u0160\u015b\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163"+
		"\7f\2\2\u0163\u0164\7k\2\2\u0164\u0165\7u\2\2\u0165\u0166\7v\2\2\u0166"+
		"\u0167\7k\2\2\u0167\u0168\7p\2\2\u0168\u0169\7v\2\2\u0169\u016a\7q\2\2"+
		"\u016a\u016b\7\"\2\2\u016b\u016c\7p\2\2\u016c\u016d\7k\2\2\u016d\u016e"+
		"\7x\2\2\u016e\u016f\7g\2\2\u016f\u0170\7n\2\2\u0170\u0171\7\"\2\2\u0171"+
		"\u0172\7s\2\2\u0172\u0173\7w\2\2\u0173\u0174\7g\2\2\u0174\64\3\2\2\2\u0175"+
		"\u0176\7q\2\2\u0176\66\3\2\2\2\u0177\u0178\7{\2\2\u01788\3\2\2\2\u0179"+
		"\u017a\7R\2\2\u017a\u017b\7K\2\2\u017b\u017c\7E\2\2\u017c\u017d\7J\2\2"+
		"\u017d\u017e\7W\2\2\u017e:\3\2\2\2\u017f\u0180\7k\2\2\u0180\u0181\7p\2"+
		"\2\u0181\u0182\7h\2\2\u0182<\3\2\2\2\u0183\u0184\7/\2\2\u0184\u0185\7"+
		"k\2\2\u0185\u0186\7p\2\2\u0186\u0187\7h\2\2\u0187>\3\2\2\2\u0188\u018a"+
		"\t\2\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c@\3\2\2\2\u018d\u0191\7$\2\2\u018e\u0190\13\2\2\2"+
		"\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u0192\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7$\2\2\u0195"+
		"B\3\2\2\2\u0196\u0198\7/\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019a\3\2\2\2\u0199\u019b\t\3\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dD\3\2\2\2\u019e\u01a0"+
		"\t\3\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\7.\2\2\u01a4\u01a6\t\3"+
		"\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8F\3\2\2\2\u01a9\u01ab\t\4\2\2\u01aa\u01a9\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\b$\2\2\u01afH\3\2\2\2\16\2\u0108\u0124\u0144\u0160"+
		"\u018b\u0191\u0197\u019c\u01a1\u01a7\u01ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}