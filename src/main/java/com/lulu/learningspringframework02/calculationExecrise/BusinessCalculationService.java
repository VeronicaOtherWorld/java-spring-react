package com.lulu.learningspringframework02.calculationExecrise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BusinessCalculationService {

	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		this.dataService = dataService;
	}

	@Bean
	public int findMax(){
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
