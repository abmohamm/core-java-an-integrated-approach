package com.app.samples.inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoLeapYear.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */

public class DemoLeapYear {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws NumberFormatException the number format exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println();
		// connecting inputstream to a keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		//	To accept data from the keyboard
		BufferedReader br = new BufferedReader(streamReader);
		System.out.println("enter year : ");
		int year = Integer.parseInt(br.readLine());
		
		if(year % 100 == 0 && year % 400 == 0) {	//	if it is century and divisible by 400
			System.out.println("It is leap year");
		} else if(year % 100 != 0 && year % 4 == 0) {	//	if it is not a century year but divisible by 4
			System.out.println("It is leap year");
		} else {
			System.out.println("Not a leap year!!!");
		}
	}

}
