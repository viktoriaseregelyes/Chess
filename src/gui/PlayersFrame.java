package gui;

import game.*;
import players.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayersFrame extends JFrame {
    public JTextField textField_player1 = new JTextField(20);
    public JTextField textField_player2 = new JTextField(20);
    public Game game;
    public Frame frame;
    public GameFrame gameFrame;
    public ResultData resultData;

    public PlayersFrame(String name, Frame frame, ResultData resultData) {
        super(name);
        if(frame != null) {
            this.frame = frame;
            this.resultData = resultData;

            JPanel panel_player1 = new JPanel();
            JPanel panel_player2 = new JPanel();
            JPanel panel_button = new JPanel();
            JLabel label_player1 = new JLabel("Player1: ");
            JLabel label_player2 = new JLabel("Player2: ");
            JButton button_start = new JButton("Start");
            button_start.addActionListener(new GameButtonActionListener());

            panel_player1.add(label_player1);
            panel_player1.add(textField_player1);
            panel_player2.add(label_player2);
            panel_player2.add(textField_player2);
            panel_button.add(button_start);
            this.add(panel_player1, BorderLayout.NORTH);
            this.add(panel_player2, BorderLayout.CENTER);
            this.add(panel_button, BorderLayout.SOUTH);

            this.pack();
            this.setSize(400, 150);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
        }
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setVisible(boolean bool) {
        super.setVisible(bool);
    }

    public class GameButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String Player1 = textField_player1.getText();
            String Player2 = textField_player2.getText();
            Player player1 = new Player(Player1, players.Type.BLACK);
            Player player2 = new Player(Player2, players.Type.WHITE);

            player1.setGame(game);
            player2.setGame(game);

            game.setBlack(player1);
            game.setWhite(player2);

            gameFrame = new GameFrame("Chess", game, resultData, frame);

            setVisible(false);
            textField_player1.setText("");
            textField_player2.setText("");
            gameFrame.setVisible(true);
        }
    }
}
