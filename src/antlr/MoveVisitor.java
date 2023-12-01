// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Move.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;

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
	T visitMoves(MoveParser.MovesContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link MoveParser#all_piece_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_piece_rule(MoveParser.All_piece_ruleContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link MoveParser#piece_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece_rule(MoveParser.Piece_ruleContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link MoveParser#general_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_rule(MoveParser.General_ruleContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link MoveParser#move_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_more(MoveParser.Move_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(MoveParser.MoveContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(MoveParser.RuleContext ctx) throws IOException;
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
	T visitEvent(MoveParser.EventContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link MoveParser#directions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirections(MoveParser.DirectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#move_again}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_again(MoveParser.Move_againContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#move_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_dir(MoveParser.Move_dirContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link MoveParser#become_piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBecome_piece(MoveParser.Become_pieceContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link MoveParser#move_anywhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_anywhere(MoveParser.Move_anywhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoveParser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece(MoveParser.PieceContext ctx);
}