package com.lulu.learningspringframework02.example.a6_xml;
import com.lulu.learningspringframework02.calculationExecrise.BusinessCalculationService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLContextLaunchApp {
	public static void main(String[] args) {
		try(
						var context = new ClassPathXmlApplicationContext("xmlConfiguration.xml");
		){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("name"));
			int res = context.getBean(BusinessCalculationService.class).findMax();
			System.out.println(res);
		}
	}
}
