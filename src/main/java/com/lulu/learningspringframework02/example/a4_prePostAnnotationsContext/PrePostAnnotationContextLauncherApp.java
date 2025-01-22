package com.lulu.learningspringframework02.example.a4_prePostAnnotationsContext;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApp {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApp.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}
}
@Component
class someClass {
	SomeDependency someDependency;

	public someClass(SomeDependency someDependency) {
		this.someDependency = someDependency;
		System.out.println("some class someDependency = " + someDependency);
	}
	@PostConstruct
	public void init(){
		someDependency.getReady();
	}
}


@Component
class SomeDependency{
	public void getReady(){
		System.out.println("SomeDependency get ready");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("SomeDependency destroy");
	}
}
/**
 *
 * java 2 ee vs java ee vs jakarta ee
 *
 * j2ee : java 2 platform enterprise edition
 * java ee: java platform enterprise edition(rebranding)
 * jakarta ee: oracle gave java ee rights to the eclipse foundation
 *
 *  -important specifications:
 *    jakarta sever pages JSP
 *    jakarta standard library JSTL
 *    jakarta enterprise beans EJB
 *    jakarta restful web services JAX-RS
 *    jakarta bean validation
 *    jakarta contexts and dependency injection CDI
 *    jakarta persistence JPA
 *   -supported by spring 6 and spring boot 3
 *    that is why we use jakarta.packages(instead of javax)
 * */