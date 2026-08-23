//Thread synchronization - Two threads acting on same object
package com.app.samples.threads;

class BerthReserve implements Runnable {

	//available berths are 1
	int availableBerths = 1;
	int wantedBerths;
	
	//accept wantedBerths at run time
	BerthReserve(int wantedBerths) {
		this.wantedBerths = wantedBerths;
	}
	public void run() {
		
		// TODO Auto-generated method stub
		synchronized(this) {	//synchronize the current object
			
			//display available berths
			System.out.println("Available berths : " + availableBerths);
			
			//if availableBerths are more than wantedBerths
			if(availableBerths >= wantedBerths) {
				
				//get the name of passenger
				String name = Thread.currentThread().getName();
				
				//allot the berth to Him
				System.out.println(wantedBerths + " berths reserved for " + name);
				
				try {
					Thread.sleep(1500); 	//wait for printing the ticket
					//update the number of availableBerths
					availableBerths = availableBerths - wantedBerths;
				} catch(InterruptedException interruptedException) {
					interruptedException.printStackTrace();
				}
			} else {
				//if availableBerths are less, display sorry
				System.out.println("Sorry, No berths!!!");
			}
		}	//end of synchronized block
	}
	
}

public class SafeThreads {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//tell that 1 berth is needed
		BerthReserve berthReserve = new BerthReserve(1);
		
		//attach 1st thread to the object
		Thread firstThread = new Thread(berthReserve);
		
		//attach 2nd thread to the same object
		Thread secondThread = new Thread(berthReserve);
		
		//take the thread names as persons names
		firstThread.setName("First person");
		secondThread.setName("Second person");
		
		//send the requests for berth
		firstThread.start();
		secondThread.start();
	}

}
