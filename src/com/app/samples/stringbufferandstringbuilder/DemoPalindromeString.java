package com.app.samples.stringbufferandstringbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoPalindromeString.
 */
public class DemoPalindromeString {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//	accept string from  keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(streamReader);
		
		System.out.print("enter a string : ");
		String str = br.readLine();
		
		//	store a copy of original string in temp
		String temp = str;
		
		//	convert the string into stringbuffer
		StringBuffer sb = new StringBuffer(str);
		
		//	now reverse the string in stringbuffer
		sb.reverse();
		
		//	convert the stringbuffer into string
		str = sb.toString();
		
		//	compare original string available in temp with str
		if(temp.equalsIgnoreCase(str)) {
			System.out.print("entered string is palindrome");
		} else {
			System.out.print("entered string is not palindrome");
		}
	}

}
