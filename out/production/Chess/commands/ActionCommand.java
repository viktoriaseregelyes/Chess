package commands;

import game.Controller;
import game.ICommand;
import game.Piece;
import pieces.*;

import java.io.IOException;

public class ActionCommand implements ICommand {
    private String action;
    private Piece piece;
    public ActionCommand(Piece piece, String action) {
        this.piece = piece;
        this.action = action;
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

        Controller.GetInstance().GetFrame().getPlayersFrame().getGameFrame().getChessPanel().repaintPanel();

        return 0;
    }
    private void become_piece() throws IOException {
        String dummy = action.replace("become", "");
        switch(dummy) {
            case "pawn":
                Pawn new_pawn = new Pawn(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_pawn);
                break;
            case "knight":
                Knight new_knight = new Knight(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_knight);
                break;
            case "king":
                King new_king = new King(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_king);
                break;
            case "bishop":
                Bishop new_bishop = new Bishop(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_bishop);
                break;
            case "rook":
                Rook new_rook = new Rook(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_rook);
                break;
            case "queen":
                Queen new_queen = new Queen(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_queen);
                break;
            default:
                break;
        }
    }
    private void move_again() {
        System.out.println("move again");
    }
    private void move_dir() {
        System.out.println("move idk where");
    }
}
