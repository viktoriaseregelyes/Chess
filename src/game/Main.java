package game;

import gui.Frame;
import antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
        //Controller.GetInstance();
        var board = readAST("inputs\\text.txt");
        new MyBoardVisitor().visit(board);
        TestSample();
    }
    public static void TestSample() throws IOException {
        var ast = readAST("inputs\\text.txt");
        for (int i = 0; i < ast.getChildCount(); i++)
        {
            var configLineTree = ast.getChild(i);
            if (configLineTree.getChildCount() == 1)
            {
                var nameTree = configLineTree.getChild(0);
                var valueTree = configLineTree.getChild(0);
                System.out.println("NAME: " + nameTree.getText() + ", VALUE: " + valueTree.getText());
            }
            else
            {
                var nameTree = configLineTree.getChild(0);
                var valueTree = configLineTree.getChild(1);
                System.out.println("NAME: " + nameTree.getText() + ", VALUE: " + valueTree.getText());
            }
        }
    }
}
