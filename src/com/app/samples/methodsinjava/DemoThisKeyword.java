package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc
//this - refers to all the members of present class
class SampleTen {
	
	//x is instance variable
	private int x;
	
	//default constructor
	SampleTen() {
		this(55);	//call present class parameterized constructor and pass 55
		this.access(); 	//call present class method
	}
	
	//parameterized constructor
	SampleTen(int x) {
		this.x = x;	//refer present class instance variable
	}
	
	//method
	void access() {
		System.out.println("X : " + x);
	}
}

// TODO: Auto-generated Javadoc
/**
 * The Class DemoThisKeyword.
 */
public class DemoThisKeyword {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleTen sample = new SampleTen();
	}

}
