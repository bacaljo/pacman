package com.gd.pm.ui;

import com.gd.pm.main.GameLoop;

import javax.swing.JPanel;
import java.awt.Graphics;

public final class GamePanel extends JPanel {
    private GameLoop gameLoop;
    private GameDimension gameDimension;

    public GamePanel(GameDimension gameDimension) {
        this.gameDimension = gameDimension;
        setPreferredSize(gameDimension.getDimension());
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

        gameLoop.render(g, gameDimension);
    }
}
