//hashtable before java 5.0 - no generic type concept
package com.app.samples.generictypes;

import java.util.Hashtable;

public class NoGenericDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create Hashtable object
		Hashtable hashtable = new Hashtable();	//generic types not used
		
		//storing String type key and Integer type value
		hashtable.put("Ajay", Integer.valueOf(50));	//auto-boxing is not used
		hashtable.put("Sachin", Integer.valueOf(90));
		hashtable.put("Dhoni", Integer.valueOf(75));
		
		//retrieve Sachin's score
		String name = "Sachin";
		Integer score = (Integer)hashtable.get(name);	//casting is required here
		System.out.println("Score : " + score);
		
	}

}
