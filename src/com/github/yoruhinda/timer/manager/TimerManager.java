package com.github.yoruhinda.timer.manager;

import com.github.yoruhinda.timer.ui.CountdownFrame;
import com.github.yoruhinda.timer.ui.TimerPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class TimerManager {
    private TimerPanel timerPanel;
    private CountdownFrame countdownFrame;
    private int hours;
    private int minutes;
    private int seconds;
    private int totalSeconds;

    public TimerManager(TimerPanel timerPanel) {
        this.timerPanel = timerPanel;
        countdownFrame = new CountdownFrame();
        initTimer();
    }

    private void initTimer() {
        timerPanel.getStartTimer().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hours = (int) timerPanel.getHours().getValue();
                minutes = (int) timerPanel.getMinutes().getValue();
                seconds = (int) timerPanel.getSeconds().getValue();
                countdownFrame.initializeFrame();
                totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (totalSeconds == 0) {
                            cancel();
                        }
                        countdownFrame.getTimerCountPanel().getTimer().setText(String.format("%02d:%02d:%02d", totalSeconds / 3600, (totalSeconds % 3600) / 60, totalSeconds % 60));
                        totalSeconds--;
                    }
                }, 1000L, 1000L);
            }
        });
    }
}
