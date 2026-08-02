//calculating electricity bill for domestic and commercial plans
package com.app.samples.abstractclasses;

//calculating electricity bill for domestic and commercial plans
abstract class Plan {

	//take rate as protected to access it in subclasses
	protected double rate;
	
	//accept rate into rate instance variable.
	//since rate will change depending on plan, We declare abstract method
	public abstract void getRate();
	
	//calculate the electricity bill by taking units
	public void calculateBill(int units) {
		System.out.print("bill amount for " + units + " units : ");
		System.out.println(rate*units);
	}
}

class CommercialPlan extends Plan {

	//store commercial rate as Rs.5.00 per unit
	public void getRate() {
		rate = 5.00;
	}	
}

class DomesticPlan extends Plan {

	//store domestic rate as Rs.2.60 per unit
	public void getRate() {
		rate = 2.60;
	}
	
}

public class CalculateElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a reference plan to abstract class
		Plan commercialPlan, domesticPlan;
		
		//calculate commercial bill for 250 units
		System.out.println("<====== commercial connection ======>");
		commercialPlan = new CommercialPlan();	//plan reference to refer to sub class commercialPlan - generalization, widening
		commercialPlan.getRate();
		commercialPlan.calculateBill(250);
		
		System.out.println();
		
		//calculate domestic bill for 150 units
		System.out.println("<====== domestic connection ======>");
		domesticPlan = new DomesticPlan();	//plan reference to refer to sub class domesticPlan - generalization, widening
		domesticPlan.getRate();
		domesticPlan.calculateBill(150);
		
	}

}
