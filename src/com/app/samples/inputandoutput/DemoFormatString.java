package com.app.samples.inputandoutput;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoFormatString.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoFormatString {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int i = 65;
		String st = "Hello";
		char ch = 'A';
		
		// formatted output string
		String str = String.format("i = %d%nst = %s%nch=%c", i, st, ch);
		System.out.println(str);
	}

}
