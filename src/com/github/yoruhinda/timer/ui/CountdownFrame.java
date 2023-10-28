package com.github.yoruhinda.timer.ui;

import com.github.yoruhinda.timer.util.IconImage;

import javax.swing.*;

public class CountdownFrame extends JFrame {
    private CountdownPanel countdownPanel = new CountdownPanel();

    public void initializeFrame() {
        countdownPanel.initComponents();
        setTitle("Timer");
        setContentPane(countdownPanel);
        setIconImage(IconImage.getIcon());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public CountdownPanel getTimerCountPanel() {
        return countdownPanel;
    }
}
