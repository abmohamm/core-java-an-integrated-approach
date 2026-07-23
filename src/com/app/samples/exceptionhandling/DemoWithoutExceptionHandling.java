package com.app.samples.exceptionhandling;

public class DemoWithoutExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open the files
		System.out.println("Open files");
		
		//do some processing
		int n = args.length;
		System.out.println("number of arguments : " + n);
		int a = 45/n;
		System.out.println("a : " + a);
		
		//close the files
		System.out.println("Close files");
	}

}
