package game;

import players.*;

import java.io.*;

public class Result implements Serializable {
    private static final long serialVersionUID = 5836294106830313151L;
    public Player white, black, winner;

    public Result(Player white, Player black, Player winner) {
        super();
        this.white = white;
        this.black = black;
        this.winner = winner;
    }

    public String getPlayerWhite() {
        return this.white.GetName();
    }
    public String getPlayerBlack() {
        return this.black.GetName();
    }
    public String getWinner() {
        return this.winner.GetName();
    }
}
