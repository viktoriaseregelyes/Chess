package gui;

import game.Controller;
import game.ResultData;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class ResultFrame extends JFrame {
    private ResultData resultData;

    public ResultFrame(String name, ResultData resultData) {
        super(name);
        this.resultData = resultData;

        this.setLayout(new BorderLayout());
        JTable table = new JTable(resultData);
        table.setFillsViewportHeight(true);
        table.updateUI();

        table.setRowSorter(new TableRowSorter<>(resultData));

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);
        sorter.sort();

        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);

        JPanel panel_button = new JPanel();
        JButton button_menu = new JButton("Menu");
        button_menu.addActionListener(new MenuButtonActionListener());

        panel_button.add(button_menu);
        this.add(panel_button, BorderLayout.SOUTH);
        this.pack();
        this.setSize(800, 600);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void setVisible(boolean bool) {
        super.setVisible(bool);
        resultData.load();
    }

    public class MenuButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            try {
                Controller.GetInstance().GetFrame().setVisible(true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}