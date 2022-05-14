package com.gears.gameobjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.gears.helpers.AssetLoader;

public class Player {

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private boolean direction; //true for right false for left

    private CurrentPlayerState playerState;

    private TextureRegion currentImage;

    public enum CurrentPlayerState {
        IDLE, RUNNING, STOPS_RUNNING
    }

    public Player(float x, float y) {

        position = new Vector2(x, y);
        velocity = new Vector2(0,0);
        acceleration = new Vector2(0, 0);

        playerState = CurrentPlayerState.IDLE;

    }

    public void update(float delta) {
        velocity.add(acceleration.cpy().scl(delta));
        position.add(velocity.cpy().scl(delta));
    }

    public void render(SpriteBatch batcher, float runTime) {
        batcher.begin();
        batcher.enableBlending();

        if(playerState == CurrentPlayerState.IDLE) {
            currentImage = (TextureRegion)AssetLoader.playerIdle.getKeyFrame(runTime);
        }

        float width = currentImage.getRegionWidth();
        float height = currentImage.getRegionHeight();
        batcher.draw(currentImage, getX(), getY(), width * 2, height * 2);

        batcher.end();
    }

    public void move(float dx, float dy, float delta) {
        velocity.x = dx;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public void setIdle() {
        playerState = CurrentPlayerState.IDLE;
    }

    public void setRunning() {
        playerState = CurrentPlayerState.RUNNING;
    }

}
