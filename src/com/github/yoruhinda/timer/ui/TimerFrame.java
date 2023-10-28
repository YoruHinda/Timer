package com.github.yoruhinda.timer.ui;

import com.github.yoruhinda.timer.manager.TimerManager;
import com.github.yoruhinda.timer.util.IconImage;

import javax.swing.*;

public class TimerFrame extends JFrame {
    private TimerPanel timerPanel = new TimerPanel();
    private TimerManager timerManager = new TimerManager(timerPanel);

    public TimerFrame() {
    }

    public void initializeFrame() {
        setIconImage(IconImage.getIcon());
        setTitle("Timer");
        setResizable(false);
        add(timerPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
