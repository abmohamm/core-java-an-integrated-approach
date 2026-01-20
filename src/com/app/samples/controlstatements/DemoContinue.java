package com.app.samples.controlstatements;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoContinue.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoContinue {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i = 10; i >= 1; i--) {
			if(i > 5) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
