// Generated from C:/Users/win 10/IdeaProjects/nfaReader/src/main/java\MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUALS=1, COMMA=2, INTEGER=3, DEFINEFUN=4, LEFTBRACKET=5, RIGHTBRACKET=6, 
		AND=7, MODEL=8, SAT=9, UNSAT=10, EXCLAMATIONMARK=11, SINGLENUMBER=12, 
		ITE=13, COORDINATEINIT=14, COORDINATE=15, VARIABLE=16, ID=17, WS=18, NUMBER=19;
	public static final int
		RULE_myStart = 0, RULE_line = 1, RULE_sat = 2, RULE_modelDeclaration = 3, 
		RULE_functionDefine = 4, RULE_functionParameterName = 5, RULE_functionInput = 6, 
		RULE_functionParameter = 7, RULE_parameterDefine = 8, RULE_coordinate = 9, 
		RULE_numberDeclaration = 10, RULE_inputSpecification = 11, RULE_name = 12, 
		RULE_and = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "line", "sat", "modelDeclaration", "functionDefine", "functionParameterName", 
			"functionInput", "functionParameter", "parameterDefine", "coordinate", 
			"numberDeclaration", "inputSpecification", "name", "and"
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
			"COORDINATEINIT", "COORDINATE", "VARIABLE", "ID", "WS", "NUMBER"
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

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMyStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SAT || _la==UNSAT) {
				{
				{
				setState(28);
				line();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public SatContext sat() {
			return getRuleContext(SatContext.class,0);
		}
		public TerminalNode UNSAT() { return getToken(MyGrammarParser.UNSAT, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				sat();
				}
				break;
			case UNSAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(UNSAT);
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

	public static class SatContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(MyGrammarParser.SAT, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(MyGrammarParser.LEFTBRACKET, 0); }
		public ModelDeclarationContext modelDeclaration() {
			return getRuleContext(ModelDeclarationContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public List<FunctionDefineContext> functionDefine() {
			return getRuleContexts(FunctionDefineContext.class);
		}
		public FunctionDefineContext functionDefine(int i) {
			return getRuleContext(FunctionDefineContext.class,i);
		}
		public SatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SatContext sat() throws RecognitionException {
		SatContext _localctx = new SatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(SAT);
			setState(41);
			match(LEFTBRACKET);
			setState(42);
			modelDeclaration();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(43);
				functionDefine();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(RIGHTBRACKET);
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

	public static class ModelDeclarationContext extends ParserRuleContext {
		public TerminalNode MODEL() { return getToken(MyGrammarParser.MODEL, 0); }
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitModelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitModelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(MODEL);
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

	public static class FunctionDefineContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(MyGrammarParser.LEFTBRACKET, 0); }
		public TerminalNode DEFINEFUN() { return getToken(MyGrammarParser.DEFINEFUN, 0); }
		public FunctionParameterContext functionParameter() {
			return getRuleContext(FunctionParameterContext.class,0);
		}
		public NumberDeclarationContext numberDeclaration() {
			return getRuleContext(NumberDeclarationContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunctionDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunctionDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFunctionDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LEFTBRACKET);
			setState(54);
			match(DEFINEFUN);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(55);
				name();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COORDINATE) {
				{
				setState(58);
				coordinate();
				}
			}

			setState(61);
			functionParameter();
			setState(62);
			numberDeclaration();
			setState(63);
			match(RIGHTBRACKET);
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

	public static class FunctionParameterNameContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MyGrammarParser.VARIABLE, 0); }
		public FunctionParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunctionParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunctionParameterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFunctionParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterNameContext functionParameterName() throws RecognitionException {
		FunctionParameterNameContext _localctx = new FunctionParameterNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionParameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(VARIABLE);
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

	public static class FunctionInputContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MyGrammarParser.EQUALS, 0); }
		public TerminalNode VARIABLE() { return getToken(MyGrammarParser.VARIABLE, 0); }
		public TerminalNode SINGLENUMBER() { return getToken(MyGrammarParser.SINGLENUMBER, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public FunctionInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunctionInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunctionInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFunctionInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInputContext functionInput() throws RecognitionException {
		FunctionInputContext _localctx = new FunctionInputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(EQUALS);
			setState(68);
			match(VARIABLE);
			setState(69);
			match(SINGLENUMBER);
			setState(70);
			match(RIGHTBRACKET);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(MyGrammarParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public List<ParameterDefineContext> parameterDefine() {
			return getRuleContexts(ParameterDefineContext.class);
		}
		public ParameterDefineContext parameterDefine(int i) {
			return getRuleContext(ParameterDefineContext.class,i);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LEFTBRACKET);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(73);
				parameterDefine();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(RIGHTBRACKET);
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

	public static class ParameterDefineContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(MyGrammarParser.LEFTBRACKET, 0); }
		public FunctionParameterNameContext functionParameterName() {
			return getRuleContext(FunctionParameterNameContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public TerminalNode INTEGER() { return getToken(MyGrammarParser.INTEGER, 0); }
		public ParameterDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParameterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParameterDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitParameterDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDefineContext parameterDefine() throws RecognitionException {
		ParameterDefineContext _localctx = new ParameterDefineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LEFTBRACKET);
			setState(82);
			functionParameterName();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(83);
				match(INTEGER);
				}
			}

			setState(86);
			match(RIGHTBRACKET);
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

	public static class CoordinateContext extends ParserRuleContext {
		public TerminalNode COORDINATE() { return getToken(MyGrammarParser.COORDINATE, 0); }
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCoordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(COORDINATE);
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

	public static class NumberDeclarationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MyGrammarParser.INTEGER, 0); }
		public TerminalNode SINGLENUMBER() { return getToken(MyGrammarParser.SINGLENUMBER, 0); }
		public InputSpecificationContext inputSpecification() {
			return getRuleContext(InputSpecificationContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public NumberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNumberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberDeclarationContext numberDeclaration() throws RecognitionException {
		NumberDeclarationContext _localctx = new NumberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numberDeclaration);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(90);
				match(INTEGER);
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLENUMBER:
					{
					setState(91);
					match(SINGLENUMBER);
					}
					break;
				case LEFTBRACKET:
					{
					setState(92);
					inputSpecification();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(95);
				match(NUMBER);
				setState(96);
				match(RIGHTBRACKET);
				}
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

	public static class InputSpecificationContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(MyGrammarParser.LEFTBRACKET, 0); }
		public TerminalNode ITE() { return getToken(MyGrammarParser.ITE, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public InputSpecificationContext inputSpecification() {
			return getRuleContext(InputSpecificationContext.class,0);
		}
		public TerminalNode SINGLENUMBER() { return getToken(MyGrammarParser.SINGLENUMBER, 0); }
		public InputSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInputSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInputSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInputSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputSpecificationContext inputSpecification() throws RecognitionException {
		InputSpecificationContext _localctx = new InputSpecificationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inputSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LEFTBRACKET);
			setState(100);
			match(ITE);
			setState(101);
			and();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(102);
				inputSpecification();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLENUMBER) {
				{
				setState(105);
				match(SINGLENUMBER);
				}
			}

			setState(108);
			match(RIGHTBRACKET);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MyGrammarParser.VARIABLE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VARIABLE);
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(MyGrammarParser.LEFTBRACKET, 0); }
		public TerminalNode AND() { return getToken(MyGrammarParser.AND, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(MyGrammarParser.RIGHTBRACKET, 0); }
		public TerminalNode SINGLENUMBER() { return getToken(MyGrammarParser.SINGLENUMBER, 0); }
		public List<FunctionInputContext> functionInput() {
			return getRuleContexts(FunctionInputContext.class);
		}
		public FunctionInputContext functionInput(int i) {
			return getRuleContext(FunctionInputContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LEFTBRACKET);
			setState(113);
			match(AND);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS) {
				{
				{
				setState(114);
				functionInput();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RIGHTBRACKET);
			setState(121);
			match(SINGLENUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25~\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3\2"+
		"\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\5\6;\n\6\3\6\5\6>\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\t\3\t\3\n\3\n\3\n\5\n"+
		"W\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f`\n\f\3\f\3\f\5\fd\n\f\3\r\3\r"+
		"\3\r\3\r\5\rj\n\r\3\r\5\rm\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17v"+
		"\n\17\f\17\16\17y\13\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\2\2{\2!\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b\65\3\2\2\2\n"+
		"\67\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20J\3\2\2\2\22S\3\2\2\2\24Z\3\2\2\2"+
		"\26c\3\2\2\2\30e\3\2\2\2\32p\3\2\2\2\34r\3\2\2\2\36 \5\4\3\2\37\36\3\2"+
		"\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\2\2\3%"+
		"\3\3\2\2\2&)\5\6\4\2\')\7\f\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\13"+
		"\2\2+,\7\7\2\2,\60\5\b\5\2-/\5\n\6\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\b\2\2\64\7\3\2\2\2"+
		"\65\66\7\n\2\2\66\t\3\2\2\2\678\7\7\2\28:\7\6\2\29;\5\32\16\2:9\3\2\2"+
		"\2:;\3\2\2\2;=\3\2\2\2<>\5\24\13\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\20"+
		"\t\2@A\5\26\f\2AB\7\b\2\2B\13\3\2\2\2CD\7\22\2\2D\r\3\2\2\2EF\7\3\2\2"+
		"FG\7\22\2\2GH\7\16\2\2HI\7\b\2\2I\17\3\2\2\2JN\7\7\2\2KM\5\22\n\2LK\3"+
		"\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\b\2\2R\21"+
		"\3\2\2\2ST\7\7\2\2TV\5\f\7\2UW\7\5\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2X"+
		"Y\7\b\2\2Y\23\3\2\2\2Z[\7\21\2\2[\25\3\2\2\2\\_\7\5\2\2]`\7\16\2\2^`\5"+
		"\30\r\2_]\3\2\2\2_^\3\2\2\2`d\3\2\2\2ab\7\25\2\2bd\7\b\2\2c\\\3\2\2\2"+
		"ca\3\2\2\2d\27\3\2\2\2ef\7\7\2\2fg\7\17\2\2gi\5\34\17\2hj\5\30\r\2ih\3"+
		"\2\2\2ij\3\2\2\2jl\3\2\2\2km\7\16\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no"+
		"\7\b\2\2o\31\3\2\2\2pq\7\22\2\2q\33\3\2\2\2rs\7\7\2\2sw\7\t\2\2tv\5\16"+
		"\b\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\b"+
		"\2\2{|\7\16\2\2|\35\3\2\2\2\16!(\60:=NV_cilw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}