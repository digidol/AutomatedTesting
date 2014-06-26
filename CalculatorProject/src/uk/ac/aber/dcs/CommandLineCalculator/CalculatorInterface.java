package uk.ac.aber.dcs.CommandLineCalculator;

import java.util.Scanner;

/**
 * A simple example java command line calculator
 * This class contains the user interface
 * @author Colin Sauze
 * @author Neil Taylor
 */
public class CalculatorInterface {
	
	private CalculatorLogic calculator;
	
	public CalculatorInterface()
	{
		calculator = new CalculatorLogic();
	}
	
    /**
     * Gets user input from the keyboard and calls the appropriate calculator logic method. 
     * The result is output to System.out. 
     */
	public void getUserInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int a = keyboard.nextInt();
		
		System.out.println("enter an operation (+,-,* or /)");
		String operator = keyboard.next();
		
		System.out.println("enter another integer");
		int b = keyboard.nextInt();
		keyboard.close();
		
		int result=0;
		
		switch(operator) {
			case "+":
				result=calculator.add(a,b);
				break;
			case "-":
				result=calculator.subtract(a,b);
				break;
			case "*":
				result=calculator.multiply(a,b);
				break;
			case "/":
				result=calculator.divide(a,b);
				break;
		}
		
		System.out.println(a + " " + operator + " " + b + " = " + result);
	}
	
	/** 
	 * Starts the calculator with the command line interface. 
	 * @param args Not used. 
	 */
	public static void main(String args[])
	{
		CalculatorInterface ci = new CalculatorInterface();
		ci.getUserInput();
	}

}
