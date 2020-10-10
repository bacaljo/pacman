package com.gd.pm.main;

import com.gd.pm.ui.GameViewManager;
import com.gd.pm.ui.GameWindow;
import com.gd.pm.ui.graphic.GameGraphics;

import java.awt.Color;

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

    public void render(GameGraphics gameGraphics) {
        gameGraphics.fillBackground(Color.BLACK);
        gameViewManager.render(gameGraphics);
        System.out.println("Rendering...");
    }
}
