package com.app.samples.packages;	//packages is the package name

//STEP 1: Creating a package with Addition class
public class Addition {
	
	//instance variables
	private double d1, d2;
	
	public Addition(double a, double b) {
		d1 = a;
		d2 = b;
	}
	
	//method to find sum of two numbers
	public void sum() {
		System.out.println("sum : " + (d1 + d2));
	}
}
