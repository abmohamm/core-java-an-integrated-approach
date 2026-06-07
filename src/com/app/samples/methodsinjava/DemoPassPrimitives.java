package com.app.samples.methodsinjava;


// TODO: Auto-generated Javadoc
//primitive data types are passed to methods by value 
class Check {
	
	//To interchange num1 and num2 values
	void swap(int num1, int num2) {
		int temp;	//take a temporary variable
		temp = num1;
		num1 = num2;
		num2 = temp;
	}
}

// TODO: Auto-generated Javadoc
/**
 * The Class DemoPassPrimitives.
 */
public class DemoPassPrimitives {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//take two primitive data types
		int num1 = 10, num2 = 20;
		
		//create check class object
		Check obj = new Check();
		
		//display data before calling
		System.out.println(num1 + "\t" + num2);
		
		//call swap and pass primitive data types
		obj.swap(num1, num2);
		
		//display data after calling
		System.out.println(num1 + "\t" + num2);
		
	}

}
