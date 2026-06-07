package com.app.samples.methodsinjava;

import java.text.NumberFormat;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoCircle.
 */
public class DemoCircle {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = (double)22/7;	//constant
		double radius = 15.5;	//radius
		double area = PI*radius*radius;
		System.out.println("Area : " + area);
		
		//create NumberFormat class object
		NumberFormat format = NumberFormat.getNumberInstance();
		
		//store the format information into object
		format.setMaximumFractionDigits(2);
		format.setMaximumIntegerDigits(7);
		
		//apply the format to area value
		String str = format.format(area);
		
		//display formatted area value
		System.out.println("formatted area : " + str);
	}

}
