// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Board.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

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
	T visitSize(BoardParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#piecePlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiecePlacement(BoardParser.PiecePlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#rank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRank(BoardParser.RankContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#piece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiece(BoardParser.PieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#digit17}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit17(BoardParser.Digit17Context ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#whitePiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitePiece(BoardParser.WhitePieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#blackPiece}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlackPiece(BoardParser.BlackPieceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#nextPlayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextPlayer(BoardParser.NextPlayerContext ctx);
}