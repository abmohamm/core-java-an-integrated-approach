//Accepting a single character from keyboard
package com.app.samples.inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoAcceptCharacter.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoAcceptCharacter {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println();
		// connecting inputstream to a keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		//	To accept data from the keyboard
		BufferedReader br = new BufferedReader(streamReader);
		//ask for character and read it
		System.out.print("Enter a character : ");
		char ch = (char)br.read();
		//display the character
		System.out.println("You entered : " + ch);
	}

}
