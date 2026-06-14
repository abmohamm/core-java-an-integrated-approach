package com.app.samples.inheritance;

//super - to access super class members - constructors, variables or methods
class One {

	//super class var
	int i;
	
	//super class default constructor
	One() {
		System.out.println("<===== One's constructor =====>");
	}
	
	//super class parameterized constructor
	One(int i) {
		this.i = i;
	}
	
	//super class method
	void show() {
		System.out.println("super class method : i = " + i);
	}
}

//by default subclass members are accessible to subclass object
class Two extends One{
	
	//sub class var
	int i;
	
	//sub class default constructor
	Two() {
		System.out.println("<===== Two's constructor =====>");
	}
	
	//sub class parameterized constructor
	Two(int a, int b) {
		super(a);	//call super class constructor and pass a
		this.i = b;	//initialize the sub class variable
	}
	//sub class method
	void show() {
		System.out.println("sub class method : i = " + i);
		
		//using super to call super class method
		super.show();
		
		//using super to access super class variable
		System.out.println("super class variable : i = " + super.i);
	}
	
}

public class SuperOne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create sub class object
		Two two = new Two(11, 22);
		
		//this will call sub class method onlt
		two.show();
	}
}

