package com.github.yoruhinda.timer.ui;

import com.github.yoruhinda.timer.listeners.CloseKeyListener;

import javax.swing.*;
import java.awt.*;

public class CountdownPanel extends JPanel {
    private JLabel timer = new JLabel();

    public void initComponents() {
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        addKeyListener(new CloseKeyListener());
        setFocusable(true);

        timer.setForeground(Color.WHITE);
        timer.setHorizontalAlignment(JLabel.CENTER);
        adaptiveFontSize();

        add(timer, BorderLayout.CENTER);
    }

    private void adaptiveFontSize() {
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        timer.setFont(new Font(timer.getFont().getName(), timer.getFont().getStyle(), (width + height) / 10));
    }

    public JLabel getTimer() {
        return timer;
    }
}
