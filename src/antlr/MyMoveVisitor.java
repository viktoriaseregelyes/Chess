package antlr;

public class MyMoveVisitor extends MoveBaseVisitor<Object>  {
    @Override
    public Object visitMoves(MoveParser.MovesContext ctx) {
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
}
