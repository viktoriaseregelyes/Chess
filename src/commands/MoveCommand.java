package commands;

import game.Controller;
import game.ICommand;
import game.Piece;
import players.Type;

import java.io.IOException;
import java.util.List;

public class MoveCommand implements ICommand {
    private Piece piece;
    private List<String> dir;
    private List<Integer> dir_num;
    private int endX, endY, startX, startY;
    private EventCommand eventcmd;
    public MoveCommand(Piece piece, List<String> dir, List<Integer> dir_num, int endX, int endY, EventCommand eventcmd) {
        this.piece = piece;
        this.dir = dir;
        this.dir_num = dir_num;
        this.endX = endX;
        this.endY = endY;
        this.startX = piece.getX();
        this.startY = piece.getY();
        this.eventcmd = eventcmd;
    }
    @Override
    public int Execute() throws IOException {
        if(dir != null) {
            for(int i=0;i<dir.size();i++) {
                switch (dir.get(i)) {
                    case "left": if(dir_num.size()-i > 0) left(dir_num.get(i)); else left(0); break;
                    case "right": if(dir_num.size()-i > 0) right(dir_num.get(i)); else right(0); break;
                    case "forward": if(dir_num.size()-i > 0) forward(dir_num.get(i)); else forward(0); break;
                    case "backward": if(dir_num.size()-i > 0) backward(dir_num.get(i)); else backward(0); break;
                    default: System.out.println("null"); break;
                }
            }
            if((startX == endX) && (startY == endY)){
                if(Controller.getInstance().getGame().getBoard().getPiece(endX, endY) != null && Controller.getInstance().getGame().getBoard().getPiece(endX, endY) != piece) {
                    eventcmd.hitter(this.piece);
                    eventcmd.Execute();
                }
                piece.Move(endX, endY);
                Controller.getInstance().getGame().setCanmove(true);
            }
            else {
                return 1;
            }
        }
        return 0;
    }

    private void left(int num) {
        if(piece.getType() == Type.WHITE) startX = startX+num;
        if(piece.getType() == Type.BLACK) startX = startX-num;
        if(num == 0) startX = endX;
    }
    private void right(int num) {
        if(piece.getType() == Type.WHITE) startX = startX-num;
        if(piece.getType() == Type.BLACK) startX = startX+num;
        if(num == 0) startX = endX;
    }
    private void forward(int num) {
        if(piece.getType() == Type.WHITE) startY = startY+num;
        if(piece.getType() == Type.BLACK) startY = startY-num;
    }
    private void backward(int num) {
        if(piece.getType() == Type.WHITE) startY = startY-num;
        if(piece.getType() == Type.BLACK) startY = startY+num;
        if(num == 0) startY = endY;
    }
}