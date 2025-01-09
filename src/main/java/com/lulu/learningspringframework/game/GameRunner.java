package com.lulu.learningspringframework.game;

public class GameRunner {
	private GamingConsole game;
	public GameRunner() {
	}
	public GameRunner(GamingConsole game){
			this.game = game;
	}

	public void runGame(){
		System.out.println("run game");
		game.down();
		game.left();
		game.right();
		game.up();
	}

}
