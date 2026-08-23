//Using Thread Groups
package com.app.samples.threads;

class Reservation extends Thread {
	public void run() {
		System.out.println("I am reservation thread");
	}
}

class Cancellation extends Thread {
	public void run() {
		System.out.println("I am cancellation thread");
	}
}

public class ThreadGroups {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * We should understand that following statements are executed 
		 * by the main thread
		 */
		Reservation reservation = new Reservation();
		Cancellation cancellation = new Cancellation();
		
		//create a Thread group with name
		ThreadGroup threadGroup = new ThreadGroup("First Group");
		
		//create 2 threads and add them to First Group
		Thread t1 = new Thread(threadGroup, reservation, "First thread");
		Thread t2 = new Thread(threadGroup, reservation, "Second thread");
		
		//create another thread group - threadGroupOne as child to threadGroup
		ThreadGroup threadGroupOne = new ThreadGroup(threadGroup, "Second Group");
		
		//create 2 threads and add them to Second Group
		Thread t3 = new Thread(threadGroupOne, cancellation, "Third thread");
		Thread t4 = new Thread(threadGroupOne, cancellation, "Fourth thread");
		
		//find parent group of threadGroupOne
		System.out.println("Parent of threadGroupOne : " + threadGroupOne.getParent());
		
		//set maximum priority of threadGroupOne as 7
		threadGroupOne.setMaxPriority(7);
		
		//know the thread group of t1 and t3
		System.out.println("Thread group of t1 : " + t1.getThreadGroup());
		System.out.println("Thread group of t3 : " + t3.getThreadGroup());
		
		//start the threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//find how many threads are actively running
		System.out.println("Number of active threads in threadGroup : " + threadGroup.activeCount());	
	}

}
