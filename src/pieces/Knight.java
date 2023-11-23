package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;

public class Knight extends Piece {
	public ImageIcon w_knight = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_knight.png");
	public ImageIcon b_knight = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_knight.png");
	public TypeOfPiece top = TypeOfPiece.KNIGHT;

	public Knight(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}
	public ImageIcon getImageIcon() {
		if(this.getType() == Type.BLACK) return b_knight;
		return w_knight;
	}
	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
