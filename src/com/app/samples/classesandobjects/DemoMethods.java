package com.app.samples.classesandobjects;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoMethods.
 */
public class DemoMethods {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//	create PersonTwo class object
		PersonTwo personTwo = new PersonTwo();
		
		//	accept  person data
		personTwo.accept();
		
		//	check age
		personTwo.check();
	}

}

/**
 * The Class PersonTwo.
 */
class PersonTwo {
	
	//	instance variables
	private String name;
	private int age;
	
	/**
	 * Accept.
	 *
	 * @throws Exception the exception
	 */
	public void accept() throws Exception {
		
		//	To accept data from keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		
		//	accept name and age
		System.out.print("Enter name : ");
		name = bufferedReader.readLine();
		
		System.out.print("Enter age : ");
		age = Integer.parseInt(bufferedReader.readLine());
	}
	
	//	To check the age and display He is young, middle aged or old
	public void check() {
		if(age <= 30) {
			System.out.println(name + " is Young!!!");
		} else if(age <= 50) {
			System.out.println(name + " is middle aged!!!");
		} else {
			System.out.println(name + " is old!!!");
		}
	}
}
