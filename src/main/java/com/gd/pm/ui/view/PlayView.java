package com.gd.pm.ui.view;

import com.gd.pm.key.GameKeyAction;
import com.gd.pm.ui.GameView;
import com.gd.pm.ui.graphic.GameGraphics;
import com.gd.pm.ui.property.HorizontalPosition;
import com.gd.pm.ui.property.Position;
import com.gd.pm.ui.property.VerticalPosition;

import static java.awt.Color.WHITE;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import static java.awt.event.KeyEvent.VK_SPACE;

public final class PlayView extends GameView {
    private boolean isPaused;

    public PlayView() {
        super("play");
    }

    @Override
    public void update() {
        if (isPaused) {
            return;
        }
    }

    @Override
    public void render(GameGraphics gameGraphics) {
        gameGraphics.adjustFontFamily("AtlandSketches BB");
        gameGraphics.adjustFontSize(30);

        gameGraphics.drawString("[Backspace] - Back",
                new Position().setX(20).setY(30),
                WHITE);
        gameGraphics.drawString("[Space] - Pause",
                new Position().setX(20).setY(60),
                WHITE);

        if (isPaused) {
            gameGraphics.adjustFontFamily("Onion soup");
            gameGraphics.adjustFontSize(100);
            gameGraphics.drawString("Paused",
                    new Position().setPositions(HorizontalPosition.MIDDLE, VerticalPosition.MIDDLE),
                    WHITE);

            gameGraphics.adjustFontFamily("AtlandSketches BB");
            gameGraphics.adjustFontSize(36);
            gameGraphics.drawString("Press space to resume",
                    new Position().setPositions(HorizontalPosition.MIDDLE, VerticalPosition.BOTTOM).offsetYBy(-50),
                    WHITE);
        }
    }

    @Override
    protected void initializeKeyObserver() {
        put(VK_BACK_SPACE, new GameKeyAction() {

            @Override
            public void press() {
                getGameViewManager().setCurrentGameView("start");
            }

            @Override
            public void release(double pressDuration) {

            }
        });

        put(VK_SPACE, new GameKeyAction() {

            @Override
            public void press() {
                isPaused = !isPaused;
            }

            @Override
            public void release(double pressDuration) {

            }
        });
    }
}
