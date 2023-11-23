package game;

import antlr.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Controller.getInstance();
        new MyBoardVisitor().visit(Controller.getInstance().getGame().getBoardTree());
        new MyMoveVisitor().visit(Controller.getInstance().getGame().getMoveTree());
    }
}
