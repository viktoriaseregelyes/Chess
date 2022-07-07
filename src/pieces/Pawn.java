package pieces;

import game.*;
import players.*;
import board.Board;

import javax.swing.*;

public class Pawn extends Piece {
	public ImageIcon w_pawn = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\w_pawn.png");
	public ImageIcon b_pawn = new ImageIcon(System.getProperty("user.dir") + "\\src\\pieces_images\\b_pawn.png");
	public TypeOfPiece top = TypeOfPiece.PAWN;
	private int step = 1;

	public Pawn(Type type, int x, int y, Board board) {
		super(type, x, y, board);
	}

	public boolean ValidMove(int endX, int endY) {
		int x_diff = Math.abs(this.GetX() - endX);
		int y_diff = Math.abs(this.GetY() - endY);
		boolean valid = (y_diff == 1 && x_diff == 0);

		if(step == 1 && y_diff == 2 && x_diff == 0) valid = true;
		if(y_diff == 1 && x_diff == 1) valid = true;

		return valid;
	}
	
	public boolean Move(int endX, int endY) {
		if(this.ValidMove(endX, endY)) {
			int x_diff = Math.abs(endX - this.GetX());
			int y_diff = endY - this.GetY();
			int sign_x = 1;
			int sign_y = 1;

			if(endX - this.GetX() < 0) sign_x = -1;
			if(this.GetType() == Type.BLACK) sign_y = -1;

			boolean settable = false;
			if(x_diff == 0 && y_diff == sign_y && GetBoard().GetPiece(this.GetX(), this.GetY() + y_diff) == null) {
				settable = true;
			}

			if(x_diff == 0 && y_diff == 2*sign_y) {
				for(int i=1;i<=Math.abs(y_diff);i++) {
					if(GetBoard().GetPiece(this.GetX(), this.GetY() + i*sign_y) == null) {
						settable = true;
					}
					else {
						settable = false;
						break;
					}
				}
			}
			if(x_diff == sign_x && y_diff == sign_y) {
				if (GetBoard().GetPiece(this.GetX() + x_diff*sign_x, this.GetY() + y_diff) != null && GetBoard().GetPiece(this.GetX() + x_diff*sign_x, this.GetY() + y_diff).GetType() != this.GetType()) {
					settable = true;
				}
			}

			if(settable) {
				this.SetX(endX);
				this.SetY(endY);
				GetBoard().SetPiece(this);
				step++;
				return true;
			}
		}
		return false;
	}

	public ImageIcon GetImageIcon() {
		if(this.GetType() == Type.BLACK) {
			return b_pawn;
		}
		return w_pawn;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
