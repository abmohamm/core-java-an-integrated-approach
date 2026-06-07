package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc

//understanding the method without parameters and without return type
class SampleOne {
	
	//	instance variables
	private double num1, num2;
	//	parameterized constructor
	SampleOne(double x, double y) {
		num1 = x;
		num2 = y;
	}
	
	//	method to calculate sum of num1 and num2
	//	method does not accept any values and does not return result
	void sum() {
		double result = num1 + num2;
		System.out.println("Sum : " + result);
	}
}

/**
 * The Class MethodWithoutParametersWithoutReturntype.
 */
public class MethodWithoutParametersWithoutReturntype {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	create object and pass values 10 and 22.5 to  constructor, which will be stored into num1 and num2
		SampleOne sample = new SampleOne(10, 22.5);
		//	call method and find sum of num1 and num2
		sample.sum();
	}

}
