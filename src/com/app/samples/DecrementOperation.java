package com.app.samples;

// TODO: Auto-generated Javadoc
/**
 * The Class DecrementOperation.
 */
public class DecrementOperation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Calling preDecrement()");
		preDecrement();
		System.out.println("Calling postDecrement()");
		postDecrement();
		System.out.println("Calling decrementOperatorsDifference()");
		decrementOperatorsDifference();
	}

	/**
	 * Pre Decrement.
	 */
	public static void preDecrement() {
		int x = 1;
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);
	}

	/**
	 * Post Decrement.
	 */
	public static void postDecrement() {
		int x = 1;
		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
	}

	/**
	 * Decrement operators difference.
	 */
	public static void decrementOperatorsDifference() {
		int a = 1;
		int b = 2;
		a = --b;
		System.out.println("Pre-Increment Values of a , b : " + a + " , " + b);

		a = 1;
		b = 2;
		a = b--;
		System.out.println("Post-Increment Values of a , b : " + a + " , " + b);

		int p = 7;
		int result = --p * p--;
		System.out.println("Result : " + result);
	}

}
