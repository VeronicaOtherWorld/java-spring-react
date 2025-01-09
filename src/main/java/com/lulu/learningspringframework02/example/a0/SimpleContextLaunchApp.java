package com.lulu.learningspringframework02.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleContextLaunchApp {
	public static void main(String[] args) {
		try(
						var context = new AnnotationConfigApplicationContext
										(SimpleContextLaunchApp.class);
		){
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
