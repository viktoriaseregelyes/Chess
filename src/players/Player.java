package players;

import game.*;

import java.io.*;
import java.lang.*;

public class Player implements Serializable {
	public String name;
	public Type type;
	public Game game;
	
	public Player(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public boolean move(Piece piece, int endX, int endY) throws NullPointerException {
		if(piece.getType() != type) return false;
		return piece.move(endX, endY);
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getName() {
		return this.name;
	}

	public Type getType() {
		return this.type;
	}

}
