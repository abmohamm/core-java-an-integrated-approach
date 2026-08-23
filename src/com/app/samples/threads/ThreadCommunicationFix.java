/*
 * This program shows how to use wait() and notify() methods.
 * This is the most efficient way of Thread communication.
 */
package com.app.samples.threads;

class ProducerThread extends Thread {
	
	//To add data, We use String buffer object
	StringBuffer data;
	
	ProducerThread() {
		data = new StringBuffer();	//allot memory
	}
	
	public void run() {
		synchronized(data) {	
			//go on appending data(numbers) to String buffer data
			for(int i = 1; i <= 10; i++) {
				try {
					if( i != 10) {
						data.append(i + " : ");
					} else {
						data.append(i + "");
					}
					Thread.sleep(1000);
					System.out.println("appending");
				} catch(InterruptedException interruptedException) {
					interruptedException.printStackTrace();
				}
			}
			
			//Once data production is over, So notify to Consumer Thread
			System.out.println("Notifying to Consumer for consumption");
			data.notify();
		}
	}
}

class ConsumerThread extends Thread {
	
	//create ProducerThread reference to refer to ProducerThread object from ConsumerThread class
	ProducerThread producerThread;
	
	ConsumerThread(ProducerThread producerThread) {
		this.producerThread = producerThread;
	}
	
	public void run() {
		synchronized(producerThread.data) {
			/*
			 * wait till a notification is received from ProducerThread.
			 * Here there is no wastage of time of even a single millisecond.
			 */
			try {
				producerThread.data.wait();
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			
			//when data production is over, display data of String buffer data
			System.out.println(producerThread.data);
		}
	}
}

public class ThreadCommunicationFix {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Producer produces some data which Consumer consumes
		ProducerThread producer = new ProducerThread();
		
		//Pass producer object to Consumer so that it is then available to Consumer
		ConsumerThread consumer = new ConsumerThread(producer);
		
		//create 2 threads and attach to producer and consumer
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		//Run the threads
		consumerThread.start(); 	//Consumer waits
		producerThread.start(); 	//Producer starts production
	}

}
