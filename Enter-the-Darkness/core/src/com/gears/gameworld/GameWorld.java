package com.gears.gameworld;

import com.badlogic.gdx.Input;
import com.gears.gameobjects.Player;
import com.gears.helpers.InputHandler;

public class GameWorld {

    private Player player;

    public GameWorld() {
        player = new Player(100,100);
    }

    public void update(float delta) {
        player.update(delta);

        //Moving Player left and Right
        if(InputHandler.keys[Input.Keys.D] && InputHandler.keys[Input.Keys.A]) {
            player.move(0, 0, delta);
            player.setIdle();
        }
        else if(InputHandler.keys[Input.Keys.D]) {
            player.move(20, 0, delta);
            player.setRunning();
        }
        else if(InputHandler.keys[Input.Keys.A]) {
            player.move(-20, 0, delta);
            player.setRunning();
        }
        else {
            player.move(0, 0, delta);
            player.setIdle();
        }

    }

    public Player getPlayer() {
        return player;
    }

}
