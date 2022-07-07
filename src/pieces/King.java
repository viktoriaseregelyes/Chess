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

	public boolean ValidMove(int endX, int endY) {
		return Math.abs(this.GetY()-endY)<=1 && Math.abs(this.GetX()-endX)<=1;
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
		if(this.GetType() == Type.BLACK) return b_king;
		return w_king;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
