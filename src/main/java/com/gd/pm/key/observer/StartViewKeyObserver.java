package com.gd.pm.key.observer;

import com.gd.pm.key.GameKeyAction;
import com.gd.pm.key.GameKeyObserver;

import java.awt.event.KeyEvent;

public final class StartViewKeyObserver extends GameKeyObserver {

    @Override
    public void initialize() {
        put(KeyEvent.VK_ESCAPE, new GameKeyAction() {

            @Override
            public void press() {
                System.exit(0);
            }

            @Override
            public void release(double pressDuration) {

            }
        });
    }
}
