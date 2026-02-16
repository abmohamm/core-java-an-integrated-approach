package com.app.samples.stringbufferandstringbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoFullName.
 */
public class DemoFullName {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//	create empty stringbuffer object
		StringBuffer sb = new StringBuffer();
		
		//	to accept data from keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(streamReader);
		
		//	accept surname
		System.out.print("Enter surname : ");
		String surName = br.readLine();
		
		//	accept middlename
		System.out.print("Enter middlename : ");
		String middleName = br.readLine();
		
		//	accept lastname
		System.out.print("Enter lastname : ");
		String lastName = br.readLine();
		
		//	append surName to sb
		sb.append(surName);
		
		//	append lastName to sb
		sb.append(" " + lastName);
		
		//	display the name till now
		System.out.println("Name : " + sb);
		
		//	insert middleName after surName in sb
		int n = surName.length();
		
		//	insert middlename after nth character
		sb.insert(n, " " + middleName);
		
		//	display fullName
		System.out.println("Name : " + sb);
		
		//	reverse and display the name
//		System.out.println("In reverse : " + sb.reverse());
		
		System.out.println("string before reversal : " + sb);
		
		StringBuffer reversedString = new StringBuffer();
		
		//	manual string reversal
		for(int i = sb.toString().length() - 1; i >= 0; i--) {
			reversedString.append(sb.charAt(i));
		}
		
		//	reversedString
		System.out.println("reverse string : " + reversedString);
	}

}
