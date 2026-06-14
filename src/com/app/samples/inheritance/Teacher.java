package com.app.samples.inheritance;

//Teacher class
public class Teacher {

	//instance variables
	int id;
	String name;
	String address;
	float salary;
	
	//setter method to store id
	void setId(int id) {
		this.id = id;
	}
	
	//getter method to retrieve id
	int getId() {
		return id;
	}
	
	//to store name
	void setName(String name) {
		this.name = name;
	}
	
	//to  retrieve name
	String getName() {
		return name;
	}
	
	//to store address
	void setAddress(String address) {
		this.address = address;
	}
	
	//to retrieve address
	String getAddress() {
		return address;
	}
	
	//to store salary
	void setSalary(float salary) {
		this.salary = salary;
	}
	
	//to retrieve salary
	float getSalary() {
		return salary;
	}
}
