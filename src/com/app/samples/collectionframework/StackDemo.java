//Pushing, popping and searching elements in a stack
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		// create an empty stack to contain Integer objects
		Stack<Integer> integerStack = new Stack<Integer>();
		//take vars
		int choice = 0;
		int position, element;
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//display the menu as long as user choice < 4
		while(choice < 4) {
			System.out.println("STACK OPERATIONS");
			System.out.println("1. Push an element");
			System.out.println("2. Pop an element");
			System.out.println("3. Search an element");
			System.out.println("4. Exit");
			System.out.print("Your choice : ");
			
			choice = Integer.parseInt(bufferedReader.readLine());
			
			//perform a task depending on the user choice
			switch(choice) {
			
				case 1 :
					System.out.print("Enter element : ");
					element = Integer.parseInt(bufferedReader.readLine());
					//int type element is converted into Integer object and pushed into Stack
					integerStack.push(element);
					break;
					
				case 2 :
					//the top-most integer object is popped 
					Integer poppedElement = integerStack.pop();
					System.out.println("Popped : " + poppedElement);
					break;
					
				case 3 :
					System.out.print("Element to search : ");
					element = Integer.parseInt(bufferedReader.readLine());
					//int type element is converted into Integer object and then searched in the integerStack
					position = integerStack.search(element);
					if(position == -1) {
						System.out.println("Element not found!!!");
					} else {
						System.out.println("Element found at position : " + position);
					}
					break;
				
				default : //come out if user choice is other than 1, 2, 3
					return;
					
			}
			
			//view the contents of the integerStack
			System.out.println("Stack contents : " + integerStack);
		}
	}

}
