package com.app.samples.strings;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoMutability.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoMutability {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "data";
		String s2 = "base";
		
		//	join s1 and s2, store in s1
		s1 = s1 + s2;
		System.out.println(s1);
	}

}
