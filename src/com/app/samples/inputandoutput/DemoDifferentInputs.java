package com.app.samples.inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoDifferentInputs.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoDifferentInputs {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println();
		// connecting inputstream to a keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		//	To accept data from the keyboard
		BufferedReader br = new BufferedReader(streamReader);
		//	input separated by commas
		System.out.println("enter name, age, salary : ");
		//	accept input into a string
		String input = br.readLine();
		//	use StringTokenizer to split string into tokens
		StringTokenizer stringTokenizer = new StringTokenizer(input, ",");
		
		//	3 tokens - name, age and salary
		String t1 = stringTokenizer.nextToken();
		String t2 = stringTokenizer.nextToken();
		String t3 = stringTokenizer.nextToken();
		
		//	trim any spaces before and after each token
		String name = t1.trim();
		int age = Integer.parseInt(t2.trim());
		float salary = Float.parseFloat(t3.trim());
		
		//	display entered data
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
	}

}
