package game;

import antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import pieces.Piece;
import pieces.TypeOfPiece;
import players.*;
import rules.Rule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Game {
	private static Game instance = null;
	private Player black, white;
	private Board board;
	private Type type = Type.WHITE;
	private ParseTree boardTree;
	private Piece piece;
	private boolean canmove = false;
	private int endX, endY;
	private ArrayList<Rule> rules = new ArrayList<>();

	public Game() throws IOException {
		this.board = new Board();
		this.boardTree = readASTBoard("inputs\\board.cfg");
	}
	public static Game getInstance() throws IOException {
		if (instance == null)
			instance = new Game();
		return instance;
	}
	public boolean round(Piece piece, int endX, int endY) throws IOException {
		this.piece = piece;
		this.endX = endX;
		this.endY = endY;

		this.piece.moveAnywhere();
		this.piece.move(endX, endY);

		switchType();
		return canmove;
	}

	public ArrayList<Rule> getRules() {
		return rules;
	}
	public void addRule(Rule rule) {
		rules.add(rule);
	}
	public ParseTree getBoardTree() {
		return boardTree;
	}
	public void setCanmove(boolean move) { this.canmove = move; }
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public static ParseTree readASTBoard(String fileName) throws IOException {
		try {
			var code = Files.readString(Paths.get(fileName));
			var inputStream = CharStreams.fromString(code);
			var lexer = new BoardLexer(inputStream);
			var tokenStream = new CommonTokenStream(lexer);
			var parser = new BoardParser(tokenStream);
			return parser.board();
		}
		catch(IOException e) {
			throw e;
		}
	}
	public boolean endGame() {
		return !board.haveKings();
	}
	public void switchType() {
		if(type == Type.WHITE)
			type = Type.BLACK;
		else type = Type.WHITE;
	}
	public Player getPlayerWhite() {
		return white;
	}
	public Player getPlayerBlack() {
		return black;
	}
	public Board getBoard() {
		return board;
	}
	public Player getWinner() {
		if(board.countKing(Type.WHITE) == 0)
			return black;
		return white;
	}
	public int getEndY(){
		return this.endY;
	}
	public int getEndX(){
		return this.endX;
	}
	public void setBlack(Player black) {
		this.black = black;
	}
	public void setWhite(Player white) {
		this.white = white;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
}
