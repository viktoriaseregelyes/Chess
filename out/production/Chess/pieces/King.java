package pieces;

import board.Board;
import game.*;
import players.*;

import javax.swing.*;

public class King extends Piece {
	public ImageIcon w_king = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_king.png");
	public ImageIcon b_king= new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_king.png");
	public TypeOfPiece top = TypeOfPiece.KING;

	public King(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}

	public ImageIcon GetImageIcon() {
		if(this.GetType() == Type.BLACK) return b_king;
		return w_king;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
