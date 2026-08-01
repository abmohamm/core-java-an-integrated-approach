//HashSet demo
package com.app.samples.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a HashSet to store strings
		HashSet<String> stringsSet = new HashSet<String>();
		
		//store some string elements
		stringsSet.add("India");
		stringsSet.add("America");
		stringsSet.add("Japan");
		stringsSet.add("China");
		stringsSet.add("America");
		
		//view the HashSet
		System.out.println("HashSet : " + stringsSet);
		
		//add an iterator to stringsSet
		Iterator<String> iterator = stringsSet.iterator();
		
		//display each element using Iterator
		System.out.println("Elements using Iterator : ");
		while(iterator.hasNext()) {
			String st = iterator.next();
			System.out.println(st);
		}
	}

}
