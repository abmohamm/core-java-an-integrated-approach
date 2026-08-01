//Sorting an array with a group of Integer objects
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//to sort in ascending order
class AscendingOrder implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

//to  sort in descending order
class DescendingOrder implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}

public class DemoComparator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		//to accept array elements from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.print("How many elements : ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		//create an array to store Integer type objects
		Integer arr[] = new Integer[size];
		
		//Below, we pass int values to the array
		//but they are converted into Integer objects and then stored
		for(int i = 0; i < size; i++) {
			System.out.print("Enter element : ");
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		//sort the array in ascending order
		Arrays.sort(arr, new AscendingOrder());
		
		//display the sorted array
		System.out.print("\nSorted in Ascending order : ");
		display(arr);
		
		//in descending order
		Arrays.sort(arr, new DescendingOrder());
		System.out.print("\nSorted in Descending order : ");
		display(arr);
	}

	static void display(Integer[] arr) {
		// TODO Auto-generated method stub
		for(Integer element : arr) {
			System.out.print(element + "\t");		
		}
	}

}
