/*
 * This program shows how two threads can communicate with each other.
 * This is inefficient way  of Communication
 */
package com.app.samples.threads;

class Producer extends Thread {
	
	//To add data, We use string buffer object
	StringBuffer data;
	
	//dataprodover will be true when data production is over
	boolean dataprodover = false;
	
	Producer() {
		data = new StringBuffer();	//allot memory
	}
	
	public void run() {
		
		//go on appending data(numbers) to data string buffer
		for(int i = 1; i <= 10; i++) {
			try {
				if( i != 10) {
					data.append(i + " : ");
				} else {
					data.append(i + "");
				}
				Thread.sleep(100);
				System.out.println("appending");
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}
		//data production is over, So store true into dataprodover
		dataprodover = true;
	}
}

class Consumer extends Thread {
	
	//create Producer reference to refer to Producer object from Consumer class
	Producer producer;
	
	Consumer(Producer producer) {
		this.producer = producer;
	}
	
	public void run() {
		/*
		 * if data production is not over, sleep for 10 milliseconds and check again.
		 * Here these is a time delay of several milliseconds to receive data.
		 */
		try {
			while(!producer.dataprodover) {
				Thread.sleep(10);
			}
		} catch(InterruptedException interruptedException) {
			interruptedException.printStackTrace();
		}
		
		//when data production is over, Display data of string buffer
		System.out.println(producer.data);
	}
}

public class ThreadCommunication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Producer produces some data which Consumer consumes
		Producer producer = new Producer();
		
		//Pass producer to Consumer so that it is then available to Consumer
		Consumer consumer = new Consumer(producer);
		
		//create 2 threads and attach to Producer and Consumer
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		//Run the threads
		consumerThread.start();	//Consumer waits
		producerThread.start();	//Producer starts production
	}

}
