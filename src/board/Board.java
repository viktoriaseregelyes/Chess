package board;

import game.*;
import pieces.*;
import players.Type;

import java.io.Serializable;
import java.util.*;

public class Board implements Serializable {
	public int size = 8;
	public ArrayList<ArrayList<Piece>> field = new ArrayList<>(size);
	public Game game;

	{
		for(int i=0;i<size;i++)  {
			field.add(i, new ArrayList<>(size));
			for(int j=0;j<size;j++)
				field.get(i).add(j, null);
		}
	}

	public Board(Game game) {
		this.game = game;
		field.get(3).set(7, new King(Type.BLACK, 3, 7, this));
		field.get(3).set(0, new King(Type.WHITE, 3, 0, this));
		field.get(4).set(7, new Queen(Type.BLACK, 4, 7, this));
		field.get(4).set(0, new Queen(Type.WHITE, 4, 0, this));
		field.get(2).set(7, new Bishop(Type.BLACK, 2, 7, this));
		field.get(5).set(7, new Bishop(Type.BLACK, 5, 7, this));
		field.get(2).set(0, new Bishop(Type.WHITE, 2, 0, this));
		field.get(5).set(0, new Bishop(Type.WHITE, 5 ,0, this));
		field.get(1).set(7, new Knight(Type.BLACK, 1, 7, this));
		field.get(6).set(7, new Knight(Type.BLACK, 6, 7, this));
		field.get(1).set(0, new Knight(Type.WHITE, 1, 0, this));
		field.get(6).set(0, new Knight(Type.WHITE, 6, 0, this));
		field.get(0).set(7, new Rook(Type.BLACK, 0, 7, this));
		field.get(7).set(7, new Rook(Type.BLACK, 7, 7, this));
		field.get(0).set(0, new Rook(Type.WHITE, 0, 0, this));
		field.get(7).set(0, new Rook(Type.WHITE, 7, 0, this));

		for(int i=0; i<8; i++) {
			field.get(i).set(6, new Pawn(Type.BLACK, i, 6, this));
			field.get(i).set(1, new Pawn(Type.WHITE, i, 1, this));
		}
	}

	public boolean missingKing() {
		int king = 0;
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				if(this.getPiece(i, j) != null && this.getPiece(i, j).getTypeOfPiece() == TypeOfPiece.KING) king++;
		return king != 2;
	}

	public Piece getPiece(int x, int y) throws NullPointerException {
		return field.get(x).get(y);
	}

	public void setField(int x, int y) {
		field.get(x).set(y, null);
	}

	public void setPiece(Piece piece) throws NullPointerException {
		if (piece != null) field.get(piece.getX()).set(piece.getY(), piece);
	}
}
