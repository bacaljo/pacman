package com.gd.pm.view;

import com.gd.pm.main.GameView;
import com.gd.pm.ui.GameDimension;

import java.awt.Graphics;
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

    public void render(Graphics g, GameDimension gameDimension) {
        if (currentGameView == null) {
            return;
        }

        currentGameView.render(g, gameDimension);
    }

    public void put(String viewName, GameView gameView) {
        viewNameGameViewMap.put(viewName, gameView);

        if (currentGameView == null) {
            setCurrentGameView(viewName);
        }
    }

    public void setCurrentGameView(String gameViewName) {
        for (GameView gameView : getGameViewList()) {
            gameView.getGameKeyObserver().setEnabled(false);
        }
        currentGameView = viewNameGameViewMap.get(gameViewName);
        currentGameView.getGameKeyObserver().setEnabled(true);
    }

    public List<GameView> getGameViewList() {
        return new ArrayList(viewNameGameViewMap.values());
    }
}
