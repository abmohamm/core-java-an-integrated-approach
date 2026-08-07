//Using the package packages
package com.app.samples.packages;

//Using the package packages
public class UseAdditionSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Addition class object
		Addition addition = new Addition(10.00, 15.50);
		
		//call the sum() method
		addition.sum();
		
		//call the  sub() method and pass values
		double result = Subtraction.sub(10.00, 15.50);
		
		System.out.println("result : " + result);
	}

}
