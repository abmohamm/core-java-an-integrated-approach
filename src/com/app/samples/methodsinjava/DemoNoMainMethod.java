package com.app.samples.methodsinjava;

/**
 * The Class DemoNoMainMethod.
 */
//No main() method
public class DemoNoMainMethod {
	
	static {
		System.out.println("static block without main method");
		//terminating JVM before it realizes that there is no main method
		System.exit(0);
	}
}
