package game;

import gui.Frame;

import java.io.IOException;

public class Controller {
    private static Controller instance = null;
    private final Game game;
    private final Frame frame;
    private final ErrorMessages msg;

    public Controller() throws IOException {
        game = Game.getInstance();
        frame = Frame.getInstance();
        msg = ErrorMessages.getInstance();
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
    public ErrorMessages getErrorMessages() {
        return msg;
    }
}
