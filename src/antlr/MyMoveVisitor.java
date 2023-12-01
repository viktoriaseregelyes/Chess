package antlr;

import commands.ActionCommand;
import commands.EventCommand;
import commands.MoveAnywhereCommand;
import commands.MoveCommand;
import game.Controller;
import pieces.Piece;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MyMoveVisitor extends MoveBaseVisitor<Object>  {
    private Piece piece;
    private int endX, endY, rules;
    private ArrayList<String> dir = new ArrayList<>();
    private ArrayList<Integer> dir_num = new ArrayList<>();
    private EventCommand eventcmd = new EventCommand();
    private boolean piece_changed = false, moveOver = false;
    private MoveParser.All_piece_ruleContext allPieceRuleCtx;

    /*1.kéne egy fv a boardra, ami kiszedi magából hogy milyen típusú bábuk vannak rajta
      2.kéne az, hogy milyen bábukhoz készült szabály
      3.kéne, hogy milyen bábukká lehet változni

      1-2 ki kéne ütniük egymást
      3nak ezek után ki kell ütnie a 2 maradékát

      ha ez nincs, akkor hiányzik/hiányoznak piece szabályok
     */

    private void errorMessage(String message, String position) throws IOException {
        Controller.getInstance().getErrorMessages().add("error at " + position + ", " + message);
    }

    private static String getPosition(ParserRuleContext ctx) {
        return "at line #" + ctx.getStart().getLine() + ", column #" + ctx.getStart().getCharPositionInLine();
    }
    @Override
    public Object visitMoves(MoveParser.MovesContext ctx) throws IOException {
        if(Controller.getInstance().getGame().getPiece() != null) {
            piece = Controller.getInstance().getGame().getPiece();
            endX = Controller.getInstance().getGame().getEndX();
            endY = Controller.getInstance().getGame().getEndY();
        }
        else {
            var code = Files.readString(Paths.get("inputs\\moves.cfg"));
            var inputStream = CharStreams.fromString(code);
            rules = (inputStream.toString().length() - inputStream.toString().replaceAll("rule","").length())/4 - 1;
            errorMessage("the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.", "one or more piece's name");
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitAll_piece_rule(MoveParser.All_piece_ruleContext ctx) throws IOException {
        if(!ctx.getStart().getText().contains("all piece rule:"))
            errorMessage("the all piece syntax is incorrect, you should add the rules like this: 'all piece rule: <rule><rule>'.", getPosition(ctx));
        else allPieceRuleCtx = ctx;

        return visitChildren(ctx);
    }
    @Override
    public Object visitGeneral_rule(MoveParser.General_ruleContext ctx) throws IOException {
        if(!ctx.getStart().getText().contains("general move:"))
            errorMessage("the general move syntax is incorrect, you should add the moves like this: 'general move: <move>, <move>'.", getPosition(ctx));
        else
            for (int i = 0; i < ctx.move_more().move().size(); i++)
                if (ctx.move_more().move(i).getText().equals(""))
                    errorMessage("the direction of the move is incorrect, you should select direction from this list: left, right, forward, backward.", getPosition(ctx));

        return visitChildren(ctx);
    }
    @Override
    public Object visitPiece_rule(MoveParser.Piece_ruleContext ctx) throws IOException {
        if(ctx.getText().contains("<missing ' rule:'>"))
            errorMessage("the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.", getPosition(ctx));

        if(this.piece != null) {
            if(ctx.piece().getText().equals(piece.getTypeOfPiece().toString().toLowerCase())) {
                for (int i = 0; i < allPieceRuleCtx.rule_().size(); i++) {
                    if(allPieceRuleCtx.rule_(i).getText().contains("moveanywhere")) {
                        MoveAnywhereCommand moveanywherecmd = new MoveAnywhereCommand(this.piece);
                        moveanywherecmd.setNumber(Integer.parseInt(ctx.rule_(i).move_anywhere().INT().getText()));
                    }
                }

                for (int i = 0; i < ctx.rule_().size(); i++) {
                    if(ctx.rule_(i).getText().contains("moveanywhere")) {
                        MoveAnywhereCommand moveanywherecmd = new MoveAnywhereCommand(this.piece);
                        moveanywherecmd.setNumber(Integer.parseInt(ctx.rule_(i).move_anywhere().INT().getText()));
                    }
                }
            }

            if (ctx.piece().getText().equals(piece.getTypeOfPiece().toString().toLowerCase()) && !piece_changed) {
                int rule_num = 0;
                int moves = ctx.general_rule().move_more().move().size();
                for (int i = 0; i < moves; i++) {
                    if(!moveOver) {
                        dir.clear();
                        dir_num.clear();

                        int dirnum = ctx.general_rule().move_more().move(i).directions().size();
                        int k = 0;
                        while (ctx.general_rule().move_more().move(i).INT(k) != null) {
                            dir_num.add(Integer.parseInt(ctx.general_rule().move_more().move(i).INT(k).toString()));
                            k++;
                        }

                        for (int j = 0; j < dirnum; j++) {
                            dir.add(ctx.general_rule().move_more().move(i).directions(j).getText());
                        }

                        MoveCommand movecmd = new MoveCommand(piece, dir, dir_num, endX, endY, eventcmd);
                        int moveReturn = movecmd.Execute();
                        if (moveReturn == 2) moveOver = true;
                        else rule_num += moveReturn;
                    }
                }
                if (rule_num == moves || moveOver) {
                    if(this.piece.getMove_times() > 0) {
                        Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().setWarLabel("One less step anywhere.");
                        MoveAnywhereCommand moveanywherecmd = new MoveAnywhereCommand(this.piece, this.endX, this.endY);
                        moveanywherecmd.setNumber(this.piece.getMove_times()-1);
                        moveanywherecmd.Execute();

                        Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().repaintPanel();
                        Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().switchType();
                        Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().switchState();
                    }
                    else
                        Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().setWarLabel("You're trying to move to a field that doesn't match the rules, or you're trying to step over a dummy. Step somewhere else.");
                }
                else
                    Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().setWarLabel("");

                moveOver = false;
            }

            if (eventcmd.getHit() && eventcmd.getPiece().getType() == this.piece.getType() && ctx.piece().getText().equals(piece.getTypeOfPiece().toString().toLowerCase())) {
                if (!piece_changed) {
                    for (int i = 0; i < allPieceRuleCtx.rule_().size(); i++) {
                        if(!allPieceRuleCtx.rule_(i).getText().contains("moveanywhere")) {
                            ActionCommand actioncmd = new ActionCommand(this.piece, allPieceRuleCtx.rule_(i).action().getText());
                            actioncmd.Execute();

                            this.piece = actioncmd.getPiece();
                        }

                        if(allPieceRuleCtx.rule_(i).getText().contains("moveanywhere")) {
                            MoveAnywhereCommand moveanywherecmd = new MoveAnywhereCommand(this.piece);
                            moveanywherecmd.setNumber(Integer.parseInt(ctx.rule_(i).move_anywhere().INT().getText()));
                        }
                    }

                    for (int j = 0; j < ctx.rule_().size(); j++) {
                        if(!ctx.rule_(j).getText().contains("moveanywhere")) {
                            ActionCommand actioncmd = new ActionCommand(this.piece, ctx.rule_(j).action().getText());
                            actioncmd.Execute();

                            if (this.piece != actioncmd.getPiece())
                                this.piece_changed = true;

                            this.piece = actioncmd.getPiece();
                        }
                    }
                }
            }
        }
        else
            rules--;

        if(rules == 0)
            Controller.getInstance().getErrorMessages().remove("error at one or more piece's name, the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.");

        return visitChildren(ctx);
    }
    @Override
    public Object visitRule(MoveParser.RuleContext ctx) throws IOException {
        if((!ctx.getText().contains("become") && !ctx.getText().contains("moveforward") && !ctx.getText().contains("moveright") && !ctx.getText().contains("moveleft") && !ctx.getText().contains("movebackward") && !ctx.getText().contains("moveagain") && !ctx.getText().contains("moveanywhere")) || ctx.getText().contains("missing"))
            errorMessage("the rule syntax is incorrect, you should add the rule like this: <action> when <event>, or move anywhere <INT> times in the game", getPosition(ctx));

        return visitChildren(ctx);
    }
    @Override
    public Object visitMove(MoveParser.MoveContext ctx)  {
        return visitChildren(ctx);
    }
    @Override
    public Object visitAction(MoveParser.ActionContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Object visitEvent(MoveParser.EventContext ctx) throws IOException {
        if(!ctx.getStart().getText().equals("hit"))
            errorMessage("the event is incorrect, you should add the rules like this: '<action> when <event>'.", getPosition(ctx));

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
