package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;

public class Rook extends Piece {
	public ImageIcon w_rook = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_rook.png");
	public ImageIcon b_rook = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_rook.png");
	public TypeOfPiece top = TypeOfPiece.ROOK;

	public Rook(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}

	public ImageIcon GetImageIcon() {
		if(this.GetType() == Type.BLACK) return b_rook;
		return w_rook;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}