package game;

import java.io.*;
import java.util.ArrayList;

import board.*;
import players.*;

public class Game implements Serializable {
	public Player black, white;
	public Board board;
	public Type type = Type.WHITE;

	public Game() {
		this.board = new Board(this);
	}

	public boolean round(Piece piece, int endX, int endY) {
		boolean canMove = false;
		if(type == Type.WHITE) canMove = white.move(piece, endX, endY);
		if(type == Type.BLACK) canMove = black.move(piece, endX, endY);

		switchType();
		return canMove;
	}

	public boolean endgame() {
		return board.missingKing();
	}

	public void switchType() {
		if(type == Type.WHITE) {
			type = Type.BLACK;
		}
		else type = Type.WHITE;
	}

	public Player getPlayerWhite() {
		return white;
	}

	public Player getPlayerBlack() {
		return black;
	}

	public Board getBoard() {
		return board;
	}

	public Type getType() {
		return type;
	}

	public Player getWinner() {
		if (type == Type.BLACK) return white;
		else return black;
	}

	public void setBlack(Player black) {
		this.black = black;
	}

	public void setWhite(Player white) {
		this.white = white;
	}
}
