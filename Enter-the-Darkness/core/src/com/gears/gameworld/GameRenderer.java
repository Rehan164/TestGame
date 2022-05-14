package com.gears.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.gears.gameobjects.Player;
import com.gears.helpers.AssetLoader;

public class GameRenderer {

    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    private SpriteBatch batcher;

    private GameWorld world;
    private Player player;

    public GameRenderer(GameWorld world, int gameWidth, int gameHeight) {

        cam = new OrthographicCamera();
        cam.setToOrtho(false, gameWidth, gameHeight);

        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(cam.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);

        this.world = world;
        player = world.getPlayer();

    }

    public void render(float runTime) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        player.render(batcher, runTime);

    }

}
