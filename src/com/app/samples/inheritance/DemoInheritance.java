package com.app.samples.inheritance;

//Shape is super class for Square
//Square is super class for Rectangle
class Shape {
	
	//take protected type var
	protected double length;
	
	//parameterized constructor
	Shape(double length) {
		this.length = length;
	}
}

class Square extends Shape {

	//call Shape's constructor and send length value
	Square(double length) {
		super(length);
	}
	
	//calculate area of square
	void area() {
		// 'length' of Shape class is available to Square class
		System.out.println("Area of Square : " + (length * length));
	}
	
}

class Rectangle extends Square {

	//var
	private double breadth;
	
	//call square's constructor and send length value
	Rectangle(double length, double breadth) {
		super(length);
		this.breadth = breadth;
	}
	
	//calculate area of rectangle
	void area() {
		// 'length' of Shape class is available to Rectangle class
		System.out.println("Area of Rectangle : " + (length * breadth));
	}
}

public class DemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//display area of square
		Square square = new Square(5.5);
		square.area();
		
		//display area of rectangle
		Rectangle rectangle = new Rectangle(5.5, 6);
		rectangle.area();
	}

}
