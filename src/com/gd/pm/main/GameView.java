package com.gd.pm.main;

import com.gd.pm.key.GameKeyObserver;
import com.gd.pm.ui.GameDimension;

import java.awt.Graphics;

public abstract class GameView {
    private GameKeyObserver gameKeyObserver;

    public GameView(GameKeyObserver gameKeyObserver) {
        this.gameKeyObserver = gameKeyObserver;
    }

    public abstract void update();

    public abstract void render(Graphics g, GameDimension gameDimension);

    public GameKeyObserver getGameKeyObserver() {
        return gameKeyObserver;
    }
}
