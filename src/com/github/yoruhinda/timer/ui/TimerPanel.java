package com.github.yoruhinda.timer.ui;

import javax.swing.*;
import java.awt.*;

public class TimerPanel extends JPanel {
    private JSpinner hours;
    private JSpinner minutes;
    private JSpinner seconds;
    private SpinnerModel hourModel = new SpinnerNumberModel(0, 0, 99, 1);
    private SpinnerModel minutesModel = new SpinnerNumberModel(0, 0, 59, 1);
    private SpinnerModel secondsModel = new SpinnerNumberModel(0, 0, 59, 1);
    private JButton startTimer;

    public TimerPanel(){
        hours = new JSpinner(hourModel);
        minutes = new JSpinner(minutesModel);
        seconds = new JSpinner(secondsModel);
        startTimer = new JButton();
        initialize();
    }

    private void initialize(){
        hours.setPreferredSize(new Dimension(50,50));
        minutes.setPreferredSize(new Dimension(50,50));
        seconds.setPreferredSize(new Dimension(50,50));
        startTimer.setPreferredSize(new Dimension(100,35));
        startTimer.setText("Start Timer");
        startTimer.setForeground(Color.WHITE);
        startTimer.setBackground(Color.BLACK);
        startTimer.setBorder(null);
        startTimer.setFocusable(false);
        setBackground(Color.DARK_GRAY);
        ((JSpinner.DefaultEditor) hours.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) minutes.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) seconds.getEditor()).getTextField().setEditable(false);
        add(hours);
        add(minutes);
        add(seconds);
        add(startTimer);
    }
}
