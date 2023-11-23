package game;

import gui.Frame;

import java.io.IOException;

public class Controller {
    private static Controller instance = null;
    private final Game game;
    private final Frame frame;

    public Controller() throws IOException {
        game = Game.getInstance();
        frame = Frame.GetInstance();
    }
    public static Controller getInstance() throws IOException {
        if (instance == null)
            instance = new Controller();
        return instance;
    }
    public Game getGame() {
        return game;
    }
    public Frame getFrame() {
        return frame;
    }
}
