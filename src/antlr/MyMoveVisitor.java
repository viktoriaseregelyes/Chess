package antlr;

import commands.ActionCommand;
import commands.EventCommand;
import commands.MoveCommand;
import game.Controller;
import game.Piece;

import java.io.IOException;
import java.util.*;

public class MyMoveVisitor extends MoveBaseVisitor<Object>  {
    private Piece piece;
    private int endX, endY, rule_num = 0;
    private ArrayList<String> dir = new ArrayList<>();
    private ArrayList<Integer> dir_num = new ArrayList<>();
    private EventCommand eventcmd;
    private boolean piece_changed = false;
    @Override
    public Object visitMoves(MoveParser.MovesContext ctx) throws IOException {
        if(Controller.GetInstance().GetGame().getPiece() != null) {
            piece = Controller.GetInstance().GetGame().getPiece();
            endX = Controller.GetInstance().GetGame().getEndX();
            endY = Controller.GetInstance().GetGame().getEndY();
            eventcmd = new EventCommand();
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

    @Override
    public Object visitPiece_rule(MoveParser.Piece_ruleContext ctx) throws IOException {
        if(ctx.piece().getText().equals(piece.GetTypeOfPiece().toString().toLowerCase()) && !piece_changed) {
            rule_num = 0;
            int moves = ctx.general_rule().move_more().move().size();
            for(int i=0; i<moves; i++) {
                dir.clear();
                dir_num.clear();

                int dirnum = ctx.general_rule().move_more().move(i).directions().size();
                int k = 0;
                while(ctx.general_rule().move_more().move(i).INT(k) != null) {
                    dir_num.add(Integer.parseInt(ctx.general_rule().move_more().move(i).INT(k).toString()));
                    k++;
                }

                for(int j=0; j<dirnum; j++) {
                    dir.add(ctx.general_rule().move_more().move(i).directions(j).getText());
                }

                MoveCommand movecmd = new MoveCommand(piece, dir, dir_num, endX, endY, eventcmd);
                rule_num += movecmd.Execute();
            }
            if(rule_num == moves) {
                game.Controller.GetInstance().GetFrame().getPlayersFrame().getGameFrame().setWarLabel("This move does not comply with any of the rules of the dummy. Step somewhere else.");
            }
            else {
                game.Controller.GetInstance().GetFrame().getPlayersFrame().getGameFrame().setWarLabel("");
            }
        }

        if(eventcmd.getHit()) {
            for(int i=0; i<ctx.rule_().size(); i++) {
                ActionCommand actioncmd = new ActionCommand(piece, ctx.rule_(i).action().getText());
                actioncmd.Execute();
                if(this.piece != actioncmd.getPiece()) {
                    this.piece = actioncmd.getPiece();
                    this.piece_changed = true;
                }
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
