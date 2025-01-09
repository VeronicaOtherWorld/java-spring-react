package com.lulu.learningspringframework.game;

public class CatGame implements GamingConsole{
	@Override
	public void up() {
		System.out.println("cat up");
	}

	@Override
	public void down() {
		System.out.println("cat down");
	}

	@Override
	public void left() {
		System.out.println("cat left");
	}

	@Override
	public void right() {
		System.out.println("cat right");
	}
}
