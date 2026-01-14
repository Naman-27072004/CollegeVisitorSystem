package ui;

import dao.AdminDAO;
import javax.swing.*;

public class LoginUI extends JFrame {

    JTextField user;
    JPasswordField pass;

    public LoginUI() {
        setTitle("Admin Login");
        setSize(300, 200);
        setLayout(null);

        JLabel u = new JLabel("Username");
        JLabel p = new JLabel("Password");
        user = new JTextField();
        pass = new JPasswordField();
        JButton login = new JButton("Login");

        u.setBounds(30, 30, 80, 25);
        p.setBounds(30, 70, 80, 25);
        user.setBounds(120, 30, 120, 25);
        pass.setBounds(120, 70, 120, 25);
        login.setBounds(90, 120, 100, 25);

        add(u);
        add(p);
        add(user);
        add(pass);
        add(login);

        login.addActionListener(e -> {
            if (AdminDAO.login(user.getText(),
                    new String(pass.getPassword()))) {
                new DashboardUI();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
