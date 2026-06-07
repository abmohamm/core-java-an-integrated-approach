package com.app.samples.methodsinjava;

// TODO: Auto-generated Javadoc
// Accessor and Mutator methods
class Person {
	
	//instance variables
	private String name;
	private int age;
	
	//mutator methods to store data
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//accessor methods to store data
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

// TODO: Auto-generated Javadoc
/**
 * The Class DemoAccessorMutatorMethods.
 */
public class DemoAccessorMutatorMethods {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create empty person class object
		Person person = new Person();
		
		//store some data into person class
		person.setName("Raju");
		person.setAge(20);
		
		//access data from person
		System.out.println("Name : " + person.getName());
		System.out.println("Age : " + person.getAge());
	}

}
