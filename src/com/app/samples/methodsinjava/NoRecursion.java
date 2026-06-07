package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc
/**
 * The Class NoRecursion.
 */
//factorial without recursion
public class NoRecursion {
	
	static long factorial(int number) {
		long factorial  = 1;
		while(number > 0) {
			factorial = factorial * number--;
		}
		return factorial;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("factorial of 5 : ");
		System.out.print(NoRecursion.factorial(5));
	}

}
