// Generated from C:/Users/Martin/IdeaProjects/nfaReader/src/main/java\MyGrammar.g4 by ANTLR 4.7.2
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
		EQUALS=1, COMMA=2, INTEGER=3, DEFINEFUN=4, LEFTBRACKET=5, STRINGTOKEN=6, 
		RIGHTBRACKET=7, AND=8, MODEL=9, SAT=10, UNSAT=11, EXCLAMATIONMARK=12, 
		SINGLENUMBER=13, QUOTE=14, ITE=15, COORDINATEINIT=16, TRUE=17, FALSE=18, 
		COORDINATE=19, STRING=20, VARIABLE=21, ID=22, WS=23, NUMBER=24;
	public static final int
		RULE_myStart = 0, RULE_line = 1, RULE_sat = 2, RULE_modelDeclaration = 3, 
		RULE_functionDefine = 4, RULE_typeDeclaration = 5, RULE_functionParameterName = 6, 
		RULE_functionInput = 7, RULE_functionParameter = 8, RULE_parameterDefine = 9, 
		RULE_coordinate = 10, RULE_numberDeclaration = 11, RULE_stringDeclaration = 12, 
		RULE_inputSpecification = 13, RULE_name = 14, RULE_and = 15, RULE_boolean = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "line", "sat", "modelDeclaration", "functionDefine", "typeDeclaration", 
			"functionParameterName", "functionInput", "functionParameter", "parameterDefine", 
			"coordinate", "numberDeclaration", "stringDeclaration", "inputSpecification", 
			"name", "and", "boolean"
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
			"VARIABLE", "ID", "WS", "NUMBER"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SAT || _la==UNSAT) {
				{
				{
				setState(34);
				line();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				sat();
				}
				break;
			case UNSAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
			setState(46);
			match(SAT);
			setState(47);
			match(LEFTBRACKET);
			setState(48);
			modelDeclaration();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(49);
				functionDefine();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
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
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
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
			setState(59);
			match(LEFTBRACKET);
			setState(60);
			match(DEFINEFUN);
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(61);
					name();
					}
				}

				}
				break;
			case 2:
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COORDINATE) {
					{
					setState(64);
					coordinate();
					}
				}

				}
				break;
			}
			setState(69);
			functionParameter();
			setState(70);
			typeDeclaration();
			setState(71);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public NumberDeclarationContext numberDeclaration() {
			return getRuleContext(NumberDeclarationContext.class,0);
		}
		public StringDeclarationContext stringDeclaration() {
			return getRuleContext(StringDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDeclaration);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				numberDeclaration();
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				stringDeclaration();
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
		enterRule(_localctx, 12, RULE_functionParameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		enterRule(_localctx, 14, RULE_functionInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(EQUALS);
			setState(80);
			match(VARIABLE);
			setState(81);
			match(SINGLENUMBER);
			setState(82);
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
		enterRule(_localctx, 16, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(LEFTBRACKET);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTBRACKET) {
				{
				{
				setState(85);
				parameterDefine();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		public TerminalNode STRINGTOKEN() { return getToken(MyGrammarParser.STRINGTOKEN, 0); }
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
		enterRule(_localctx, 18, RULE_parameterDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LEFTBRACKET);
			setState(94);
			functionParameterName();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(95);
					match(INTEGER);
					}
				}

				}
				break;
			case 2:
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRINGTOKEN) {
					{
					setState(98);
					match(STRINGTOKEN);
					}
				}

				}
				break;
			}
			setState(103);
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
		enterRule(_localctx, 20, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 22, RULE_numberDeclaration);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(107);
				match(INTEGER);
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SINGLENUMBER:
					{
					setState(108);
					match(SINGLENUMBER);
					}
					break;
				case LEFTBRACKET:
					{
					setState(109);
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
				setState(112);
				match(NUMBER);
				setState(113);
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

	public static class StringDeclarationContext extends ParserRuleContext {
		public TerminalNode STRINGTOKEN() { return getToken(MyGrammarParser.STRINGTOKEN, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(MyGrammarParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(MyGrammarParser.QUOTE, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDeclarationContext stringDeclaration() throws RecognitionException {
		StringDeclarationContext _localctx = new StringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(STRINGTOKEN);
			setState(117);
			match(QUOTE);
			setState(118);
			name();
			setState(119);
			match(QUOTE);
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
		enterRule(_localctx, 26, RULE_inputSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LEFTBRACKET);
			setState(122);
			match(ITE);
			setState(123);
			and();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTBRACKET) {
				{
				setState(124);
				inputSpecification();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLENUMBER) {
				{
				setState(127);
				match(SINGLENUMBER);
				}
			}

			setState(130);
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
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
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
		enterRule(_localctx, 28, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(STRING);
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
		enterRule(_localctx, 30, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LEFTBRACKET);
			setState(135);
			match(AND);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS) {
				{
				{
				setState(136);
				functionInput();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(RIGHTBRACKET);
			setState(143);
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

	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MyGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyGrammarParser.FALSE, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4"+
		"\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6A\n\6\3\6\5"+
		"\6D\n\6\5\6F\n\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7N\n\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\7\nY\n\n\f\n\16\n\\\13\n\3\n\3\n\3\13\3\13\3\13\5\13"+
		"c\n\13\3\13\5\13f\n\13\5\13h\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\5\rq\n"+
		"\r\3\r\3\r\5\ru\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u0080\n\17\3\17\5\17\u0083\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7"+
		"\21\u008c\n\21\f\21\16\21\u008f\13\21\3\21\3\21\3\21\3\22\3\22\3\22\2"+
		"\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\23\24\2\u0094"+
		"\2\'\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2\fM\3\2\2\2"+
		"\16O\3\2\2\2\20Q\3\2\2\2\22V\3\2\2\2\24_\3\2\2\2\26k\3\2\2\2\30t\3\2\2"+
		"\2\32v\3\2\2\2\34{\3\2\2\2\36\u0086\3\2\2\2 \u0088\3\2\2\2\"\u0093\3\2"+
		"\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'"+
		"\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,/\5\6\4\2-/\7\r\2\2.,\3\2\2\2.-\3\2\2\2"+
		"/\5\3\2\2\2\60\61\7\f\2\2\61\62\7\7\2\2\62\66\5\b\5\2\63\65\5\n\6\2\64"+
		"\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3"+
		"\2\2\29:\7\t\2\2:\7\3\2\2\2;<\7\13\2\2<\t\3\2\2\2=>\7\7\2\2>E\7\6\2\2"+
		"?A\5\36\20\2@?\3\2\2\2@A\3\2\2\2AF\3\2\2\2BD\5\26\f\2CB\3\2\2\2CD\3\2"+
		"\2\2DF\3\2\2\2E@\3\2\2\2EC\3\2\2\2FG\3\2\2\2GH\5\22\n\2HI\5\f\7\2IJ\7"+
		"\t\2\2J\13\3\2\2\2KN\5\30\r\2LN\5\32\16\2MK\3\2\2\2ML\3\2\2\2N\r\3\2\2"+
		"\2OP\7\27\2\2P\17\3\2\2\2QR\7\3\2\2RS\7\27\2\2ST\7\17\2\2TU\7\t\2\2U\21"+
		"\3\2\2\2VZ\7\7\2\2WY\5\24\13\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[]\3\2\2\2\\Z\3\2\2\2]^\7\t\2\2^\23\3\2\2\2_`\7\7\2\2`g\5\16\b\2ac\7"+
		"\5\2\2ba\3\2\2\2bc\3\2\2\2ch\3\2\2\2df\7\b\2\2ed\3\2\2\2ef\3\2\2\2fh\3"+
		"\2\2\2gb\3\2\2\2ge\3\2\2\2hi\3\2\2\2ij\7\t\2\2j\25\3\2\2\2kl\7\25\2\2"+
		"l\27\3\2\2\2mp\7\5\2\2nq\7\17\2\2oq\5\34\17\2pn\3\2\2\2po\3\2\2\2qu\3"+
		"\2\2\2rs\7\32\2\2su\7\t\2\2tm\3\2\2\2tr\3\2\2\2u\31\3\2\2\2vw\7\b\2\2"+
		"wx\7\20\2\2xy\5\36\20\2yz\7\20\2\2z\33\3\2\2\2{|\7\7\2\2|}\7\21\2\2}\177"+
		"\5 \21\2~\u0080\5\34\17\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3"+
		"\2\2\2\u0081\u0083\7\17\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\7\t\2\2\u0085\35\3\2\2\2\u0086\u0087\7\26\2"+
		"\2\u0087\37\3\2\2\2\u0088\u0089\7\7\2\2\u0089\u008d\7\n\2\2\u008a\u008c"+
		"\5\20\t\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\7\t\2\2\u0091\u0092\7\17\2\2\u0092!\3\2\2\2\u0093\u0094\t\2\2\2\u0094"+
		"#\3\2\2\2\22\'.\66@CEMZbegpt\177\u0082\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}