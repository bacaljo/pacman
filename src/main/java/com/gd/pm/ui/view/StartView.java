package com.gd.pm.ui.view;

import com.gd.pm.key.GameKeyAction;
import com.gd.pm.ui.GameView;
import com.gd.pm.ui.graphic.GameGraphics;
import com.gd.pm.ui.property.HorizontalPosition;
import com.gd.pm.ui.property.Position;
import com.gd.pm.ui.property.VerticalPosition;

import static java.awt.Color.WHITE;
import static java.awt.event.KeyEvent.VK_ESCAPE;
import static java.awt.event.KeyEvent.VK_SPACE;

public final class StartView extends GameView {

    public StartView() {
        super("start");
    }

    @Override
    public void update() {

    }

    @Override
    public void render(GameGraphics gameGraphics) {
        gameGraphics.adjustFontFamily("Onion soup");
        gameGraphics.adjustFontSize(160);
        gameGraphics.drawString("Pacman",
                new Position().setPositions(HorizontalPosition.MIDDLE, VerticalPosition.MIDDLE),
                WHITE);

        gameGraphics.adjustFontFamily("AtlandSketches BB");
        gameGraphics.adjustFontSize(36);
        gameGraphics.drawString("Press space to play",
                new Position().setPositions(HorizontalPosition.MIDDLE, VerticalPosition.BOTTOM).offsetYBy(-50),
                WHITE);
    }

    @Override
    protected void initializeKeyObserver() {
        put(VK_ESCAPE, new GameKeyAction() {

            @Override
            public void press() {
                System.exit(0);
            }

            @Override
            public void release(double pressDuration) {

            }
        });
        put(VK_SPACE, new GameKeyAction() {

            @Override
            public void press() {
                getGameViewManager().setCurrentGameView("play");
            }

            @Override
            public void release(double pressDuration) {

            }
        });
    }
}
