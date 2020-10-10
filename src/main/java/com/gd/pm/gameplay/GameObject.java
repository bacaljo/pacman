package com.gd.pm.gameplay;

import com.gd.pm.gameplay.property.Location;
import com.gd.pm.ui.graphic.GameGraphics;

public abstract class GameObject {
    private Location location;
    private boolean isUpdatable;
    private boolean isVisible;

    public GameObject(Location location) {
        this.location = location;
        isUpdatable = true;
        isVisible = true;
    }

    public abstract void update();

    public abstract void render(GameGraphics gameGraphics);

    public Location getLocation() {
        return location;
    }

    public boolean isUpdatable() {
        return isUpdatable;
    }

    public void setUpdatable(boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }
}
