package com.app.samples.relationshipbetweenobjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Inner class example
//This is outer class
class BankAccount {
	
	//balance amount is variable
	private double balance;
	
	//initiate the balance
	BankAccount(double balance) {
		this.balance = balance;
	}
	
	//Inner class object is created after verifying authentication of user. rateOfInterest is rate of interest.
	//This method accepts rate of interest
	void contact(double rateOfInterest) throws IOException{
		
		//accept password from keyboard and verify
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStreamReader);
		System.out.print("enter password : ");
		String password = br.readLine();
		if(password.equals("xyz123")) {
			
			//if password is correct then calculate interest
			Interest interest = new Interest(rateOfInterest);
			interest.calculateInterest();
		} else {
			System.out.println("Sorry, You are not an authorized person!!!");
			return;
		}
	}
	
	//inner class
	private class Interest {
		
		//rate of interest
		private double rateOfInterest;
		
		//initialize the rateOfInterest
		Interest(double rateOfInterest) {
			this.rateOfInterest = rateOfInterest;
		}
		
		//calculate interest amount and update balance
		void calculateInterest() {
			double interest = balance*rateOfInterest/100;
			balance = balance + interest;
			System.out.println("updated balance : " + balance);
		}
	}
}
// TODO: Auto-generated Javadoc
/**
 * The Class DemoInnerClass.
 */
//using InnerClass
public class DemoInnerClass {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//bank account is holding a balance of 10000
		BankAccount account = new BankAccount(10000);
		
		//update balance amount by adding interest at 9.5%
		account.contact(9.5);
	}

}
