package game;

import players.*;
import pieces.*;
import board.Board;

import javax.swing.*;
import java.io.Serializable;

abstract public class Piece implements Serializable {
	private final Type type;
	private TypeOfPiece top;
	private int x, y;
	private final Board board;
	
	public Piece(Type type, int x, int y, Board board) {
		this.type = type;
		this.x = x;
		this.y = y;
		this.board = board;
	}
	public void Move(int endX, int endY) {
		this.setX(endX);
		this.setY(endY);
		getBoard().setPiece(this);
	}

	abstract public ImageIcon getImageIcon();
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	public Board getBoard() {return board;}
	public Type getType() {
		return type;
	}
	public TypeOfPiece getTypeOfPiece() {
		return top;
	}
}