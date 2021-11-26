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

	public boolean validMove(int endX, int endY) {
		return Math.abs(this.getY() - endY) == Math.abs(this.getX()-endX);
	}
	
	public boolean move(int endX, int endY) {
		if(this.validMove(endX, endY)) {
			int dist = Math.abs(this.getX() - endX);
			boolean settable = true;

			int x_diff = 1;
			int y_diff = 1;

			if((endX - this.getX())<0) x_diff = -1;
			if((endY - this.getY())<0) y_diff = -1;

			if(dist == 1) settable = true;
			else
				for(int i=2;i<dist-1;i++)
					if(board.getPiece(this.getX() + x_diff*i, this.getY() + y_diff*i) != null) {
						settable = false;
						break;
					}

			if(settable && board.getPiece(endX, endY) != null && board.getPiece(endX, endY).getType() == this.getType()) settable = false;

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
		if(this.getType() == Type.BLACK) return b_bishop;
		return w_bishop;
	}

	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
