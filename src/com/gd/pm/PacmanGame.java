package com.gd.pm;

import com.gd.pm.main.GameLoop;
import com.gd.pm.ui.GameDimension;
import com.gd.pm.ui.GameView;
import com.gd.pm.ui.GameViewManager;
import com.gd.pm.ui.GameWindow;
import com.gd.pm.ui.view.StartView;

public class PacmanGame {

    public static void main(String[] args) throws InterruptedException {
        GameWindow gameWindow = new GameWindow("Pacman", new GameDimension(1000, 600));
        gameWindow.show();

        GameViewManager gameViewManager = new GameViewManager();
        gameViewManager.put("start", new StartView());

        for (GameView gameView : gameViewManager.getGameViewList()) {
            gameWindow.addGameKeyObserver(gameView.getGameKeyObserver());
        }

        GameLoop gameLoop = new GameLoop(100, gameWindow, gameViewManager);
        gameLoop.start();
    }
}
