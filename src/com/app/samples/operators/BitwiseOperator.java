package com.app.samples.operators;

// TODO: Auto-generated Javadoc
/**
 * The Class BitwiseOperator.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project
 */
public class BitwiseOperator {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 10;
		byte y = 11;
		System.out.println();
		bitwiseOperation(x,y);
	}
	
	/**
	 * Bitwise operation.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public static void bitwiseOperation(byte x, byte y) {
		System.out.println("Binary representation of x : " + Integer.toBinaryString(x));
		System.out.println("Binary representation of y : " + Integer.toBinaryString(y));
		
		System.out.println("~x : " + (~x));
		System.out.println("Binary representation of ~x : " + Integer.toBinaryString((~x)));
		System.out.println("x & y : " + (x&y));
		System.out.println("Binary representation of x & y : " + Integer.toBinaryString((x&y)));
		System.out.println("x | y : " + (x|y));
		System.out.println("Binary representation of x | y : " + Integer.toBinaryString((x|y)));
		System.out.println("x ^ y : " + (x^y));
		System.out.println("Binary representation of x ^ y : " + Integer.toBinaryString((x^y)));
		System.out.println("x << 2 : " + (x<<2));
		System.out.println("Binary representation of x << 2 : " + Integer.toBinaryString((x<<2)));
		System.out.println("x >> 2 : " + (x>>2));
		System.out.println("Binary representation of x >> 2 : " + Integer.toBinaryString((x>>2)));
		System.out.println("x >>> 2 : " + (x>>>2));
		System.out.println("Binary representation of x >>> 2 : " + Integer.toBinaryString((x>>>2)));
	}

}
