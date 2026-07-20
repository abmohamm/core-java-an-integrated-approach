//Addition.java
/** This package is useful to perform some arithmetic calculations. 
 *  It has two classes by the name Addition and Subtraction	*/
package com.app.samples.packages.sampleapidoc;

/**	This class is useful to find sum  of two numbers. 
 *  It has a parameterized constructor and a method to find sum	*/
public class Addition {

	private double num1, num2;
	
	/**	This is a parameterized constructor to initialize the instance variables of a class	
	 *  @param a operand for addition, 
	 *  @param b operand for addition	*/
	public Addition(double a, double b) {
		num1 = a;
		num2 = b;
	}
	
	/**	This method is useful to find sum of two numbers.
	 *  It does not accept any parameters	
	
	<br>Parameters : nil
	<br>Return type : void
	<br>Exceptions : nil	*/
	public void sum() {
		System.out.println("Sum : " + (num1 + num2));
	}
}
