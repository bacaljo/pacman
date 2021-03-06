package com.gd.pm.ui;

import com.gd.pm.key.GameKeyManager;
import com.gd.pm.key.GameKeyObserver;
import com.gd.pm.main.GameLoop;

import javax.swing.JFrame;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public final class GameWindow {
    private JFrame jFrame;
    private GamePanel gamePanel;
    private GameKeyManager gameKeyManager;

    public GameWindow(String title, GameDimension gameDimension) {
        jFrame = new JFrame(title);
        gamePanel = new GamePanel(gameDimension);
        gameKeyManager = new GameKeyManager();

        setup();
    }

    private void setup() {
        jFrame.add(gamePanel);
        jFrame.addKeyListener(gameKeyManager);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
    }

    public void show() {
        jFrame.setVisible(true);
    }

    public void render() {
        jFrame.repaint();
    }

    public void setGameLoop(GameLoop gameLoop) {
        gamePanel.setGameLoop(gameLoop);
    }

    public void setGameKeyObserverList(List<GameKeyObserver> gameKeyObserverList) {
        gameKeyManager.setGameKeyObserverList(gameKeyObserverList);
    }
}
