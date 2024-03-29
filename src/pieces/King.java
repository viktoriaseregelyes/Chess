package pieces;

import game.Board;
import game.Controller;
import players.*;
import rules.Rule;

import javax.swing.*;
import java.io.IOException;

public class King extends Piece {
	public ImageIcon w_king = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_king.png");
	public ImageIcon b_king= new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_king.png");
	public TypeOfPiece top = TypeOfPiece.KING;

	public King(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}
	public ImageIcon getImageIcon() {
		if(this.getType() == Type.BLACK) return b_king;
		return w_king;
	}
	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
