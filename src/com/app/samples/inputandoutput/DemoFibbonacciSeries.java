package com.app.samples.inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoFibbonacciSeries.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */

public class DemoFibbonacciSeries {

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
		System.out.println("How many fibbonacci's : ");
		int n = Integer.parseInt(br.readLine());
		
		//	first 2 fibbonacci's are 0 and 1
		long f1 = 0, f2 = 1;
		System.out.print(f1 + ", " + f2 + ", ");
		//	next number
		long f = f1 + f2;
		System.out.print(f + ", ");
		
		//	already 3 fibbonacci's are displayed, so count will start at 3
		int count = 3;
		while(count < n) {
			f1 = f2;
			f2 = f;
			f = f1+f2;
			if((count+1) == n) {
				System.out.println(f);
			} else {
				System.out.print(f + ", ");
			}
			count++;
		}
		
	}

}
