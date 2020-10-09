package com.gd.pm.main;

import com.gd.pm.ui.GameWindow;
import com.gd.pm.view.GameViewManager;

import java.awt.Color;
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

    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, gameWindow.getWidth(), gameWindow.getHeight());
        gameViewManager.render(g);
        System.out.println("Rendering...");
    }
}
