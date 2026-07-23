package com.app.samples.exceptionhandling;

//Handling multiple exceptions using try, catch and finally blocks
public class DemoMultipleExceptionsHandling {

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
			int b[] = {10, 20, 30};
			b[50] = 100;
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException exception) {
			//display the exception details
			System.out.println(exception);
			//display any message to the user
			System.out.println("Please pass data while running this program");
		} /*catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			//display the exception details
			arrayIndexOutOfBoundsException.printStackTrace();
			System.out.println("Please see that array index is within the range");
		}*/ finally {
			//close the files
			System.out.println("Close files");
		}
		
	}

}
