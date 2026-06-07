package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoRecursion.
 */
//factorial using recursion
public class DemoRecursion {
	
	static long factorial(int number) {
		long result;
		if(number == 1) {
			return 1;
		}
		result = factorial(number-1)*number;
		return result;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("factorial of 5 : ");
		System.out.print(DemoRecursion.factorial(5));
	}

}
