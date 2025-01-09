package com.lulu.learningspringframework02.calculationExecrise;

import com.lulu.learningspringframework02.GamingAppLauncherApplication;
import com.lulu.learningspringframework02.game.GameRunner;
import com.lulu.learningspringframework02.game.GamingConsole;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.lulu.learningspringframework02.calculationExecrise")
public class ServiceApp {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(ServiceApp.class);) {
				var business = context.getBean(BusinessCalculationService.class);
				var res = business.findMax();
			System.out.println(res);
		}
	}
}
