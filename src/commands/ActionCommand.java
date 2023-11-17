package commands;

import antlr.MyMoveVisitor;
import game.Controller;
import game.ICommand;
import game.Piece;
import org.antlr.v4.runtime.tree.ParseTree;
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
        this.startX = piece.GetX();
        this.startY = piece.GetY();
        this.endX = startX;
        this.endY = startY;
    }
    @Override
    public int Execute() throws IOException {
        if (action.contains("become")) {
            System.out.println("become");
            become_piece();
        } else if (action.contains("moveagain")) {
            System.out.println("move again");
            move_again();
        } else if (action.contains("move")) {
            System.out.println("move dir");
            move_dir();
        }

        Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
        Controller.GetInstance().GetGame().setPiece(this.piece);
        Controller.GetInstance().GetGame().GetBoard().SetPiece(this.piece);

        Controller.GetInstance().GetFrame().getPlayersFrame().getGameFrame().getChessPanel().repaintPanel();

        return 0;
    }
    private void become_piece() throws IOException {
        String dummy = action.replace("become", "");
        switch(dummy) {
            case "pawn":
                Pawn new_pawn = new Pawn(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_pawn);
                this.piece = new_pawn;
                break;
            case "knight":
                Knight new_knight = new Knight(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_knight);
                this.piece = new_knight;
                break;
            case "king":
                King new_king = new King(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_king);
                this.piece = new_king;
                break;
            case "bishop":
                Bishop new_bishop = new Bishop(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_bishop);
                this.piece = new_bishop;
                break;
            case "rook":
                Rook new_rook = new Rook(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_rook);
                this.piece = new_rook;
                break;
            case "queen":
                Queen new_queen = new Queen(this.piece.GetType(), this.piece.GetX(), this.piece.GetY(), Controller.GetInstance().GetGame().GetBoard());
                Controller.GetInstance().GetGame().GetBoard().SetField(startX, startY);
                Controller.GetInstance().GetGame().GetBoard().SetPiece(new_queen);
                this.piece = new_queen;
                break;
            default:
                break;
        }
    }
    private void move_again() throws IOException {
        ParseTree move = Controller.GetInstance().GetGame().readASTMoves("inputs\\moves.txt");
        new MyMoveVisitor().visit(move);
    }
    private void move_dir() throws IOException {
        switch("left") {
            case "left": left(); break;
            case "right": right(); break;
            case "forward": forward(); break;
            case "backward": backward(); break;
            default: System.out.println("null"); break;
        }
        if((endX >= 0 && endX < Controller.GetInstance().GetGame().GetBoard().GetSize()) && (endY >= 0 && endY < Controller.GetInstance().GetGame().GetBoard().GetSize())){
            this.piece.Move(endX, endY);
        }
    }

    private void left() {
        if(this.piece.GetType() == Type.WHITE) endX++;
        if(this.piece.GetType() == Type.BLACK) endX--;
    }
    private void right() {
        if(piece.GetType() == Type.WHITE) endX--;
        if(piece.GetType() == Type.BLACK) endX++;
    }
    private void forward() {
        if(piece.GetType() == Type.WHITE) endY++;
        if(piece.GetType() == Type.BLACK) endY--;
    }
    private void backward() {
        if(piece.GetType() == Type.WHITE) endY--;
        if(piece.GetType() == Type.BLACK) endY++;
    }
    public Piece getPiece() {
        return this.piece;
    }
}
