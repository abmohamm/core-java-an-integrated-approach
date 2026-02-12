package com.app.samples.strings;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoSplitString.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoSplitString {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	take a string which is to be broken
		String str = "Hello, This is a book on Java";
		
		//	declare a string type array s to store pieces
		String s[];
		
		//	split the string where a space is found in str
		s = str.split(" ");
		
		//	display pieces from s
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
