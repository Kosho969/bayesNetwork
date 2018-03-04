// Generated from Bayes.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BayesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BayesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BayesParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(@NotNull BayesParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BayesParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(@NotNull BayesParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link BayesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull BayesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BayesParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(@NotNull BayesParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link BayesParser#var2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar2(@NotNull BayesParser.Var2Context ctx);
	/**
	 * Visit a parse tree produced by {@link BayesParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(@NotNull BayesParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BayesParser#var1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar1(@NotNull BayesParser.Var1Context ctx);
}