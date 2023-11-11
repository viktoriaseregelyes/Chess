package board;

import game.*;
import pieces.*;
import players.Type;

import java.util.*;

public class Board {
    private int size;
    private ArrayList<ArrayList<Piece>> field = new ArrayList<>(size);

    public Board() {}

    public boolean MissingKing() {
        return CountKings() < 2;
    }

    public int CountKings() {
        int king = 0;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (this.GetPiece(i, j) != null && this.GetPiece(i, j).GetTypeOfPiece() == TypeOfPiece.KING) king++;
        return king;
    }

    public Piece GetPiece(int x, int y) throws NullPointerException {
        return field.get(x).get(y);
    }

    public void SetField(int x, int y) {
        field.get(x).set(y, null);
    }

    public void SetPiece(Piece piece) throws NullPointerException {
        if (piece != null) field.get(piece.GetX()).set(piece.GetY(), piece);
    }

    public void CreateBoard(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            field.add(i, new ArrayList<>(size));
            for (int j = 0; j < size; j++)
                field.get(i).add(j, null);
        }
    }

    public int GetSize() {
        return this.size;
    }

    public boolean SymmetricalBoard() {
        for (int i = 0; i < size; i++) {
            field.add(i, new ArrayList<>(size));
            for (int j = 0; j < size; j++)
                field.get(i).add(j, null);
        }

        return true;
    }
}
