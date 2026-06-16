package com.app.samples.polymorphism;

//Dynamic polymorphism
class SampleTwo {
	
	//method to calculate square value
	void calculate(double x) {
		System.out.println("Square value : " + (x*x));
	}
}

class SampleThree extends SampleTwo {
	
	//method to calculate square root value
	void calculate(double x) {
		super.calculate(x);
		System.out.println("Square root value : " + Math.sqrt(x));
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create sub class object
		SampleThree sample = new SampleThree();
	
		//call calculate() method using sample object
		sample.calculate(25);

	}

}
