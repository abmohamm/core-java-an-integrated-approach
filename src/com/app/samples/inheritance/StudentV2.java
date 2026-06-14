package com.app.samples.inheritance;

//Student class - version 2
public class StudentV2 extends Teacher{

	/*
	 * since id, name and address are available from Teacher class, We omit those
	 * instance variables and the corresponding methods
	*/
	//instance variables
	int marks;
	
	//to store marks
	void setMarks(int marks) {
		this.marks = marks;
	}
	
	//to retrieve marks
	int getMarks() {
		return marks;
	}
}
