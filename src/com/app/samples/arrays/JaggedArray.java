package com.app.samples.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class JaggedArray.
 */
public class JaggedArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	jagged array that contains two 1D arrays
		int x[][] = new int[2][];
		
		//	create 2 more 1D arrays as part of x
		x[0] = new int[2];	//	x[0] holds an array of row that contains 2 elements
		x[1] = new int[3];	//	x[1] holds an array of row that contains 3 elements
		
		//	store 2 elements in the 1st array
		x[0][0] = 10;
		x[0][1] = 11;
		
		//	store 3 elements in the 2nd array
		x[1][0] = 12;
		x[1][1] = 13;
		x[1][2] = 14;
		
		//	display 1st array
		for(int i = 0; i < 2; i++) {
			
			if(i == x[0].length-1) {
				System.out.print(x[0][i]);
			} else {
				System.out.print(x[0][i] + ",");
			}
		}
		
		System.out.println();
		
		//	display 2nd array
		for(int i = 0; i < 3; i++) {
			if(i == x[1].length-1) {
				System.out.print(x[1][i]);
			} else {
				System.out.print(x[1][i] + ",");
			}
		}
	}

}
