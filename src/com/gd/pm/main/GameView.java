package com.gd.pm.main;

import com.gd.pm.key.GameKeyObserver;

import java.awt.Graphics;

public abstract class GameView {
    private GameKeyObserver gameKeyObserver;

    public GameView(GameKeyObserver gameKeyObserver) {
        this.gameKeyObserver = gameKeyObserver;
    }

    public abstract void update();

    public abstract void render(Graphics g);

    public GameKeyObserver getGameKeyObserver() {
        return gameKeyObserver;
    }
}
