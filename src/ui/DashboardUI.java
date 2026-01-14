package ui;

import javax.swing.*;

public class DashboardUI extends JFrame {

    public DashboardUI() {
        setTitle("Dashboard");
        setSize(400, 300);
        setLayout(null);

        JButton entry = new JButton("Visitor Entry");
        JButton exit = new JButton("Visitor Exit");
        JButton view = new JButton("View Visitors");

        entry.setBounds(100, 40, 200, 30);
        exit.setBounds(100, 90, 200, 30);
        view.setBounds(100, 140, 200, 30);

        add(entry);
        add(exit);
        add(view);

        entry.addActionListener(e -> new VisitorEntryUI());
        exit.addActionListener(e -> new VisitorExitUI());
        view.addActionListener(e -> new VisitorListUI());

        setVisible(true);
    }
}
