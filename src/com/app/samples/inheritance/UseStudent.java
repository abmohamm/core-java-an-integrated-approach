package com.app.samples.inheritance;

//using Student class
public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object to Student class
		Student student = new Student();
		
		//store data into object - for this use setter methods
		student.setId(1001);
		student.setName("Chandra Sekhar");
		student.setAddress("MIG-12, Kukatpally, Hyderabad");
		student.setMarks(950);

		//retrieve data using getter methods and display
		System.out.println("Id : " + student.getId());
		System.out.println("Name : " + student.getName());
		System.out.println("Address : " + student.getAddress());
		System.out.println("Marks : " + student.getMarks());
	}

}
