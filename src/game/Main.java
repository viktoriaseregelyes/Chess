package game;

import antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
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
    public static void main(String[] args) throws IOException {
        Controller.GetInstance();
        var board = readASTBoard("inputs\\board.txt");
        var move = readASTMoves("inputs\\moves.txt");
        new MyBoardVisitor().visit(board);
        new MyMoveVisitor().visit(move);
    }
}
