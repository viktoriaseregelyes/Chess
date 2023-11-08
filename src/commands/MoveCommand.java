package commands;

import game.Controller;
import game.ICommand;
import game.Piece;
import players.Type;

import java.io.IOException;
import java.util.List;

public class MoveCommand implements ICommand {
    Piece piece;
    List<String> dir;
    int endX, endY;
    int startX, startY;
    public MoveCommand(Piece piece, List<String> dir, int endX, int endY) {
        this.piece = piece;
        this.dir = dir;
        this.endX = endX;
        this.endY = endY;
        this.startX = piece.GetX();
        this.startY = piece.GetY();
    }
    @Override
    public void Execute() throws IOException {
        if(dir != null) {
            for(int i=0;i<dir.size();i++) {
                switch (dir.get(i)) {
                    case "left": left(); break;
                    case "right": right(); break;
                    case "forward": forward(); break;
                    case "backward": backward(); break;
                    default: System.out.println("null"); break;
                }
            }
            if((startX == endX) && (startY == endY)){
                piece.Move(endX, endY);
                Controller.GetInstance().GetGame().setCanmove(true);
            }
            else {
                System.out.println(startX + ", " + startY + ", " + endX + ", " + endY);
            }
        }
        else {
            System.out.println("null lett");
        }
    }

    private void left() {
        if(piece.GetType() == Type.WHITE) startX = startX+1;
        if(piece.GetType() == Type.BLACK) startX = startX-1;
    }
    private void right() {
        if(piece.GetType() == Type.WHITE) startX = startX-1;
        if(piece.GetType() == Type.BLACK) startX = startX+1;
    }
    private void forward() {
        if(piece.GetType() == Type.WHITE) startY = startY+1;
        if(piece.GetType() == Type.BLACK) startY = startY-1;
    }
    private void backward() {
        if(piece.GetType() == Type.WHITE) startY = startY-1;
        if(piece.GetType() == Type.BLACK) startY = startY+1;
    }
}