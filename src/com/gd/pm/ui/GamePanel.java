package com.gd.pm.ui;

import com.gd.pm.main.GameLoop;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public final class GamePanel extends JPanel {
    private GameLoop gameLoop;

    public GamePanel(Dimension dimension) {
        setPreferredSize(dimension);
        setDoubleBuffered(true);
    }

    public void setGameLoop(GameLoop gameLoop) {
        this.gameLoop = gameLoop;
    }

    @Override
    public void paintComponent(Graphics g) {
        if (gameLoop == null) {
            return;
        }

        gameLoop.render(g);
    }
}
