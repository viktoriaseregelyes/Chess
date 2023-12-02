package pieces;

import commands.ActionCommand;
import commands.EventCommand;
import commands.MoveAnywhereCommand;
import commands.MoveCommand;
import game.Controller;
import players.*;
import game.Board;
import rules.GeneralRule;
import rules.Rule;
import rules.SpecialRule;

import javax.swing.*;
import java.io.IOException;
import java.io.Serializable;

abstract public class Piece implements Serializable {
	private final Type type;
	private TypeOfPiece top = TypeOfPiece.KING;
	private int x, y, moveTimes = -1;
	private final Board board;
	private Rule rule = new Rule();
	private EventCommand eventcmd = new EventCommand();
	private boolean piece_changed = false, moveOver = false;
	
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

	public void moveAnywhere() throws IOException {
		for (int i = 0; i < rule.getSpecRule().size(); i++) {
			if (rule.getSpecRule().get(i).contains("moveanywhere")) {
				MoveAnywhereCommand moveanywherecmd = new MoveAnywhereCommand(this);
				moveanywherecmd.setNumber(Integer.parseInt(rule.getSpecRule().get(i).replace("-moveanywhere ", "").replace(" times in the game", "")));
			}
		}
	}
	public void getPieceRule() throws IOException {
		for(int i = 0; i< Controller.getInstance().getGame().getRules().size(); i++)
			if(Controller.getInstance().getGame().getRules().get(i).getTypeOfPiece().equals(this.getTypeOfPiece().toString()))
				rule = Controller.getInstance().getGame().getRules().get(i);
	}
	public void specRules() throws IOException {
		for (int i=0;i<rule.getSpecRule().size();i++) {
			if (!rule.getSpecRule().get(i).contains("moveanywhere")) {
				ActionCommand actioncmd = new ActionCommand(this, rule.getSpecRule().get(i));
				actioncmd.Execute();

				//King newPiece = new King(actioncmd.getPiece().getType(), actioncmd.getPiece().getX(), actioncmd.getPiece().getY(), this.board);

				setNewLocation(actioncmd.getPiece().getX(), actioncmd.getPiece().getY());

				//this = newPiece;
			}
		}
	}
	public void move(int endX, int endY) throws IOException {
		getPieceRule();
		if(!piece_changed) {
			int ruleNum = 0;
			int moves = rule.getGenRule().size();
			for(int i=0;i<moves;i++) {
				if(!moveOver) {
					MoveCommand movecmd = new MoveCommand(this, rule.getGenRule().getDir(i), rule.getGenRule().getDirNum(i), endX, endY, eventcmd);
					int moveReturn = movecmd.Execute();
					System.out.println(moveReturn);
					if (moveReturn == 2) moveOver = true;
					else ruleNum += moveReturn;
				}
			}
			if(ruleNum == moves || moveOver) {
				if(this.getMoveTimes() > 0) {
					Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().setWarLabel("One less step anywhere.");
					MoveAnywhereCommand moveanywherecmd = new MoveAnywhereCommand(this, endX, endY);
					moveanywherecmd.setNumber(this.getMoveTimes()-1);
					moveanywherecmd.Execute();

					Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().repaintPanel();
					Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().switchType();
					Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().switchState();
				}
				else
					Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().setWarLabel("You're trying to move to a field that doesn't match the rules, or you're trying to step over a dummy. Step somewhere else.");
			}
			else
				Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().setWarLabel("");

			moveOver = false;
		}

		if(eventcmd.getHit() && eventcmd.getPiece().getType() == this.type) {
			if(!piece_changed)
				this.specRules();
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
	public Rule getRule() {
		return rule;
	}
}