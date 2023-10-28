package com.github.yoruhinda.timer.ui;

import javax.swing.*;
import java.awt.*;

public class TimerPanel extends JPanel {
    private JSpinner hours;
    private JSpinner minutes;
    private JSpinner seconds;
    private JLabel hoursLabel;
    private JLabel minutesLabel;
    private JLabel secondsLabel;
    private SpinnerModel hourModel = new SpinnerNumberModel(0, 0, 99, 1);
    private SpinnerModel minutesModel = new SpinnerNumberModel(0, 0, 59, 1);
    private SpinnerModel secondsModel = new SpinnerNumberModel(0, 0, 59, 1);
    private JButton startTimer;

    public TimerPanel(){
        hours = new JSpinner(hourModel);
        minutes = new JSpinner(minutesModel);
        seconds = new JSpinner(secondsModel);
        hoursLabel = new JLabel("Hours:");
        minutesLabel = new JLabel("Minutes:");
        secondsLabel = new JLabel("Seconds:");
        startTimer = new JButton();
        initialize();
    }

    private void initialize(){
        setBackground(Color.DARK_GRAY);

        startTimer.setPreferredSize(new Dimension(100,35));
        startTimer.setText("Start Timer");
        startTimer.setForeground(Color.WHITE);
        startTimer.setBackground(Color.GRAY);
        startTimer.setBorder(null);
        startTimer.setFocusable(false);

        hours.getEditor().getComponent(0).setBackground(Color.DARK_GRAY);
        hours.getEditor().getComponent(0).setForeground(Color.WHITE);
        hours.setPreferredSize(new Dimension(50,50));
        hours.setBorder(null);

        minutes.getEditor().getComponent(0).setBackground(Color.DARK_GRAY);
        minutes.getEditor().getComponent(0).setForeground(Color.WHITE);
        minutes.setPreferredSize(new Dimension(50,50));
        minutes.setBorder(null);

        seconds.getEditor().getComponent(0).setBackground(Color.DARK_GRAY);
        seconds.getEditor().getComponent(0).setForeground(Color.WHITE);
        seconds.setPreferredSize(new Dimension(50,50));
        seconds.setBorder(null);

        ((JSpinner.DefaultEditor) hours.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) minutes.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) seconds.getEditor()).getTextField().setEditable(false);

        hoursLabel.setForeground(Color.WHITE);
        minutesLabel.setForeground(Color.WHITE);
        secondsLabel.setForeground(Color.WHITE);

        add(hoursLabel);
        add(hours);
        add(minutesLabel);
        add(minutes);
        add(secondsLabel);
        add(seconds);
        add(startTimer);
    }

    public JSpinner getHours() {
        return hours;
    }

    public JSpinner getMinutes() {
        return minutes;
    }

    public JSpinner getSeconds() {
        return seconds;
    }

    public JButton getStartTimer() {
        return startTimer;
    }
}
