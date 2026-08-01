//A string broken into pieces at spaces
package com.app.samples.collectionframework;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//take a string
		String str = "He is a gentle man!!! Thanks, Abid";
		
		//break into tokens at spaces. Here delimiters are space, exclamation mark, comma
		StringTokenizer stringTokenizer = new StringTokenizer(str, " !,");
		
		//retrieve the tokens from stringTokenizer and display
		System.out.println("The tokens are : ");
		
		while(stringTokenizer.hasMoreTokens()) {
			String token = stringTokenizer.nextToken();
			System.out.println(token);
		}
	}

}
