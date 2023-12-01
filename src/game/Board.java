package game;

import pieces.*;
import players.Type;

import java.util.*;

public class Board {
    private int size;
    private final ArrayList<ArrayList<Piece>> field = new ArrayList<>(size);

    public Board() { }

    public boolean haveKings() {
        return countKing(Type.WHITE) > 0 && countKing(Type.BLACK) > 0;
    }

    public int countKing(Type type) {
        int king_num = 0;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (this.getPiece(i, j) != null && this.getPiece(i, j).getTypeOfPiece() == TypeOfPiece.KING && this.getPiece(i, j).getType() == type)
                    king_num++;

        return king_num;
    }

    public Piece getPiece(int x, int y) throws NullPointerException {
        return field.get(x).get(y);
    }

    public void setFieldToNull(int x, int y) {
        field.get(x).set(y, null);
    }

    public void setPiece(Piece piece) throws NullPointerException {
        if (piece != null) field.get(piece.getX()).set(piece.getY(), piece);
    }

    public void createBoard(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            field.add(i, new ArrayList<>(size));
            for (int j = 0; j < size; j++)
                field.get(i).add(j, null);
        }
    }

    public int getSize() {
        return this.size;
    }

    public ArrayList<String> getAllPieceTypes() {
        ArrayList<String> types = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(this.getPiece(i, j) != null && !types.contains(this.getPiece(i, j).getTypeOfPiece().toString())) {
                    types.add(this.getPiece(i, j).getTypeOfPiece().toString());
                }
            }
        }
            return types;
    }
}
