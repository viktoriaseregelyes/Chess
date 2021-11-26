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

	public boolean validMove(int endX, int endY) {
		return (Math.abs(this.getY() - endY) == 0 || Math.abs(this.getX()-endX) == 0);
	}

	public boolean move(int endX, int endY) {
		if(this.validMove(endX, endY)) {
			int dist;
			int diff = 1;
			boolean settable = true;

			if(Math.abs(this.getX() - endX) != 0) {
				dist = Math.abs(this.getX() - endX);
				if((endX - this.getX())<0) diff = -1;

				if(dist == 1) settable = true;
				else
					for(int i=1;i<dist-1;i++)
						if(board.getPiece(this.getX() + i*diff, endY) != null) {
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
		if(this.getType() == Type.BLACK) return b_rook;
		return w_rook;
	}

	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}
