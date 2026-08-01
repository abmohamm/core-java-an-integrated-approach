//HashMap used as a telephone book
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		//create HashMap
		HashMap<String, Long> phoneBook = new HashMap<String, Long>();
		
		//vars
		String name;
		Long contactNumber;
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//menu
		while(true) {
			System.out.println("1. Enter Phone entries : ");
			System.out.println("2. Lookup in the phone-book");
			System.out.println("3. Display names in phone-book");
			System.out.println("4. Exit");
			
			System.out.print("Your choice : ");
			int n =Integer.parseInt(bufferedReader.readLine());
			
			switch(n) {
				
				case 1 :
					System.out.print("Enter name : ");
					name = bufferedReader.readLine();
					System.out.print("Enter phone number : ");
					contactNumber = Long.parseLong(bufferedReader.readLine());
					//store name and phoneNumber into phoneBook
					phoneBook.put(name, contactNumber);
					break;
				
				case 2 :
					System.out.print("Enter name : ");
					name = bufferedReader.readLine();
					name = name.trim();//remove unnecessary spaces
					//pass name and get contactNumber
					contactNumber = phoneBook.get(name);
					System.out.println("Contact number : " + contactNumber);
				
				case 3 : 
					//use keySet() to display the names
					//create HashSet object to store names and refer it by Set reference
					Set<String> names = new HashSet<String>();
					names = phoneBook.keySet();
					System.out.println("Names : " + names);
					break;
				
				case 4 :
					return;
			}
		}
		
	}

}
