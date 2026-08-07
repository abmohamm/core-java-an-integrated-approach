//Exception handling using try,catch and finally blocks
package com.app.samples.exceptionhandling;

//Exception handling using try,catch and finally blocks
public class DemoWithExceptionHandling {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			//open the files
			System.out.println("Open files");
			
			//do some processing
			int n = args.length;
			System.out.println("number of arguments : " + n);
			int a = 45/n;
			System.out.println("a : " + a);
		} catch(ArithmeticException arithmeticException) {
			//display the exception details
			System.out.println(arithmeticException);
			
			//display any message to the user
			System.out.println("Please pass data while running this program");
		} finally {
			//close the files
			System.out.println("Close files");
		}
		
	}

}
