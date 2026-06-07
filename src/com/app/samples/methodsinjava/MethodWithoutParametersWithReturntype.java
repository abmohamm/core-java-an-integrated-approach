package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc

//understanding the method without parameters but with return type
class SampleTwo {
	
	//	instance variables
	private double num1, num2;
	//	parameterized constructor
	SampleTwo(double x, double y) {
		num1 = x;
		num2 = y;
	}
	
	//	method to calculate sum of num1 and num2
	//	method does not accept any values but returns the result
	double sum() {
		double result = num1 + num2;
		return result;
	}
}

/**
 * The Class MethodWithoutParametersWithReturntype.
 */
public class MethodWithoutParametersWithReturntype {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//	create object and pass values 10 and 22.5 to  constructor, which will be stored into num1 and num2
		SampleTwo sample = new SampleTwo(10, 22.5);
		//	call the method and store result into x
		double result = sample.sum();
		System.out.println("Sum : " + result);
	}

}
