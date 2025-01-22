package com.lulu.learningspringframework02.calculationExecrise;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component
@Repository
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[]{1, 2,3 };
	}
}

