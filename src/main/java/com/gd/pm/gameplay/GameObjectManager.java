package com.gd.pm.gameplay;

import com.gd.pm.ui.graphic.GameGraphics;

import java.util.ArrayList;
import java.util.List;

public class GameObjectManager {
    private List<GameObject> gameObjectList;
    private GameMap gameMap;

    public GameObjectManager() {
        gameObjectList = new ArrayList<>();
    }

    public void addGameObject(GameObject gameObject) {
        gameObjectList.add(gameObject);
    }

    public void update() {
        gameObjectList.stream()
                .filter(GameObject::isUpdatable)
                .forEach(GameObject::update);
    }

    public void render(GameGraphics gameGraphics) {
        gameObjectList.stream()
                .filter(GameObject::isVisible)
                .forEach(gameObject -> gameObject.render(gameGraphics));
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }
}
