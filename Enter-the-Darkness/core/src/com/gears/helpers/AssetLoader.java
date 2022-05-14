package com.gears.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {

    public static Texture pIdle, pRunning;
    public static Animation playerIdle, playerRunning;

    public static TextureRegion playerIdle1, playerIdle2, playerIdle3, playerIdle4, playerIdle5, playerIdle6;
    public static TextureRegion playerRunning1, playerRunning2, playerRunning3, playerRunning4, playerRunning5, playerRunning6, playerRunning7, playerRunning8;

    public static void load() {

        pIdle = new Texture(Gdx.files.internal("hero/Idle.png"));
        pIdle.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        //Idle Animation

        //1 13x15 7x17
        playerIdle1 = new TextureRegion(pIdle, 7, 17, 13, 15);
        playerIdle2 = new TextureRegion(pIdle, 7, 48, 13, 16);
        playerIdle3 = new TextureRegion(pIdle, 7, 80, 13, 16);
        playerIdle4 = new TextureRegion(pIdle, 7, 111, 13, 17);
        playerIdle5 = new TextureRegion(pIdle, 7, 143, 13, 17);
        playerIdle6 = new TextureRegion(pIdle, 7, 177, 13, 15);
        TextureRegion[] p_idle = {playerIdle1, playerIdle2, playerIdle3, playerIdle4, playerIdle5, playerIdle6};
        playerIdle = new Animation(0.15f, p_idle);
        playerIdle.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);

    }

    public static void dispose() {

    }

}
