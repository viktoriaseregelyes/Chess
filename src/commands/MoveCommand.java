package commands;

import game.Controller;
import pieces.Piece;
import pieces.TypeOfPiece;
import players.Type;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static java.lang.Math.abs;

public class MoveCommand implements ICommand {
    private Piece piece;
    private List<String> dir;
    private List<Integer> dir_num;
    private int endX, endY, startX, startY;
    private EventCommand eventcmd;
    private boolean moveOver = false, noTable = false;

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
            if(dir.size() == 2 && dir_num.get(0) == dir_num.get(1)) {
                int num = dir_num.get(0);
                if(dir_num.get(0) == 0)
                    num = abs(startX - endX);

                for(int i=0;i<num;i++) {
                    switch (dir.get(0)) {
                        case "left": left(1); break;
                        case "right": right(1); break;
                        case "forward": forward(1); break;
                        case "backward": backward(1); break;
                        default: break;
                    }
                    switch (dir.get(1)) {
                        case "left": left(1); break;
                        case "right": right(1); break;
                        case "forward": forward(1); break;
                        case "backward": backward(1); break;
                        default: break;
                    }
                    if(Controller.getInstance().getGame().getBoard().getPiece(startX , startY) == null)
                        moveOver = false;
                }
            }
            else {
                for(int i=0;i<dir.size();i++) {
                    switch (dir.get(i)) {
                        case "left": if(dir_num.size()-i > 0) left(dir_num.get(i)); else left(0); break;
                        case "right": if(dir_num.size()-i > 0) right(dir_num.get(i)); else right(0); break;
                        case "forward": if(dir_num.size()-i > 0) forward(dir_num.get(i)); else forward(0); break;
                        case "backward": if(dir_num.size()-i > 0) backward(dir_num.get(i)); else backward(0); break;
                        default: break;
                    }
                }
            }
            if(noTable) {
                return 1;
            }
            if(moveOver && piece.getTypeOfPiece() != TypeOfPiece.KNIGHT) {
                return 2;
            }
            if((startX == endX) && (startY == endY)) {
                if(Controller.getInstance().getGame().getBoard().getPiece(endX, endY) != null && Controller.getInstance().getGame().getBoard().getPiece(endX, endY) != piece && Controller.getInstance().getGame().getBoard().getPiece(endX, endY).getType() != piece.getType()) {
                    eventcmd.hitter(this.piece);
                    eventcmd.Execute();
                }
                if(Controller.getInstance().getGame().getBoard().getPiece(endX, endY) == null || Controller.getInstance().getGame().getBoard().getPiece(endX, endY).getType() != piece.getType()) {
                    piece.setNewLocation(endX, endY);
                    Controller.getInstance().getGame().setCanmove(true);
                }
                else {
                    return 1;
                }
            }
            else {
                return 1;
            }
        }
        return 0;
    }
    private void left(int num) throws IOException {
        if(num == 0)
            num = abs(startX - endX);

        if(piece.getType() == Type.BLACK) {
            for(int i = 1; i < num; i++) {
                if (startX - num < 0) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX - i, startY) != null)
                    moveOver = true;
            }
            if (startX - num >= 0)
                startX = startX-num;
            else noTable = true;
        }
        if(piece.getType() == Type.WHITE) {
            for(int i = 1; i < num; i++) {
                if (startX + num >= Controller.getInstance().getGame().getBoard().getSize()) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX + i, startY) != null)
                    moveOver = true;
            }
            if (startX + num < Controller.getInstance().getGame().getBoard().getSize())
                startX = startX+num;
            else noTable = true;
        }
    }
    private void right(int num) throws IOException {
        if(num == 0)
            num = abs(startX - endX);

        if(piece.getType() == Type.WHITE) {
            for(int i = 1; i < num; i++) {
                if (startX-num < 0) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX-i, startY) != null)
                    moveOver = true;
            }
            if (startX-num >= 0)
                startX = startX-num;
            else noTable = true;
        }
        if(piece.getType() == Type.BLACK) {
            for(int i = 1; i < num; i++) {
                if (startX + num >= Controller.getInstance().getGame().getBoard().getSize()) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX + i, startY) != null)
                    moveOver = true;
            }
            if (startX + num < Controller.getInstance().getGame().getBoard().getSize())
                startX = startX+num;
            else noTable = true;
        }
    }
    private void forward(int num) throws IOException {
        if(num == 0)
            num = abs(startY-endY);

        if(piece.getType() == Type.WHITE) {
            for(int i = 1; i < num; i++) {
                if (startY + num >= Controller.getInstance().getGame().getBoard().getSize()) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX, startY + i) != null)
                    moveOver = true;
            }
            if (startY + num < Controller.getInstance().getGame().getBoard().getSize())
                startY = startY+num;
            else noTable = true;
        }
        if(piece.getType() == Type.BLACK) {
            for(int i = 1; i < num; i++) {
                if (startY - num < 0) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX, startY - i) != null)
                    moveOver = true;
            }
            if (startY - num >= 0)
                startY = startY-num;
            else noTable = true;
        }
    }
    private void backward(int num) throws IOException {
        if(num == 0)
            num = abs(startY - endY);

        if(piece.getType() == Type.BLACK) {
            for(int i = 1; i < num; i++) {
                if(startY+num >= Controller.getInstance().getGame().getBoard().getSize()) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX, startY + i) != null)
                    moveOver = true;
            }
            if(startY+num < Controller.getInstance().getGame().getBoard().getSize())
                startY = startY+num;
            else noTable = true;
        }
        if(piece.getType() == Type.WHITE) {
            for(int i = 1; i < num; i++) {
                if(startY-num < 0) return;
                if (Controller.getInstance().getGame().getBoard().getPiece(startX, startY-i) != null)
                    moveOver = true;
            }
            if(startY-num >= 0)
                startY = startY-num;
            else noTable = true;
        }
    }
}