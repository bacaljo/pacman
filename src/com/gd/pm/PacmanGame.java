package com.gd.pm;

import com.gd.pm.key.GameKeyObserver;
import com.gd.pm.key.observer.StartViewKeyObserver;
import com.gd.pm.ui.GameWindow;

import java.awt.Dimension;

public class PacmanGame {

    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow("Pacman", new Dimension(1000, 600));
        gameWindow.show();

        GameKeyObserver startViewKeyObserver = new StartViewKeyObserver();
        startViewKeyObserver.setEnabled(true);

        gameWindow.addGameKeyObserver(startViewKeyObserver);
    }
}
