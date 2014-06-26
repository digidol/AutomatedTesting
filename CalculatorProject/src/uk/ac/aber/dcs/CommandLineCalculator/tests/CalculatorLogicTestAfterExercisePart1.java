package uk.ac.aber.dcs.CommandLineCalculator.tests;

import uk.ac.aber.dcs.CommandLineCalculator.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorLogicTestAfterExercisePart1 {

	@Test
	public void testAdd() {
		CalculatorLogic calculator = new CalculatorLogic(); 
		assertEquals(3, calculator.add(2,1));
	}
	
	@Test 
	public void testSubtract() { 
		CalculatorLogic calculator = new CalculatorLogic();
		assertEquals(5, calculator.subtract(10,5)); 
	}
	
	@Test 
	public void testMultiply() { 
		CalculatorLogic calculator = new CalculatorLogic(); 
		assertEquals(6, calculator.multiply(2, 3)); 
	}
	
	@Test 
	public void testDivide() { 
	   CalculatorLogic calculator = new CalculatorLogic(); 
	   assertEquals(10, calculator.divide(100, 10)); 
	}
}




