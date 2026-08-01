//Creating a vector with Integer elements
package com.app.samples.collectionframework;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//take a vector to store Integer objects
		Vector<Integer> integersVector = new Vector<Integer>();
		
		//take an int type array
		int x[] = {22, 20, 10, 40, 15, 60};
		
		//when x[i] is stored into integersVector below, x[i] values are converted into Integer objects 
		//and stored into integersVector - This is auto-boxing.
		for(int i = 0; i < x.length; i++) {
			integersVector.add(x[i]);
		}
		
		//retrieve the elements using get()
		System.out.print("Vector elements : ");
		for(int i = 0; i < integersVector.size(); i++) {
			System.out.println(integersVector.get(i));
		}
		
		//retrieve using ListIterator
		System.out.println("\n<===== Elements using ListIterator =====>");
		ListIterator<Integer> iterator = integersVector.listIterator();
		
		System.out.println("<===== Iteration in forward direction =====>");
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println("\n<===== Iteration in backward direction =====>");
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous() + "\t");
		}
	}

}
