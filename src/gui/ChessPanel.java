package gui;

import game.*;
import pieces.Piece;
import players.*;

import java.io.IOException;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessPanel extends JPanel {
    private int size, startX, startY, endX, endY;
    private Piece piece;
    private boolean canMove = true;
    private Type type = Controller.getInstance().getGame().getType();
    public ArrayList<ArrayList<ChessButton>> chessButton = new ArrayList<>(size);
    enum State {
        FIRST, LAST
    }
    private State state = State.FIRST;

    public ChessPanel() throws IOException {
        super(new GridLayout(game.Controller.getInstance().getGame().getBoard().getSize(), game.Controller.getInstance().getGame().getBoard().getSize()));

        size = game.Controller.getInstance().getGame().getBoard().getSize();

        for (int x = 0; x < size; x++) {
            chessButton.add(new ArrayList<>(size));
        }

        this.setPreferredSize(new Dimension(size * 60, size * 60));
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
        for (int y = 0; y< size; y++) {
            for (int x = 0; x< size; x++) {
                Piece piece_tmp = Controller.getInstance().getGame().getBoard().getPiece(x, y);
                if (piece_tmp != null) {
                    ImageIcon image = piece_tmp.getImageIcon();
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
    public void switchTypeToType(Type type) {
        this.type = type;
    }
    public class ChessButton extends JButton {
        private Point point;

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
                try {
                    piece = Controller.getInstance().getGame().getBoard().getPiece(startX, startY);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if(piece != null && piece.getType() == type)
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
                    canMove = Controller.getInstance().getGame().round(piece, endX, endY);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                if(canMove) {
                    try {
                        Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        repaintPanel();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        if(Controller.getInstance().getGame().endGame()) {
                            WinnerFrame winnerFrame = new WinnerFrame();
                            winnerFrame.setVisible(true);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        Controller.getInstance().getGame().setCanmove(false);
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