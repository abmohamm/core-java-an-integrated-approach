package com.app.samples.polymorphism;

//Static polymorphism
class OneSample {
	
	//method to calculate square value
	static void calculate(double x) {
		System.out.println("Square value : " + (x*x));
	}
}

class TwoSample extends OneSample {
	
	//method to calculate square root value
	static void calculate(double x) {
		System.out.println("Square root value : " + Math.sqrt(x));
	}
}

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//super class reference refers to sub class object
		OneSample sample = new TwoSample();
		
		//call calculate() method using super class reference
		sample.calculate(25);
		
		
	}

}
