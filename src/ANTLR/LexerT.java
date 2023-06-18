package ANTLR;

// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, OUTPUT=3, INPUT=4, IF=5, ELSE=6, DO=7, WHILE=8, FOR=9, 
		COSENO=10, SENO=11, SUMAR=12, RESTAR=13, MULT=14, DIV=15, POW=16, MAYOR=17, 
		MENOR=18, IGUAL=19, DISTINTO=20, OR=21, AND=22, PICHU=23, MEW=24, MEWTWO=25, 
		VARNAME=26, CHAR=27, INT=28, FLOAT=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "OUTPUT", "INPUT", "IF", "ELSE", "DO", "WHILE", "FOR", 
		"COSENO", "SENO", "SUMAR", "RESTAR", "MULT", "DIV", "POW", "MAYOR", "MENOR", 
		"IGUAL", "DISTINTO", "OR", "AND", "PICHU", "MEW", "MEWTWO", "VARNAME", 
		"CHAR", "INT", "FLOAT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'empezar combate'", "'combate finalizado'", "'yo te elijo'", "'mote'", 
		"'si'", "'sino'", "'hacer'", "'mientras'", "'para'", "'cosmog'", "'sentret'", 
		"'es curado por'", "'es atacado por'", "'junto con'", "'debilita'", "'potencia'", 
		null, null, null, null, "'o'", "'y'", "'PICHU'", "'inf'", "'-inf'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "OUTPUT", "INPUT", "IF", "ELSE", "DO", "WHILE", 
		"FOR", "COSENO", "SENO", "SUMAR", "RESTAR", "MULT", "DIV", "POW", "MAYOR", 
		"MENOR", "IGUAL", "DISTINTO", "OR", "AND", "PICHU", "MEW", "MEWTWO", "VARNAME", 
		"CHAR", "INT", "FLOAT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0189\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00e2\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00fe\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011e\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013a\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u0163\n\33\r\33\16\33\u0164\3"+
		"\34\3\34\7\34\u0169\n\34\f\34\16\34\u016c\13\34\3\34\3\34\3\35\5\35\u0171"+
		"\n\35\3\35\6\35\u0174\n\35\r\35\16\35\u0175\3\36\6\36\u0179\n\36\r\36"+
		"\16\36\u017a\3\36\3\36\6\36\u017f\n\36\r\36\16\36\u0180\3\37\6\37\u0184"+
		"\n\37\r\37\16\37\u0185\3\37\3\37\3\u016a\2 \3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\5\3\2c|\3\2\62;\5\2"+
		"\13\f\17\17\"\"\2\u0193\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5O\3\2\2\2\7b\3\2\2"+
		"\2\tn\3\2\2\2\13s\3\2\2\2\rv\3\2\2\2\17{\3\2\2\2\21\u0081\3\2\2\2\23\u008a"+
		"\3\2\2\2\25\u008f\3\2\2\2\27\u0096\3\2\2\2\31\u009e\3\2\2\2\33\u00ac\3"+
		"\2\2\2\35\u00bb\3\2\2\2\37\u00c5\3\2\2\2!\u00ce\3\2\2\2#\u00e1\3\2\2\2"+
		"%\u00fd\3\2\2\2\'\u011d\3\2\2\2)\u0139\3\2\2\2+\u014e\3\2\2\2-\u0150\3"+
		"\2\2\2/\u0152\3\2\2\2\61\u0158\3\2\2\2\63\u015c\3\2\2\2\65\u0162\3\2\2"+
		"\2\67\u0166\3\2\2\29\u0170\3\2\2\2;\u0178\3\2\2\2=\u0183\3\2\2\2?@\7g"+
		"\2\2@A\7o\2\2AB\7r\2\2BC\7g\2\2CD\7|\2\2DE\7c\2\2EF\7t\2\2FG\7\"\2\2G"+
		"H\7e\2\2HI\7q\2\2IJ\7o\2\2JK\7d\2\2KL\7c\2\2LM\7v\2\2MN\7g\2\2N\4\3\2"+
		"\2\2OP\7e\2\2PQ\7q\2\2QR\7o\2\2RS\7d\2\2ST\7c\2\2TU\7v\2\2UV\7g\2\2VW"+
		"\7\"\2\2WX\7h\2\2XY\7k\2\2YZ\7p\2\2Z[\7c\2\2[\\\7n\2\2\\]\7k\2\2]^\7|"+
		"\2\2^_\7c\2\2_`\7f\2\2`a\7q\2\2a\6\3\2\2\2bc\7{\2\2cd\7q\2\2de\7\"\2\2"+
		"ef\7v\2\2fg\7g\2\2gh\7\"\2\2hi\7g\2\2ij\7n\2\2jk\7k\2\2kl\7l\2\2lm\7q"+
		"\2\2m\b\3\2\2\2no\7o\2\2op\7q\2\2pq\7v\2\2qr\7g\2\2r\n\3\2\2\2st\7u\2"+
		"\2tu\7k\2\2u\f\3\2\2\2vw\7u\2\2wx\7k\2\2xy\7p\2\2yz\7q\2\2z\16\3\2\2\2"+
		"{|\7j\2\2|}\7c\2\2}~\7e\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\20\3\2"+
		"\2\2\u0081\u0082\7o\2\2\u0082\u0083\7k\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7u\2\2\u0089\22\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7c\2\2\u008e\24\3\2\2\2\u008f\u0090\7e\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7u\2\2\u0092\u0093\7o\2\2\u0093\u0094\7q\2\2"+
		"\u0094\u0095\7i\2\2\u0095\26\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7"+
		"g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7v\2\2\u009d\30\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0"+
		"\7u\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7w\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7q\2\2"+
		"\u00a7\u00a8\7\"\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af"+
		"\7\"\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7q\2\2"+
		"\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7l\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be"+
		"\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7\"\2\2\u00c1"+
		"\u00c2\7e\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7p\2\2\u00c4\36\3\2\2\2\u00c5"+
		"\u00c6\7f\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7n\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd \3\2\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7e\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7c\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\u00d9\7u\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7f\2\2\u00db\u00e2\7g\2"+
		"\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7i\2\2\u00e0\u00e2\7c\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7{\2"+
		"\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea"+
		"\7p\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7n\2\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7s\2\2\u00f0\u00f1\7w\2"+
		"\2\u00f1\u00f2\7g\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7"+
		"u\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7\7f\2\2\u00f7\u00fe\7g\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7i\2\2"+
		"\u00fc\u00fe\7c\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7g\2\2\u0101\u0102\7p\2\2\u0102"+
		"\u0103\7q\2\2\u0103\u0104\7t\2\2\u0104\u0105\7\"\2\2\u0105\u0106\7p\2"+
		"\2\u0106\u0107\7k\2\2\u0107\u0108\7x\2\2\u0108\u0109\7g\2\2\u0109\u010a"+
		"\7n\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7s\2\2\u010c\u010d\7w\2\2\u010d"+
		"\u010e\7g\2\2\u010e&\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7u\2\2\u0111"+
		"\u0112\7\"\2\2\u0112\u0113\7f\2\2\u0113\u0114\7g\2\2\u0114\u011e\7n\2"+
		"\2\u0115\u0116\7v\2\2\u0116\u0117\7g\2\2\u0117\u0118\7p\2\2\u0118\u0119"+
		"\7i\2\2\u0119\u011a\7c\2\2\u011a\u011b\7\"\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011e\7n\2\2\u011d\u010f\3\2\2\2\u011d\u0115\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\7o\2\2\u0120\u0121\7k\2\2\u0121\u0122\7u\2\2\u0122\u0123"+
		"\7o\2\2\u0123\u0124\7q\2\2\u0124\u0125\7\"\2\2\u0125\u0126\7p\2\2\u0126"+
		"\u0127\7k\2\2\u0127\u0128\7x\2\2\u0128\u0129\7g\2\2\u0129\u012a\7n\2\2"+
		"\u012a\u012b\7\"\2\2\u012b\u012c\7s\2\2\u012c\u012d\7w\2\2\u012d\u012e"+
		"\7g\2\2\u012e(\3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131\7u\2\2\u0131\u0132"+
		"\7\"\2\2\u0132\u0133\7f\2\2\u0133\u013a\7g\2\2\u0134\u0135\7v\2\2\u0135"+
		"\u0136\7g\2\2\u0136\u0137\7p\2\2\u0137\u0138\7i\2\2\u0138\u013a\7c\2\2"+
		"\u0139\u012f\3\2\2\2\u0139\u0134\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\7f\2\2\u013c\u013d\7k\2\2\u013d\u013e\7u\2\2\u013e\u013f\7v\2\2\u013f"+
		"\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142\u0143\7q\2\2"+
		"\u0143\u0144\7\"\2\2\u0144\u0145\7p\2\2\u0145\u0146\7k\2\2\u0146\u0147"+
		"\7x\2\2\u0147\u0148\7g\2\2\u0148\u0149\7n\2\2\u0149\u014a\7\"\2\2\u014a"+
		"\u014b\7s\2\2\u014b\u014c\7w\2\2\u014c\u014d\7g\2\2\u014d*\3\2\2\2\u014e"+
		"\u014f\7q\2\2\u014f,\3\2\2\2\u0150\u0151\7{\2\2\u0151.\3\2\2\2\u0152\u0153"+
		"\7R\2\2\u0153\u0154\7K\2\2\u0154\u0155\7E\2\2\u0155\u0156\7J\2\2\u0156"+
		"\u0157\7W\2\2\u0157\60\3\2\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a"+
		"\u015b\7h\2\2\u015b\62\3\2\2\2\u015c\u015d\7/\2\2\u015d\u015e\7k\2\2\u015e"+
		"\u015f\7p\2\2\u015f\u0160\7h\2\2\u0160\64\3\2\2\2\u0161\u0163\t\2\2\2"+
		"\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\66\3\2\2\2\u0166\u016a\7$\2\2\u0167\u0169\13\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u016b\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7$\2\2\u016e"+
		"8\3\2\2\2\u016f\u0171\7/\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0174\t\3\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176:\3\2\2\2\u0177\u0179"+
		"\t\3\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7.\2\2\u017d\u017f\t\3"+
		"\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181<\3\2\2\2\u0182\u0184\t\4\2\2\u0183\u0182\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0188\b\37\2\2\u0188>\3\2\2\2\16\2\u00e1\u00fd\u011d\u0139"+
		"\u0164\u016a\u0170\u0175\u017a\u0180\u0185\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}