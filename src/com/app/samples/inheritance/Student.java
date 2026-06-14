package com.app.samples.inheritance;

//Student class - version 1
public class Student {

	//instance variables
	int id;
	String name;
	String address;
	int marks;
	
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
	
	//to retrieve name
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
	
	//to store marks
	void setMarks(int marks) {
		this.marks = marks;
	}
	
	//to retrieve marks
	int getMarks() {
		return marks;
	}
}
