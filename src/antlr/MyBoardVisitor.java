package antlr;

import game.Controller;
import org.antlr.v4.runtime.ParserRuleContext;
import pieces.*;
import players.Type;

import java.io.IOException;

public class MyBoardVisitor extends BoardBaseVisitor<Object> {
    Type playerType;
    int size, row, col;

    private void error() throws IOException {
        Controller.getInstance().getFrame().disappearButtons();
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
        if(ctx.INT().getText().equals("<missing INT>")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", there is no size of the board, you should give it.");
            error();
        }
        if(!ctx.getStart().getText().equals("board size is:")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the board size syntax is incorrect, you should add the board size like this: 'board size is: <INT>'.");
            error();
        }

        size = Integer.parseInt(ctx.INT().getText());
        Controller.getInstance().getGame().getBoard().createBoard(size);
        return visitChildren(ctx);
    }
    @Override
    public Object visitPiecePlacement(BoardParser.PiecePlacementContext ctx) throws IOException {
        if(!ctx.getStart().getText().equals("piece(s) on the board is:")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the piece syntax is incorrect, you should add the board size like this: 'piece(s) on the board is: <pieceRule><pieceRule>'.");
            error();
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitPiece(BoardParser.PieceContext ctx) throws IOException {
        switch(ctx.getText()) {
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
                Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", piece's type is not exist.");
                error();
                break;
        }

        row = -1;
        col = -1;

        return visitChildren(ctx);
    }
    @Override public Object visitPlayer(BoardParser.PlayerContext ctx) throws IOException {
        if (ctx.getText() == null) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", player's type is not exist, it can be 'white' or 'black'.");
            error();
        }

        var player = ctx.getText();

        if(player.equals("white")) { playerType = Type.WHITE; }
        else if (player.equals("black")) { playerType = Type.BLACK; }
        else {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", player's type is not exist, it can be 'white' or 'black'.");
            error();
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitPieceOnBoard(BoardParser.PieceOnBoardContext ctx) throws IOException {
        if (ctx.INT(0).getText().equals("<missing INT>") || ctx.INT(1).getText().equals("<missing INT>")) { Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the row and the column is missing"); error(); }
        else if (ctx.getText().contains("<missing 'is at row'>") || ctx.getText().contains("<missing 'column'>")) {Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the piece rule is incorrect, you should give it like that: <pieceColor> <pieceType> is at row <INT> column <INT>"); error();}

        row = Integer.parseInt(ctx.INT(0).getText()) - 1;
        col = Integer.parseInt(ctx.INT(1).getText()) - 1;

        if (row < 0) { Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the row number is lower than 1, and there is no row like that."); error(); }
        else if (row >= size) { Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the row number is higher than the board's size, and there is no row like that."); error(); }
        else if (col >= size) { Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the column number is higher than the board's size, and there is no column like that."); error(); }
        else if (col < 0) { Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the column number is lower than 1, and there is no column like that."); error(); }

        return visitChildren(ctx);
    }
    @Override
    public Object visitNextPlayer(BoardParser.NextPlayerContext ctx) throws IOException {
        if(!ctx.getStart().getText().contains("next player is:")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the next player syntax is incorrect, you should add the next player like this: 'next player is: <Player>'.");
            error();
        }
        else if(!Controller.getInstance().getGame().getBoard().haveKings()) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", there is not enough kings.");
            error();
        }
        else if (ctx.player() == null) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", player's type is not exist, it can be 'white' or 'black'.");
            error();
        }

            var player = ctx.player().getText();

        if(player.equals("white")) { playerType = Type.WHITE; }
        else if (player.equals("black")) { playerType = Type.BLACK; }
        else {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", next player's type is not exist, it can be 'white' or 'black'.");
            error();
            return null;
        }

        Controller.getInstance().getGame().setType(playerType);
        return visitChildren(ctx);
    }
}
