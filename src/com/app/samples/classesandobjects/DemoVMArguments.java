package com.app.samples.classesandobjects;

/**
 * The Class DemoVMArguments.
 */
public class DemoVMArguments {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		PersonThree person = new PersonThree(name, age);
		person.check();
	}

}

/**
 * The Class PersonThree.
 */
class  PersonThree {
	
	//	instance variables
	private String name;
	private int age;
	
	/**
	 * Instantiates a new person three.
	 *
	 * @param name the name
	 * @param age the age
	 */
	//	parameterized constructor
	PersonThree(String name,  int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Check.
	 */
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