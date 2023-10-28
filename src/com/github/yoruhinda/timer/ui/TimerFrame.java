package com.github.yoruhinda.timer.ui;

import com.github.yoruhinda.timer.manager.TimerManager;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class TimerFrame extends JFrame {
    private TimerPanel timerPanel = new TimerPanel();
    private TimerManager timerManager = new TimerManager(timerPanel);

    public TimerFrame() {
    }

    public void initializeFrame() {
        try {
            setIconImage(ImageIO.read(new File("src/resources/timerIcon.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setTitle("Timer");
        setResizable(false);
        add(timerPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
