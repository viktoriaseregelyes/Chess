package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;

public class Pawn extends Piece {
	public ImageIcon w_pawn = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_pawn.png");
	public ImageIcon b_pawn = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_pawn.png");
	public TypeOfPiece top = TypeOfPiece.PAWN;

	public Pawn(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}
	public ImageIcon getImageIcon() {
		if(this.getType() == Type.BLACK) {
			return b_pawn;
		}
		return w_pawn;
	}
	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
