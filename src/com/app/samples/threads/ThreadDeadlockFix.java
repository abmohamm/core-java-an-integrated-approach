//Thread Deadlock
package com.app.samples.threads;

class ReserveTicket extends Thread {
	
	//we are assuming train, compartment as objects
	Object train, compartment;
	
	ReserveTicket(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}
	
	public void run() {
		//lock on train
		synchronized(train) {
			System.out.println("ReserveTicket locked on Train");
			try {
				Thread.sleep(1500);
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			System.out.println("ReserveTicket now waiting to lock on Compartment");
			synchronized(compartment) {
				System.out.println("ReserveTicket locked on Compartment");
			}
		}
	}
}

class UnreserveTicket extends Thread {
	
	//we are assuming train, compartment as objects
	Object train, compartment;
	
	UnreserveTicket(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}
	
	public void run() {
		//locl on compartment
		synchronized(train) {
			System.out.println("UnreserveTicket locked on compartment");
			try {
				Thread.sleep(1500);
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			System.out.println("UnreserveTicket now waiting to lock on Train");
			synchronized(compartment) {
				System.out.println("UnreserveTicket locked on Train");
			}
		}
	}
}

public class ThreadDeadlockFix {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//take train, compartment as objects of Object class
		Object train = new Object();
		Object compartment = new Object();
		
		//create objects to ReserveTicket, UnreserveTicket classes
		ReserveTicket reserveTicket = new ReserveTicket(train, compartment);
		UnreserveTicket unreserveTicket = new UnreserveTicket(train, compartment);
		
		//attach 2 threads to these objects
		Thread firstThread = new Thread(reserveTicket);
		Thread secondThread = new Thread(unreserveTicket);
		
		//run the threads on the objects
		firstThread.start();
		secondThread.start();
	}

}
