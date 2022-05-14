package com.gears.etd;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.gears.helpers.AssetLoader;
import com.gears.screens.GameScreen;

public class etdGame extends Game {
	
	@Override
	public void create () {
		Gdx.app.log("etdGame", "created");
		AssetLoader.load();
		setScreen(new GameScreen());

	}
	
	@Override
	public void dispose () {
		super.dispose();
		AssetLoader.dispose();
	}
}
