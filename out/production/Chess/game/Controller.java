package game;

import gui.Frame;

import java.io.IOException;

public class Controller {
    private static Controller instance = null;
    private Game game;
    private Frame frame;

    public Controller() throws IOException {
        game = Game.GetInstance();
        frame = Frame.GetInstance();
    }

    public static Controller GetInstance() throws IOException {
        if (instance == null)
            instance = new Controller();
        return instance;
    }

    public Game GetGame() {
        return game;
    }

    public Frame GetFrame() {
        return frame;
    }
}
