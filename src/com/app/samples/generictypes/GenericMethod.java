//A generic method - to read and display any type of array elements
package com.app.samples.generictypes;

class MyMethod {
	
	//This method accepts T type array
	static <T>void display(T[] arrayElements) {
		
		//use for-each loop and read elements of array
		for(T element : arrayElements) {
			System.out.println(element);
		}
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//read elements from Integer type array using display()
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		System.out.println("reading integer objects : ");
		MyMethod.display(integerArray);
		
		System.out.println();
		//read elements from Double type array using display()
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		System.out.println("reading double objects : ");
		MyMethod.display(doubleArray);
		
		System.out.println();
		//read elements from String type array using display()
		String[] stringArray = {"Raju", "Rani", "Ravi", "Kiran"};
		System.out.println("reading string objects : ");
		MyMethod.display(stringArray);
	}

}
