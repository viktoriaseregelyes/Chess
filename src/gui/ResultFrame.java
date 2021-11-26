package gui;

import game.ResultData;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class ResultFrame extends JFrame {
    public ResultData resultData;
    public Frame frame;

    public ResultFrame(String name, Frame frame, ResultData resultData) {
        super(name);
        this.resultData = resultData;
        this.frame = frame;

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
            frame.setVisible(true);
        }
    }
}