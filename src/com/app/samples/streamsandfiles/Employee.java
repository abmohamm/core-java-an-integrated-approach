//Employee class
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Calendar;

public class Employee implements Serializable{

	int id;
	String name;
	float salary;
	Calendar dateOfJoining;
	
	void displayData() {
		int year = dateOfJoining.get(Calendar.YEAR);
		int month = dateOfJoining.get(Calendar.MONTH);
		++month;
		int date = dateOfJoining.get(Calendar.DATE);
		
		System.out.printf("%-10d %s %10.2f %2d-%2d-%4d\n", id, name, salary, date, month, year);	
	}
	
	void getData() throws NumberFormatException, IOException {
		
		//to read data from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.print("enter employee id : ");
		id = Integer.parseInt(bufferedReader.readLine());
		System.out.print("enter employee name : ");
		name = bufferedReader.readLine();
		System.out.print("enter salary : ");
		salary = Float.parseFloat(bufferedReader.readLine());
		
		//accept dateOfJoining from keyboard
		System.out.println("<===== enter date of joining =====>");
		
		System.out.print("enter day : ");
		int date = Integer.parseInt(bufferedReader.readLine());
		
		System.out.print("enter month : ");
		int month = Integer.parseInt(bufferedReader.readLine());
		month--;
		
		System.out.print("enter year : ");
		int year = Integer.parseInt(bufferedReader.readLine());
		
		//store date of joining into calendar object
		dateOfJoining = Calendar.getInstance();
		dateOfJoining.set(year, month, date);
	}
}
