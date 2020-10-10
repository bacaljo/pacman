package com.gd.pm.key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public final class GameKeyManager implements KeyListener {
    private List<GameKeyObserver> gameKeyObserverList;

    public GameKeyManager() {
        gameKeyObserverList = new ArrayList<>();
    }

    public void addGameKeyObserver(GameKeyObserver gameKeyObserver) {
        gameKeyObserverList.add(gameKeyObserver);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        gameKeyObserverList.stream()
                .filter(GameKeyObserver::isEnabled)
                .forEach(gameKeyObserver -> {
                    gameKeyObserver.press(e.getKeyCode());
                });
    }

    @Override
    public void keyReleased(KeyEvent e) {
        gameKeyObserverList.stream()
                .filter(GameKeyObserver::isEnabled)
                .forEach(gameKeyObserver -> {
                    gameKeyObserver.release(e.getKeyCode(), 0);
                });
    }
}
