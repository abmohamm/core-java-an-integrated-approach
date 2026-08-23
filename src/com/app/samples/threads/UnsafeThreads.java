//Thread unsafe - Two threads acting on same object
package com.app.samples.threads;

class ReserveBerth implements Runnable {

	//available berths are 1
	int availableBerths = 1;
	int wantedBerths;
	
	//accept wantedBerths at run time
	ReserveBerth(int wantedBerths) {
		this.wantedBerths = wantedBerths;
	}
	
	public void run() {
	
		// TODO Auto-generated method stub
		//display available berths
		System.out.println("Available berths : " + availableBerths);
		//if availableBerths are more than wantedBerths
		if(availableBerths >= wantedBerths) {
			
			//get the name of passenger
			String name = Thread.currentThread().getName();
			
			//allot the berth to him
			System.out.println(wantedBerths + " berths reserved for " + name);
			
			try {
				Thread.sleep(1500);	//wait for printing the ticket
				//update the number of availableBerths
				availableBerths = availableBerths - wantedBerths;
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		} else {	//if availableBerths are less, display sorry message
			System.out.println("Sorry, No berths!!!");
		}
	}
	
}

public class UnsafeThreads {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//tell that 1 berth is needed
		ReserveBerth reserveBerth = new ReserveBerth(1);
		
		//attach first thread to the object
		Thread firstThread = new Thread(reserveBerth);
		
		//attach second thread to the object
		Thread secondThread = new Thread(reserveBerth);
		
		//take the thread names as person's names
		firstThread.setName("First person");
		secondThread.setName("Second person");
		
		//send requests for berth
		firstThread.start();
		secondThread.start();
	}

}
