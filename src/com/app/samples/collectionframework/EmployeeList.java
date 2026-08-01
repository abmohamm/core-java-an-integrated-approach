//To create an ArrayList of Employee objects and search for a particular Employee object based on id number
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class EmployeeResource {
	
	//take variables
	int id;
	String name;
	String address;
	
	//initialize them
	EmployeeResource(int employeeId, String employeeName, String employeeAddress) {
		id = employeeId;
		name = employeeName;
		address = employeeAddress;
	}
	
	//display employee details
	void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
	
}

public class EmployeeList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		//vars
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		int id;
		String name;
		String address;
		
		//create an ArrayList employeeResources to store EmployeeResource objects
		ArrayList<EmployeeResource> employeeResources = new ArrayList<EmployeeResource>();
		
		//accept 5 employee details and store into employeeResources
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter id : ");
			id = Integer.parseInt(bufferedReader.readLine());
			
			System.out.print("Enter name : ");
			name = bufferedReader.readLine();
			
			System.out.print("Enter address : ");
			address = bufferedReader.readLine();
			
			//create EmployeeResource object with accepted data
			EmployeeResource employeeResource = new EmployeeResource(id, name, address);
			
			//store employeeResource object into employeeResources
			employeeResources.add(employeeResource);
		}
		
		//Now search for an employee id
		System.out.print("Enter id to search : ");
		id = Integer.parseInt(bufferedReader.readLine());
		
		//found becomes true if employeeResource id is found in employeeResources
		boolean found = false;
		
		//search all elements in employeeResources
		for(int i = 0; i < employeeResources.size(); i++) {
			
			//get() method of ArrayList will return i-th employeeResource object
			EmployeeResource employeeResource = employeeResources.get(i);
			
			//check if given id is equal to id of EmployeeResource object
			if(id == employeeResource.id) {
				employeeResource.display();	//display that EmployeeResource data
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee not found!!!");
		}
	}

}
