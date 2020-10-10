package com.gd.pm.ui.graphic;

import com.gd.pm.ui.GameDimension;
import com.gd.pm.ui.property.Position;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

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

    public void drawString(String string, Position position, Color color) {
        graphics.setColor(color);

        int x = 0;
        int y = 0;

        Graphics2D graphics2D = null;
        if (position.isHorizontallyPositioned() || position.isVerticallyPositioned()) {
            graphics2D = (Graphics2D) graphics;
        }

        if (position.isHorizontallyPositioned()) {
            int stringWidth = graphics2D.getFontMetrics().stringWidth(string);
            switch (position.getHorizontalPosition()) {
                case LEFT:
                    x = 0;
                    break;
                case MIDDLE:
                    x = (gameDimension.getWidth() / 2) - (stringWidth / 2);
                    break;
                case RIGHT:
                    x = gameDimension.getWidth() - stringWidth;
                    break;
            }
        } else {
            x = position.getX();
        }

        if (position.isVerticallyPositioned()) {
            int stringHeight = graphics2D.getFontMetrics().getMaxAscent() - graphics2D.getFontMetrics().getMaxDescent();
            switch (position.getVerticalPosition()) {
                case TOP:
                    y = stringHeight;
                    break;
                case MIDDLE:
                    y = gameDimension.getHeight() / 2;
                    break;
                case BOTTOM:
                    y = gameDimension.getHeight();
                    break;
            }
        } else {
            y = position.getY();
        }

        x += position.getOffset().getX();
        y += position.getOffset().getY();

        graphics.drawString(string, x, y);
    }

    public void adjustFontSize(int fontSize) {
        Font font = graphics.getFont();
        graphics.setFont(new Font(font.getFamily(), font.getStyle(), fontSize));
    }

    public void adjustFontFamily(String fontFamily) {
        Font font = graphics.getFont();
        graphics.setFont(new Font(fontFamily, font.getStyle(), font.getSize()));
    }

    public void adjustFontStyle(int fontStyle) {
        Font font = graphics.getFont();
        graphics.setFont(new Font(font.getFamily(), fontStyle, font.getSize()));
    }

    public void setFont(Font font) {
        graphics.setFont(font);
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public GameDimension getGameDimension() {
        return gameDimension;
    }
}
