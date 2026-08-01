//static block or static method? - JVM executes static block on highest priority basis
package com.app.samples.methodsinjava;


// TODO: Auto-generated Javadoc
/**
 * The Class DemoStaticBlock.
 */
public class DemoStaticBlock {

	static {
		System.out.println("static block!!!");
	}
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static method!!!");
	}

}
