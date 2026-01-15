package ui;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {

    private JProgressBar progressBar;
    private Timer timer;

    public SplashScreen() {
        setSize(500, 300);
        setLocationRelativeTo(null); // center of screen
        getContentPane().setLayout(new BorderLayout());

        // Title Label
        JLabel title = new JLabel("College Visitor Entry System", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        // Progress Bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        // Footer Label
        JLabel footer = new JLabel("Loading, please wait...", JLabel.CENTER);

        getContentPane().add(title, BorderLayout.NORTH);
        getContentPane().add(progressBar, BorderLayout.CENTER);
        getContentPane().add(footer, BorderLayout.SOUTH);

        startLoading();
    }

    private void startLoading() {
        timer = new Timer(30, e -> {
            int value = progressBar.getValue();
            if (value < 100) {
                progressBar.setValue(value + 1);
            } else {
                timer.stop();
                dispose(); // close splash screen
                new LoginUI().setVisible(true); // open login screen
            }
        });
        timer.start();
    }
}
