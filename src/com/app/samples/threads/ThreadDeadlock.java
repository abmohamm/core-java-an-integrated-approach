//Thread Deadlock
package com.app.samples.threads;

class BookTicket extends Thread {
	
	//we are assuming train, compartment as objects
	Object train, compartment;
	
	BookTicket(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}
	
	public void run() {
		//lock on train
		synchronized(train) {
			System.out.println("BookTicket locked on Train");
			try {
				Thread.sleep(1500);
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			System.out.println("BookTicket now waiting to lock on Compartment");
			synchronized(compartment) {
				System.out.println("BookTicket locked on Compartment");
			}
		}
	}
}

class CancelTicket extends Thread {
	
	//we are assuming train, compartment as objects
	Object train, compartment;
	
	CancelTicket(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}
	
	public void run() {
		//locl on compartment
		synchronized(compartment) {
			System.out.println("CancelTicket locked on compartment");
			try {
				Thread.sleep(1500);
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			System.out.println("CancelTicket now waiting to lock on Train");
			synchronized(train) {
				System.out.println("CancelTicket locked on Train");
			}
		}
	}
}

public class ThreadDeadlock {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//take train, compartment as objects of Object class
		Object train = new Object();
		Object compartment = new Object();
		
		//create objects to BookTicket, CancelTicket classes
		BookTicket bookTicket = new BookTicket(train, compartment);
		CancelTicket cancelTicket = new CancelTicket(train, compartment);
		
		//attach 2 threads to these objects
		Thread firstThread = new Thread(bookTicket);
		Thread secondThread = new Thread(cancelTicket);
		
		//run the threads on the objects
		firstThread.start();
		secondThread.start();
	}

}
