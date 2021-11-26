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

	public boolean validMove(int endX, int endY) {
		int x_diff = Math.abs(this.getX() - endX);
		int y_diff = Math.abs(this.getY() - endY);

		return ((x_diff == 2 && y_diff == 1) || (y_diff == 2 && x_diff == 1));
	}

	public boolean move(int endX, int endY) {
		if(this.validMove(endX, endY)) {
			boolean settable = false;
			if(board.getPiece(endX, endY) != null && board.getPiece(endX, endY).getType() != this.getType()) settable = true;
			if(board.getPiece(endX, endY) == null) settable = true;

			if(settable) {
				this.setX(endX);
				this.setY(endY);
				board.setPiece(this);
				return true;
			}
		}
		return false;
	}

	public ImageIcon getImageIcon() {
		if(this.getType() == Type.BLACK) return b_knight;
		return w_knight;
	}

	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
