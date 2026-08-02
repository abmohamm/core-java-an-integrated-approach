//calling super class parameterized constructor from sub class
package com.app.samples.inheritance;

class ParameterizedConstructorOne {
	
	//super class var
	int i;
	
	//super class para constructor
	ParameterizedConstructorOne(int i) {
		this.i = i;
	}
}

class ParameterizedConstructorTwo extends ParameterizedConstructorOne {

	//sub class var
	int i;
	
	//sub class para constructor
	ParameterizedConstructorTwo(int a, int b) {
		// TODO Auto-generated constructor stub
		super(a);	//call super class constructor and pass a
		i = b;	//initialize sub class var		
	}
	
	//sub class method
	void show() {
		System.out.println("sub class i : " + i);
		System.out.println("super class i : " + super.i);
	}
	
}

public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create sub class object
		ParameterizedConstructorTwo constructorTwo = new ParameterizedConstructorTwo(11, 22);
		
		//call sub class method
		constructorTwo.show();
	}

}
