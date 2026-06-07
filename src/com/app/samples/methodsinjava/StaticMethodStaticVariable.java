package com.app.samples.methodsinjava;

//TODO: Auto-generated Javadoc

//static method accessing the static variable.
class SampleSix {
	//static var
	static int x = 55;
	//static method accessing static variable
	static void access() {
		System.out.println("X : " + x);
	}
}


/**
 * The Class StaticMethodStaticVariable.
 */
public class StaticMethodStaticVariable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleSix.access();
	}

}
