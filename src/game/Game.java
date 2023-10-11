package game;

import board.*;
import players.*;

public class Game {
	private static Game instance = null;
	private Player black, white;
	private Board board;
	private Type type = Type.WHITE;

	public Game() {
		this.board = new Board();
	}

	public static Game GetInstance() {
		if (instance == null)
			instance = new Game();
		return instance;
	}

	public boolean Round(Piece piece, int endX, int endY) {
		boolean canMove = false;
		if(type == Type.WHITE) canMove = white.Move(piece, endX, endY);
		if(type == Type.BLACK) canMove = black.Move(piece, endX, endY);

		SwitchType();
		return canMove;
	}

	public boolean Endgame() {
		return board.MissingKing();
	}

	public void SwitchType() {
		if(type == Type.WHITE)
			type = Type.BLACK;
		else type = Type.WHITE;
	}

	public Player GetPlayerWhite() {
		return white;
	}

	public Player GetPlayerBlack() {
		return black;
	}

	public Board GetBoard() {
		return board;
	}

	public Player GetWinner() {
		if (type == Type.BLACK)
			return white;
		return black;
	}

	public void SetBlack(Player black) {
		this.black = black;
	}
	public void SetType(Type type) {
		this.type = type;
	}

	public void SetWhite(Player white) {
		this.white = white;
	}

	public String GetType() {
		return String.valueOf(type);
	}
}
