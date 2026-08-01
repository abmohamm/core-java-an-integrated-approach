//To store and a group of objects in an array
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
	
	//instance variables
	int id;
	String name;
	
	//to store data
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//a method to display data
	void displayData() {
		System.out.println(id + "\t" + name);
	}
}

public class EmployeeGroup {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		//to accept data from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//create Employee type array with size 5
		Employee[] empArray = new Employee[5];
		
		//store 5 employees data into the array
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("enter id : ");
			int id = Integer.parseInt(bufferedReader.readLine());
			
			System.out.print("enter name : ");
			String name = bufferedReader.readLine();
			
			empArray[i] = new Employee(id, name);
		}
		
		System.out.println("\nThe employee data is : ");
		
		//display the employee data from the array
		for(int i = 0 ; i < empArray.length ; i++) {
			empArray[i].displayData();
		}	
		
	}

}
