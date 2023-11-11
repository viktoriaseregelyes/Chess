package game;

import javax.swing.table.*;
import java.io.*;
import java.util.ArrayList;

public class ResultData extends AbstractTableModel implements Serializable {
    public ArrayList<Result> results = new ArrayList<>();

    public ResultData() {
        this.load();
    }

    public void add(Result r) {
        results.add(r);
        fireTableDataChanged();
        this.save();
    }

    public int getRowCount() {
        return results.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int column) {
        switch(column) {
            case 0: return "White";
            case 1: return "Black";
            default: return "Winner";
        }
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Result res = results.get(rowIndex);
        switch(columnIndex) {
            case 0: return res.GetPlayerWhite();
            case 1: return res.GetPlayerBlack();
            default: return res.GetWinner();
        }
    }

    public void load() {
        try {
            FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "\\src\\players_winner.ser");
            ObjectInputStream in = new ObjectInputStream(f);
            this.results = (ArrayList<Result>) in.readObject();
            in.close();
            f.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
    }

    public void save() {
        try {
            FileOutputStream f = new FileOutputStream(System.getProperty("user.dir") + "\\src\\players_winner.ser");
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(this.results);
            out.close();
            f.close();
        }
        catch(IOException e) {
            e.getMessage();
        }
    }
}