package antlr;

import game.Controller;
import org.antlr.v4.runtime.ParserRuleContext;
import pieces.*;
import players.Type;

public class MyBoardVisitor extends BoardBaseVisitor<Object> {
    Type playerType;
    int size;
    int row;
    int col;

    private static boolean moreThanTwoKing() {
        int countKing = Controller.GetInstance().GetGame().GetBoard().CountKings();
        return countKing >= 2;
    }

    private static String getPosition(ParserRuleContext ctx) {
        return "at line #" + ctx.getStart().getLine() + ", column #" + ctx.getStart().getCharPositionInLine();
    }

    @Override
    public Object visitBoard(BoardParser.BoardContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSize(BoardParser.SizeContext ctx) {
        if(ctx == null) {
            game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", there is no size of the board, you should give it.");
        }
        else if(!ctx.getStart().getText().equals("board size is: ")) {
            game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the board size syntax is incorrect, you should add the board size like this: 'board size is: <INT>'.");
        }

        size = Integer.parseInt(ctx.INT().getText());
        System.out.println("Size of the board: " + size + "x" + size);
        game.Controller.GetInstance().GetGame().GetBoard().CreateBoard(size);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPiecePlacement(BoardParser.PiecePlacementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPiece(BoardParser.PieceContext ctx) {
        switch(ctx.getText()) {
            case "pawn":
                Pawn pawn = new Pawn(playerType, col, row, Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(pawn);
                break;
            case "knight":
                Knight knight = new Knight(playerType, col, row, Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(knight);
                break;
            case "king":
                King king = new King(playerType, col, row, Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(king);
                break;
            case "bishop":
                Bishop bishop = new Bishop(playerType, col, row, Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(bishop);
                break;
            case "rook":
                Rook rook = new Rook(playerType, col, row, Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(rook);
                break;
            case "queen":
                Queen queen = new Queen(playerType, col, row, Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(queen);
                break;
            default:
                System.out.println("error at " + getPosition(ctx) + ", piece's type is not exist.");
                System.exit(0);
                break;
        }

        row = -1;
        col = -1;

        return visitChildren(ctx);
    }

    @Override public Object visitPlayer(BoardParser.PlayerContext ctx) {
        if (ctx.getText() == null) {
            System.out.println("error at " + getPosition(ctx) + ", there is no next player.");
            System.exit(0);
        }

        var player = ctx.getText();

        if(player.equals("white")) { playerType = Type.WHITE; }
        else if (player.equals("black")) { playerType = Type.BLACK; }
        else {
            System.out.println("error at " + getPosition(ctx) + ", player's type is not exist, it can be 'white' or 'black'.");
            System.exit(0);
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitPieceOnBoard(BoardParser.PieceOnBoardContext ctx) {
        if (ctx.INT(0).getText().equals("<missing INT>")) { game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the row and the column is missing"); }
        else if (ctx.INT(1) == null) { game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the row or the column is missing"); }

        row = Integer.parseInt(ctx.INT(0).getText()) - 1;
        col = Integer.parseInt(ctx.INT(1).getText()) - 1;

        if (row < 0) { game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the row number is lower than 1, and there is no row like that."); }
        else if (row >= size) { game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the row number is higher than the board's size, and there is no row like that."); }
        else if (col >= size) { game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the column number is higher than the board's size, and there is no column like that."); }
        else if (col < 0) { game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the column number is lower than 1, and there is no column like that."); }

        return visitChildren(ctx);
    }

    @Override
    public Object visitNextPlayer(BoardParser.NextPlayerContext ctx) {
        if(!moreThanTwoKing()) {
            game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", there is not enough kings.");
        } else if (ctx.player() == null) {
            game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", there is no next player.");
        } else if(ctx == null) {
            game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", there is no next player, you should give it.");
        } else if(!ctx.getStart().getText().equals("next player is: ")) {
            game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", the next player syntax is incorrect, you should add the next player like this: 'next player is: <Player>'.");
        }

        var player = ctx.player().getText();

        Type playerType;
        if(player.equals("white")) { playerType = Type.WHITE; }
        else if (player.equals("black")) { playerType = Type.BLACK; }
        else {
            game.Controller.GetInstance().GetFrame().setWarLabel("error at " + getPosition(ctx) + ", next player's type is not exist, it can be 'white' or 'black'.");
            return null;
        }
        game.Controller.GetInstance().GetGame().SetType(playerType);
        System.out.println("Next player visited: " + game.Controller.GetInstance().GetGame().GetType().toLowerCase());
        return visitChildren(ctx);
    }
}
