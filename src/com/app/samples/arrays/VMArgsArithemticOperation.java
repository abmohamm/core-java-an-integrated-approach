package com.app.samples.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class VMArgsArithemticOperation.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class VMArgsArithemticOperation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("please enter values");
		}
		
		//	take string form of input and convert to respective types
		String s1 = args[0];
		String s2 = args[1];
		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		//	add them and display
		double sum = d1 + d2;
		System.out.println("sum : " + sum);
	}

}
