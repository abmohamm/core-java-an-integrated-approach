package com.app.samples.inputandoutput;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoUtilScanner.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoUtilScanner {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("enter id, name, sal : ");
		//	Scanner reads input while assuming whitespace as default delimiter. 
		//	To change , useDelimiter() method can be used
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.next();
		float sal = sc.nextFloat();
		
		System.out.println("id  : " + id);
		System.out.println("name : " + name);
		System.out.println("sal : " + sal);
	
		sc.close();
	}

}
