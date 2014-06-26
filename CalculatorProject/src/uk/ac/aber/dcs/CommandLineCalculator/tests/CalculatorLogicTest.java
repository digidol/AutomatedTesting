package uk.ac.aber.dcs.CommandLineCalculator.tests;

import uk.ac.aber.dcs.CommandLineCalculator.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorLogicTest {

	@Test
	public void testAdd() {
		CalculatorLogic calculator = new CalculatorLogic(); 
		assertEquals(3, calculator.add(2,1));
	}
	
}




