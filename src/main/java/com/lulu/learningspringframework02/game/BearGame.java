package com.lulu.learningspringframework02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bearQualifier")
public class BearGame implements GamingConsole {
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
