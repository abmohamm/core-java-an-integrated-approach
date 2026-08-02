//All the objects sharing the same method
package com.app.samples.abstractclasses;

// TODO: Auto-generated Javadoc
//all the objects sharing the same method
class Myclass {
	
	//method to calculate square value
	void calculate(double x) {
		System.out.println("square : " + (x*x));
	}
}

/**
 * The Class Common.
 */
public class Common {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create 3 objects
		Myclass object1 = new Myclass();
		Myclass object2 = new Myclass();
		Myclass object3 = new Myclass();
		
		//call calculate() method from the objects
		object1.calculate(3);
		object2.calculate(4);
		object3.calculate(5);
	}

}
