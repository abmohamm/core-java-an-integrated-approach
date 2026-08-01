//Sorting and searching an array
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		//to accept data from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//create an array
		int arr[] = new int[5];
		
		//store elements into arr
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter an element : ");
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		//display the arr[] contents
		System.out.println("Contents of the array : ");
		display(arr);
		
		//sort the arr[] into ascending order
		Arrays.sort(arr);
		
		//display the sorted contents
		System.out.println("The sorted array : ");
		display(arr);
		
		//Now search for an element
		System.out.print("Which element to search : ");
		int element = Integer.parseInt(bufferedReader.readLine());
		int index = Arrays.binarySearch(arr, element);
		if(index < 0) {
			System.out.println("Element not found!!!");
		} else {
			System.out.println("Element found at location : " + (index + 1));
		}
		
	}

	//display method uses for-each loop
	static void display(int[] arr) {
		
		// TODO Auto-generated method stub
		for(int element : arr) {
			System.out.println(element);
		}
	}
}//end of ArraysDemo class
