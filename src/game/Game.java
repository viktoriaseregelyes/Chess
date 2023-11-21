package game;

import antlr.*;
import board.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import players.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game {
	private static Game instance = null;
	private Player black, white;
	private Board board;
	private Type type = Type.WHITE;
	private ParseTree boardTree, moveTree;
	private Piece piece;
	private boolean canmove = false;
	private int endX, endY;

	public Game() throws IOException {
		this.board = new Board();
		this.boardTree = readASTBoard("inputs\\board.txt");
		this.moveTree = readASTMoves("inputs\\moves.txt");
	}

	public static Game GetInstance() throws IOException {
		if (instance == null)
			instance = new Game();
		return instance;
	}

	public boolean Round(Piece piece, int endX, int endY) {
		this.piece = piece;
		this.endX = endX;
		this.endY = endY;

		new MyMoveVisitor().visit(this.moveTree);

		SwitchType();
		return canmove;
	}
	public ParseTree getBoardTree() {
		return boardTree;
	}
	public void SetCanmove(boolean move) { this.canmove = move; }
	public Piece GetPiece() {
		return piece;
	}
	public void SetPiece(Piece piece) {
		this.piece = piece;
	}
	public static ParseTree readASTMoves(String fileName) throws IOException {
		try {
			var code = Files.readString(Paths.get(fileName));
			var inputStream = CharStreams.fromString(code);
			var lexer = new MoveLexer(inputStream);
			var tokenStream = new CommonTokenStream(lexer);
			var parser = new MoveParser(tokenStream);
			var context = parser.moves();
			return context;
		}
		catch(IOException e) {
			throw e;
		}
	}
	public static ParseTree readASTBoard(String fileName) throws IOException {
		try {
			var code = Files.readString(Paths.get(fileName));
			var inputStream = CharStreams.fromString(code);
			var lexer = new BoardLexer(inputStream);
			var tokenStream = new CommonTokenStream(lexer);
			var parser = new BoardParser(tokenStream);
			var context = parser.board();
			return context;
		}
		catch(IOException e) {
			throw e;
		}
	}
	public boolean Endgame() {
		return !board.CountKings();
	}
	public void SwitchType() {
		if(type == Type.WHITE)
			type = Type.BLACK;
		else type = Type.WHITE;
	}
	public Player GetPlayerWhite() {
		return white;
	}
	public Player GetPlayerBlack() {
		return black;
	}
	public Board GetBoard() {
		return board;
	}
	public Player GetWinner() {
		if (type == Type.BLACK)
			return white;
		return black;
	}
	public int GetEndY(){
		return this.endY;
	}
	public int GetEndX(){
		return this.endX;
	}
	public void SetBlack(Player black) {
		this.black = black;
	}
	public void SetWhite(Player white) {
		this.white = white;
	}
	public Type GetType() {
		return type;
	}
	public void SetType(Type type) {
		this.type = type;
	}
	public ParseTree getMoveTree() {
		return moveTree;
	}
}
