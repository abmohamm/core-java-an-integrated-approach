package com.app.samples.inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeData.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class EmployeeData {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println();
		// connecting inputstream to a keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		//	To accept data from the keyboard
		BufferedReader br = new BufferedReader(streamReader);
		//	accept employee details
		System.out.print("enter id : ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.println("enter gender : ");
		// Solution 1 - Accepts single character while accepting input string, for example gender.
		char gender = br.readLine().charAt(0);
		// skip 2 characters (\ and n, which is released for every enter hit)
		//	br.skip(2);
		
		System.out.println("enter name : ");
		String name = br.readLine();
		
		//	employee details
		System.out.println("Id : " + id);
		System.out.println("Gender : " + gender);
		System.out.println("Name : " + name);
		
	}

}
