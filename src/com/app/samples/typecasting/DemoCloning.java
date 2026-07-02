package com.app.samples.typecasting;

//cloning example
class Employee implements Cloneable {
	//instance variables
	int id;
	String name;
	
	//constructor to initialize variables
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//method to display the details
	void getData() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
	}
	
	//clone present class object
	public Object myClone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class DemoCloning {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		//create Employee class object using new operator
		Employee employee = new Employee(10, "Abid");
		System.out.println("<===== original object =====>");
		employee.getData();
		
		/*
		 * create another object by cloning employee object. As myClone() method returns object of Object class type
		 * it should be converted into Employee type
		*/
		Employee clonedEmployee = (Employee)employee.myClone();
		System.out.println("<===== cloned object =====>");
		clonedEmployee.getData();
	}

}
