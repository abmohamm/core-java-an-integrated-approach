package com.app.samples.introductiontooops;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoEncapsulation.
 */
public class DemoEncapsulation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.displayDetails();
		System.out.println("<===========================================>");
		Student student = new Student();
		student.displayDetails();
	}

}

/**
 * The Class Employee.
 */
class Employee {
	int id = 1001;
	String name = "Vishal";
	
	void displayDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
}

/**
 * The Class Student.
 */
class Student {
	int id = 12;
	String name = "Lakshmi";
	
	void displayDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
	}
}
