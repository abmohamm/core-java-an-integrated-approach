package com.app.samples.inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoArithmetic.
 */
public class DemoArithmetic {

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
		System.out.print("enter 2 numbers : ");
		String input = br.readLine();
		//	use StringTokenizer to split string into tokens
		StringTokenizer stringTokenizer = new StringTokenizer(input, ",");
		String t1 = stringTokenizer.nextToken().trim();
		String t2 = stringTokenizer.nextToken().trim();
		
		double num1 = Double.parseDouble(t1);
		double num2 = Double.parseDouble(t2);
		
		//	arithmetic operations
		System.out.println("addition : " + (num1 + num2));
		System.out.println("subtraction : " + (num1 - num2));
		System.out.println("multiplication : " + (num1 * num2));
		System.out.println("division : " + (num1 / num2));
		
	}

}
