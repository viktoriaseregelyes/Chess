package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;

public class Rook extends Piece {
	public ImageIcon w_rook = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_rook.png");
	public ImageIcon b_rook = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_rook.png");
	public TypeOfPiece top = TypeOfPiece.ROOK;

	public Rook(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}

	public boolean ValidMove(int endX, int endY) {
		return (Math.abs(this.GetY() - endY) == 0 || Math.abs(this.GetX()-endX) == 0);
	}

	public boolean Move(int endX, int endY) {
		if(this.ValidMove(endX, endY)) {
			int dist;
			int diff = 1;
			boolean settable = true;

			if(Math.abs(this.GetX() - endX) != 0) {
				dist = Math.abs(this.GetX() - endX);
				if((endX - this.GetX())<0) diff = -1;

				if(dist == 1) settable = true;
				else
					for(int i=1;i<dist-1;i++)
						if(GetBoard().GetPiece(this.GetX() + i*diff, endY) != null) {
							settable = false;
							break;
						}
			}
			else {
				dist = Math.abs(this.GetY() - endY);
				if((endY - this.GetY())<0) diff = -1;

				if(dist == 1) settable = true;
				else
					for(int i=1;i<dist-1;i++)
						if(GetBoard().GetPiece(endX,this.GetY() + i*diff) != null) {
							settable = false;
							break;
						}

			}
			if(settable && GetBoard().GetPiece(endX, endY) != null && GetBoard().GetPiece(endX, endY).GetType() == this.GetType()) settable = false;

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
		if(this.GetType() == Type.BLACK) return b_rook;
		return w_rook;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
