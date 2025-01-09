package com.lulu.learningspringframework02.game;

import org.springframework.stereotype.Component;

@Component
public class DogGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("dog up");
	}

	@Override
	public void down() {
		System.out.println("dog down");
	}

	@Override
	public void left() {
		System.out.println("dog left");
	}

	@Override
	public void right() {
		System.out.println("dog right");
	}
}
