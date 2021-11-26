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

	public boolean validMove(int endX, int endY) {
		int x_diff = Math.abs(this.getX() - endX);
		int y_diff = Math.abs(this.getY() - endY);

		return (y_diff == x_diff) || (y_diff == 0 || x_diff == 0);
	}
	
	public boolean move(int endX, int endY) {
		if(this.validMove(endX, endY)) {
			int dist;
			boolean settable = true;

			if(Math.abs(this.getY() - endY) == Math.abs(this.getX() - endX)) {
				int x_diff = 1;
				int y_diff = 1;

				dist = Math.abs(this.getX() - endX);

				if((endX - this.getX())<0) x_diff = -1;
				if((endY - this.getY())<0) y_diff = -1;

				if(dist == 1) settable = true;
				else
					for(int i=2;i<dist-1;i++)
						if(board.getPiece(this.getX() + x_diff*i, this.getY() + y_diff*i) != null) {
							settable = false;
							break;
						}
			}
			if(Math.abs(this.getY() - endY) == 0 || Math.abs(this.getX() - endX) == 0) {
				int diff = 1;

				if(Math.abs(this.getX() - endX) != 0) {
					dist = Math.abs(this.getX() - endX);
					if ((endX - this.getX()) < 0) diff = -1;

					if (dist == 1) settable = true;
					else
						for (int i = 0; i < dist - 1; i++)
							if (board.getPiece(this.getX() + (i + 1) * diff, endY) != null) {
								settable = false;
								break;
							}
				}
				else {
					dist = Math.abs(this.getY() - endY);
					if((endY - this.getY())<0) diff = -1;

					if(dist == 1) settable = true;
					else
						for(int i=1;i<dist-1;i++)
							if(board.getPiece(endX,this.getY() + i*diff) != null) {
								settable = false;
								break;
							}
				}
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
		if(this.getType() == Type.BLACK) return b_queen;
		return w_queen;
	}

	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
