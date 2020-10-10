package com.gd.pm.ui;

import com.gd.pm.key.GameKeyObserver;
import com.gd.pm.ui.graphic.GameGraphics;

public abstract class GameView {
    private GameKeyObserver gameKeyObserver;

    public GameView(GameKeyObserver gameKeyObserver) {
        this.gameKeyObserver = gameKeyObserver;
    }

    public abstract void update();

    public abstract void render(GameGraphics gameGraphics);

    public GameKeyObserver getGameKeyObserver() {
        return gameKeyObserver;
    }
}
