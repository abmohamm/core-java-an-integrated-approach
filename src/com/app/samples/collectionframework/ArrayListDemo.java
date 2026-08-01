//ArrayList with string objects
package com.app.samples.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create ArrayList
		ArrayList<String> stringsArrayList = new ArrayList<String>();
		
		//add four objects
		stringsArrayList.add("Apple");
		stringsArrayList.add("Mango");
		stringsArrayList.add("Grapes");
		stringsArrayList.add("Guava");
		
		//display contents
		System.out.println("Contents : " + stringsArrayList);
		
		//remove two objects
		stringsArrayList.remove(3);	//removes "Guava" as it is at index - 3, index starts from 0
		stringsArrayList.remove("Apple");
		
		//display after removing
		System.out.println("Contents are removing : " + stringsArrayList);
		
		//display its size
		System.out.println("Size of ArrayList : " + stringsArrayList.size());
		
		//extract elements using Iterator
		System.out.println("<===== Extracting using Iterator =====>");
		
		//add an Iterator to ArrayList to retrieve elements
		Iterator<String> iterator = stringsArrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
