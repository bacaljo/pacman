package com.gd.pm.ui;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public final class GamePanel extends JPanel {
    public GamePanel(Dimension dimension) {
        setPreferredSize(dimension);
        setDoubleBuffered(true);
    }

    @Override
    public void paintComponent(Graphics g) {
    }
}
