package com.gd.pm.ui;

import java.awt.Dimension;

public final class GameDimension {
    private int width;
    private int height;

    public GameDimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public GameDimension(Dimension dimension) {
        this.width = dimension.width;
        this.height = dimension.height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Dimension getDimension() {
        return new Dimension(width, height);
    }
}
