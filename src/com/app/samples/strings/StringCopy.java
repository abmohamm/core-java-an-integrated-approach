package com.app.samples.strings;

// TODO: Auto-generated Javadoc
/**
 * The Class StringCopy.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class StringCopy {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello, This is a book on Java!!!";
		char arr[] = new char[20];
		
		//	copy from string into array starting from 7th character to 20th character
		str.getChars(7,  21, arr, 0);
		
		System.out.println(arr);
	}

}
