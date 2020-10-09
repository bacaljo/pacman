package com.gd.pm.key;

import java.util.HashMap;
import java.util.Map;

public abstract class GameKeyObserver {
    private boolean isEnabled;
    private Map<Integer, GameKeyAction> keyActionMap;
    private GameKeyAction emptyGameKeyAction;

    public GameKeyObserver() {
        keyActionMap = new HashMap<>();
        emptyGameKeyAction = new GameKeyAction() {
            @Override
            public void press() {

            }

            @Override
            public void release(double pressDuration) {

            }
        };
        initialize();
    }

    protected abstract void initialize();

    public void press(int keyCode) {
        keyActionMap.getOrDefault(keyCode, emptyGameKeyAction)
                .press();
    }

    public void release(int keyCode, double pressDuration) {
        keyActionMap.getOrDefault(keyCode, emptyGameKeyAction)
                .release(pressDuration);
    }

    public void put(int keyEvent, GameKeyAction gameKeyAction) {
        keyActionMap.put(keyEvent, gameKeyAction);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
