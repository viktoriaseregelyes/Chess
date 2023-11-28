package gui;

import game.Controller;
import game.ResultData;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GameFrame extends JFrame {
    private ChessPanel chessPanel;
    private JTextPane warLabel;

    public GameFrame() throws IOException {
        super("Chess");

        JPanel playersPanel = new JPanel();
        playersPanel.setLayout(new BoxLayout(playersPanel, BoxLayout.PAGE_AXIS));
        chessPanel = new ChessPanel();

        JPanel panelMenu = new JPanel();
        JButton buttonMenu = new JButton("Menu");
        buttonMenu.addActionListener(new MenuButtonActionListener());
        panelMenu.add(buttonMenu);

        JLabel whiteLabel = new JLabel("White: "+ Controller.getInstance().getGame().getPlayerWhite().GetName());
        JLabel blackLabel = new JLabel("Black: "+ Controller.getInstance().getGame().getPlayerBlack().GetName());
        playersPanel.add(whiteLabel);
        playersPanel.add(blackLabel);

        warLabel = new JTextPane();
        warLabel.setEditable(false);
        warLabel.setOpaque(false);
        warLabel.setBorder(BorderFactory.createEmptyBorder());
        StyledDocument doc = warLabel.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        JPanel panelWar = new JPanel(new BorderLayout());
        warLabel.setForeground(Color.RED);
        warLabel.setFont(new Font("Monospace", Font.BOLD, 16));
        warLabel.setSize(600, 200);
        panelWar.add(warLabel, BorderLayout.SOUTH);

        JPanel p = new JPanel(new BorderLayout());

        p.add(panelWar,BorderLayout.CENTER);
        p.add(panelMenu,BorderLayout.NORTH);

        JPanel panelMenuWar = new JPanel(new BorderLayout());
        panelMenuWar.add(p,BorderLayout.SOUTH);

        this.add(playersPanel, BorderLayout.NORTH);
        this.add(chessPanel, BorderLayout.CENTER);
        this.add(panelMenuWar, BorderLayout.SOUTH);
        this.pack();
        this.setSize(700, 700);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public ChessPanel getChessPanel() {
        return chessPanel;
    }

    public void setWarLabel(String wartext) {
        this.warLabel.setText(wartext);
    }

    private class MenuButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            try {
                Controller.getInstance().getFrame().setVisible(true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}