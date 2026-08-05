//callback mechanism using interfaces in java
//create an interface
package com.app.samples.interfaces;

import java.lang.reflect.InvocationTargetException;

//callback mechanism using interfaces in java
//create an interface
interface Tax {
	double stateTax();
}

//implementation class for AndhraPradesh state tax
class AndhraPradesh implements Tax {

	public double stateTax() {
		// TODO Auto-generated method stub
		System.out.println("According to AP Govt rules");
		return 5000.50;
	}
}

//implementation class for Karnataka state tax 
class Karnataka implements Tax {

	public double stateTax() {
		// TODO Auto-generated method stub
		System.out.println("According to Karnataka Govt rules");
		return 2000.00;
	}
	
}

public class DemoCallbackTaxApp {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		// TODO Auto-generated method stub
		//Accept the state name through command line arguments, state name is stored in an object - clazz
		Class<?> clazz = Class.forName(args[0]);
		//Create a new object to that class whose name is in clazz, Tax interface reference is referencing to that object.
		Tax tax = (Tax)clazz.getDeclaredConstructor().newInstance();
		/*call the method to calculate tax and pass interface reference - this is callback.
		 *Here, tax may refer to stateTax() of AndhraPradesh or Karnataka classes depending on the class for which  
		 *object is created in the previous step*/
		calculateTax(tax);
	}

	static void calculateTax(Tax tax) {
		// TODO Auto-generated method stub
		//calculate central tax
		double centralTax = 1000.00;
		//calculate state tax
		double stateTax = tax.stateTax();
		//display total tax
		System.out.println("Total tax : " + (centralTax + stateTax));
	}

}
