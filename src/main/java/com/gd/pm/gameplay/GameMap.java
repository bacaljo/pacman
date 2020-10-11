package com.gd.pm.gameplay;

import com.gd.pm.ui.graphic.GameGraphics;

import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;

public abstract class GameMap {
    private int columns;
    private int rows;
    private int gridSize;

    public GameMap(int columns, int rows, int gridSize) {
        this.columns = columns;
        this.rows = rows;
        this.gridSize = gridSize;
    }

    public void render(GameGraphics gameGraphics) {
        gameGraphics.fillRect(0, 0, getWidth(), getHeight(), BLUE);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                gameGraphics.drawRect(c * gridSize, r * gridSize, gridSize, gridSize, BLACK);
            }
        }
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public int getGridSize() {
        return gridSize;
    }

    public int getWidth() {
        return columns * gridSize;
    }

    public int getHeight() {
        return rows * gridSize;
    }
}
