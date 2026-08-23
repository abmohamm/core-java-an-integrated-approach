//To create a thread and run it, then stop it.
package com.app.samples.threads;

import java.io.IOException;

class StopThread extends Thread {
	
	boolean stop = false;
	
	public void run() {
		for(int i = 1; i <= 10000000; i++) {
			System.out.println(i);
			if(stop) {
				return;		//come out of run() method
			}
		}
	}
}

public class DemoStopThread {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		StopThread stopThread = new StopThread();
		Thread thread = new Thread(stopThread);
		thread.start();
		//stop the thread when Enter key is pressed
		System.in.read();	//wait till enter key is pressed
		stopThread.stop = true;
	}

}
