package com.app.samples.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoVMArguments.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoVMArguments {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfArguments = args.length;
		System.out.println("number of arguments : " + numberOfArguments);
		
		//	display all the arguments
		System.out.println("arguments are : ");
		for(int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
	}

}
