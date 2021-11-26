package gui;

import game.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Frame implements Serializable {

    @Serial
    private static final long serialVersionUID = 3769575128566519194L;
    public JFrame frame = new JFrame("Chess");
    public PlayersFrame playersFrame;
    public Game game;
    public ResultFrame resultFrame;
    public ResultData resultData;

    public Frame() {
        this.resultData = new ResultData();
        this.playersFrame = new PlayersFrame("Players", this, resultData);
        this.resultFrame = new ResultFrame("Results", this, resultData);

        JButton button_game = new JButton("Game");
        JButton button_eredmeny = new JButton("Result");
        button_game.addActionListener(new PlayersButtonActionListener());
        button_eredmeny.addActionListener(new ResultButtonActionListener());
        JPanel panel_chess = new JPanel();
        JPanel panel_menu = new JPanel();
        JLabel label_chess = new JLabel("Chess");

        panel_chess.add(label_chess);
        frame.add(panel_chess, BorderLayout.NORTH);

        panel_menu.add(button_game);
        panel_menu.add(button_eredmeny);
        frame.add(panel_menu);

        frame.pack();
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setVisible(boolean bool) {
        frame.setVisible(bool);
    }

    public class PlayersButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            playersFrame.setGame(new Game());
            playersFrame.setVisible(true);
        }
    }

    public class ResultButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            resultFrame.setVisible(true);
        }
    }
}