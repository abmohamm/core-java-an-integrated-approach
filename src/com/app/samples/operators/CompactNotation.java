package com.app.samples.operators;

// TODO: Auto-generated Javadoc
/**
 * The Class CompactNotation.
 */
public class CompactNotation {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		notation();
	}
	
	/**
	 * Notation.
	 */
	public static void notation() {
		int x = 1;
		x += 10; //	x = x+10;
		System.out.println("x : " + x);
		
		int sal = 1000;
		sal *= 12;	//	sal = sal * 12;
		System.out.println("Sal : " + sal);
		
		int val = 1000;
		int discount = 100;
		val -= discount;	//	val =  val - discount;
		System.out.println("Val : " + val);
		
		int p = 100;
		p /= 10;	//	p = p / 10;
		System.out.println("p : " + p);
	
		int num = 10;
		num %= 5;	//	num = num % 5;
		System.out.println("num : " + num);
	}

}
