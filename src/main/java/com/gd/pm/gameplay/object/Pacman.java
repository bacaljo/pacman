package com.gd.pm.gameplay.object;

import com.gd.pm.gameplay.GameObject;
import com.gd.pm.gameplay.property.Direction;
import com.gd.pm.gameplay.property.Location;
import com.gd.pm.ui.graphic.GameGraphics;

import static java.awt.Color.YELLOW;

public class Pacman extends GameObject {
    private double movementSpeed;
    private Direction direction;

    public Pacman(Location location, Direction direction) {
        super(location);
        this.direction = direction;
        movementSpeed = 200;
    }

    public void move(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void update() {
        int speedPerFrame = (int) (movementSpeed / 100);
        switch (direction) {
            case UP:
                speedPerFrame = -speedPerFrame;
            case DOWN:
                getLocation().adjustY(speedPerFrame);
                break;

            case LEFT:
                speedPerFrame = -speedPerFrame;
            case RIGHT:
                getLocation().adjustX(speedPerFrame);
                break;
        }
    }

    @Override
    public void render(GameGraphics gameGraphics) {
        int size = 50;

        gameGraphics.fillOval(getLocation().getX(), getLocation().getY(), size, size, YELLOW);
    }
}
