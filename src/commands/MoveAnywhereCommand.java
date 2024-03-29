package commands;

import game.Controller;
import pieces.Piece;

import java.io.IOException;

public class MoveAnywhereCommand implements ICommand {
    private Piece piece;
    private int num, endX, endY, startX, startY;

    public MoveAnywhereCommand(Piece piece, int endX, int endY) {
        this.piece = piece;
        this.endX = endX;
        this.endY = endY;
        this.startX = this.piece.getX();
        this.startY = this.piece.getY();
    }

    public MoveAnywhereCommand(Piece piece) {
        this.piece = piece;
    }
    @Override
    public int Execute() throws IOException {
        this.piece.setNewLocation(endX, endY);

        Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
        Controller.getInstance().getGame().setPiece(this.piece);
        Controller.getInstance().getGame().getBoard().setPiece(this.piece);

        return 0;
    }

    public void setNumber(int num) {
        this.num = num;
        if(this.piece.getMoveTimes() == -1 || this.piece.getMoveTimes()-1 == num)
            this.piece.setMoveTimes(this.num);
    }
}
