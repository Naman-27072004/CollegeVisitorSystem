package ui;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {

    private JProgressBar progressBar;
    private Timer timer;

    public SplashScreen() {
        setSize(600, 400);
        setLocationRelativeTo(null); // center of screen
        getContentPane().setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon("images/college_logo.png");
        JLabel logoLabel = new JLabel(icon, JLabel.CENTER);

        JLabel title = new JLabel("College Visitor Entry System", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        JLabel footer = new JLabel("Loading, please wait...", JLabel.CENTER);

        getContentPane().add(title, BorderLayout.NORTH);
        getContentPane().add(logoLabel, BorderLayout.CENTER);
        getContentPane().add(progressBar, BorderLayout.SOUTH);

        startLoading();
    }

    private void startLoading() {
        timer = new Timer(30, e -> {
            int value = progressBar.getValue();
            if (value < 100) {
                progressBar.setValue(value + 1);
            } else {
                timer.stop();
                dispose();
                new LoginUI().setVisible(true);
            }
        });
        timer.start();
    }
}
