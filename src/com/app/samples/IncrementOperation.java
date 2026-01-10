/*
 * 
 */
package com.app.samples;

// TODO: Auto-generated Javadoc
/**
 * The Class IncrementOperation.
 */
public class IncrementOperation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Calling preIncrement()");
//		preIncrement();
		System.out.println("Calling postIncrement()");
//		postIncrement();
		System.out.println("Calling incrementOperatorsDifference()");
		incrementOperatorsDifference();
	}

	/**
	 * Pre increment.
	 */
	public static void preIncrement() {
		int x = 1;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
	}

	/**
	 * Post increment.
	 */
	public static void postIncrement() {
		int x = 1;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
	}
	
	public static void incrementOperatorsDifference() {
		int a = 1;
		int b = 2;
		a = ++b;
		System.out.println("Pre-Increment Values of a , b : " + a + " , " + b);

		a = 1;
		b = 2;
		a = b++;
		System.out.println("Post-Increment Values of a , b : " + a + " , " + b);

		int p = 7;
		int result = ++p * p++;
		System.out.println("Result : " + result);
	}

}
