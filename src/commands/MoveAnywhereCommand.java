package commands;

import game.Controller;
import game.ICommand;
import game.Piece;

import java.io.IOException;

public class MoveAnywhereCommand implements ICommand {
    private Piece piece;
    private int num;

    public MoveAnywhereCommand(Piece piece, int num) {
        this.piece = piece;
        this.num = num;
    }

    @Override
    public int Execute() throws IOException {
        if(this.piece.getMove_times() == -1)
            this.piece.setMove_times(this.num);
        return 0;
    }
}
