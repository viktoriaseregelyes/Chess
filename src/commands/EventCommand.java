package commands;

import game.ICommand;

public class EventCommand implements ICommand {
    private boolean hit = false;
    @Override
    public int Execute() {
        this.hit = true;
        return 0;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public boolean getHit() {
        return this.hit;
    }
}
