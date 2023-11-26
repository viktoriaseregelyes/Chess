package commands;

import game.Controller;
import game.ICommand;
import game.Piece;

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
        this.piece.Move(endX, endY);

        System.out.println(endX+", "+endY);
        System.out.println(startX+", "+startY);

        Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
        Controller.getInstance().getGame().setPiece(this.piece);
        Controller.getInstance().getGame().getBoard().setPiece(this.piece);

        return 0;
    }

    public void setNumber(int num) {
        this.num = num;
        if(this.piece.getMove_times() == -1 || this.piece.getMove_times()-1 == num)
            this.piece.setMove_times(this.num);
    }
}
