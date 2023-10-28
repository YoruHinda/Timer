package com.github.yoruhinda.timer.ui;

import com.github.yoruhinda.timer.listeners.CloseKeyListener;

import javax.swing.*;
import java.awt.*;

public class CountdownPanel extends JPanel{
    private JLabel timer = new JLabel();

    public void initComponents(){
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        addKeyListener(new CloseKeyListener());
        setFocusable(true);

        timer.setForeground(Color.WHITE);
        timer.setHorizontalAlignment(JLabel.CENTER);
        timer.setFont(new Font("arial",Font.PLAIN ,350));

        add(timer, BorderLayout.CENTER);
    }

    public JLabel getTimer() {
        return timer;
    }
}
