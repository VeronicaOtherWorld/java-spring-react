package com.lulu.learningspringframework;

import com.lulu.learningspringframework.game.CatGame;
import com.lulu.learningspringframework.game.GameRunner;

import java.util.List;

public class App01GamingBasic {
	public static void main(String[] args) {
		// var: type inference
		// allow the compiler to infer the type of the variable
		// based on the value assigned
		// var game = new MarioGame();
		// var game = new BearGame();
		// 1.object creation
		var game = new CatGame();
		// 2.object creation + wiring of dependencies
		// game is a dependency of the gamerunner class
		// injecting the game class in
		var gameRunner = new GameRunner(game);
		gameRunner.runGame();


	// simplify the step easy to readable
	// 	List<String> names = List.of("aa", "bob", "carl");
		var names = List.of("cc","aa","dd");
	}
}

/**
 * Tightly coupled java code
 * what is it?
 *coupling(耦合) : how much work is involved in changing something
 * */