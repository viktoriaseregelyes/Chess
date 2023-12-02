package pieces;

import commands.MoveAnywhereCommand;
import players.*;
import game.Board;
import rules.GeneralRule;
import rules.SpecialRule;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

abstract public class Piece implements Serializable {
	private final Type type;
	private TypeOfPiece top;
	private int x, y, moveTimes = -1;
	private final Board board;
	private GeneralRule genRules = new GeneralRule();
	private SpecialRule specRules = new SpecialRule();
	
	public Piece(Type type, int x, int y, Board board) {
		this.type = type;
		this.x = x;
		this.y = y;
		this.board = board;
	}
	public void setNewLocation(int endX, int endY) {
		this.setX(endX);
		this.setY(endY);
		getBoard().setPiece(this);
	}

	public void specRules() {
		for (int i=0;i<specRules.size();i++) {
			if (specRules.get(i).contains("moveanywhere")) {
				MoveAnywhereCommand moveanywherecmd = new MoveAnywhereCommand(this);
				moveanywherecmd.setNumber(Integer.parseInt(specRules.get(i).replace("-moveanywhere ", "").replace(" times in the game", "")));
			}
		}
	}

	abstract public ImageIcon getImageIcon();
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	public int getMoveTimes() {return moveTimes;}
	public void setMoveTimes(int moveTimes) {
		this.moveTimes = moveTimes;
	}
	public Board getBoard() {return board;}
	public Type getType() {
		return type;
	}
	public TypeOfPiece getTypeOfPiece() {
		return top;
	}

	public void addGenRule(String rule) {
		this.genRules.addGenRule(rule);
	}

	public void addSpecRule(String rule) {
		this.specRules.addSpecRule(rule);
	}

	public ArrayList<String> getGenRule() {
        return this.genRules.getGenRules();
	}

	public ArrayList<String> getSpecRule() {
		return this.specRules.getSpecRules();
	}
}