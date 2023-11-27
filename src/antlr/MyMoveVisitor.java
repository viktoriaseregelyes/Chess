package antlr;

import commands.ActionCommand;
import commands.EventCommand;
import commands.MoveAnywhereCommand;
import commands.MoveCommand;
import game.Controller;
import game.Piece;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;

import java.awt.*;
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

    private void error() throws IOException {
        Controller.getInstance().getFrame().disappearButtons();
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
            var code = Files.readString(Paths.get("inputs\\moves.txt"));
            var inputStream = CharStreams.fromString(code);
            rules = (inputStream.toString().length() - inputStream.toString().replaceAll("rule","").length())/4 - 1;
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitAll_piece_rule(MoveParser.All_piece_ruleContext ctx) throws IOException {
        if(!ctx.getStart().getText().contains("all piece rule:")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the all piece syntax is incorrect, you should add the rules like this: 'all piece rule: <rule><rule>'.");
            error();
        }

        allPieceRuleCtx = ctx;
        return visitChildren(ctx);
    }
    @Override
    public Object visitGeneral_rule(MoveParser.General_ruleContext ctx) throws IOException {
        if(!ctx.getStart().getText().equals("general move:")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the general move syntax is incorrect, you should add the moves like this: 'general move: <move>, <move>'.");
            error();
        }

        for(int i = 0; i < ctx.move_more().move().size(); i++) {
            if(ctx.move_more().move(i).getText().equals("")) {
                Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the direction of the move is incorrect, you should select direction from this list: left, right, forward, backward");
                error();
            }
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitPiece_rule(MoveParser.Piece_ruleContext ctx) throws IOException {
        if(ctx.getText().contains("<missing ' rule:'>")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.");
            error();
        }

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

        if(rules == 0 && Controller.getInstance().getFrame().getWarLabel().contains(", the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.")){
            Controller.getInstance().getFrame().getPanel_war().setVisible(false);
            Controller.getInstance().getFrame().getPanel_menu().setVisible(true);
            Controller.getInstance().getFrame().getFrame().add(Controller.getInstance().getFrame().getPanel_menu(), BorderLayout.CENTER);
        }
        else if(rules != 0 && Controller.getInstance().getFrame().getWarLabel().equals("")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.");
            error();
        }

        return visitChildren(ctx);
    }
    @Override
    public Object visitRule(MoveParser.RuleContext ctx) throws IOException {
        String errorMessage = null;
        if((!ctx.getText().contains("become") && !ctx.getText().contains("move") && !ctx.getText().contains("moveagain") && !ctx.getText().contains("moveanywhere")) || ctx.getText().contains("missing")) {
            errorMessage = "error at " + getPosition(ctx) + ", the rule syntax is incorrect, you should add the rule like this: <action> when <event>, or move anywhere <INT> times in the game";
        }

        if(errorMessage != null) {
            Controller.getInstance().getFrame().setWarLabel(errorMessage);
            error();
        }

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
    public Object visitEvent(MoveParser.EventContext ctx) throws IOException {
        if(!ctx.getStart().getText().equals("hit")) {
            Controller.getInstance().getFrame().setWarLabel("error at " + getPosition(ctx) + ", the event is incorrect, you should add the rules like this: '<action> when <event>'.");
            error();
        }

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
