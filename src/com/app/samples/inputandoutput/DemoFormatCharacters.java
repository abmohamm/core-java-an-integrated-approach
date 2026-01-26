package com.app.samples.inputandoutput;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoFormatCharacters.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoFormatCharacters {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		String st = "hello";
		int n = 65;
		float f = 15.1234f;
		/*	format characters : 
		 * %s - string, %c - char, %d - decimal number,
		 * %f - float number, %o - octal number, %b, %B - boolean value,
		 * %x, %X - hexadecimal number, %e, %E - number in scientific notation,
		 * %n - new line character */
		System.out.printf("String = %s%nnum = %d%nhexa decimal = %x%nfloat = %f", st, n, n, f);
	}

}
