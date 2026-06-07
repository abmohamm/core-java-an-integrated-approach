package com.app.samples.methodsinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Matrix addition using arrays
//Passing arrays to methods and returning them
class Matrix {
	
	//take a 2D array for matrix and rows, columns
	int arr[][];
	int rows, columns;
	
	//initialize rows and columns, allot memory for array
	Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		arr = new int[rows][columns];
	}
	
	//accept 2D array from keyboard and return it
	int[][] getMatrix() throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		//StringTokenizer is useful to accept each row as a single string and then divide it into tokens.
		//Each token represents an array element.
		StringTokenizer st;
		for(int i = 0; i < rows; i++) {
			String str = br.readLine();
			st = new StringTokenizer(str," ");
			for(int j = 0; j < columns; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		return arr;
	}
	
	//accept two 2D arrays and find sum matrix, return it
	int[][] findSum(int a[][], int b[][]) {
		int temp[][] = new int[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				temp[i][j] = a[i][j] + b[i][j];
			}
		}
		return temp;
	}
	
	//display the resultant 2D array as matrix
	void displayMatrix(int result[][]) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
// TODO: Auto-generated Javadoc
/**
 * The Class DemoMatrixAddition.
 */
public class DemoMatrixAddition {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create two objects to Matrix class, since each object contains an array
		Matrix obj1 = new Matrix(3,3);
		Matrix obj2 = new Matrix(3,3);
		
		//take 3 references for 2D arrays
		int x[][], y[][], result[][];
		
		System.out.println("\nEnter elements for 1st matrix : ");
		x = obj1.getMatrix();
		
		System.out.println("\nEnter elements for 2nd matrix : ");
		y = obj2.getMatrix();
		
		//add matrices and return sum matrix into result
		result = obj1.findSum(x, y);
		
		System.out.println("\nResultant matrix : ");
		obj2.displayMatrix(result);
	}

}
