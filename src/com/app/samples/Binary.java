package com.app.samples;

// TODO: Auto-generated Javadoc
/**
 * The Class Binary.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project
 */
public class Binary {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int num = 0b1010;
		
		System.out.printf("\nIn Decimal = %d", num);
		System.out.printf("\nIn Octal = %o", num);
		System.out.printf("\nIn HexaDecimal = %x", num);
		System.out.printf("\nIn Binary = %s", Integer.toBinaryString(num));
	}
}
