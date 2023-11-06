package antlr;

import commands.MoveCommand;
import game.Controller;
import game.Piece;

import java.io.IOException;

public class MyMoveVisitor extends MoveBaseVisitor<Object>  {
    Piece piece;
    MoveCommand movecmd;
    @Override
    public Object visitMoves(MoveParser.MovesContext ctx) throws IOException {
        if(Controller.GetInstance().GetGame().getPiece() != null)
            piece = Controller.GetInstance().GetGame().getPiece();
        return visitChildren(ctx);
    }

    @Override
    public Object visitAll_piece_rule(MoveParser.All_piece_ruleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitGeneral_rule(MoveParser.General_ruleContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Object visitPiece_rule(MoveParser.Piece_ruleContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Object visitRule(MoveParser.RuleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMove(MoveParser.MoveContext ctx) {
        // át kéne vennie az endx, endy paramétereket, hogy bele lehessen venni a hány lépés problémáját
        movecmd = new MoveCommand(piece);
        movecmd.Execute();

        System.out.println(piece.GetX() + ", " + piece.GetY());

        return visitChildren(ctx);
    }

    @Override
    public Object visitAction(MoveParser.ActionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitEvent(MoveParser.EventContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDirections(MoveParser.DirectionsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPiece(MoveParser.PieceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMove_again(MoveParser.Move_againContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Object visitMove_dir(MoveParser.Move_dirContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Object visitBecome_piece(MoveParser.Become_pieceContext ctx) {
        return visitChildren(ctx);
    }
}
