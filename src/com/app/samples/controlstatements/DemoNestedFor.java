package com.app.samples.controlstatements;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoNestedFor.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoNestedFor {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int r = 5;	// we want 5 rows
		//row iteration
		for(int i = 1; i <= r; i++) { 
			for(int st = 1; st <= i; st++) {  // column iteration
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
