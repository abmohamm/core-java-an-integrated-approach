//De-Serialization -> to retrieve objects from object-file
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class DemoDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// TODO Auto-generated method stub
		//to read data from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/object-file.txt
		String fileName = bufferedReader.readLine();
		//connect FileInputStream to object-file
		FileInputStream fileInputStream = new FileInputStream(fileName);
		
		//connect ObjectInputStream to fileInputStream
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		//read objects from objectInputStream and store data into Employee object
		try {
			Employee employee = null;
			employee = (Employee)objectInputStream.readObject();
			while(employee != null) {
				employee.displayData();
				employee = (Employee)objectInputStream.readObject();
			}
		} catch(EOFException eofException) {
			System.out.println("End of file reached!!!");
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		objectInputStream.close();
	}

}
