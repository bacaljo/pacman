package com.gd.pm.ui.graphic;

import com.gd.pm.ui.GameDimension;

import java.awt.Color;
import java.awt.Graphics;

public final class GameGraphics {
    private Graphics graphics;
    private GameDimension gameDimension;

    public GameGraphics(Graphics graphics, GameDimension gameDimension) {
        this.graphics = graphics;
        this.gameDimension = gameDimension;
    }

    public void fillBackground(Color color) {
        graphics.setColor(color);
        graphics.fillRect(0, 0, gameDimension.getWidth(), gameDimension.getHeight());
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public GameDimension getGameDimension() {
        return gameDimension;
    }
}
