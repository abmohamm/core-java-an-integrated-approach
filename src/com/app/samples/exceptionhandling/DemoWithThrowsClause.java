//Not handling the exception - Using throws clause
package com.app.samples.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Class SampleTwo.
 */
class SampleTwo {
	
	//instance variable
	private String name;
	
	//method to accept name
	void accept() throws IOException {
		//to accept data from keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		System.out.print("Enter name : ");
		name = bufferedReader.readLine();
	}
	
	//method to display name
	void display() {
		System.out.println("Name : " + name);
	}
}

/**
 * The Class DemoWithThrowsClause.
 */
public class DemoWithThrowsClause {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SampleTwo sampleTwo = new SampleTwo();
		sampleTwo.accept();
		sampleTwo.display();
	}

}
