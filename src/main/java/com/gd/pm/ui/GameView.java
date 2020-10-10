package com.gd.pm.ui;

import com.gd.pm.key.GameKeyObserver;
import com.gd.pm.ui.graphic.GameGraphics;

public abstract class GameView {
    private GameViewManager gameViewManager;
    private GameKeyObserver gameKeyObserver;

    public GameView() {
        this.gameKeyObserver = initializeKeyObserver();
    }

    protected abstract GameKeyObserver initializeKeyObserver();

    public abstract void update();

    public abstract void render(GameGraphics gameGraphics);

    public GameKeyObserver getGameKeyObserver() {
        return gameKeyObserver;
    }

    protected GameViewManager getGameViewManager() {
        return gameViewManager;
    }

    void setGameViewManager(GameViewManager gameViewManager) {
        this.gameViewManager = gameViewManager;
    }
}
