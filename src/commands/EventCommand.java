package commands;

import game.ICommand;
import game.Piece;

public class EventCommand implements ICommand {
    private boolean hit = false;
    private Piece piece;
    @Override
    public int Execute() {
        this.hit = true;
        return 0;
    }

    public void hitter(Piece piece) {
        this.piece = piece;
    }

    public boolean getHit() {
        return this.hit;
    }

    public Piece getPiece() {
        return this.piece;
    }
}
