package com.gd.pm.ui;

import com.gd.pm.key.GameKeyObserver;
import com.gd.pm.ui.graphic.GameGraphics;

public abstract class GameView extends GameKeyObserver {
    private GameViewManager gameViewManager;

    public abstract void update();

    public abstract void render(GameGraphics gameGraphics);

    protected GameViewManager getGameViewManager() {
        return gameViewManager;
    }

    void setGameViewManager(GameViewManager gameViewManager) {
        this.gameViewManager = gameViewManager;
    }
}
