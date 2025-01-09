package com.lulu.learningspringframework;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String sayHello() {
		return "Hello World";
	}

	@Bean
	public int age(){
		return 18;
	}

	@Bean
	public String name(){
		return "lulu";
	}

	@Bean
	public String address(){
		return "dublin";
	}

	record Person(String name, int age, Address address) {};
	@Bean
	public Person person(){
		return new Person("lulu", 100, addressObj());
	}

	record Address(String firstLine, String secondLine) {};

	@Bean(name = "addressNew")
	@Qualifier("addressNewQualifier")
	public Address addressObj(){
		return new Address("11","22");
	}

	@Bean(name = "addressNew2")
	@Primary
	public Address addressObj2(){
		return new Address("33","44");
	}

	@Bean
	public Person personMethodCall(){
		return new Person(name(), age(), addressObj());
	}

	@Bean
	@Primary
	public Person person3Parameters(String name,int age, @Qualifier("addressNewQualifier") Address address ){
		return new Person(name,age,address);
	}

	@Bean
	public Person person4Parameters(String name,int age, Address address ){
		return new Person(name,age,address);
	}


}
