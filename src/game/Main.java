package game;

import antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static ParseTree readASTMoves(String fileName) throws IOException {
        try {
            var code = Files.readString(Paths.get(fileName));
            var inputStream = CharStreams.fromString(code);
            var lexer = new MoveLexer(inputStream);
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new MoveParser(tokenStream);
            return parser.moves();
        }
        catch(IOException e) {
            throw e;
        }
    }
    public static void main(String[] args) throws IOException {
        Controller.getInstance();

        new MyBoardVisitor().visit(Controller.getInstance().getGame().getBoardTree());
        new MyMoveVisitor().visit(readASTMoves("inputs\\moves.cfg"));

        Controller.getInstance().getErrorMessages().printMsg();
    }
}
