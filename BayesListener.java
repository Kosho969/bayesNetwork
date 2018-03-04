// Generated from Bayes.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BayesParser}.
 */
public interface BayesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BayesParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(@NotNull BayesParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BayesParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(@NotNull BayesParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BayesParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(@NotNull BayesParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BayesParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(@NotNull BayesParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BayesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull BayesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BayesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull BayesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BayesParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(@NotNull BayesParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BayesParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(@NotNull BayesParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link BayesParser#var2}.
	 * @param ctx the parse tree
	 */
	void enterVar2(@NotNull BayesParser.Var2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BayesParser#var2}.
	 * @param ctx the parse tree
	 */
	void exitVar2(@NotNull BayesParser.Var2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BayesParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(@NotNull BayesParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BayesParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(@NotNull BayesParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BayesParser#var1}.
	 * @param ctx the parse tree
	 */
	void enterVar1(@NotNull BayesParser.Var1Context ctx);
	/**
	 * Exit a parse tree produced by {@link BayesParser#var1}.
	 * @param ctx the parse tree
	 */
	void exitVar1(@NotNull BayesParser.Var1Context ctx);
}