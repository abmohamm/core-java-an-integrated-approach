package com.app.samples.exceptionhandling;

//User defined exception to throw whenever balance amount is below Rs. 1000
// TODO: Auto-generated Javadoc
/**
 * The Class DemoCustomException.
 */
public class DemoCustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//store account information
	private static int accountNumbers[] = {1001, 1002, 1003, 1004, 1005};
	
	private static String names[] = {"Raja rao", "Rama rao", "Subba rao", "Appa rao", "Laxmi devi"};
	
	private static double balance[] = {10000.00, 12000.00, 5600.50, 999.00, 1100.55};
	
	//default constructor
	DemoCustomException() {
		
	}
	
	//parameterized constructor
	DemoCustomException(String exception) {
		super(exception);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		try {
			//display the heading for the table
			System.out.println("Account Number" + "\t" + "Customer" + "\t\t" + "Balance");
			System.out.println("---------------------------------------------------------------");
			//display actual account information
			for(int i = 0; i < 5; i++) {
				System.out.println(accountNumbers[i] + "\t\t" + names[i] + "\t\t" + balance[i]);
				
				//display the exception if balance < 1000
				if(balance[i] < 1000.00) {
					DemoCustomException exception = new DemoCustomException("balance amount is less!!!");
					throw exception;
				}
			}	//end of for-loop
		}	//end of try block 
		catch(DemoCustomException exception) {
			exception.printStackTrace();
		}
	}	//end of main
}	//end of DemoCustomException class
