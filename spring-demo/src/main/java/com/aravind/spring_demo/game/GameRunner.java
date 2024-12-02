package com.aravind.spring_demo.game;

public class GameRunner {

    public Game game;

    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
