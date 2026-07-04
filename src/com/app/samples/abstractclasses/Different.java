package com.app.samples.abstractclasses;

//all the objects need different implementations of the same method
abstract  class DemoAbstract {
	
	//this is abstract method
	abstract void calculate(double x);
}

class Square extends DemoAbstract {
	
	//calculate square value
	void calculate(double x) {
		System.out.println("square : " + (x*x));
	}
}

class SquareRoot extends DemoAbstract {
	
	//calculate square root value
	void calculate(double x) {
		System.out.println("square root : " + Math.sqrt(x));
	}
}

class Cube extends DemoAbstract {
	
	//calculate cube value
	void calculate(double x) {
		System.out.println("cube : " + (x*x*x));
	}
}

public class Different {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create sub class objects
		Square square = new Square();
		SquareRoot squareRoot = new SquareRoot();
		Cube cube = new Cube();
		
		//let the objects call and use calculate() method
		square.calculate(3);	//	calculate square
		squareRoot.calculate(4);	//	calculate squareroot
		cube.calculate(5);	//	calculate cube
	}

}
