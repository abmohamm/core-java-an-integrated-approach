//Serialization -> to  store employee objects into objectFile
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class DemoSerialization {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to read data from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/object-file.txt
		String fileName = bufferedReader.readLine();
		
		//connect FileOutputStream to the object-file
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		
		//connect ObjectOutputStream to fileOutputStream
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		//ask how many employees
		System.out.print("How many employees? : ");
		int employeeCount = Integer.parseInt(bufferedReader.readLine());
		
		//do  for employeeCount employees
		for(int i = 0; i < employeeCount; i++) {
			
			//create Employee object
			Employee employee = new Employee();
			
			//store data into e
			employee.getData();
			
			//write data from employee into object-file
			objectOutputStream.writeObject(employee);
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		objectOutputStream.close();		
	}

}
