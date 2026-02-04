package com.app.samples.arrays;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoTransposeMatrix.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoTransposeMatrix {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		//	use scanner to accept data from the keyboard
		Scanner sc = new Scanner(System.in);
		//	accept rows and columns of a matrix
		System.out.print("enter rows, columns? : ");
		int rows = sc.nextInt();	//	number of rows
		int columns = sc.nextInt();	//	number of columns
		//	create an array with size [r][c]
		int arr[][] = new int[rows][columns];
		
		System.out.println("enter elements : ");
		//	accept a matrix from keyboard
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//	transpose matrix
		System.out.println("transpose matrix : ");
		//	take columns as rows and rows as columns
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print(arr[j][i] + "  ");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
