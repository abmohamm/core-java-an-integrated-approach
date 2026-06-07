package com.app.samples.methodsinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//creating our own factory method

//an interface with an abstract method
interface Fees {
	double showFees();	//this method does not have a body
}

//implementation class to implement showFees() method
class CSE implements Fees {
	public double showFees() {
		return 60000.00;
	}
}

//another implementation class to implement showFees() method
class ECE implements Fees {
	public double showFees() {
		return 55000.00;
	}
}

//factory class with a factory method getFees()
class CourseFees {
	public static Fees getFees(String course) {
		if(course.equalsIgnoreCase("CSE")) {
			return new CSE();
		}
		else if(course.equalsIgnoreCase("ECE")) {
			return new ECE();
		}
		else {
			return null;
		}
	}
}

//using the factory method getFees() to display any course fees depending on user option
public class DemoFactoryMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("enter course name : ");
		String courseName = bufferedReader.readLine();
		Fees fees = CourseFees.getFees(courseName);
		System.out.println(courseName + " course fees in rupees : " + fees.showFees());

	}

}
