package antlr;

import commands.MoveCommand;
import game.Controller;
import game.Piece;

import java.io.IOException;
import java.util.*;

public class MyMoveVisitor extends MoveBaseVisitor<Object>  {
    private Piece piece;
    private int endX, endY;
    private ArrayList<String> dir = new ArrayList<>();
    @Override
    public Object visitMoves(MoveParser.MovesContext ctx) throws IOException {
        if(Controller.GetInstance().GetGame().getPiece() != null) {
            piece = Controller.GetInstance().GetGame().getPiece();
            endX = Controller.GetInstance().GetGame().getEndX();
            endY = Controller.GetInstance().GetGame().getEndY();
        }
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

    /**
     * nincs kezelve a lépésszám
     * **/
    @Override
    public Object visitPiece_rule(MoveParser.Piece_ruleContext ctx) throws IOException {
        if(ctx.piece().getText().equals(piece.GetTypeOfPiece().toString().toLowerCase())) {
            int moves = ctx.general_rule().move_more().move().size();
            for(int i=0; i<moves; i++) {
                dir.clear();
                int dirnum = ctx.general_rule().move_more().move(i).directions().size();
                for(int j=0; j<dirnum; j++) {
                    dir.add(ctx.general_rule().move_more().move(i).directions(j).getText());
                }
                MoveCommand movecmd = new MoveCommand(piece, dir, endX, endY);
                movecmd.Execute();
            }
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitRule(MoveParser.RuleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMove(MoveParser.MoveContext ctx) {
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
