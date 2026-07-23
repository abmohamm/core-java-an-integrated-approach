package com.app.samples.exceptionhandling;

//Logical error
public class DemoLogicalError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary = 5000.00;
		salary = salary * 15/100;	//wrong. Use : salary = salary + salary*15/100;
//		salary = salary + salary*15/100;
		System.out.println("Incremented salary : " + salary);
	}

}
