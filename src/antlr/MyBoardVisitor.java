package antlr;

import game.Controller;
import org.antlr.v4.runtime.ParserRuleContext;
import pieces.*;
import players.Type;

import java.io.IOException;
import java.sql.SQLSyntaxErrorException;

public class MyBoardVisitor extends BoardBaseVisitor<Object> {
    Type playerType;
    int size = 0, row, col;

    private void errorMessage(String message, String position) throws IOException {
        Controller.getInstance().getErrorMessages().add("error at " + position + ", " + message);
    }
    private static String getPosition(ParserRuleContext ctx) {
        return "at line #" + ctx.getStart().getLine() + ", column #" + ctx.getStart().getCharPositionInLine();
    }
    @Override
    public Object visitBoard(BoardParser.BoardContext ctx) {
        return super.visitChildren(ctx);
    }
    @Override
    public Object visitSize(BoardParser.SizeContext ctx) throws IOException {
        if(ctx.getText().contains("<missing INT>")) {
            errorMessage("there is no size of the board, you should give it.", getPosition(ctx));
        }
        else if(!ctx.getStart().getText().equals("board size is:"))
            errorMessage("the board size syntax is incorrect, you should add the board size like this: 'board size is: <INT>'.", getPosition(ctx));
        else {
            size = Integer.parseInt(ctx.INT().getText());
            Controller.getInstance().getGame().getBoard().createBoard(size);
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitPiecePlacement(BoardParser.PiecePlacementContext ctx) throws IOException {
        if(!ctx.getStart().getText().equals("piece(s) on the board is:"))
            errorMessage("the piece syntax is incorrect, you should add the board size like this: 'piece(s) on the board is: <pieceRule><pieceRule>'.", getPosition(ctx));
        return visitChildren(ctx);
    }
    @Override
    public Object visitPiece(BoardParser.PieceContext ctx) throws IOException {
        if(size != 0) {
            switch (ctx.getText()) {
                case "pawn":
                    Pawn pawn = new Pawn(playerType, col, row, Controller.getInstance().getGame().getBoard());
                    Controller.getInstance().getGame().getBoard().setPiece(pawn);
                    break;
                case "knight":
                    Knight knight = new Knight(playerType, col, row, Controller.getInstance().getGame().getBoard());
                    Controller.getInstance().getGame().getBoard().setPiece(knight);
                    break;
                case "king":
                    King king = new King(playerType, col, row, Controller.getInstance().getGame().getBoard());
                    Controller.getInstance().getGame().getBoard().setPiece(king);
                    break;
                case "bishop":
                    Bishop bishop = new Bishop(playerType, col, row, Controller.getInstance().getGame().getBoard());
                    Controller.getInstance().getGame().getBoard().setPiece(bishop);
                    break;
                case "rook":
                    Rook rook = new Rook(playerType, col, row, Controller.getInstance().getGame().getBoard());
                    Controller.getInstance().getGame().getBoard().setPiece(rook);
                    break;
                case "queen":
                    Queen queen = new Queen(playerType, col, row, Controller.getInstance().getGame().getBoard());
                    Controller.getInstance().getGame().getBoard().setPiece(queen);
                    break;
                default:
                    errorMessage("piece's type is not exist.", getPosition(ctx));
                    break;
            }
            row = -1;
            col = -1;
        }

        return visitChildren(ctx);
    }
    @Override public Object visitPlayer(BoardParser.PlayerContext ctx) throws IOException {
        if (ctx.getText() == null)
            errorMessage("player's type is not exist, it can be 'white' or 'black'.", getPosition(ctx));

        var player = ctx.getText();

        if(player.equals("white")) { playerType = Type.WHITE; }
        else if (player.equals("black")) { playerType = Type.BLACK; }
        else
            errorMessage("player's type is not exist, it can be 'white' or 'black'.", getPosition(ctx));

        return visitChildren(ctx);
    }
    @Override
    public Object visitPieceOnBoard(BoardParser.PieceOnBoardContext ctx) throws IOException {
        if (ctx.INT().size() < 2 || ctx.INT(1).getText().equals("<missing INT>")) errorMessage("the row or the column is missing.", getPosition(ctx));
        else if (ctx.getText().contains("<missing 'is at row'>") || ctx.getText().contains("<missing 'column'>")) errorMessage("the piece rule is incorrect, you should give it like that: <pieceColor> <pieceType> is at row <INT> column <INT>.", getPosition(ctx));
        else {
            row = Integer.parseInt(ctx.INT(0).getText()) - 1;
            col = Integer.parseInt(ctx.INT(1).getText()) - 1;

            if (row < 0)
                errorMessage("the row number is lower than 1, and there is no row like that.", getPosition(ctx));
            else if (row >= size)
                errorMessage("the row number is higher than the board's size, and there is no row like that.", getPosition(ctx));
            else if (col >= size)
                errorMessage("the column number is higher than the board's size, and there is no column like that.", getPosition(ctx));
            else if (col < 0)
                errorMessage("the column number is lower than 1, and there is no column like that.", getPosition(ctx));
        }
        return visitChildren(ctx);
    }
    @Override
    public Object visitNextPlayer(BoardParser.NextPlayerContext ctx) throws IOException {
        if(!ctx.getText().contains("next player is:"))
            errorMessage("the next player syntax is incorrect, you should add the next player like this: 'next player is: <Player>'.", getPosition(ctx));
        else if(!Controller.getInstance().getGame().getBoard().haveKings())
            errorMessage("there is not enough kings.", getPosition(ctx));
        else if (ctx.player() == null)
            errorMessage("player's type is not exist, it can be 'white' or 'black'.", getPosition(ctx));
        else {
            var player = ctx.player().getText();

            if (player.equals("white")) playerType = Type.WHITE;
            else if (player.equals("black")) playerType = Type.BLACK;
            else {
                errorMessage("next player's type is not exist, it can be 'white' or 'black'.", getPosition(ctx));
                return null;
            }

            Controller.getInstance().getGame().setType(playerType);
        }

        return visitChildren(ctx);
    }
}
