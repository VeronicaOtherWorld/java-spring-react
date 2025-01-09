package com.lulu.learningspringframework02.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {
	private GamingConsole game;

	public GameRunner() {
	}
	@Autowired
	public GameRunner(@Qualifier("bearQualifier") GamingConsole game){

		this.game = game;
	}

	public void runGame(){
		System.out.println("run game" + game);
		game.down();
		game.left();
		game.right();
		game.up();
	}

}
