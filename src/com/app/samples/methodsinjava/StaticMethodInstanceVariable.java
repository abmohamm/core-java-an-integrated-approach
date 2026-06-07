package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc

//program to test whether a static method can access the instance variable or not.
class SampleFive {
	
	//instance variable
	int x;
	//parameterized constructor
	SampleFive(int x) {
		this.x = x;
	}
	
	//static method accessing instance variable
	static void access() {
		//Cannot make a static reference to the non-static field x
		System.out.println("x : " + x);
	}
}

/**
 * The Class StaticMethodInstanceVariable.
 */
public class StaticMethodInstanceVariable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleFive sample = new SampleFive(55);
		SampleFive.access();
	}

}
