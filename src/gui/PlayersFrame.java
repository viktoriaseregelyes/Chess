package gui;

import game.*;
import players.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class PlayersFrame extends JFrame {
    private JTextField player1 = new JTextField(20);
    private JTextField player2 = new JTextField(20);
    private GameFrame gameFrame;

    public PlayersFrame(){
        super("Players");

        JPanel panel_player1 = new JPanel();
        JPanel panel_player2 = new JPanel();
        JPanel panel_button = new JPanel();
        JLabel label_player1 = new JLabel("Player1: ");
        JLabel label_player2 = new JLabel("Player2: ");
        JButton button_start = new JButton("Start");
        button_start.addActionListener(new GameButtonActionListener());

        panel_player1.add(label_player1);
        panel_player1.add(player1);
        panel_player2.add(label_player2);
        panel_player2.add(player2);
        panel_button.add(button_start);
        this.add(panel_player1, BorderLayout.NORTH);
        this.add(panel_player2, BorderLayout.CENTER);
        this.add(panel_button, BorderLayout.SOUTH);

        this.pack();
        this.setSize(400, 150);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    public GameFrame getGameFrame() {
        return gameFrame;
    }
    public class GameButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String Player1 = player1.getText();
            String Player2 = player2.getText();
            Player player1 = new Player(Player1, players.Type.BLACK);
            Player player2 = new Player(Player2, players.Type.WHITE);

            try {
                Controller.getInstance().getGame().setBlack(player1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                Controller.getInstance().getGame().setWhite(player2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                gameFrame = new GameFrame();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            setVisible(false);
            PlayersFrame.this.player1.setText("");
            PlayersFrame.this.player2.setText("");
            gameFrame.setVisible(true);
        }
    }
}
