package ui;

import dao.VisitorDAO;
import javax.swing.*;

public class VisitorExitUI extends JFrame {

    public VisitorExitUI() {
        setTitle("Visitor Exit");
        setSize(250, 150);
        setLayout(null);

        JLabel l = new JLabel("Visitor ID");
        JTextField id = new JTextField();
        JButton exit = new JButton("Exit");

        l.setBounds(30, 20, 80, 25);
        id.setBounds(120, 20, 80, 25);
        exit.setBounds(80, 70, 80, 25);

        add(l);
        add(id);
        add(exit);

        exit.addActionListener(e -> {
            try {
                VisitorDAO.exitVisitor(
                        Integer.parseInt(id.getText()));
                JOptionPane.showMessageDialog(this, "Exit Recorded");
                dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}
