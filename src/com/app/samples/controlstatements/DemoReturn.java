package com.app.samples.controlstatements;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoReturn.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoReturn {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int result = DemoReturn.myMethod(10);
		System.out.println("result : " + result);
		
		int x = 1;
		System.out.println("before return");
		if(x == 1) {
			return;
		}
		System.out.println("after return");
	}
	
	/**
	 * My method.
	 *
	 * @param number the number
	 * @return the int
	 */
	public static int myMethod(int number) {
		return number*number;
		
	}

}
