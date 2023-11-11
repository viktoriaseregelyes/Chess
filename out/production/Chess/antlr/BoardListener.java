// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Board.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoardParser}.
 */
public interface BoardListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoardParser#board}.
	 * @param ctx the parse tree
	 */
	void enterBoard(BoardParser.BoardContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#board}.
	 * @param ctx the parse tree
	 */
	void exitBoard(BoardParser.BoardContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(BoardParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(BoardParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#piecePlacement}.
	 * @param ctx the parse tree
	 */
	void enterPiecePlacement(BoardParser.PiecePlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#piecePlacement}.
	 * @param ctx the parse tree
	 */
	void exitPiecePlacement(BoardParser.PiecePlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#pieceOnBoard}.
	 * @param ctx the parse tree
	 */
	void enterPieceOnBoard(BoardParser.PieceOnBoardContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieceOnBoard}.
	 * @param ctx the parse tree
	 */
	void exitPieceOnBoard(BoardParser.PieceOnBoardContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#piece}.
	 * @param ctx the parse tree
	 */
	void enterPiece(BoardParser.PieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#piece}.
	 * @param ctx the parse tree
	 */
	void exitPiece(BoardParser.PieceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#nextPlayer}.
	 * @param ctx the parse tree
	 */
	void enterNextPlayer(BoardParser.NextPlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#nextPlayer}.
	 * @param ctx the parse tree
	 */
	void exitNextPlayer(BoardParser.NextPlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(BoardParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(BoardParser.PlayerContext ctx);
}