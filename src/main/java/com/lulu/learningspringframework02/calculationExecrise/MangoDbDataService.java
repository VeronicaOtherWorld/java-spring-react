package com.lulu.learningspringframework02.calculationExecrise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class MangoDbDataService implements DataService {
	@Override
	public int[] retrieveData() {
		return new int[]{ 4, 5, 6};
	}
}

