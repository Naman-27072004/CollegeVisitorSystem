package ui;

import dao.VisitorDAO;
import javax.swing.*;
import java.util.Vector;

public class VisitorListUI extends JFrame {

    public VisitorListUI() {
        setTitle("Visitor Records");
        setSize(700, 300);

        Vector<String> cols = new Vector<>();
        cols.add("ID");
        cols.add("Name");
        cols.add("Mobile");
        cols.add("Purpose");
        cols.add("Host");
        cols.add("Entry");
        cols.add("Exit");

        try {
            JTable table = new JTable(
                    VisitorDAO.getAllVisitors(), cols);
            add(new JScrollPane(table));
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }
}
