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

	public boolean ValidMove(int endX, int endY) {
		return Math.abs(this.GetY() - endY) == Math.abs(this.GetX()-endX);
	}
	
	public boolean Move(int endX, int endY) {
		if(this.ValidMove(endX, endY)) {
			int dist = Math.abs(this.GetX() - endX);
			boolean settable = true;

			int x_diff = 1;
			int y_diff = 1;

			if((endX - this.GetX())<0) x_diff = -1;
			if((endY - this.GetY())<0) y_diff = -1;

			if(dist == 1) settable = true;
			else
				for(int i=2;i<dist-1;i++)
					if(GetBoard().GetPiece(this.GetX() + x_diff*i, this.GetY() + y_diff*i) != null) {
						settable = false;
						break;
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
		if(this.GetType() == Type.BLACK) return b_bishop;
		return w_bishop;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return this.top;
	}
}
