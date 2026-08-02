//calling super class default constructor from sub class
package com.app.samples.inheritance;

class DefaultConstructorOne {
	
	//super class default constructor
	DefaultConstructorOne() {
		System.out.println("<===== DefaultConstructorOne =====>");
	}
}

class DefaultConstructorTwo extends DefaultConstructorOne {
	
	//sub class default constructor
	DefaultConstructorTwo() {
		System.out.println("<===== DefaultConstructorTwo =====>");
	}
}
public class DefaultConstructorDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create sub class object - super class constructor will be called by default
		DefaultConstructorTwo defaultConstructorTwo = new DefaultConstructorTwo();
	}

}
