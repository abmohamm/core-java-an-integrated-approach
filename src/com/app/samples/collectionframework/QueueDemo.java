//a queue with Integer objects
package com.app.samples.collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a linked-list as a queue
		Queue<Integer> integersQueue = new LinkedList<Integer>();
		
		//store integers from 1 to 5
		//these integers are converted into Integer objects and then stored into integersQueue
		for(int i = 1; i <= 5; i++) {
			integersQueue.offer(i);	//offer() returns true if element is added otherwise false if it fails
		}
		
		//retrieve integers from queue
		System.out.println("The queue is : ");
		while(!integersQueue.isEmpty()) {
			//remove() deletes 1st element of integersQueue, throws NoSuchElementException if integersQueue is empty
			System.out.println(integersQueue.remove());
			//poll() deletes and returns the 1st element of the integersQueue, returns null if integersQueue is empty
			System.out.println(integersQueue.poll());
		}
		
		//returns 1st element of integersQueue, throws NoSuchElementException if integersQueue is empty
		System.out.println("Integers Queue are emptying : " + integersQueue.element());
		
		//returns 1st element of integersQueue, returns null if integersQueue is empty
		System.out.println("Integers Queue are empty : " + integersQueue.peek());
		
		System.out.println("Integers Queue is emptied!!!");
		
	}

}
