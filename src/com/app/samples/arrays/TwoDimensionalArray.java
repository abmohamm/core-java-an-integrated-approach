package com.app.samples.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class TwoDimensionalArray.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class TwoDimensionalArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	2D array
		float x[][] = {{1.1f, 1.2f, 1.3f, 1.4f},
					   {2.1f, 2.2f, 2.3f, 2.4f},
					   {3.1f, 3.2f, 3.3f, 3.4f}};
		//	read and display array elements
		System.out.println("in matrix form : ");
		for(int i = 0; i < 3; i++) {	//	for loop for rows
			for(int j = 0; j < 4; j++) {	//	for loop for columns
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
