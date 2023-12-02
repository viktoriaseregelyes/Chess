package antlr;

import commands.ActionCommand;
import commands.EventCommand;
import commands.MoveAnywhereCommand;
import commands.MoveCommand;
import game.Controller;
import pieces.Piece;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import pieces.Queen;
import pieces.TypeOfPiece;
import rules.GeneralRule;
import rules.Rule;
import rules.SpecialRule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MyMoveVisitor extends MoveBaseVisitor<Object>  {
    private int rules;
    private MoveParser.All_piece_ruleContext allPieceRuleCtx;
    private ArrayList<String> typesOnBoard, typesWithRules = new ArrayList<>();

    private static String getPosition(ParserRuleContext ctx) {
        return "at line #" + ctx.getStart().getLine() + ", column #" + ctx.getStart().getCharPositionInLine();
    }
    private void errorMessage(String message, String position) throws IOException {
        Controller.getInstance().getErrorMessages().add("error at " + position + ", " + message);
    }
    @Override
    public Object visitMoves(MoveParser.MovesContext ctx) throws IOException {
        typesOnBoard = Controller.getInstance().getGame().getBoard().getAllPieceTypes();
        var code = Files.readString(Paths.get("inputs\\moves.cfg"));
        var inputStream = CharStreams.fromString(code);
        rules = (inputStream.toString().length() - inputStream.toString().replaceAll("rule","").length())/4 - 1;
        errorMessage("the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.", "one or more piece's name");

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
        if(!this.typesWithRules.contains(ctx.piece().getText().toUpperCase()))
            typesWithRules.add(ctx.piece().getText().toUpperCase());

        GeneralRule genRule = new GeneralRule();
        SpecialRule specRule = new SpecialRule();

        for (int k = 0; k < allPieceRuleCtx.rule_().size(); k++)
            specRule.addSpecRule(allPieceRuleCtx.rule_(k).getText());

        for (int k = 0; k < ctx.rule_().size(); k++)
            specRule.addSpecRule(ctx.rule_(k).getText());

        for (int k = 0; k < ctx.general_rule().move_more().move().size(); k++) {
            int l = 0;
            while (ctx.general_rule().move_more().move(k).INT(l) != null) {
                genRule.addDirNum(k, Integer.parseInt(ctx.general_rule().move_more().move(k).INT(l).toString()));
                l++;
            }

            for (int m=0;m<ctx.general_rule().move_more().move(k).directions().size();m++) {
                genRule.addDir(k, ctx.general_rule().move_more().move(k).directions(m).getText());
                genRule.addDirNum(k, 0);
            }

            Rule newRule = new Rule(ctx.piece().getText().toUpperCase(), genRule, specRule);
            Controller.getInstance().getGame().addRule(newRule);
        }

        rules--;
        if(rules == 0) Controller.getInstance().getErrorMessages().remove("error at one or more piece's name, the piece rule syntax is incorrect, you should add the rules like this: '<piece name> rule: <general move><rule>'.");

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
    public Object visitBecome_piece(MoveParser.Become_pieceContext ctx) throws IOException {
        if(ctx.getText().equals("become"))
            errorMessage("there is no piece type like this.", getPosition(ctx));

        if(ctx.getText().contains("become") && !this.typesWithRules.contains(ctx.getText().replace("become", "").toUpperCase())) {
            typesWithRules.add(ctx.getText().replace("become", "").toUpperCase());
        }

        if(rules == 0) {
            if(typesWithRules.size() < typesOnBoard.size())
                errorMessage("you should give all the piece rules for the pieces on the board and the 'become' pieces as well.", "the piece rules");
            else {
                for (String typesWithRule : typesWithRules)
                    for (int j = 0; j < typesOnBoard.size(); j++)
                        if (typesWithRule.equals(typesOnBoard.get(j)))
                            typesOnBoard.remove(j);

                if(!typesOnBoard.isEmpty())
                    errorMessage("you should give all the piece rules for the pieces on the board and the 'become' pieces as well.", "the piece rules");
            }
        }


        return visitChildren(ctx);
    }
}
