package com.lulu.learningspringframework02.example.a5_CDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.Arrays;
@Configuration
@ComponentScan
public class CDI {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(CDI.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).
							forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataService2());
		}

	}
}

// @Component
@Named
class BusinessService {
	DataService2 dataService2;


	public DataService2 getDataService2() {
		return dataService2;
	}

	// @Autowired
	@Inject
	public void setDataService(DataService2 dataService2) {
		this.dataService2 = dataService2;
	}


}

// @Component
@Named
class DataService2{

}


/*
* jakarta contexts & dependency injection
*
* specification(interface)
* spring framework implements CDI
*
* important inject api annotations:
* inject(~autowired in spring)
* named(component in spring)
* qualifier
* scope
* singleton
*
* */