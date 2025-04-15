package gol;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static Timer timer;
    private static boolean isRunning = false;
    private static GameOfLifeGUI golPanel;

    public static void main(String[] args) {
        Grid.initialize();

        JFrame frame = new JFrame("Conway's Game of Life");
        golPanel = new GameOfLifeGUI();

        // === Control Buttons ===
        JButton startBtn = new JButton("Start");
        JButton pauseBtn = new JButton("Pause");
        JButton restartBtn = new JButton("Restart");

        JPanel controlPanel = new JPanel();
        controlPanel.add(startBtn);
        controlPanel.add(pauseBtn);
        controlPanel.add(restartBtn);

        // === Add everything to frame ===
        frame.setLayout(new BorderLayout());
        frame.add(golPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // === Button Logic ===
        startBtn.addActionListener(e -> startSimulation());
        pauseBtn.addActionListener(e -> stopSimulation());
        restartBtn.addActionListener(e -> {
            stopSimulation();
            Grid.initialize();
            golPanel.refresh();
        });
    }

    private static void startSimulation() {
        if (isRunning) return;

        isRunning = true;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Grid.phase();
                golPanel.refresh();
            }
        }, 0, 200); // update every 200ms
    }

    private static void stopSimulation() {
        if (timer != null) {
            timer.cancel();
        }
        isRunning = false;
    }
}
