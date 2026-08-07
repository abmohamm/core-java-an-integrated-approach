//Generating random numbers between 0 and 10
package com.app.samples.wrapperclasses;

//Generating random numbers between 0 and 10
public class DemoMathRandom {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Random numbers between 0 and 10 : ");
		
		while(true) {
			/* random() returns double type between 0 and 1. But We want the numbers as integer and between 0 and 10.
			   So multiply it by 10 and convert into int */
			double d = 10 * Math.random();
			int integer = (int)d;
			System.out.println(integer);
			
			//Let the execution wait till 2000 milli seconds = 2 seconds
			Thread.sleep(2000);
			
			if(integer == 0) {
				System.exit(0);	//come out
			}
		}//end of while
	}

}
