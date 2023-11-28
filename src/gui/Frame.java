package gui;

import antlr.MyBoardVisitor;
import game.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Frame extends JFrame {
    private static Frame instance = null;
    private PlayersFrame playersFrame;
    private ResultFrame resultFrame;
    private ResultData resultData;
    private JPanel panelMenu = new JPanel();
    private JPanel panelWar = new JPanel();
    private JTextArea warLabel;

    public static Frame getInstance() {
        if (instance == null)
            instance = new Frame();
        return instance;
    }
    public Frame() {
        super("Chess");

        this.resultData = new ResultData();
        this.playersFrame = new PlayersFrame();
        this.resultFrame = new ResultFrame(resultData);

        JPanel panel_chess = new JPanel();
        JLabel label_chess = new JLabel("Chess");
        label_chess.setFont(new Font("Monospace", Font.PLAIN, 20));

        warLabel = new JTextArea("");
        warLabel.setEditable(false);
        warLabel.setLineWrap(true);
        warLabel.setOpaque(false);
        warLabel.setBorder(BorderFactory.createEmptyBorder());
        warLabel.setFont(new Font("Monospace", Font.BOLD, 16));
        warLabel.setForeground(Color.RED);
        warLabel.setSize(570, 150);

        JButton button_game = new JButton("Game");
        JButton button_result = new JButton("Result");
        button_game.addActionListener(new PlayersButtonActionListener());
        button_result.addActionListener(new ResultButtonActionListener());

        panelMenu.add(button_game);
        panelMenu.add(button_result);
        this.add(panelMenu);
        panel_chess.add(label_chess);
        this.add(panel_chess, BorderLayout.NORTH);
        panelWar.add(warLabel);

        this.pack();
        this.setSize(600, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void disappearButtons() {
        panelMenu.setVisible(false);
        this.add(panelWar, BorderLayout.CENTER);
    }
    public void setWarLabel(String wartext) {
        this.warLabel.setText(wartext);
    }
    public String getWarLabel() {
        return this.warLabel.getText();
    }
    public PlayersFrame getPlayersFrame() {
        return playersFrame;
    }
    public JPanel getPanelMenu() {
        return panelMenu;
    }
    public JPanel getPanelWar() {
        return panelWar;
    }
    public ResultData getResultData() {
        return resultData;
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