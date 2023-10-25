package com.github.yoruhinda.timer.ui;

import javax.swing.*;

public class TimerFrame extends JFrame {
    private TimerPanel timerPanel = new TimerPanel();

    public TimerFrame() {
    }

    public void initializeFrame() {
        setTitle("Timer");
        setResizable(false);
        add(timerPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
