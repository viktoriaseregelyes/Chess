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
	 * Enter a parse tree produced by {@link MoveParser#all_piece_rule}.
	 * @param ctx the parse tree
	 */
	void enterAll_piece_rule(MoveParser.All_piece_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#all_piece_rule}.
	 * @param ctx the parse tree
	 */
	void exitAll_piece_rule(MoveParser.All_piece_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#piece_rule}.
	 * @param ctx the parse tree
	 */
	void enterPiece_rule(MoveParser.Piece_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#piece_rule}.
	 * @param ctx the parse tree
	 */
	void exitPiece_rule(MoveParser.Piece_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#general_rule}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_rule(MoveParser.General_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#general_rule}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_rule(MoveParser.General_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#move_more}.
	 * @param ctx the parse tree
	 */
	void enterMove_more(MoveParser.Move_moreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#move_more}.
	 * @param ctx the parse tree
	 */
	void exitMove_more(MoveParser.Move_moreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(MoveParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(MoveParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(MoveParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(MoveParser.RuleContext ctx);
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
	 * Enter a parse tree produced by {@link MoveParser#move_again}.
	 * @param ctx the parse tree
	 */
	void enterMove_again(MoveParser.Move_againContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#move_again}.
	 * @param ctx the parse tree
	 */
	void exitMove_again(MoveParser.Move_againContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#move_dir}.
	 * @param ctx the parse tree
	 */
	void enterMove_dir(MoveParser.Move_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#move_dir}.
	 * @param ctx the parse tree
	 */
	void exitMove_dir(MoveParser.Move_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoveParser#become_piece}.
	 * @param ctx the parse tree
	 */
	void enterBecome_piece(MoveParser.Become_pieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoveParser#become_piece}.
	 * @param ctx the parse tree
	 */
	void exitBecome_piece(MoveParser.Become_pieceContext ctx);
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