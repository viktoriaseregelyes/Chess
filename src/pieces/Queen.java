package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;

public class Queen extends Piece {
	public ImageIcon w_queen = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_queen.png");
	public ImageIcon b_queen = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_queen.png");
	public TypeOfPiece top = TypeOfPiece.QUEEN;

	public Queen(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}

	public boolean ValidMove(int endX, int endY) {
		int x_diff = Math.abs(this.GetX() - endX);
		int y_diff = Math.abs(this.GetY() - endY);

		return (y_diff == x_diff) || (y_diff == 0 || x_diff == 0);
	}
	
	public boolean Move(int endX, int endY) {
		if(this.ValidMove(endX, endY)) {
			int dist;
			boolean settable = true;

			if(Math.abs(this.GetY() - endY) == Math.abs(this.GetX() - endX)) {
				int x_diff = 1;
				int y_diff = 1;

				dist = Math.abs(this.GetX() - endX);

				if((endX - this.GetX())<0) x_diff = -1;
				if((endY - this.GetY())<0) y_diff = -1;

				if(dist == 1) settable = true;
				else
					for(int i=2;i<dist-1;i++)
						if(GetBoard().GetPiece(this.GetX() + x_diff*i, this.GetY() + y_diff*i) != null) {
							settable = false;
							break;
						}
			}
			if(Math.abs(this.GetY() - endY) == 0 || Math.abs(this.GetX() - endX) == 0) {
				int diff = 1;

				if(Math.abs(this.GetX() - endX) != 0) {
					dist = Math.abs(this.GetX() - endX);
					if ((endX - this.GetX()) < 0) diff = -1;

					if (dist == 1) settable = true;
					else
						for (int i = 0; i < dist - 1; i++)
							if (GetBoard().GetPiece(this.GetX() + (i + 1) * diff, endY) != null) {
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
		if(this.GetType() == Type.BLACK) return b_queen;
		return w_queen;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
