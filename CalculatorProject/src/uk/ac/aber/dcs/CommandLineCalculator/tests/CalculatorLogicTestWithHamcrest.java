package uk.ac.aber.dcs.CommandLineCalculator.tests;

import uk.ac.aber.dcs.CommandLineCalculator.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*; 

import org.junit.Test;

public class CalculatorLogicTestWithHamcrest {

	@Test
	public void testAdd() {
		CalculatorLogic calculator = new CalculatorLogic();
		int result = calculator.add(2,1); 
		assertThat(result, equalTo(3));
		// the following is exactly the same 
		// assertThat(result, is(equalTo(3)));
	}
	
}




