package uk.ac.aber.dcs.CommandLineCalculator.tests;

import uk.ac.aber.dcs.CommandLineCalculator.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorLogicTestWithBeforeMethod {

	private CalculatorLogic calculator; 
	
	@Before
	public void setup() { 
		calculator = new CalculatorLogic(); 
	}
	
	@Test
	public void testAdd() {
		assertEquals(3, calculator.add(2,1));
	}
	
	@Test 
	public void testSubtract() { 
		assertEquals(5, calculator.subtract(10,5)); 
	}
	
	@Test 
	public void testMultiply() { 
		assertEquals(6, calculator.multiply(2, 3)); 
	}
	
	@Test 
	public void testDivide() { 
	   assertEquals(10, calculator.divide(100, 10)); 
	}
}




