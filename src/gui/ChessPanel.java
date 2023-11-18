package gui;

import game.*;
import players.*;

import java.io.IOException;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessPanel extends JPanel {
    private static int SIZE = 60;
    private int N;
    private Piece piece;
    private boolean canMove = true;
    private int startX, startY, endX, endY;
    private Type type = Controller.GetInstance().GetGame().GetType();
    private WinnerFrame winnerFrame;
    private ArrayList<ArrayList<ChessButton>> chessButton = new ArrayList<>(N);
    enum State {
        FIRST, LAST
    }
    public State state = State.FIRST;

    public ChessPanel(ResultData resultData, GameFrame gameFrame) throws IOException {
        super(new GridLayout(game.Controller.GetInstance().GetGame().GetBoard().GetSize(), game.Controller.GetInstance().GetGame().GetBoard().GetSize()));

        N = game.Controller.GetInstance().GetGame().GetBoard().GetSize();

        for (int x = 0; x < N; x++) {
            chessButton.add(new ArrayList<>(N));
        }

        this.winnerFrame = new WinnerFrame("Winner", resultData, gameFrame);

        this.setPreferredSize(new Dimension(N * SIZE, N * SIZE));
        addButtons();
        switchType();
    }
    public void repaintPanel() throws IOException {
        this.removeAll();
        addButtons();
        this.revalidate();
        this.repaint();
    }
    public void addButtons() throws IOException {
        chessButton.remove(chessButton);
        for (int y=0;y<N;y++) {
            for (int x=0;x<N;x++) {
                Piece piece_tmp = Controller.GetInstance().GetGame().GetBoard().GetPiece(x, y);
                if (piece_tmp != null) {
                    ImageIcon image = piece_tmp.GetImageIcon();
                    chessButton.get(x).add(y, new ChessButton(image, x, y));
                }
                else {
                    chessButton.get(x).add(y, new ChessButton(x, y));
                }
                chessButton.get(x).get(y).setVisible(true);
                this.add(chessButton.get(x).get(y));
                chessButton.get(x).get(y).addActionListener(new ChessButtonListenerAdapter());
            }
        }
    }
    public void switchState() {
        if(this.state == State.FIRST) {
            this.state = State.LAST;
        }
        else this.state = State.FIRST;
    }
    public void switchType() {
        if(this.type == Type.WHITE) {
            this.type = Type.BLACK;
        }
        else this.type = Type.WHITE;
    }
    public class ChessButton extends JButton {
        Point point;

        public ChessButton(ImageIcon ii, int x, int y) {
            super(ii);
            point = new Point(x, y);
            this.setOpaque(true);
            this.setBorderPainted(false);
            if ((x + y) % 2 == 1) this.setBackground(Color.gray);
        }

        public ChessButton(int x, int y) {
            super();
            point = new Point(x, y);
            this.setOpaque(true);
            this.setBorderPainted(false);
            if ((x + y) % 2 == 1) this.setBackground(Color.gray);
        }

        public Point getPoint() {
            return point;
        }
    }
    public class ChessButtonListenerAdapter implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            System.out.println(type);
            if(state == State.FIRST) {
                if(ae == null) return;
                if(canMove) switchType();
                startX = (int) ((ChessButton)ae.getSource()).getPoint().getX();
                startY = (int) ((ChessButton)ae.getSource()).getPoint().getY();
                try {
                    piece = Controller.GetInstance().GetGame().GetBoard().GetPiece(startX, startY);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if(piece != null && piece.GetType() == type)
                    chessButton.get(startX).get(startY).setBackground(new Color(51, 204, 51));
                else {
                    piece = null;
                    canMove = false;
                }
            }

            if(state == State.LAST) {
                if(ae == null) return;
                endX = (int) ((ChessButton)ae.getSource()).getPoint().getX();
                endY = (int) ((ChessButton)ae.getSource()).getPoint().getY();
                chessButton.get(endX).get(endY).setBackground(new Color(183, 44, 44));
                try {
                    canMove = Controller.GetInstance().GetGame().Round(piece, endX, endY);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                if(canMove) {
                    try {
                        Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        repaintPanel();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        if(Controller.GetInstance().GetGame().Endgame()) winnerFrame.setVisible(true);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        Controller.GetInstance().GetGame().SetCanmove(false);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    switchState();
                }
            }
            if(piece != null) switchState();
        }
    }
}