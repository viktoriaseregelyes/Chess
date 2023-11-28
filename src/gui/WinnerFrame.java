package gui;

import game.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class WinnerFrame extends JFrame {
    private final JLabel winnerLabel;

    public WinnerFrame() {
        super("Winner");

        JPanel panel_winner = new JPanel();
        JPanel panel_button = new JPanel();
        this.winnerLabel = new JLabel();
        JButton button_menu = new JButton("Menu");
        button_menu.addActionListener(new OkButtonActionListener());

        panel_winner.add(winnerLabel);
        panel_button.add(button_menu);
        this.add(panel_winner, BorderLayout.CENTER);
        this.add(panel_button, BorderLayout.SOUTH);
        this.setSize(400, 150);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void setVisible(boolean bool) {
        super.setVisible(bool);
        if(bool) {
            try {
                this.winnerLabel.setText("Winner: " + Controller.getInstance().getGame().getWinner().GetName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                Controller.getInstance().getFrame().getResultData().add(new Result(Controller.getInstance().getGame().getPlayerWhite(), Controller.getInstance().getGame().getPlayerBlack(), Controller.getInstance().getGame().getWinner()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class OkButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            try {
                Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().setVisible(false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                Controller.getInstance().getFrame().setVisible(true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
