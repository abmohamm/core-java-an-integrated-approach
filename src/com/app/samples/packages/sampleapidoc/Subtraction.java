//Subtraction.java
//Adding another class to package : com.app.samples.packages.sampleapidoc
/** This package is useful to perform some arithmetic calculations. 
 *  It has two classes by the name Addition and Subtraction	*/
package com.app.samples.packages.sampleapidoc;

/**	This class is useful to calculate difference of two numbers.	*/
public class Subtraction {
	
	/**
     * Default constructor for Subtraction.
     */
    public Subtraction() {
        // Explicit constructor satisfies the Javadoc compiler
    }
	/**	This method is useful  to subtract a number from another and return the result	
	 
	 <br>Parameters : double x, double y
	 <br>Return type : double
	 <br>Exceptions : nil	
	 @param x operand for subtraction, 
	 @param y operand for subtraction
	 @return {@code (x-y)}.
	 */
	public static double difference(double x, double y) {
		return (x-y);
	}
}
