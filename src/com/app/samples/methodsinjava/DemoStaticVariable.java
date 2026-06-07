package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc
//changes in one object's static variable will effect in another object's static variable
//class variables
class SampleEight {
	//class variable
	static int x = 10;
	//display the variable
	static void display() {
		System.out.println(x);
	}
}
/**
 * The Class DemoStaticVariable.
 */
public class DemoStaticVariable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create two references
		SampleEight sample1, sample2;
		//create 2 objects
		sample1 = new SampleEight();
		sample2 = new SampleEight();
		//increment x in sample1
		++sample1.x;
		//display x in sample1
		System.out.print("X in sample1 : ");
		sample1.display();
		//display x in sample2
		System.out.print("X in sample2 : ");
		sample2.display();
	}

}
