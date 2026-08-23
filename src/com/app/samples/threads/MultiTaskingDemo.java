//Two threads performing two tasks at a time - Theatre example
package com.app.samples.threads;

class MultiTasking implements Runnable {

	//declare a String to represent the task
	String task;
	MultiTasking(String task) {
		this.task = task;
	}
	
	public void run() {
		
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			System.out.println(task + " : " + i);
			try {
				Thread.sleep(2000); //cease the thread execution for 2000 milliseconds
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}	//end of for
	}	//	end of run() method
	
}

//	Theatre example
public class MultiTaskingDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create two objects to represent the two tasks
		MultiTasking taskOne = new MultiTasking("Cut the ticket");
		MultiTasking taskTwo = new MultiTasking("Show the seat");
		
		//create two threads and attach them to the two objects - taskOne, tasktwo
		Thread task1 = new Thread(taskOne);
		Thread task2 = new Thread(taskTwo);
		
		//start the threads
		task1.start();
		task2.start();
	}

}
