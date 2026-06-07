package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc

//changes in one object's instance variable will not effect in another object's  instance variable
class SampleSeven {
	//instance var
	int x = 10;
	//display the variable
	void display() {
		System.out.println(x);
	}
}
/**
 * The Class DemoInstanceVariable.
 */
public class DemoInstanceVariable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 2 references
		SampleSeven sample1, sample2;
		//create two objects
		sample1 = new SampleSeven();
		sample2 = new SampleSeven();
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
