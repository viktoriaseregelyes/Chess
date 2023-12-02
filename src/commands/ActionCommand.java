package commands;

import game.Controller;
import pieces.Piece;
import pieces.*;
import players.Type;

import java.io.IOException;

public class ActionCommand implements ICommand {
    private int endX, endY, startX, startY;
    private String action;
    private Piece piece;

    public ActionCommand(Piece piece, String action) {
        this.piece = piece;
        this.action = action;
        this.startX = piece.getX();
        this.startY = piece.getY();
        this.endX = startX;
        this.endY = startY;
    }
    @Override
    public int Execute() throws IOException {
        if (action.contains("become")) {
            become_piece();
        } else if (action.contains("moveagain")) {
            move_again();
        } else if (action.contains("move")) {
            move_dir();
        }

        Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
        Controller.getInstance().getGame().setPiece(this.piece);
        Controller.getInstance().getGame().getBoard().setPiece(this.piece);

        Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().repaintPanel();

        return 0;
    }
    private void become_piece() throws IOException {
        String dummy = action.replace("become", "");
        switch(dummy) {
            case "pawn":
                Pawn new_pawn = new Pawn(this.piece.getType(), this.piece.getX(), this.piece.getY(), Controller.getInstance().getGame().getBoard());
                Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
                Controller.getInstance().getGame().getBoard().setPiece(new_pawn);
                this.piece = new_pawn;
                break;
            case "knight":
                Knight new_knight = new Knight(this.piece.getType(), this.piece.getX(), this.piece.getY(), Controller.getInstance().getGame().getBoard());
                Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
                Controller.getInstance().getGame().getBoard().setPiece(new_knight);
                this.piece = new_knight;
                break;
            case "king":
                King new_king = new King(this.piece.getType(), this.piece.getX(), this.piece.getY(), Controller.getInstance().getGame().getBoard());
                Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
                Controller.getInstance().getGame().getBoard().setPiece(new_king);
                this.piece = new_king;
                break;
            case "bishop":
                Bishop new_bishop = new Bishop(this.piece.getType(), this.piece.getX(), this.piece.getY(), Controller.getInstance().getGame().getBoard());
                Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
                Controller.getInstance().getGame().getBoard().setPiece(new_bishop);
                this.piece = new_bishop;
                break;
            case "rook":
                Rook new_rook = new Rook(this.piece.getType(), this.piece.getX(), this.piece.getY(), Controller.getInstance().getGame().getBoard());
                Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
                Controller.getInstance().getGame().getBoard().setPiece(new_rook);
                this.piece = new_rook;
                break;
            case "queen":
                Queen new_queen = new Queen(this.piece.getType(), this.piece.getX(), this.piece.getY(), Controller.getInstance().getGame().getBoard());
                Controller.getInstance().getGame().getBoard().setFieldToNull(startX, startY);
                Controller.getInstance().getGame().getBoard().setPiece(new_queen);
                this.piece = new_queen;
                break;
            default:
                break;
        }
    }
    private void move_again() throws IOException {
        if(this.piece.getType() == Type.WHITE) Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().switchTypeToType(Type.BLACK);
        else Controller.getInstance().getFrame().getPlayersFrame().getGameFrame().getChessPanel().switchTypeToType(Type.WHITE);
    }
    private void move_dir() throws IOException {
        switch(action.replace("move", "")) {
            case "left": left(); break;
            case "right": right(); break;
            case "forward": forward(); break;
            case "backward": backward(); break;
            default: break;
        }
        if((endX >= 0 && endX < Controller.getInstance().getGame().getBoard().getSize()) && (endY >= 0 && endY < Controller.getInstance().getGame().getBoard().getSize())){
            this.piece.setNewLocation(endX, endY);
        }
    }
    private void left() {
        if(this.piece.getType() == Type.WHITE) endX++;
        if(this.piece.getType() == Type.BLACK) endX--;
    }
    private void right() {
        if(piece.getType() == Type.WHITE) endX--;
        if(piece.getType() == Type.BLACK) endX++;
    }
    private void forward() {
        if(piece.getType() == Type.WHITE) endY++;
        if(piece.getType() == Type.BLACK) endY--;
    }
    private void backward() {
        if(piece.getType() == Type.WHITE) endY--;
        if(piece.getType() == Type.BLACK) endY++;
    }
    public Piece getPiece() {
        return this.piece;
    }
}
