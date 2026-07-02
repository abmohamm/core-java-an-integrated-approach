package com.app.samples.typecasting;

//Widening using referenced data types
class DemoOne {
	void showOne() {
		System.out.println("<======== super class method ========>");
	}
}

class DemoTwo extends DemoOne {
	void showTwo() {
		System.out.println("<======== sub class method ========>");
	}
}

//widening without overriding super class methods
public class DemoWideningCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoOne demoOne;	//super class reference
		demoOne = (DemoOne)new DemoTwo();	//demoOne is referring to sub class object - Widening
		demoOne.showOne();
		
	}

}
