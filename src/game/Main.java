package game;

import antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import players.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static ParseTree readAST(String fileName) throws IOException {
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
    public static void main(String[] args) throws IOException {
        Controller.GetInstance();
        var board = readAST("inputs\\board.txt");
        new MyBoardVisitor().visit(board);

    }
}
