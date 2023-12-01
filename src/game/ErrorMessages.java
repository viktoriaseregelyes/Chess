package game;

import java.io.IOException;
import java.util.ArrayList;

public class ErrorMessages {
    private static ErrorMessages instance = null;
    private ArrayList<String> msgs = new ArrayList<>();

    public ErrorMessages() {}

    public static ErrorMessages getInstance() {
        if (instance == null)
            instance = new ErrorMessages();
        return instance;
    }

    public void add(String msg) {
        this.msgs.add(msg);
    }

    public void remove(String msg) {
        this.msgs.remove(msg);
    }

    public void printMsg() throws IOException {
        if(msgs.size() != 0) {
            String message = "";
            for (String msg : msgs) {
                message = message + msg + "\n";
            }
            Controller.getInstance().getFrame().setWarLabel(message);
            Controller.getInstance().getFrame().disappearButtons();
        }
    }
}
