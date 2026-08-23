//To create a Thread and run it
//Let the class extends Thread or implements Runnable interface
package com.app.samples.threads;

class MyThread extends Thread {
	
	//write  run() method inside this class
	public void run() {
		
		//only this code is executed by the Thread
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

//another class
public class DemoThread {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create an object to MyThread class
		MyThread myThread = new MyThread();
		
		//create a Thread and attach it to the object of MyThread class
		Thread thread = new Thread(myThread);
		
		//now run the thread on the object
		thread.start();	//now this thread will execute the code inside run() method of MyThread class.		
		
	}

}
