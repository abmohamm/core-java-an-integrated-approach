package com.app.samples.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//	searching for a string - Linear search
// TODO: Auto-generated Javadoc
/**
 * The Class DemoLinearSearch.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoLinearSearch {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//	take a boolean variable
		boolean isFound = false;
		
		//	To accept data from keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(streamReader);
		
		//	how many strings
		System.out.print("how many strings ? : ");
		int num = Integer.parseInt(br.readLine());
		
		//	create a string type array with size n
		String str[] = new String[num];
		
		//	store strings into str[]
		for(int i = 0; i < num; i++) {
			System.out.print("enter a string : ");
			str[i] = br.readLine();
		}
		
		//	accept the string to search
		System.out.print("enter a string to search : ");
		String search = br.readLine();
		
		//	search for the string in str[]
		for(int i = 0; i < num; i++) {
			if(search.equalsIgnoreCase(str[i])) {
				System.out.println("found at position : " + (i+1));
				isFound = true;
			}
		}
		
		if(!isFound) {
			System.out.println("not found in the group!!!");
		}
	}

}
