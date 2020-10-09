package com.gd.pm;

import com.gd.pm.key.GameKeyObserver;
import com.gd.pm.key.observer.StartViewKeyObserver;
import com.gd.pm.main.GameLoop;
import com.gd.pm.ui.GameWindow;

import java.awt.Dimension;

public class PacmanGame {

    public static void main(String[] args) throws InterruptedException {
        GameWindow gameWindow = new GameWindow("Pacman", new Dimension(1000, 600));

        GameKeyObserver startViewKeyObserver = new StartViewKeyObserver();
        startViewKeyObserver.setEnabled(true);
        gameWindow.addGameKeyObserver(startViewKeyObserver);

        GameLoop gameLoop = new GameLoop(100, gameWindow);
        gameWindow.show();
        gameLoop.start();
    }
}
