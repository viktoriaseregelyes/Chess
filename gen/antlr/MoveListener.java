// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Move.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MoveParser}.
 */
public interface MoveListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MoveParser#moves}.
	 * @param ctx the parse tree
	 */
	void enterMoves(MoveParser.MovesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#moves}.
	 * @param ctx the parse tree
	 */
	void exitMoves(MoveParser.MovesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#general_role}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_role(MoveParser.General_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#general_role}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_role(MoveParser.General_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#piece_role}.
	 * @param ctx the parse tree
	 */
	void enterPiece_role(MoveParser.Piece_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#piece_role}.
	 * @param ctx the parse tree
	 */
	void exitPiece_role(MoveParser.Piece_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(MoveParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(MoveParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(MoveParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(MoveParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(MoveParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(MoveParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#directions}.
	 * @param ctx the parse tree
	 */
	void enterDirections(MoveParser.DirectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#directions}.
	 * @param ctx the parse tree
	 */
	void exitDirections(MoveParser.DirectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#piece}.
	 * @param ctx the parse tree
	 */
	void enterPiece(MoveParser.PieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#piece}.
	 * @param ctx the parse tree
	 */
	void exitPiece(MoveParser.PieceContext ctx);
}