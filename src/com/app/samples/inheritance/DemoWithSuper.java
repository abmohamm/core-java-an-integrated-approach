//super - to access the super class method and variable
package com.app.samples.inheritance;

class SuperOne {
	
	//super class var
	int i = 10;
	
	//super class method
	void show() {
		System.out.println("super class method : " + i);
	}
}

class SuperTwo extends SuperOne {
	
	//sub class var
	int i = 20;
	
	//sub class method
	void show() {
		System.out.println("sub class method : " + i);
		
		//using super to call super class method
		super.show();
		
		//using super to access super class var
		System.out.println("accessing super class variable : " + super.i);
	}
}

public class DemoWithSuper {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create sub class object
		SuperTwo two = new SuperTwo();
		
		//This will call sub class method only
		two.show();
	}

}
