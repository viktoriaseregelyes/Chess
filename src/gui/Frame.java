package gui;

import antlr.MyBoardVisitor;
import game.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Frame {
    private static Frame instance = null;
    private JFrame frame;
    private PlayersFrame playersFrame;
    private ResultFrame resultFrame;
    private ResultData resultData;
    private JPanel panel_menu = new JPanel();
    private JPanel panel_war = new JPanel();
    private JTextArea war_lab;

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

        JPanel panel_chess = new JPanel();
        JLabel label_chess = new JLabel("Chess");
        label_chess.setFont(new Font("Monospace", Font.PLAIN, 20));

        war_lab = new JTextArea();
        war_lab.setEditable(false);
        war_lab.setLineWrap(true);
        war_lab.setOpaque(false);
        war_lab.setBorder(BorderFactory.createEmptyBorder());
        war_lab.setFont(new Font("Monospace", Font.BOLD, 16));
        war_lab.setForeground(Color.RED);
        war_lab.setSize(550, 150);

        JButton button_game = new JButton("Game");
        JButton button_result = new JButton("Result");
        button_game.addActionListener(new PlayersButtonActionListener());
        button_result.addActionListener(new ResultButtonActionListener());

        panel_menu.add(button_game);
        panel_menu.add(button_result);
        frame.add(panel_menu);
        panel_chess.add(label_chess);
        frame.add(panel_chess, BorderLayout.NORTH);
        panel_war.add(war_lab);

        frame.pack();
        frame.setSize(600, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void disappearButtons() {
        panel_menu.setVisible(false);
        frame.add(panel_war, BorderLayout.CENTER);
    }
    public void setWarLabel(String wartext) {
        this.war_lab.setText(wartext);
    }
    public PlayersFrame getPlayersFrame() {
        return playersFrame;
    }
    public void setVisible(boolean bool) {
        frame.setVisible(bool);
    }
    public class PlayersButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            playersFrame.setVisible(true);
            try {
                new MyBoardVisitor().visit(Controller.getInstance().getGame().getBoardTree());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public class ResultButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            resultFrame.setVisible(true);
        }
    }
}