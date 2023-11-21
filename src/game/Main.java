package game;

import antlr.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Controller.GetInstance();
        new MyBoardVisitor().visit(Controller.GetInstance().GetGame().getBoardTree());
        new MyMoveVisitor().visit(Controller.GetInstance().GetGame().getMoveTree());
    }
}
