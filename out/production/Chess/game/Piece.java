package game;

import players.*;
import pieces.*;
import board.Board;

import javax.swing.*;
import java.io.Serializable;

abstract public class Piece implements Serializable {
	private Type type;
	private TypeOfPiece top;
	private int x, y;
	private Board board;
	
	public Piece(Type type, int x, int y, Board board) {
		this.type = type;
		this.x = x;
		this.y = y;
		this.board = board;
	}
	public void Move(int endX, int endY) {
		this.SetX(endX);
		this.SetY(endY);
		GetBoard().SetPiece(this);
	}

	abstract public ImageIcon GetImageIcon();
	
	public void SetX(int x) {this.x = x;}
	public void SetY(int y) {this.y = y;}
	public int GetX() {return x;}
	public int GetY() {return y;}

	public Board GetBoard() {return board;}

	public Type GetType() {
		return type;
	}

	public TypeOfPiece GetTypeOfPiece() {
		return top;
	}
}