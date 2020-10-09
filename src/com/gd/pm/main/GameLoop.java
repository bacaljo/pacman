package com.gd.pm.main;

import com.gd.pm.ui.GameWindow;

import java.awt.Color;
import java.awt.Graphics;

public class GameLoop {
    private GameWindow gameWindow;
    private final int fps;

    public GameLoop(int fps, GameWindow gameWindow) {
        this.fps = fps;
        this.gameWindow = gameWindow;
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
        System.out.println("Updating...");
    }

    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, gameWindow.getWidth(), gameWindow.getHeight());
        System.out.println("Rendering...");
    }
}
