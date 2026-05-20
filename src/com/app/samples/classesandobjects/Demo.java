package com.app.samples.classesandobjects;

//TODO: Auto-generated Javadoc
/**
* The Class Demo.
*/
public class Demo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//	create person class object raju
		Person raju = new Person();
		
		//	find the hashcode of the object
		System.out.println("Raju Hashcode : " + raju.hashCode());
		//	raju.name = "raju";
		//	raju.age = 22;
		raju.talk();
		
		//	create person class object sita
		Person sita = new Person("Sita", 20);
		//	find the hashcode of the object
		System.out.println("Sita Hashcode : " + sita.hashCode());
		sita.talk();
	}

}

/**
 * The Class Person.
 */
//	creating a class and object
class Person {
	
	//	properties - variables
	private String name;
	private int age;
	
	/**
	 * Instantiates a new person.
	 */
	//	default constructor
	Person() {
		name = "Raju";
		age = 22;
	}
	
	//	parameterized constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Talk.
	 */
	//	actions - methods
	void talk() {
		System.out.println("Hello I am : " + name);
		System.out.println("My age is : " + age);
	}
}