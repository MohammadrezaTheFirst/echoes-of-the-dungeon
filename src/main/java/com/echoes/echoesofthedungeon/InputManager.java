package com.echoes.echoesofthedungeon;

import javafx.scene.input.KeyCode;

import java.util.HashSet;
import java.util.Set;

public class InputManager {

    private final Set<KeyCode> pressedKeys;

    public InputManager() {
        pressedKeys = new HashSet<>();
    }

    public void keyPressed(KeyCode key) {
        pressedKeys.add(key);
    }

    public void keyReleased(KeyCode key) {
        pressedKeys.remove(key);
    }

    public boolean isPressed(KeyCode key) {
        return pressedKeys.contains(key);
    }
}