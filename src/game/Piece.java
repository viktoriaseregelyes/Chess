package game;

import players.*;
import pieces.*;
import board.Board;

import javax.swing.*;
import java.io.Serializable;

abstract public class Piece  implements Serializable {
	public Type type;
	public TypeOfPiece top;
	public int x, y;
	public Board board;
	
	public Piece(Type type, int x, int y, Board board) {
		this.type = type;
		this.x = x;
		this.y = y;
		this.board = board;
	}
	
	abstract public boolean validMove(int endX, int endY);
	
	abstract public boolean move(int endX, int endY);

	abstract public ImageIcon getImageIcon();
	
	public void setX(int x) {this.x=x;}
	public void setY(int y) {this.y=y;}
	public int getX() {return this.x;}
	public int getY() {return this.y;}

	public Type getType() {
		return type;
	}

	public TypeOfPiece getTypeOfPiece() {
		return this.top;
	}
}