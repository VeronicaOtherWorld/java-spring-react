package com.lulu.learningspringframework.game;

public class BearGame implements  GamingConsole{
	@Override
	public void up() {
		System.out.println("bear up");
	}

	@Override
	public void down() {
		System.out.println("bear down");
	}

	@Override
	public void left() {
		System.out.println("bear left");
	}

	@Override
	public void right() {
		System.out.println("bear right");
	}
}
