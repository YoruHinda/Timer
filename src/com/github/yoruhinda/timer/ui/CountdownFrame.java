package com.github.yoruhinda.timer.ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class CountdownFrame extends JFrame {
    private CountdownPanel countdownPanel = new CountdownPanel();

    public void initializeFrame(){
        countdownPanel.initComponents();
        setTitle("Timer");
        setContentPane(countdownPanel);
        try {
            setIconImage(ImageIO.read(new File("src/resources/timerIcon.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
