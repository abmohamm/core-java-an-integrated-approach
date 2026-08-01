//Understanding the methods - static methods
package com.app.samples.methodsinjava;

//TODO: Auto-generated Javadoc

//understanding the static method that accepts data and returns result
class SampleFour {
	
	//	static method should be declared as static
	static double sum(double num1, double num2) {
		double result = num1 + num2;
		return result;	//return result
	}
}

/**
 * The Class StaticMethodAcceptReturn.
 */
public class StaticMethodAcceptReturn {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call the static method using Classname.methodname()
		double result = SampleFour.sum(10, 22.5);
		System.out.println("Sum : " + result);
	}

}
