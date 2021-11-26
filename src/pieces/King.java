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

	public boolean validMove(int endX, int endY) {
		return Math.abs(this.getY()-endY)<=1 && Math.abs(this.getX()-endX)<=1;
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
		if(this.getType() == Type.BLACK) return b_king;
		return w_king;
	}

	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
