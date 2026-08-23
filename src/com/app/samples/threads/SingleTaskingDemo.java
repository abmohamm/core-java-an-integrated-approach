//Single tasking using a Thread
package com.app.samples.threads;

class SingleTasking implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		//execute the tasks one by one calling the methods.
		taskOne();
		taskTwo();
		taskThree();
	}

	void taskOne() {
		// TODO Auto-generated method stub
		System.out.println("This is Task-1");
	}

	void taskTwo() {
		// TODO Auto-generated method stub
		System.out.println("This is Task-2");
	}
	
	void taskThree() {
		// TODO Auto-generated method stub
		System.out.println("This is Task-3");
	}

}

public class SingleTaskingDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create an object to SingleTasking class
		SingleTasking singleTasking = new SingleTasking();
		
		//create a Thread and attach it to that object
		Thread thread = new Thread(singleTasking);
		
		//execute the thread on that object's run() method
		thread.start();
	}

}
