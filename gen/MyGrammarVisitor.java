// Generated from C:/Users/win 10/IdeaProjects/nfaReader/src/main/java\MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(MyGrammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#sat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSat(MyGrammarParser.SatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#modelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelDeclaration(MyGrammarParser.ModelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefine(MyGrammarParser.FunctionDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionParameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterName(MyGrammarParser.FunctionParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInput(MyGrammarParser.FunctionInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(MyGrammarParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parameterDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDefine(MyGrammarParser.ParameterDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(MyGrammarParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#numberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDeclaration(MyGrammarParser.NumberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#inputSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputSpecification(MyGrammarParser.InputSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MyGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(MyGrammarParser.AndContext ctx);
}