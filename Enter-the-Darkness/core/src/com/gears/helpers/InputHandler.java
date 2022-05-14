package com.gears.helpers;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.gears.gameobjects.Player;
import com.gears.gameworld.GameWorld;

public class InputHandler implements InputProcessor {

    private GameWorld world;
    private Player player;

    public static final boolean[] keys = new boolean[256];

    public InputHandler(GameWorld world){
        this.world = world;
        player = world.getPlayer();
    }

    @Override
    public boolean keyDown(int keycode) {
        keys[keycode] = true;
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        keys[keycode] = false;
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
