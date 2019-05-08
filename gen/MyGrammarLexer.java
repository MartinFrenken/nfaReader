// Generated from C:/Users/win 10/IdeaProjects/nfaReader/src/main/java\MyGrammar.g4 by ANTLR 4.7.2
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
		EQUALS=1, COMMA=2, INTEGER=3, DEFINEFUN=4, LEFTBRACKET=5, RIGHTBRACKET=6, 
		AND=7, MODEL=8, SAT=9, UNSAT=10, EXCLAMATIONMARK=11, SINGLENUMBER=12, 
		ITE=13, COORDINATEINIT=14, COORDINATE=15, VARIABLE=16, ID=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUALS", "COMMA", "INTEGER", "DEFINEFUN", "LEFTBRACKET", "RIGHTBRACKET", 
			"AND", "MODEL", "SAT", "UNSAT", "EXCLAMATIONMARK", "SINGLENUMBER", "ITE", 
			"COORDINATEINIT", "COORDINATE", "VARIABLE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(='", "','", "'Int'", "'define-fun'", "'('", "')'", "'and'", 
			"'model'", "'sat'", "'unsat'", "'!'", null, "'ite'", "'a'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUALS", "COMMA", "INTEGER", "DEFINEFUN", "LEFTBRACKET", "RIGHTBRACKET", 
			"AND", "MODEL", "SAT", "UNSAT", "EXCLAMATIONMARK", "SINGLENUMBER", "ITE", 
			"COORDINATEINIT", "COORDINATE", "VARIABLE", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\6\21c\n\21\r\21"+
		"\16\21d\3\21\5\21h\n\21\3\21\5\21k\n\21\3\22\3\22\7\22o\n\22\f\22\16\22"+
		"r\13\22\3\23\6\23u\n\23\r\23\16\23v\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3"+
		"\2\7\3\2\62;\4\2C\\c|\5\2C\\aac|\b\2##\60\60\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2\2\7,\3\2\2\2\t\60\3\2\2\2"+
		"\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21C\3\2\2\2\23I\3\2\2\2\25M\3\2\2"+
		"\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!b\3\2\2"+
		"\2#l\3\2\2\2%t\3\2\2\2\'(\7*\2\2()\7?\2\2)\4\3\2\2\2*+\7.\2\2+\6\3\2\2"+
		"\2,-\7K\2\2-.\7p\2\2./\7v\2\2/\b\3\2\2\2\60\61\7f\2\2\61\62\7g\2\2\62"+
		"\63\7h\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7g\2\2\66\67\7/\2\2\678\7h"+
		"\2\289\7w\2\29:\7p\2\2:\n\3\2\2\2;<\7*\2\2<\f\3\2\2\2=>\7+\2\2>\16\3\2"+
		"\2\2?@\7c\2\2@A\7p\2\2AB\7f\2\2B\20\3\2\2\2CD\7o\2\2DE\7q\2\2EF\7f\2\2"+
		"FG\7g\2\2GH\7n\2\2H\22\3\2\2\2IJ\7u\2\2JK\7c\2\2KL\7v\2\2L\24\3\2\2\2"+
		"MN\7w\2\2NO\7p\2\2OP\7u\2\2PQ\7c\2\2QR\7v\2\2R\26\3\2\2\2ST\7#\2\2T\30"+
		"\3\2\2\2UV\t\2\2\2V\32\3\2\2\2WX\7k\2\2XY\7v\2\2YZ\7g\2\2Z\34\3\2\2\2"+
		"[\\\7c\2\2\\\36\3\2\2\2]^\7c\2\2^_\t\2\2\2_`\t\2\2\2` \3\2\2\2ac\t\3\2"+
		"\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\7#\2\2gf\3\2\2"+
		"\2gh\3\2\2\2hj\3\2\2\2ik\t\2\2\2ji\3\2\2\2jk\3\2\2\2k\"\3\2\2\2lp\t\4"+
		"\2\2mo\t\5\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q$\3\2\2\2rp\3\2"+
		"\2\2su\t\6\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\23"+
		"\2\2y&\3\2\2\2\b\2dgjpv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}