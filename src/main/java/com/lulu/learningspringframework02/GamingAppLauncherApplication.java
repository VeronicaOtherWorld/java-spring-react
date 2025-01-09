package com.lulu.learningspringframework02;

import com.lulu.learningspringframework02.game.BearGame;
import com.lulu.learningspringframework02.game.GameRunner;
import com.lulu.learningspringframework02.game.GamingConsole;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.lulu.learningspringframework02.game")
public class GamingAppLauncherApplication {
	public static void main(String[] args) {
		try(
						var context = new AnnotationConfigApplicationContext
										(GamingAppLauncherApplication.class);
		){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).runGame();
		}
	}
}

/**
 * qualifier is higher than primary  *
 * primary for the preferred class
 * qualifer for the specific class
 * */


/**
 * dependency injection
 *
 * 1 constructor-based
 *  dependencies are set by creating the bean using its constructor
 * 2 setter based
 *  calling setter methods on the bean
 * 3 field
 * no setter or constructor, dependency is injected using reflection
 * */