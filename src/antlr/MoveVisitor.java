// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Move.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MoveParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MoveVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MoveParser#moves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoves(MoveParser.MovesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#general_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_rule(MoveParser.General_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#piece_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece_rule(MoveParser.Piece_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(MoveParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(MoveParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(MoveParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#directions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirections(MoveParser.DirectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece(MoveParser.PieceContext ctx);
}