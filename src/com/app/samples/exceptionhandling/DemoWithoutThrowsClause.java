//Not handling the exception, nor throwing.
package com.app.samples.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * The Class Sample.
 */
class Sample {
	
	//instance variable
	private String name;
	
	//method to accept name
	void accept() {
		//to accept data from keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		System.out.println("Enter name : ");
		name = bufferedReader.readLine();
	}
	
	//method to display name
	void display() {
		System.out.println("Name : " + name);
	}
}

/**
 * The Class DemoWithoutThrowsClause.
 */
public class DemoWithoutThrowsClause {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		sample.accept();
		sample.display();
	}

}
