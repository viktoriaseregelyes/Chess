package antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import pieces.*;
import players.Type;

public class MyBoardVisitor extends BoardBaseVisitor<Object> {
    Env env;
    TypeSystem ts;

    int line = 0;
    int size;

    private static String getPosition(ParserRuleContext ctx) {
        return "at line #" + ctx.getStart().getLine() + ", column #" + ctx.getStart().getCharPositionInLine();
    }

    @Override
    public Object visitBoard(BoardParser.BoardContext ctx) {
        env = new Env();
        ts = new TypeSystem();
        size = Integer.parseInt(ctx.size().getText());
        System.out.println("Size of the board: " + size + "x" + size);
        game.Controller.GetInstance().GetGame().GetBoard().CreateBoard(size);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSize(BoardParser.SizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitLine(BoardParser.LineContext ctx) {
        line++;
        if(line > size) {
            System.out.println("There are too many lines");
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitPiecePlacement(BoardParser.PiecePlacementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRank(BoardParser.RankContext ctx) {
        env = new Env(this.env);
        System.out.println("Rank visited:");
        System.out.println(env.toString());
        var result = super.visitRank(ctx);
        env = env.Previous;
        return result;
    }

    @Override
    public Object visitPiece(BoardParser.PieceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPieceOnBoard(BoardParser.PieceOnBoardContext ctx) {
        var digit = 0;
        if(ctx.digit() != null) {
            digit = Integer.parseInt(ctx.digit().getText());
            if(Integer.parseInt(ctx.digit().getText()) > size) {
                System.out.println(
                        "error at " + getPosition(ctx.digit()) + ", digit of piece is not compatible with the size of the board");
            }
            System.out.println(ctx.digit().getText());
            switch(ctx.piece().getText()) {
                case "p":
                    Pawn pawn = new Pawn(Type.BLACK,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(pawn);
                    break;
                case "n":
                    Knight knight = new Knight(Type.BLACK,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(knight);
                    break;
                case "k":
                    King king = new King(Type.BLACK,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(king);
                    break;
                case "b":
                    Bishop bishop = new Bishop(Type.BLACK,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(bishop);
                    break;
                case "r":
                    Rook rook = new Rook(Type.BLACK,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(rook);
                    break;
                case "q":
                    Queen queen = new Queen(Type.BLACK,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(queen);
                    break;
                case "P":
                    Pawn Pawn = new Pawn(Type.WHITE,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(Pawn);
                    break;
                case "N":
                    Knight Knight = new Knight(Type.WHITE,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(Knight);
                    break;
                case "K":
                    King King = new King(Type.WHITE,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(King);
                    break;
                case "B":
                    Bishop Bishop = new Bishop(Type.WHITE,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(Bishop);
                    break;
                case "R":
                    Rook Rook = new Rook(Type.WHITE,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(Rook);
                    break;
                case "Q":
                    Queen Queen = new Queen(Type.WHITE,digit,line,game.Controller.GetInstance().GetGame().GetBoard());
                    game.Controller.GetInstance().GetGame().GetBoard().SetPiece(Queen);
                    break;
                default:
                    break;
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitDigit(BoardParser.DigitContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhitePiece(BoardParser.WhitePieceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlackPiece(BoardParser.BlackPieceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitNextPlayer(BoardParser.NextPlayerContext ctx) {
        game.Controller.GetInstance().GetGame().SetType(Type.BLACK);
        System.out.println("Next player visited: " + game.Controller.GetInstance().GetGame().GetType());
        return visitChildren(ctx);
    }
}
