package ANTLR;

// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, OUTPUT=3, INPUT=4, IF=5, ELSE=6, DO=7, WHILE=8, FOR=9, 
		VARNAME=10, CHAR=11, INT=12, FLOAT=13, COSENO=14, SENO=15, SUMAR=16, RESTAR=17, 
		MULT=18, DIV=19, POW=20, MAYOR=21, MENOR=22, IGUAL=23, DISTINTO=24, OR=25, 
		AND=26, PICHU=27, MEW=28, MEWTWO=29, NUMBER=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "OUTPUT", "INPUT", "IF", "ELSE", "DO", "WHILE", "FOR", 
		"VARNAME", "CHAR", "INT", "FLOAT", "COSENO", "SENO", "SUMAR", "RESTAR", 
		"MULT", "DIV", "POW", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "OR", "AND", 
		"PICHU", "MEW", "MEWTWO", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'empezar combate'", "'combate finalizado'", "'yo te elijo'", "'mote'", 
		"'si'", "'sino'", "'hacer'", "'mientras'", "'para'", null, null, null, 
		null, "'cosmog'", "'sentret'", "'es curado por'", "'es atacado por'", 
		"'junto con'", "'debilita'", "'potencia'", null, null, null, null, "'o'", 
		"'y'", "'PICHU'", "'inf'", "'-inf'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "OUTPUT", "INPUT", "IF", "ELSE", "DO", "WHILE", 
		"FOR", "VARNAME", "CHAR", "INT", "FLOAT", "COSENO", "SENO", "SUMAR", "RESTAR", 
		"MULT", "DIV", "POW", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "OR", "AND", 
		"PICHU", "MEW", "MEWTWO", "NUMBER", "WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0190\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u0093\n\13\r\13\16\13\u0094"+
		"\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\f\3\f\3\r\5\r\u00a1\n\r\3"+
		"\r\6\r\u00a4\n\r\r\r\16\r\u00a5\3\16\6\16\u00a9\n\16\r\16\16\16\u00aa"+
		"\3\16\3\16\6\16\u00af\n\16\r\16\16\16\u00b0\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0105\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0121\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0141\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u015d\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\6\37\u0186\n\37\r\37\16\37\u0187\3 \6 \u018b\n \r \16 \u018c\3 \3 \3"+
		"\u009a\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\u019b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5Q\3\2\2\2\7d\3\2\2\2\tp\3\2\2\2\13u\3"+
		"\2\2\2\rx\3\2\2\2\17}\3\2\2\2\21\u0083\3\2\2\2\23\u008c\3\2\2\2\25\u0092"+
		"\3\2\2\2\27\u0096\3\2\2\2\31\u00a0\3\2\2\2\33\u00a8\3\2\2\2\35\u00b2\3"+
		"\2\2\2\37\u00b9\3\2\2\2!\u00c1\3\2\2\2#\u00cf\3\2\2\2%\u00de\3\2\2\2\'"+
		"\u00e8\3\2\2\2)\u00f1\3\2\2\2+\u0104\3\2\2\2-\u0120\3\2\2\2/\u0140\3\2"+
		"\2\2\61\u015c\3\2\2\2\63\u0171\3\2\2\2\65\u0173\3\2\2\2\67\u0175\3\2\2"+
		"\29\u017b\3\2\2\2;\u017f\3\2\2\2=\u0185\3\2\2\2?\u018a\3\2\2\2AB\7g\2"+
		"\2BC\7o\2\2CD\7r\2\2DE\7g\2\2EF\7|\2\2FG\7c\2\2GH\7t\2\2HI\7\"\2\2IJ\7"+
		"e\2\2JK\7q\2\2KL\7o\2\2LM\7d\2\2MN\7c\2\2NO\7v\2\2OP\7g\2\2P\4\3\2\2\2"+
		"QR\7e\2\2RS\7q\2\2ST\7o\2\2TU\7d\2\2UV\7c\2\2VW\7v\2\2WX\7g\2\2XY\7\""+
		"\2\2YZ\7h\2\2Z[\7k\2\2[\\\7p\2\2\\]\7c\2\2]^\7n\2\2^_\7k\2\2_`\7|\2\2"+
		"`a\7c\2\2ab\7f\2\2bc\7q\2\2c\6\3\2\2\2de\7{\2\2ef\7q\2\2fg\7\"\2\2gh\7"+
		"v\2\2hi\7g\2\2ij\7\"\2\2jk\7g\2\2kl\7n\2\2lm\7k\2\2mn\7l\2\2no\7q\2\2"+
		"o\b\3\2\2\2pq\7o\2\2qr\7q\2\2rs\7v\2\2st\7g\2\2t\n\3\2\2\2uv\7u\2\2vw"+
		"\7k\2\2w\f\3\2\2\2xy\7u\2\2yz\7k\2\2z{\7p\2\2{|\7q\2\2|\16\3\2\2\2}~\7"+
		"j\2\2~\177\7c\2\2\177\u0080\7e\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2"+
		"\2\u0082\20\3\2\2\2\u0083\u0084\7o\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7u\2\2\u008b\22\3\2\2\2\u008c\u008d\7r\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f\u0090\7c\2\2\u0090\24\3\2\2\2\u0091"+
		"\u0093\t\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\26\3\2\2\2\u0096\u009a\7$\2\2\u0097\u0099"+
		"\13\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\7$\2\2\u009e\30\3\2\2\2\u009f\u00a1\7/\2\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a4\t\3\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\32\3\2\2\2\u00a7\u00a9\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\7.\2\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7e\2\2"+
		"\u00b3\u00b4\7q\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7o\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7i\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb"+
		"\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7w\2"+
		"\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1"+
		"\u00d2\7\"\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7c\2"+
		"\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7t\2\2\u00dd$\3\2\2\2\u00de\u00df\7l\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7\"\2"+
		"\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7&\3\2"+
		"\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7v\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0(\3\2\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7e\2\2"+
		"\u00f7\u00f8\7k\2\2\u00f8\u00f9\7c\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7g\2"+
		"\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7f\2\2\u00fe\u0105"+
		"\7g\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7g\2\2\u0101\u0102\7p\2\2\u0102"+
		"\u0103\7i\2\2\u0103\u0105\7c\2\2\u0104\u00fa\3\2\2\2\u0104\u00ff\3\2\2"+
		"\2\u0105\u0106\3\2\2\2\u0106\u0107\7o\2\2\u0107\u0108\7c\2\2\u0108\u0109"+
		"\7{\2\2\u0109\u010a\7q\2\2\u010a\u010b\7t\2\2\u010b\u010c\7\"\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7k\2\2\u010e\u010f\7x\2\2\u010f\u0110\7g\2\2"+
		"\u0110\u0111\7n\2\2\u0111\u0112\7\"\2\2\u0112\u0113\7s\2\2\u0113\u0114"+
		"\7w\2\2\u0114\u0115\7g\2\2\u0115,\3\2\2\2\u0116\u0117\7g\2\2\u0117\u0118"+
		"\7u\2\2\u0118\u0119\7\"\2\2\u0119\u011a\7f\2\2\u011a\u0121\7g\2\2\u011b"+
		"\u011c\7v\2\2\u011c\u011d\7g\2\2\u011d\u011e\7p\2\2\u011e\u011f\7i\2\2"+
		"\u011f\u0121\7c\2\2\u0120\u0116\3\2\2\2\u0120\u011b\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\7o\2\2\u0123\u0124\7g\2\2\u0124\u0125\7p\2\2\u0125"+
		"\u0126\7q\2\2\u0126\u0127\7t\2\2\u0127\u0128\7\"\2\2\u0128\u0129\7p\2"+
		"\2\u0129\u012a\7k\2\2\u012a\u012b\7x\2\2\u012b\u012c\7g\2\2\u012c\u012d"+
		"\7n\2\2\u012d\u012e\7\"\2\2\u012e\u012f\7s\2\2\u012f\u0130\7w\2\2\u0130"+
		"\u0131\7g\2\2\u0131.\3\2\2\2\u0132\u0133\7g\2\2\u0133\u0134\7u\2\2\u0134"+
		"\u0135\7\"\2\2\u0135\u0136\7f\2\2\u0136\u0137\7g\2\2\u0137\u0141\7n\2"+
		"\2\u0138\u0139\7v\2\2\u0139\u013a\7g\2\2\u013a\u013b\7p\2\2\u013b\u013c"+
		"\7i\2\2\u013c\u013d\7c\2\2\u013d\u013e\7\"\2\2\u013e\u013f\7g\2\2\u013f"+
		"\u0141\7n\2\2\u0140\u0132\3\2\2\2\u0140\u0138\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0143\7o\2\2\u0143\u0144\7k\2\2\u0144\u0145\7u\2\2\u0145\u0146"+
		"\7o\2\2\u0146\u0147\7q\2\2\u0147\u0148\7\"\2\2\u0148\u0149\7p\2\2\u0149"+
		"\u014a\7k\2\2\u014a\u014b\7x\2\2\u014b\u014c\7g\2\2\u014c\u014d\7n\2\2"+
		"\u014d\u014e\7\"\2\2\u014e\u014f\7s\2\2\u014f\u0150\7w\2\2\u0150\u0151"+
		"\7g\2\2\u0151\60\3\2\2\2\u0152\u0153\7g\2\2\u0153\u0154\7u\2\2\u0154\u0155"+
		"\7\"\2\2\u0155\u0156\7f\2\2\u0156\u015d\7g\2\2\u0157\u0158\7v\2\2\u0158"+
		"\u0159\7g\2\2\u0159\u015a\7p\2\2\u015a\u015b\7i\2\2\u015b\u015d\7c\2\2"+
		"\u015c\u0152\3\2\2\2\u015c\u0157\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\7f\2\2\u015f\u0160\7k\2\2\u0160\u0161\7u\2\2\u0161\u0162\7v\2\2\u0162"+
		"\u0163\7k\2\2\u0163\u0164\7p\2\2\u0164\u0165\7v\2\2\u0165\u0166\7q\2\2"+
		"\u0166\u0167\7\"\2\2\u0167\u0168\7p\2\2\u0168\u0169\7k\2\2\u0169\u016a"+
		"\7x\2\2\u016a\u016b\7g\2\2\u016b\u016c\7n\2\2\u016c\u016d\7\"\2\2\u016d"+
		"\u016e\7s\2\2\u016e\u016f\7w\2\2\u016f\u0170\7g\2\2\u0170\62\3\2\2\2\u0171"+
		"\u0172\7q\2\2\u0172\64\3\2\2\2\u0173\u0174\7{\2\2\u0174\66\3\2\2\2\u0175"+
		"\u0176\7R\2\2\u0176\u0177\7K\2\2\u0177\u0178\7E\2\2\u0178\u0179\7J\2\2"+
		"\u0179\u017a\7W\2\2\u017a8\3\2\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2"+
		"\2\u017d\u017e\7h\2\2\u017e:\3\2\2\2\u017f\u0180\7/\2\2\u0180\u0181\7"+
		"k\2\2\u0181\u0182\7p\2\2\u0182\u0183\7h\2\2\u0183<\3\2\2\2\u0184\u0186"+
		"\t\3\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188>\3\2\2\2\u0189\u018b\t\4\2\2\u018a\u0189\3\2\2\2"+
		"\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u018f\b \2\2\u018f@\3\2\2\2\17\2\u0094\u009a\u00a0\u00a5"+
		"\u00aa\u00b0\u0104\u0120\u0140\u015c\u0187\u018c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}