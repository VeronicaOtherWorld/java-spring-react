package com.lulu.learningspringframework02.example.scope;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class BeanScopesLauncherApp {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApp.class))
		{
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));

			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}

	}
}
@Component
class NormalClass {}
@Component
// SCOPE_PROTOTYPE singleton frequently used 99.9%
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {}

/**
 * spring bean scopes
 * spring beans are defined to be used in a specific scope
 *
 *- singleton - one object instance per spring IoC container
 * -prototype - possibly many object instances per spring IoC container
 *
 * scopes applicable only for web-aware spring applicationcontext
 * request ... http request
 * session ... http session
 * application ... app runtime
 * websocket: one object instance per websocket instance
 *
 * java singleton (GOF) vs singleton
 *
 * srpng singleton: one object instance per spring Ioc container
 *java singleton: one object instance per JVM
 *
 *
 * */