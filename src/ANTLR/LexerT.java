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
		MENOR=18, IGUAL=19, DISTINTO=20, OR=21, AND=22, PICHU=23, VARNAME=24, 
		CHAR=25, INT=26, FLOAT=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "OUTPUT", "INPUT", "IF", "ELSE", "DO", "WHILE", "FOR", 
		"COSENO", "SENO", "SUMAR", "RESTAR", "MULT", "DIV", "POW", "MAYOR", "MENOR", 
		"IGUAL", "DISTINTO", "OR", "AND", "PICHU", "VARNAME", "CHAR", "INT", "FLOAT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'empezar combate'", "'combate finalizado'", "'yo te elijo'", "'mote'", 
		"'si'", "'sino'", "'hacer'", "'mientras'", "'para'", "'cosmog'", "'sentret'", 
		"'es curado por'", "'es atacado por'", "'junto con'", "'debilita'", "'potencia'", 
		null, null, null, null, "'o'", "'y'", "'PICHU'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "OUTPUT", "INPUT", "IF", "ELSE", "DO", "WHILE", 
		"FOR", "COSENO", "SENO", "SUMAR", "RESTAR", "MULT", "DIV", "POW", "MAYOR", 
		"MENOR", "IGUAL", "DISTINTO", "OR", "AND", "PICHU", "VARNAME", "CHAR", 
		"INT", "FLOAT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0183\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00de\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00fb\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u011c\n\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0139\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\6\31"+
		"\u015a\n\31\r\31\16\31\u015b\3\32\3\32\7\32\u0160\n\32\f\32\16\32\u0163"+
		"\13\32\3\32\3\32\3\33\5\33\u0168\n\33\3\33\6\33\u016b\n\33\r\33\16\33"+
		"\u016c\3\34\5\34\u0170\n\34\3\34\6\34\u0173\n\34\r\34\16\34\u0174\3\34"+
		"\3\34\6\34\u0179\n\34\r\34\16\34\u017a\3\35\6\35\u017e\n\35\r\35\16\35"+
		"\u017f\3\35\3\35\3\u0161\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\u018e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3"+
		"\2\2\2\5K\3\2\2\2\7^\3\2\2\2\tj\3\2\2\2\13o\3\2\2\2\rr\3\2\2\2\17w\3\2"+
		"\2\2\21}\3\2\2\2\23\u0086\3\2\2\2\25\u008b\3\2\2\2\27\u0092\3\2\2\2\31"+
		"\u009a\3\2\2\2\33\u00a8\3\2\2\2\35\u00b7\3\2\2\2\37\u00c1\3\2\2\2!\u00ca"+
		"\3\2\2\2#\u00dd\3\2\2\2%\u00fa\3\2\2\2\'\u011b\3\2\2\2)\u0138\3\2\2\2"+
		"+\u014e\3\2\2\2-\u0150\3\2\2\2/\u0152\3\2\2\2\61\u0159\3\2\2\2\63\u015d"+
		"\3\2\2\2\65\u0167\3\2\2\2\67\u016f\3\2\2\29\u017d\3\2\2\2;<\7g\2\2<=\7"+
		"o\2\2=>\7r\2\2>?\7g\2\2?@\7|\2\2@A\7c\2\2AB\7t\2\2BC\7\"\2\2CD\7e\2\2"+
		"DE\7q\2\2EF\7o\2\2FG\7d\2\2GH\7c\2\2HI\7v\2\2IJ\7g\2\2J\4\3\2\2\2KL\7"+
		"e\2\2LM\7q\2\2MN\7o\2\2NO\7d\2\2OP\7c\2\2PQ\7v\2\2QR\7g\2\2RS\7\"\2\2"+
		"ST\7h\2\2TU\7k\2\2UV\7p\2\2VW\7c\2\2WX\7n\2\2XY\7k\2\2YZ\7|\2\2Z[\7c\2"+
		"\2[\\\7f\2\2\\]\7q\2\2]\6\3\2\2\2^_\7{\2\2_`\7q\2\2`a\7\"\2\2ab\7v\2\2"+
		"bc\7g\2\2cd\7\"\2\2de\7g\2\2ef\7n\2\2fg\7k\2\2gh\7l\2\2hi\7q\2\2i\b\3"+
		"\2\2\2jk\7o\2\2kl\7q\2\2lm\7v\2\2mn\7g\2\2n\n\3\2\2\2op\7u\2\2pq\7k\2"+
		"\2q\f\3\2\2\2rs\7u\2\2st\7k\2\2tu\7p\2\2uv\7q\2\2v\16\3\2\2\2wx\7j\2\2"+
		"xy\7c\2\2yz\7e\2\2z{\7g\2\2{|\7t\2\2|\20\3\2\2\2}~\7o\2\2~\177\7k\2\2"+
		"\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\u0083\7"+
		"t\2\2\u0083\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\22\3\2\2\2\u0086\u0087"+
		"\7r\2\2\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089\u008a\7c\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d\7q\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7o\2\2\u008f\u0090\7q\2\2\u0090\u0091\7i\2\2\u0091\26\3\2\2\2\u0092"+
		"\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2"+
		"\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7v\2\2\u0099\30\3\2"+
		"\2\2\u009a\u009b\7g\2\2\u009b\u009c\7u\2\2\u009c\u009d\7\"\2\2\u009d\u009e"+
		"\7e\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7f\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7r\2"+
		"\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7v\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7f\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4"+
		"\7r\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6\34\3\2\2\2\u00b7\u00b8"+
		"\7l\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7q\2"+
		"\2\u00bf\u00c0\7p\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7c\2\2\u00c9 \3\2\2\2\u00ca"+
		"\u00cb\7r\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7g\2\2"+
		"\u00ce\u00cf\7p\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\"\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6"+
		"\7\"\2\2\u00d6\u00d7\7f\2\2\u00d7\u00de\7g\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7i\2\2\u00dc\u00de\7c\2\2"+
		"\u00dd\u00d3\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\7\"\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7{\2\2\u00e3"+
		"\u00e4\7q\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\7p\2"+
		"\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\7s\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f3\7\"\2\2\u00f3\u00f4\7f\2\2\u00f4\u00fb\7g\2\2\u00f5\u00f6\7v\2"+
		"\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7i\2\2\u00f9\u00fb"+
		"\7c\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7\"\2\2\u00fd\u00fe\7o\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2"+
		"\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\u0103\7\"\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7k\2\2\u0105\u0106\7x\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7s\2\2\u010a\u010b\7w\2"+
		"\2\u010b\u010c\7g\2\2\u010c&\3\2\2\2\u010d\u010e\7g\2\2\u010e\u010f\7"+
		"u\2\2\u010f\u0110\7\"\2\2\u0110\u0111\7f\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u011c\7n\2\2\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2"+
		"\u0116\u0117\7i\2\2\u0117\u0118\7c\2\2\u0118\u0119\7\"\2\2\u0119\u011a"+
		"\7g\2\2\u011a\u011c\7n\2\2\u011b\u010d\3\2\2\2\u011b\u0113\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\7\"\2\2\u011e\u011f\7o\2\2\u011f\u0120\7k\2"+
		"\2\u0120\u0121\7u\2\2\u0121\u0122\7o\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7\"\2\2\u0124\u0125\7p\2\2\u0125\u0126\7k\2\2\u0126\u0127\7x\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7n\2\2\u0129\u012a\7\"\2\2\u012a\u012b\7s\2"+
		"\2\u012b\u012c\7w\2\2\u012c\u012d\7g\2\2\u012d(\3\2\2\2\u012e\u012f\7"+
		"g\2\2\u012f\u0130\7u\2\2\u0130\u0131\7\"\2\2\u0131\u0132\7f\2\2\u0132"+
		"\u0139\7g\2\2\u0133\u0134\7v\2\2\u0134\u0135\7g\2\2\u0135\u0136\7p\2\2"+
		"\u0136\u0137\7i\2\2\u0137\u0139\7c\2\2\u0138\u012e\3\2\2\2\u0138\u0133"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\"\2\2\u013b\u013c\7f\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7u\2\2\u013e\u013f\7v\2\2\u013f\u0140\7k\2\2"+
		"\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142\u0143\7q\2\2\u0143\u0144"+
		"\7\"\2\2\u0144\u0145\7p\2\2\u0145\u0146\7k\2\2\u0146\u0147\7x\2\2\u0147"+
		"\u0148\7g\2\2\u0148\u0149\7n\2\2\u0149\u014a\7\"\2\2\u014a\u014b\7s\2"+
		"\2\u014b\u014c\7w\2\2\u014c\u014d\7g\2\2\u014d*\3\2\2\2\u014e\u014f\7"+
		"q\2\2\u014f,\3\2\2\2\u0150\u0151\7{\2\2\u0151.\3\2\2\2\u0152\u0153\7R"+
		"\2\2\u0153\u0154\7K\2\2\u0154\u0155\7E\2\2\u0155\u0156\7J\2\2\u0156\u0157"+
		"\7W\2\2\u0157\60\3\2\2\2\u0158\u015a\t\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\62\3\2\2"+
		"\2\u015d\u0161\7$\2\2\u015e\u0160\13\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\7$\2\2\u0165\64\3\2\2\2\u0166\u0168\7/\2\2"+
		"\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b"+
		"\t\3\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\66\3\2\2\2\u016e\u0170\7/\2\2\u016f\u016e\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0173\t\3\2\2\u0172\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\7.\2\2\u0177\u0179\t\3\2\2\u0178\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"8\3\2\2\2\u017c\u017e\t\4\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\b\35\2\2\u0182:\3\2\2\2\17\2\u00dd\u00fa\u011b\u0138\u015b\u0161\u0167"+
		"\u016c\u016f\u0174\u017a\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}