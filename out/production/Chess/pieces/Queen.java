package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;

public class Queen extends Piece {
	public ImageIcon w_queen = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_queen.png");
	public ImageIcon b_queen = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_queen.png");
	public TypeOfPiece top = TypeOfPiece.QUEEN;

	public Queen(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}

	public ImageIcon GetImageIcon() {
		if(this.GetType() == Type.BLACK) return b_queen;
		return w_queen;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
