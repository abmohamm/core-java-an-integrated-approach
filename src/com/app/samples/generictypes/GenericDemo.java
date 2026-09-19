//Hashtable is rewritten using generic types in Java 5.0 and later as Hashtable<K, V>
package com.app.samples.generictypes;

import java.util.Hashtable;

public class GenericDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create Hashtable usinf String and Integer
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();	//generic types used
		
		//storing String type key and Integer type value
		hashtable.put("Ajay", 50);	//auto-boxing is used
		hashtable.put("Sachin", 90);
		hashtable.put("Dhoni", 75);
		
		//retrieve Sachin's score
		String name = "Sachin";
		Integer score = hashtable.get(name);	//casting is not required here
		System.out.println("Score : " + score);
		
	}

}
