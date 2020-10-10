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

    public void setGameKeyObserverList(List<GameKeyObserver> gameKeyObserverList) {
        this.gameKeyObserverList = gameKeyObserverList;
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
