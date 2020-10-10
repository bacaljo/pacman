package com.gd.pm;

import com.gd.pm.main.FontLoader;
import com.gd.pm.main.GameLoop;
import com.gd.pm.ui.GameDimension;
import com.gd.pm.ui.GameViewManager;
import com.gd.pm.ui.GameWindow;
import com.gd.pm.ui.view.StartView;

import java.awt.FontFormatException;
import java.io.IOException;

import static java.util.Collections.unmodifiableList;

public class PacmanGame {

    public static void main(String[] args) throws InterruptedException, IOException, FontFormatException {
        FontLoader.load();

        GameWindow gameWindow = new GameWindow("Pacman", new GameDimension(1000, 600));
        gameWindow.show();

        GameViewManager gameViewManager = new GameViewManager();
        gameViewManager.put("start", new StartView());

        gameWindow.setGameKeyObserverList(unmodifiableList(gameViewManager.getGameViewList()));

        GameLoop gameLoop = new GameLoop(100, gameWindow, gameViewManager);
        gameLoop.start();
    }
}
