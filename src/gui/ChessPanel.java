package gui;

import game.*;
import players.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessPanel extends JPanel {
    public static int N = 8, SIZE = 60;
    public Game game;
    public Piece piece;
    public boolean canMove = true;
    public int startX, startY, endX, endY;
    public Type type = Type.BLACK;
    public WinnerFrame winnerFrame;
    public ArrayList<ArrayList<ChessButton>> chessButton = new ArrayList<>(N);
    enum State {
        FIRST, LAST
    }
    public State state = State.FIRST;

    {
        for (int x = 0; x < N; x++) {
            chessButton.add(new ArrayList<>(N));
        }
    }

    public ChessPanel(Game game, ResultData resultData, Frame frame, GameFrame gameFrame) {
        super(new GridLayout(N, N));
        this.game = game;
        this.winnerFrame = new WinnerFrame("Winner", game, resultData, frame, gameFrame);

        this.setPreferredSize(new Dimension(N * SIZE, N * SIZE));
        addButtons();
    }

    public void repaintPanel() {
        this.removeAll();
        addButtons();
        this.revalidate();
        this.repaint();
    }

    public void addButtons() {
        chessButton.remove(chessButton);
        for (int y=0;y<N;y++) {
            for (int x=0;x<N;x++) {
                Piece piece = game.getBoard().getPiece(x, y);
                if (piece != null) {
                    ImageIcon image = piece.getImageIcon();
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
            if(state == State.FIRST) {
                if(ae == null) return;
                if(canMove) switchType();
                startX = (int) ((ChessButton)ae.getSource()).getPoint().getX();
                startY = (int) ((ChessButton)ae.getSource()).getPoint().getY();
                piece = game.getBoard().getPiece(startX, startY);
                if(piece != null) chessButton.get(startX).get(startY).setBackground(new Color(51, 204, 51));
            }

            if(state == State.LAST) {
                if(ae == null) return;
                endX = (int) ((ChessButton)ae.getSource()).getPoint().getX();
                endY = (int) ((ChessButton)ae.getSource()).getPoint().getY();
                canMove = game.round(piece, endX, endY);

                if(canMove) {
                    game.getBoard().setField(startX, startY);
                    repaintPanel();
                    if(game.endgame()) winnerFrame.setVisible(true);
                }
            }
            if(piece != null && piece.getType() == type && canMove) switchState();
        }
    }
}