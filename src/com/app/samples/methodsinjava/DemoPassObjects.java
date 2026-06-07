package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc
//objects are also passed to methods by value
class Employee {
	
	//instance variable
	int id;
	
	//to initialize Employee object
	Employee(int id) {
		this.id = id;
	}
}


class CheckTwo {

	//to interchange Employee class objects
	void swap(Employee emp1, Employee emp2) {
		Employee temp;	//temporary reference
		temp = emp1;
		emp1 = emp2;
		emp2 = temp;
	}
}

// TODO: Auto-generated Javadoc
/**
 * The Class DemoPassObjects.
 */
public class DemoPassObjects {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pass two employee class objects
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(20);
		
		//create checkTwo class object
		CheckTwo obj = new CheckTwo();
		
		//display data before calling
		System.out.println(e1.id + "\t" + e2.id);
		
		//call swap and pass Employee class objects
		obj.swap(e1, e2);
		
		//display data before calling
		System.out.println(e1.id + "\t" + e2.id);

	}

}
