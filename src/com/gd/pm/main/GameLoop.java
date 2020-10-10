package com.gd.pm.main;

import com.gd.pm.ui.GameDimension;
import com.gd.pm.ui.GameWindow;
import com.gd.pm.view.GameViewManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public final class GameLoop {
    private final int fps;
    private GameWindow gameWindow;
    private GameViewManager gameViewManager;

    public GameLoop(int fps, GameWindow gameWindow, GameViewManager gameViewManager) {
        this.fps = fps;
        this.gameWindow = gameWindow;
        this.gameViewManager = gameViewManager;
        gameWindow.setGameLoop(this);
    }

    public void start() throws InterruptedException {
        while (true) {
            update();
            gameWindow.render();
            Thread.sleep(1000 / fps);
        }
    }

    public void update() {
        gameViewManager.update();
        System.out.println("Updating...");
    }

    public void render(Graphics g, GameDimension gameDimension) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, gameDimension.getWidth(), gameDimension.getHeight());
        gameViewManager.render(g, gameDimension);
        System.out.println("Rendering...");
    }
}
