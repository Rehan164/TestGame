package com.gears.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.gears.gameworld.GameRenderer;
import com.gears.gameworld.GameWorld;
import com.gears.helpers.InputHandler;

public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;

    private float runTime = 0;

    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();

        world = new GameWorld();
        renderer = new GameRenderer(world, (int) screenWidth, (int) screenHeight);

        Gdx.input.setInputProcessor(new InputHandler(world));

    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void dispose() {
        // Leave blank
    }
}
