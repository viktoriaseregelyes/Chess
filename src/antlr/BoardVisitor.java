// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Board.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoardParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoardVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BoardParser#board}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoard(BoardParser.BoardContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(BoardParser.SizeContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link BoardParser#piecePlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiecePlacement(BoardParser.PiecePlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceOnBoard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceOnBoard(BoardParser.PieceOnBoardContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link BoardParser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece(BoardParser.PieceContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link BoardParser#nextPlayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextPlayer(BoardParser.NextPlayerContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link BoardParser#player}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer(BoardParser.PlayerContext ctx);
}