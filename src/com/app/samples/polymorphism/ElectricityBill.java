package com.app.samples.polymorphism;

//Electricity bill for Commercial connection
class Commercial {
	//take customer name
	private String customerName;
	
	//to store customer name
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//retrieve customer name
	String getCustomerName() {
		return customerName;
	}
	
	//to calculate bill taking Rs:5.00 per unit
	void calculateBill(int units) {
		System.out.println("Customer : " + getCustomerName());
		System.out.println("Bill amount : " + (units*5.00));
	}
}

//Electricity bill for Domestic connection
class Domestic extends Commercial {
	/*
	 * override calculateBill() of Commercial class, to calculate
	 * bill at Rs:2.50 per unit
	 */
	void calculateBill(int units) {
		System.out.println("Customer : " + getCustomerName());
		System.out.println("Bill amount : " + (units*2.50));
	}
}

//calculate Electricity bill for commercial and domestic users
public class ElectricityBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call calculateBill() using commercial object
		Commercial commercial = new Commercial();
		commercial.setCustomerName("Raj Kumar");
		commercial.calculateBill(100);
		
		//call calculateBill() using domestic object
		Domestic domestic = new Domestic();
		domestic.setCustomerName("Vijaya Laxmi");
		domestic.calculateBill(100);
	}

}
