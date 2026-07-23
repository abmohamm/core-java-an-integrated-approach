package com.app.samples.exceptionhandling;

//Rethrowing an exception
class RethrowException {
	
	void rethrowException() {
		char ch = ' ';
		try {
			//take a string with five chars. Their index will be from 0 to 4.
			String str = "Hello";
			
			//exception will be thrown here because there is no index with the value 5
			ch = str.charAt(5);
		} catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
			System.out.println("Please see the index is within the range");
			throw stringIndexOutOfBoundsException;	//rethrow exception
		}
	}
}

public class DemoRethrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object to RethrowException and call method rethrowException
		RethrowException rethrowException = new RethrowException();
		
		try {
			rethrowException.rethrowException();
		}	//rethrown exception is caught by the beloww catch block 	
		catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
			System.out.println(stringIndexOutOfBoundsException.getMessage());
			System.out.println("rethrown exception from class - RethrowException is caught here!!!");
		}
	}

}
