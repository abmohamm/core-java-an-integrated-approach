package com.app.samples.methodsinjava;

//interchanging the values should be done in a single object
class EmployeeTwo {
	
	//instance variables
	int id1, id2;
	
	//to initialize id values
	EmployeeTwo(int id1, int id2) {
		this.id1 = id1;
		this.id2 = id2;
	}
}

class CheckThree {
	
	//to interchange id values in same employee object
	void swap(EmployeeTwo obj) {
		int temp;	//take a temporary variable
		temp = obj.id1;
		obj.id1 = obj.id2;
		obj.id2 = temp;
	}
}
// TODO: Auto-generated Javadoc
/**
 * The Class DemoSwapObjectData.
 */
public class DemoSwapObjectData {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take employee class object with id values
		EmployeeTwo emp = new EmployeeTwo(10,20);
		
		//create check class object
		CheckThree check = new CheckThree();
		
		//display data before calling
		System.out.println(emp.id1 + "\t" + emp.id2);
		
		//call swap and pass employee object
		check.swap(emp);
		
		//display data after calling
		System.out.println(emp.id1 + "\t" + emp.id2);

	}

}
