package com.gd.pm.ui.view;

import com.gd.pm.key.observer.StartViewKeyObserver;
import com.gd.pm.ui.GameView;
import com.gd.pm.ui.graphic.GameGraphics;
import com.gd.pm.ui.property.HorizontalPosition;
import com.gd.pm.ui.property.Position;
import com.gd.pm.ui.property.VerticalPosition;

import static java.awt.Color.WHITE;

public final class StartView extends GameView {
    public StartView() {
        super(new StartViewKeyObserver());
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
}
