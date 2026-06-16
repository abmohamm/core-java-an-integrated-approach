package com.app.samples.polymorphism;

// TODO: Auto-generated Javadoc
//Dynamic polymorphism
class SampleOne {
	
	//method to add two values
	void add(int a, int b) {
		System.out.println("sum of two : " + (a+b));
	}
	
	//method to add three values
	void add(int a, int b, int c) {
		System.out.println("sum  of three : " + (a+b+c));
	}
}

/**
 * The Class MethodOverloading.
 */
public class MethodOverloading {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create Sample class object
		SampleOne sample = new SampleOne();
		
		//call add() pass two values
		sample.add(10, 15);	//call is bound with first method
		
		//call add() pass three values
		sample.add(10, 15, 20);	//call is bound with second method
		
	}

}
