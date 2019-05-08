// Generated from C:/Users/Martin/IdeaProjects/nfaReader/src/main/java\MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void enterMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void exitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MyGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MyGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#sat}.
	 * @param ctx the parse tree
	 */
	void enterSat(MyGrammarParser.SatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#sat}.
	 * @param ctx the parse tree
	 */
	void exitSat(MyGrammarParser.SatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModelDeclaration(MyGrammarParser.ModelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModelDeclaration(MyGrammarParser.ModelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefine(MyGrammarParser.FunctionDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefine(MyGrammarParser.FunctionDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MyGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MyGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionParameterName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterName(MyGrammarParser.FunctionParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionParameterName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterName(MyGrammarParser.FunctionParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionInput}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInput(MyGrammarParser.FunctionInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionInput}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInput(MyGrammarParser.FunctionInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(MyGrammarParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(MyGrammarParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parameterDefine}.
	 * @param ctx the parse tree
	 */
	void enterParameterDefine(MyGrammarParser.ParameterDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parameterDefine}.
	 * @param ctx the parse tree
	 */
	void exitParameterDefine(MyGrammarParser.ParameterDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void enterCoordinate(MyGrammarParser.CoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void exitCoordinate(MyGrammarParser.CoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNumberDeclaration(MyGrammarParser.NumberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNumberDeclaration(MyGrammarParser.NumberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stringDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclaration(MyGrammarParser.StringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stringDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclaration(MyGrammarParser.StringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#inputSpecification}.
	 * @param ctx the parse tree
	 */
	void enterInputSpecification(MyGrammarParser.InputSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#inputSpecification}.
	 * @param ctx the parse tree
	 */
	void exitInputSpecification(MyGrammarParser.InputSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MyGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MyGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MyGrammarParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MyGrammarParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MyGrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MyGrammarParser.BooleanContext ctx);
}