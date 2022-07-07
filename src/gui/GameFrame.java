package gui;

import game.Game;
import game.ResultData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
    public Game game;
    public Frame frame;

    public GameFrame(String name, Game game, ResultData resultData, Frame frame) {
        super(name);
        this.frame = frame;
        this.game = game;

        JPanel panel_players = new JPanel();
        panel_players.setLayout(new BoxLayout(panel_players, BoxLayout.PAGE_AXIS));
        ChessPanel chessPanel = new ChessPanel(game, resultData, frame, this);

        JPanel panel_menu = new JPanel();
        JButton button_menu = new JButton("Menu");
        button_menu.addActionListener(new MenuButtonActionListener());
        panel_menu.add(button_menu);

        JLabel label_white = new JLabel("White: "+ game.GetPlayerWhite().GetName());
        JLabel label_black = new JLabel("Black: "+ game.GetPlayerBlack().GetName());
        panel_players.add(label_white);
        panel_players.add(label_black);

        this.add(panel_players, BorderLayout.NORTH);
        this.add(chessPanel, BorderLayout.CENTER);
        this.add(panel_menu, BorderLayout.SOUTH);
        this.pack();
        this.setSize(600, 600);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void setVisible(boolean bool) {
        super.setVisible(bool);
    }

    private class MenuButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            frame.setVisible(true);
        }
    }
}