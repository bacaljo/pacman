package com.gd.pm.ui;

import com.gd.pm.ui.graphic.GameGraphics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GameViewManager {
    private Map<String, GameView> viewNameGameViewMap;
    private GameView currentGameView;

    public GameViewManager() {
        viewNameGameViewMap = new HashMap<>();
    }

    public void update() {
        if (currentGameView == null) {
            return;
        }

        currentGameView.update();
    }

    public void render(GameGraphics gameGraphics) {
        if (currentGameView == null) {
            return;
        }

        currentGameView.render(gameGraphics);
    }

    public void put(String viewName, GameView gameView) {
        gameView.setGameViewManager(this);
        viewNameGameViewMap.put(viewName, gameView);

        if (currentGameView == null) {
            currentGameView = gameView;
            currentGameView.setEnabled(true);
        }
    }

    public void setCurrentGameView(String gameViewName) {
        currentGameView.setEnabled(false);

        currentGameView = viewNameGameViewMap.get(gameViewName);
        currentGameView.setEnabled(true);
    }

    public List<GameView> getGameViewList() {
        return new ArrayList(viewNameGameViewMap.values());
    }
}
