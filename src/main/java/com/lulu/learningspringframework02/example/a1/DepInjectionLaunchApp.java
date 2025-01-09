package com.lulu.learningspringframework02.example.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class DepInjectionLaunchApp {
	public static void main(String[] args) {
		try(
						var context = new AnnotationConfigApplicationContext
										(DepInjectionLaunchApp.class);
		){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(BusinessClass.class);
			System.out.println(context.getBean(BusinessClass.class));
		}
	}
}



@Component
class BusinessClass {
	/**
	 * field injection
	 *
	 * */
	// @Autowired
		DepInjectionClass1 depInjectionClass1;
	// @Autowired
		DepInjectionClass2 depInjectionClass2;

	// 	✨constructor
	@Autowired
	public BusinessClass(DepInjectionClass1 depInjectionClass1, DepInjectionClass2 depInjectionClass2) {
		this.depInjectionClass1 = depInjectionClass1;
		this.depInjectionClass2 = depInjectionClass2;
		System.out.println("constructor");
	}

	// 	setter injection
	// @Autowired
	public void setDepInjectionClass1(DepInjectionClass1 depInjectionClass1) {
		System.out.println("setDepInjectionClass1 depInjectionClass1=" + depInjectionClass1);
		this.depInjectionClass1 = depInjectionClass1;
	}

	// @Autowired
	public void setDepInjectionClass2(DepInjectionClass2 depInjectionClass2) {
		System.out.println("setDepInjectionClass2 depInjectionClass2=" + depInjectionClass2);
		this.depInjectionClass2 = depInjectionClass2;
	}

	@Override
	public String toString() {
		return "BusinessClass{" +
						"depInjectionClass1=" + depInjectionClass1 +
						", depInjectionClass2=" + depInjectionClass2 +
						'}';
	}
}

@Component
class DepInjectionClass1 {

}

@Component
class DepInjectionClass2 {

}

/***
 * component
 * instance of class will be managed by spring framework
 *
 * dependency
 *gamerunner needs gaming console implement
 * impl (beargame) is dependency of gamerunner
 * 一个类通过其构造器、字段或方法使用了另一个类或接口实例时，这个类被称为依赖
 *
 * @Component
 * public class GameRunner {
 *     private final GamingConsole game;
 *
 *     // GamingConsole 是 GameRunner 的依赖
 *     @Autowired
 *     public GameRunner(GamingConsole game) {
 *         this.game = game;
 *     }
 * }
 *
 * component scan
 *
 *
 * dependency injection
 * identify beans, their dependencies and write them together
 * provide IOC inversion of control
 * - spring beans: means now any object is managed by spring framework
 * - ioc container: manages the lifecycle of beans and dependencies\
 *  (_types: application context, benefactor)
 * - autowiring:process of wiring in dependencies for a spring bean
 * */