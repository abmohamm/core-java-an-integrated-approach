package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc

//understanding the method with two parameters and a return type
class SampleThree {
	
	//	method to calculate sum of num1 and num2
	//	accepts double values and returns double type result
	double sum(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
}

/**
 * The Class MethodWithParameterWithReturntype.
 */
public class MethodWithParameterWithReturntype {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	create object and pass 2 values to method and store returned result into result
		SampleThree sample = new SampleThree();
		double result = sample.sum(10, 22.5);
		System.out.println("Sum : " + result);
	}

}
