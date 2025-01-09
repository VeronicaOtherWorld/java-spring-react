package com.lulu.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
	// 	1.launch a spring context
		var applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	// 	2.configure the things that we want spring to manage -@configuration
	// 	helloworldconfiguration - @ configuration
	// 	sayHello - @Beans
		applicationContext.getBean("sayHello");
		// 3.retrieving Beans managed by spring
		System.out.println(applicationContext.getBean("sayHello"));
		System.out.println(applicationContext.getBean("age"));
		System.out.println(applicationContext.getBean("name"));
		System.out.println(applicationContext.getBean("address"));
		System.out.println(applicationContext.getBean("person"));
		System.out.println(applicationContext.getBean("personMethodCall"));



		// if have the same bean, set Primary to tell the java which one is most important
		System.out.println(applicationContext.getBean("addressNew"));
		System.out.println(applicationContext.getBean("addressNew2"));

		// qualifier to aovid the problem
		System.out.println(applicationContext.getBean("person3Parameters"));
		System.out.println(applicationContext.getBean("person4Parameters"));

		System.out.println(applicationContext.getBean(HelloWorldConfiguration.Address.class));


		// get all the spring beans
		Arrays.stream(applicationContext.getBeanDefinitionNames()).
						forEach(System.out::println);

	}
}


/***
 * what is spring container(IOC container)
 * -manages spring beans & their lifecycle
 *
 * two types
 * 1.bean factory
 *  basic spring container
 * 2.application context
 *  advance spring container with enterprise-specific features
 *    § easy to use in the web app
 *    § easy internationalization
 *    § easy integration with spring AOP
 *
 * which one to use?
 * most enterprise app use application context
 *
 */

/*
java bean & pojo & spring bean

javabean
classes adhering to 3 constraints
constructor, getter setter implement

pojo plain old java object
any java object is a pojo

spring bean: java object that is managed by spring
application context
* **/