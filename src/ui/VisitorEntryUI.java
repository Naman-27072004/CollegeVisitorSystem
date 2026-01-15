package ui;

import dao.VisitorDAO;
import model.Visitor;
import report.VisitorPDF;
import javax.swing.*;

public class VisitorEntryUI extends JFrame {

    public VisitorEntryUI() {
        setTitle("Visitor Entry");
        setSize(350, 300);
        setLayout(null);
        // Center the frame on the screen
        setLocationRelativeTo(null);
        // Prevent resizing
        setResizable(false);

        JTextField name = new JTextField();
        JTextField mobile = new JTextField();
        JTextField purpose = new JTextField();
        JTextField host = new JTextField();

        JButton save = new JButton("Save");

        JLabel l1 = new JLabel("Name");
        JLabel l2 = new JLabel("Mobile");
        JLabel l3 = new JLabel("Purpose");
        JLabel l4 = new JLabel("Host");

        l1.setBounds(30, 30, 80, 25);
        name.setBounds(120, 30, 150, 25);
        l2.setBounds(30, 70, 80, 25);
        mobile.setBounds(120, 70, 150, 25);
        l3.setBounds(30, 110, 80, 25);
        purpose.setBounds(120, 110, 150, 25);
        l4.setBounds(30, 150, 80, 25);
        host.setBounds(120, 150, 150, 25);
        save.setBounds(120, 200, 100, 30);

        add(l1);
        add(name);
        add(l2);
        add(mobile);
        add(l3);
        add(purpose);
        add(l4);
        add(host);
        add(save);

        save.addActionListener(e -> {
            try {
                Visitor v = new Visitor(
                        name.getText(), mobile.getText(),
                        purpose.getText(), host.getText());
                VisitorDAO.addVisitor(v);
                VisitorPDF.generate(name.getText(), mobile.getText(),
                        purpose.getText(), host.getText());
                JOptionPane.showMessageDialog(this, "Visitor Added");
                dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}
