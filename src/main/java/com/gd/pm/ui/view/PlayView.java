package com.gd.pm.ui.view;

import com.gd.pm.gameplay.GameObjectManager;
import com.gd.pm.gameplay.object.Pacman;
import com.gd.pm.gameplay.property.Location;
import com.gd.pm.key.GameKeyAction;
import com.gd.pm.ui.GameView;
import com.gd.pm.ui.graphic.GameGraphics;
import com.gd.pm.ui.property.HorizontalPosition;
import com.gd.pm.ui.property.Position;
import com.gd.pm.ui.property.VerticalPosition;

import static com.gd.pm.gameplay.property.Direction.DOWN;
import static com.gd.pm.gameplay.property.Direction.LEFT;
import static com.gd.pm.gameplay.property.Direction.RIGHT;
import static com.gd.pm.gameplay.property.Direction.UP;
import static java.awt.Color.WHITE;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import static java.awt.event.KeyEvent.VK_D;
import static java.awt.event.KeyEvent.VK_S;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_W;

public final class PlayView extends GameView {
    private boolean isPaused;
    private GameObjectManager gameObjectManager;
    private Pacman pacman;

    public PlayView() {
        super("play");
        gameObjectManager = new GameObjectManager();

        pacman = new Pacman(new Location(10, 10), UP);
        gameObjectManager.addGameObject(pacman);
    }

    @Override
    public void update() {
        if (isPaused) {
            return;
        }

        gameObjectManager.update();
    }

    @Override
    public void render(GameGraphics gameGraphics) {
        gameObjectManager.render(gameGraphics);

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
        put(VK_W, new GameKeyAction() {

            @Override
            public void press() {
                pacman.move(UP);
            }

            @Override
            public void release(double pressDuration) {

            }
        });
        put(VK_S, new GameKeyAction() {

            @Override
            public void press() {
                pacman.move(DOWN);
            }

            @Override
            public void release(double pressDuration) {

            }
        });
        put(VK_A, new GameKeyAction() {

            @Override
            public void press() {
                pacman.move(LEFT);
            }

            @Override
            public void release(double pressDuration) {

            }
        });
        put(VK_D, new GameKeyAction() {

            @Override
            public void press() {
                pacman.move(RIGHT);
            }

            @Override
            public void release(double pressDuration) {

            }
        });
    }
}
