package gui;

import game.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame {
    private static Frame instance = null;
    private JFrame frame;
    private PlayersFrame playersFrame;
    private ResultFrame resultFrame;
    private ResultData resultData;

    JLabel war_lab;

    public static Frame GetInstance() {
        if (instance == null)
            instance = new Frame();
        return instance;
    }

    public Frame() {
        frame = new JFrame("Chess");

        this.resultData = new ResultData();
        this.playersFrame = new PlayersFrame("Players",  resultData);
        this.resultFrame = new ResultFrame("Results", resultData);

        JButton button_game = new JButton("Game");
        JButton button_result = new JButton("Result");
        button_game.addActionListener(new PlayersButtonActionListener());
        button_result.addActionListener(new ResultButtonActionListener());
        JPanel panel_chess = new JPanel();
        JPanel panel_menu = new JPanel();
        JPanel panel_war = new JPanel();
        JLabel label_chess = new JLabel("Chess");
        war_lab = new JLabel();

        war_lab.setForeground(Color.RED);
        war_lab.setSize(400, 150);

        panel_chess.add(label_chess);
        frame.add(panel_chess, BorderLayout.NORTH);

        panel_menu.add(button_game);
        panel_menu.add(button_result);
        frame.add(panel_menu);

        panel_war.add(war_lab);
        frame.add(panel_war, BorderLayout.SOUTH);

        frame.pack();
        frame.setSize(800, 180);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setWarLabel(String wartext) {
        this.war_lab.setText(wartext);
    }

    public void setVisible(boolean bool) {
        frame.setVisible(bool);
    }

    public class PlayersButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
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