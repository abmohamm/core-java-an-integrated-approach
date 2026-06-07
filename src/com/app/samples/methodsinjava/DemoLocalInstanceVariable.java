package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc
//local variables
class SampleNine {
	//x is instance variable
	private int x;
	
	//a is local variable
	void modify(int a) {
		x = a;
	}
	
	//we can access x, but not a
	void access() {
		System.out.println("X : " + x);
		System.out.println("a : " + a);
	}
}
/**
 * The Class DemoLocalInstanceVariable.
 */
public class DemoLocalInstanceVariable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleNine sample = new SampleNine();
		sample.modify(10);
		sample.access();
	}

}
