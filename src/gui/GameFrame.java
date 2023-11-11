package gui;

import game.Controller;
import game.ResultData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GameFrame extends JFrame {

    ChessPanel chessPanel;

    JLabel war_lab;

    public GameFrame(String name, ResultData resultData) throws IOException {
        super(name);

        JPanel panel_players = new JPanel();
        panel_players.setLayout(new BoxLayout(panel_players, BoxLayout.PAGE_AXIS));
        chessPanel = new ChessPanel(resultData, this);

        JPanel panel_menu = new JPanel();
        JButton button_menu = new JButton("Menu");
        button_menu.addActionListener(new MenuButtonActionListener());
        panel_menu.add(button_menu);

        JLabel label_white = new JLabel("White: "+ Controller.GetInstance().GetGame().GetPlayerWhite().GetName());
        JLabel label_black = new JLabel("Black: "+ Controller.GetInstance().GetGame().GetPlayerBlack().GetName());
        panel_players.add(label_white);
        panel_players.add(label_black);

        war_lab = new JLabel("", SwingConstants.CENTER);
        JPanel panel_war = new JPanel(new BorderLayout());
        war_lab.setForeground(Color.RED);
        war_lab.setSize(600, 150);
        panel_war.add(war_lab, BorderLayout.SOUTH);

        JPanel p = new JPanel(new BorderLayout());

        p.add(panel_war,BorderLayout.CENTER);
        p.add(panel_menu,BorderLayout.NORTH);

        JPanel panel_menu_war = new JPanel(new BorderLayout());
        panel_menu_war.add(p,BorderLayout.SOUTH);

        this.add(panel_players, BorderLayout.NORTH);
        this.add(chessPanel, BorderLayout.CENTER);
        this.add(panel_menu_war, BorderLayout.SOUTH);
        this.pack();
        this.setSize(600, 600);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public ChessPanel getChessPanel() {
        return chessPanel;
    }

    public void setWarLabel(String wartext) {
        this.war_lab.setText(wartext);
    }

    public void setVisible(boolean bool) {
        super.setVisible(bool);
    }

    private class MenuButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            try {
                Controller.GetInstance().GetFrame().setVisible(true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}