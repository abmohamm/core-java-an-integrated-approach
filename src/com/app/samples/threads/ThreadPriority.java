//Thread priorities
package com.app.samples.threads;

class DemoThreadPriority extends Thread{
	
	int count = 0;	//this counts numbers
	
	public void run() {
		
		synchronized(this) {
			for(int i = 1; i <= 100; i++) {
				count++;	//count numbers upto 100
			}
			
			//display which thread has completed counting and its priority
			System.out.println("Completed thread : " + Thread.currentThread().getName());
			System.out.println("It's priority : " + Thread.currentThread().getPriority());
		}
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DemoThreadPriority threadPriority = new DemoThreadPriority();
		
		//create two threads
		Thread firstThread = new Thread(threadPriority, "One");
		Thread secondThread = new Thread(threadPriority, "Two");
		
		//set priorities for them
		firstThread.setPriority(2);
		secondThread.setPriority(Thread.NORM_PRIORITY);	//this means priority number - 5
		
		firstThread.start();
		secondThread.start();
	}

}
