//fixed thread pool example
package com.app.samples.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//a class that represents the task to be executed
class Tasks implements Runnable {
	
	private int taskNumber;
	private String threadName;
	
	Tasks(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	public void run() {
		
		// TODO Auto-generated method stub
		for(int i = 0; i <= 100; i = i + 25) {
			//find the currently running thread's name
			threadName = Thread.currentThread().getName();
			
			//display the thread name that is performing the task
			System.out.println(threadName + " completed task " + taskNumber + " by " + i + " percent.");
			
			try {
				Thread.sleep(1000); 	// this task is taking 1 second
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}
	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//fixed thread pool is created with 2 threads
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		/*
		 * number of tasks are 4. create Tasks type array with size 4.
		 * t[0] to t[3] represent the four tasks.
		 */
		Tasks[] tasks = new Tasks[4];
		
		//execute the 4 tasks
		for(int i = 0; i < 4; i++) {
			//attach task to the array reference
			tasks[i] = new Tasks(i);
			
			//execute the task shown by array reference
			executorService.execute(tasks[i]);
		}
		
		//close the old tasks and do not accept new tasks
		executorService.shutdown();
	}

}
