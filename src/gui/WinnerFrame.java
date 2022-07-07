package gui;

import game.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WinnerFrame extends JFrame {
    public Game game;
    public ResultData resultData;
    public Frame frame;
    public GameFrame gameFrame;
    public JLabel label_winner;

    public WinnerFrame(String name, Game game, ResultData resultData, Frame frame, GameFrame gameFrame) {
        super(name);
        this.game = game;
        this.resultData = resultData;
        this.frame = frame;
        this.gameFrame = gameFrame;

        JPanel panel_winner = new JPanel();
        JPanel panel_button = new JPanel();
        this.label_winner = new JLabel();
        JButton button_menu = new JButton("Menu");
        button_menu.addActionListener(new OkButtonActionListener());

        panel_winner.add(label_winner);
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
            this.label_winner.setText("Winner: " + game.GetWinner().GetName());
            resultData.add(new Result(game.GetPlayerWhite(), game.GetPlayerBlack(), game.GetWinner()));
        }
    }

    private class OkButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            gameFrame.setVisible(false);
            frame.setVisible(true);
        }
    }
}
