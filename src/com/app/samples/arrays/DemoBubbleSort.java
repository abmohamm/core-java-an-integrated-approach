package com.app.samples.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoBubbleSort.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoBubbleSort {

	/**
	 * The main method.
	 * @param args the arguments
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int temp;
		boolean flag = false;
		System.out.println();
		// connecting input-stream to a keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		//	To accept data from the keyboard
		BufferedReader br = new BufferedReader(streamReader);
		
		System.out.println("how many elements : ");
		int numberOfElements = Integer.parseInt(br.readLine());
		int limit = numberOfElements - 1;
		int arr[] = new int[numberOfElements];
		
		//	accept integer elements into the array
		for(int i = 0; i < numberOfElements; i++) {
			System.out.print("enter integer : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//	use bubble-sort technique to sort array
		for(int i = 0; i < limit; i++) {
			for(int j = 0; j < limit-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false) {
				break;
			} else {
				flag = false;
			}
		}
		
		//	display sorted array
		System.out.println("sorted array is : ");
		for(int i = 0; i < numberOfElements; i++) {
			if(i == numberOfElements - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
