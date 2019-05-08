// Generated from C:/Users/Martin/IdeaProjects/nfaReader/src/main/java\MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUALS=1, COMMA=2, INTEGER=3, DEFINEFUN=4, LEFTBRACKET=5, STRINGTOKEN=6, 
		RIGHTBRACKET=7, AND=8, MODEL=9, SAT=10, UNSAT=11, EXCLAMATIONMARK=12, 
		SINGLENUMBER=13, QUOTE=14, ITE=15, COORDINATEINIT=16, TRUE=17, FALSE=18, 
		COORDINATE=19, STRING=20, VARIABLE=21, ID=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUALS", "COMMA", "INTEGER", "DEFINEFUN", "LEFTBRACKET", "STRINGTOKEN", 
			"RIGHTBRACKET", "AND", "MODEL", "SAT", "UNSAT", "EXCLAMATIONMARK", "SINGLENUMBER", 
			"QUOTE", "ITE", "COORDINATEINIT", "TRUE", "FALSE", "COORDINATE", "STRING", 
			"VARIABLE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(='", "','", "'Int'", "'define-fun'", "'('", "'String'", "')'", 
			"'and'", "'model'", "'sat'", "'unsat'", "'!'", null, "'\"'", "'ite'", 
			"'a'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUALS", "COMMA", "INTEGER", "DEFINEFUN", "LEFTBRACKET", "STRINGTOKEN", 
			"RIGHTBRACKET", "AND", "MODEL", "SAT", "UNSAT", "EXCLAMATIONMARK", "SINGLENUMBER", 
			"QUOTE", "ITE", "COORDINATEINIT", "TRUE", "FALSE", "COORDINATE", "STRING", 
			"VARIABLE", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25\u0081"+
		"\n\25\r\25\16\25\u0082\3\26\6\26\u0086\n\26\r\26\16\26\u0087\3\26\5\26"+
		"\u008b\n\26\3\26\5\26\u008e\n\26\3\27\3\27\7\27\u0092\n\27\f\27\16\27"+
		"\u0095\13\27\3\30\6\30\u0098\n\30\r\30\16\30\u0099\3\30\3\30\2\2\31\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\b\3\2\62;\5\2\62<C\\c|\4\2C\\"+
		"c|\5\2C\\aac|\b\2##\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00a2\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61"+
		"\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\t:\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17"+
		"N\3\2\2\2\21P\3\2\2\2\23T\3\2\2\2\25Z\3\2\2\2\27^\3\2\2\2\31d\3\2\2\2"+
		"\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!n\3\2\2\2#p\3\2\2\2%u\3\2\2\2\'{"+
		"\3\2\2\2)\u0080\3\2\2\2+\u0085\3\2\2\2-\u008f\3\2\2\2/\u0097\3\2\2\2\61"+
		"\62\7*\2\2\62\63\7?\2\2\63\4\3\2\2\2\64\65\7.\2\2\65\6\3\2\2\2\66\67\7"+
		"K\2\2\678\7p\2\289\7v\2\29\b\3\2\2\2:;\7f\2\2;<\7g\2\2<=\7h\2\2=>\7k\2"+
		"\2>?\7p\2\2?@\7g\2\2@A\7/\2\2AB\7h\2\2BC\7w\2\2CD\7p\2\2D\n\3\2\2\2EF"+
		"\7*\2\2F\f\3\2\2\2GH\7U\2\2HI\7v\2\2IJ\7t\2\2JK\7k\2\2KL\7p\2\2LM\7i\2"+
		"\2M\16\3\2\2\2NO\7+\2\2O\20\3\2\2\2PQ\7c\2\2QR\7p\2\2RS\7f\2\2S\22\3\2"+
		"\2\2TU\7o\2\2UV\7q\2\2VW\7f\2\2WX\7g\2\2XY\7n\2\2Y\24\3\2\2\2Z[\7u\2\2"+
		"[\\\7c\2\2\\]\7v\2\2]\26\3\2\2\2^_\7w\2\2_`\7p\2\2`a\7u\2\2ab\7c\2\2b"+
		"c\7v\2\2c\30\3\2\2\2de\7#\2\2e\32\3\2\2\2fg\t\2\2\2g\34\3\2\2\2hi\7$\2"+
		"\2i\36\3\2\2\2jk\7k\2\2kl\7v\2\2lm\7g\2\2m \3\2\2\2no\7c\2\2o\"\3\2\2"+
		"\2pq\7v\2\2qr\7t\2\2rs\7w\2\2st\7g\2\2t$\3\2\2\2uv\7h\2\2vw\7c\2\2wx\7"+
		"n\2\2xy\7u\2\2yz\7g\2\2z&\3\2\2\2{|\7c\2\2|}\t\2\2\2}~\t\2\2\2~(\3\2\2"+
		"\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083*\3\2\2\2\u0084\u0086\t\4\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u008b\7#\2\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e,\3\2\2\2\u008f\u0093\t\5\2\2\u0090\u0092"+
		"\t\6\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094.\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\t\7\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\30\2\2\u009c\60\3\2\2\2\n\2"+
		"\u0080\u0082\u0087\u008a\u008d\u0093\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}