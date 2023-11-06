package commands;

import game.ICommand;
import game.Piece;
import players.Type;

public class MoveCommand implements ICommand {
    Piece piece;

    public MoveCommand(Piece piece) {
        this.piece = piece;
    }

    @Override
    public void Execute() {
        moveLeft();
    }

    private void moveLeft() {
        if(piece.GetType() == Type.WHITE) piece.Move(piece.GetX()+1, piece.GetY());
        if(piece.GetType() == Type.BLACK) piece.Move(piece.GetX()-1, piece.GetY());
    }

    private void moveRight() {
        if(piece.GetType() == Type.WHITE) piece.Move(piece.GetX()-1, piece.GetY());
        if(piece.GetType() == Type.BLACK) piece.Move(piece.GetX()+1, piece.GetY());
    }

    private void moveForward() {
        if(piece.GetType() == Type.WHITE) piece.Move(piece.GetX(), piece.GetY()+1);
        if(piece.GetType() == Type.BLACK) piece.Move(piece.GetX(), piece.GetY()-1);
    }

    private void moveBackward() {
        if(piece.GetType() == Type.WHITE) piece.Move(piece.GetX(), piece.GetY()-1);
        if(piece.GetType() == Type.BLACK) piece.Move(piece.GetX(), piece.GetY()+1);
    }
}

// teljesen adja hozzá a lépéseket, ha ezt megtette akkor lehet ellenőrizni hogy valid e a lépés
// 1 move-ok fuggvényszerü megírésa, majd ezek for ciklusban több lépéssé kombinálhatóak???

// átveszi GUIból hova akar lépni
// megnézi, valid-e a lépés
// ha igen nézi, van-e ott valaki
// ha nincs odalép
// ha van, akkor ütéses command (ez már nem is feltétlen itt fut majd)

// hibakezelés itt vagy visitorban? - visitor