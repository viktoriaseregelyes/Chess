package pieces;

import game.Controller;
import players.*;
import game.Board;
import rules.Rule;

import javax.swing.*;
import java.io.IOException;

public class Queen extends Piece {
	public ImageIcon w_queen = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_queen.png");
	public ImageIcon b_queen = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_queen.png");
	public TypeOfPiece top = TypeOfPiece.QUEEN;

	public Queen(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}
	public ImageIcon getImageIcon() {
		if(this.getType() == Type.BLACK) return b_queen;
		return w_queen;
	}
	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
