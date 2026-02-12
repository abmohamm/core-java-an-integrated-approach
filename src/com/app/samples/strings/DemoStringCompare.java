package com.app.samples.strings;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoStringCompare.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoStringCompare {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";	//	String object is created and stored in String constant pool by JVM
		String s2 = new String("Hello");	//	String object is created on Heap memory
		
		if(s1 == s2) {	//	== compares references of object instead of contents
			System.out.println("Both are same");
		} else {
			System.out.println("Not same");
		}
		
		String names[] = {""};
		StringComparison.main(names);
	}

}

//TODO: Auto-generated Javadoc
/**
* The Class StringComparison.
* @author: DreamTech press
* @version: 1.0
* @title: DreamTech project 
*/
class StringComparison {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";	//	String object is created and stored in String constant pool by JVM
		String s2 = "Hello";	//	String object is created and stored in String constant pool by JVM
		
		if(s1 == s2) {
			System.out.println("Both are same");
		} else {
			System.out.println("Not same");
		}
		
	}
}
