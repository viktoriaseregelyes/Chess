package game;

import gui.Frame;

public class Controller {
    private static Controller instance = null;
    private Game game;
    private Frame frame;

    public Controller() {
        game = Game.GetInstance();
        frame = Frame.GetInstance();
    }

    public static Controller GetInstance() {
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
