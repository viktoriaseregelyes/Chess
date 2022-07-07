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

	public boolean ValidMove(int endX, int endY) {
		int x_diff = Math.abs(this.GetX() - endX);
		int y_diff = Math.abs(this.GetY() - endY);

		return ((x_diff == 2 && y_diff == 1) || (y_diff == 2 && x_diff == 1));
	}

	public boolean Move(int endX, int endY) {
		if(this.ValidMove(endX, endY)) {
			boolean settable = false;
			if(GetBoard().GetPiece(endX, endY) != null && GetBoard().GetPiece(endX, endY).GetType() != this.GetType()) settable = true;
			if(GetBoard().GetPiece(endX, endY) == null) settable = true;

			if(settable) {
				this.SetX(endX);
				this.SetY(endY);
				GetBoard().SetPiece(this);
				return true;
			}
		}
		return false;
	}

	public ImageIcon GetImageIcon() {
		if(this.GetType() == Type.BLACK) return b_knight;
		return w_knight;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
