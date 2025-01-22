package com.lulu.learningspringframework02.example.lazyInit;


import com.lulu.learningspringframework02.example.a1.DepInjectionLaunchApp;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class LazyInitializationLauncherApp {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApp.class))
		{
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}
}
@Component
class ClassA {}
@Component
@Lazy
class ClassB {
	private ClassA classA;
	public ClassB( ClassA classA ) {
		System.out.println("some init logic");
		this.classA = classA;
	}
}

/**
 * default initialization for spring bean: eager
 *
 * good for errors in the configuartion are discovered immediately at app start up
 *
 * using lazy annotation is not recommended and not frequently used
 *
 * lazy:
 * can be used almost everywhere  @component and @bean
 *
 *lazy-resoluton proxy will be injected instead of actual dependency
 * it also can be used on configuration class
 * all @bean methods within the @configuration will be lazily initialized
 * */