package com.gd.pm.view;

import com.gd.pm.key.observer.StartViewKeyObserver;
import com.gd.pm.main.GameView;

import java.awt.Graphics;

public class StartView extends GameView {
    public StartView() {
        super(new StartViewKeyObserver());
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {

    }
}
