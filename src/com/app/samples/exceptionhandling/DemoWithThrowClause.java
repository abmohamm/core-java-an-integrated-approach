package com.app.samples.exceptionhandling;

//using throw
class SampleThree {
	
	/**
	 * Demo.
	 */
	// TODO Auto-generated method stub
	static void demo() {
		try {
			System.out.println("Inside demo()");
			throw new NullPointerException("exception data");
		} catch(NullPointerException nullPointerException) {
			System.out.println(nullPointerException);
		}
	}
}
/**
 * The Class DemoWithThrowClause.
 */
public class DemoWithThrowClause {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThree.demo();
	}

}
