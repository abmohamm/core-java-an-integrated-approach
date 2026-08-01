//LinkedList with strings
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		//create an empty linked-list to store strings
		LinkedList<String> stringsList = new LinkedList<String>();
		
		//add some names to stringsList
		stringsList.add("America");
		stringsList.add("India");
		stringsList.add("Japan");
		stringsList.add("America");
		
		//display the elements in the stringsList
		System.out.println("List : " + stringsList);
		
		//vars
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String element;
		int position, choice = 0;
		
		//menu
		while(choice < 4) {
			System.out.println("\nLINKEDLIST OPERATIONS");
			System.out.println("1. Add an element");
			System.out.println("2. Remove an element");
			System.out.println("3. Change an element");
			System.out.println("4. Exit");
			
			System.out.print("Your choice : ");
			choice = Integer.parseInt(bufferedReader.readLine());
			
			//perform a task depending on user choice
			switch(choice) {
				
				case 1 :
					System.out.print("Enter element : ");
					element = bufferedReader.readLine();
					System.out.print("At what position : ");
					position = Integer.parseInt(bufferedReader.readLine());
					stringsList.add(position-1, element);
					break;
					
				case 2 :
					System.out.print("Enter positon : ");
					position = Integer.parseInt(bufferedReader.readLine());
					stringsList.remove(position-1);
					break;
					
				case 3 :
					System.out.print("Enter position : ");
					position = Integer.parseInt(bufferedReader.readLine());
					System.out.print("Enter element to be replaced : ");
					element = bufferedReader.readLine();
					stringsList.set(position-1, element);
					break;
					
				default :
					return;
			}
			
			//Use Iterator to retrieve the elements
			System.out.print("List : ");
			Iterator<String> iterator = stringsList.iterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}//end of while
		}
	}

}
