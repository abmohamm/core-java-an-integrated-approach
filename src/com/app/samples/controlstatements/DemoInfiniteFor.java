package com.app.samples.controlstatements;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoInfiniteFor.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoInfiniteFor {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// infinite for-loop
		System.out.println();
		int x = 1;
		for( ; ; ) {
			System.out.println(x);
			x++;
			if(x > 10) {
				break;
			}
		}
		mainOne(new String[1]);
	}
	
	/**
	 * The mainOne method.
	 *
	 * @param args the arguments
	 */
	public static void mainOne(String[] args) {
		// TODO Auto-generated method stub
		// infinite for-loop
		System.out.println();
		for(int i = 1, j = 5; i <= 5 ; i++, j--) {
			System.out.println(i+"\t"+j);
		}
	}

}
