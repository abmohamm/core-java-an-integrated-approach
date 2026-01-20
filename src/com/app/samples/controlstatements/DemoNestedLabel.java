package com.app.samples.controlstatements;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoNestedLabel.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoNestedLabel {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		//	nested loop
		int i = 1, j;
		loop1: while(i <= 3) {
			System.out.print(i); 	//	i changes from 1 to 3
			loop2: for(j = 1; j <= 5; j++) {
				System.out.println("\t" + j); //	j changes from 1 to 5 for every  j value
				if(j == 3) {
					System.out.println("---------------");
					i++;
					continue loop1;
				}
			}
			i++;
			System.out.println("==============");
		}
	}

}
