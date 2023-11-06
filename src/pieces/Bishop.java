package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;
import java.lang.*;

public class Bishop extends Piece {
	public ImageIcon w_bishop = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_bishop.png");
	public ImageIcon b_bishop = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_bishop.png");
	public TypeOfPiece top = TypeOfPiece.BISHOP;

	public Bishop(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}

	public ImageIcon GetImageIcon() {
		if(this.GetType() == Type.BLACK) return b_bishop;
		return w_bishop;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
