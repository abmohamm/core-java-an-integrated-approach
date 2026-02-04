package com.app.samples.arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class ClassTwo.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class ClassTwo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	string type array
		String names[] = {"Arif", "Asif", "Abid", "Akhil"};
		ClassOne.main(names);
	}

}

class ClassOne {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//	args contains names, display them
		for(String s : args) {
			System.out.print(s + " ");
		}
	}
}
