package com.app.samples.introductiontooops;

//TODO: Auto-generated Javadoc
/**
* The Class DemoAbstraction.
*/
public class DemoAbstraction {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Bank {
	private int accNo;
	private String name;
	private float balance;
	private float profit;
	private float loan;
	
	public void displayToClerk() {
		System.out.println("A/c No : " + accNo);
		System.out.println("Name : " + name);
		System.out.println("Balance : " + balance);
		System.out.println("Profit : " + profit);
		System.out.println("Loan : " + loan);
	}
}