package com.gd.pm.ui.view;

import com.gd.pm.key.observer.StartViewKeyObserver;
import com.gd.pm.ui.GameDimension;
import com.gd.pm.ui.GameView;

import java.awt.Graphics;

public final class StartView extends GameView {
    public StartView() {
        super(new StartViewKeyObserver());
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g, GameDimension gameDimension) {

    }
}
