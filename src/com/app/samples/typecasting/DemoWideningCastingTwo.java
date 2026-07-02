package com.app.samples.typecasting;

//widening using referenced data types
class DemoThree {
	
	void showThree() {
		System.out.println("<====== super class method ======>");
	}
}

class DemoFour extends DemoThree {
	
	//overriding super class method
	void showThree() {
		System.out.println("<====== sub class method ======>");
	}
}

public class DemoWideningCastingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoThree demoThree;	//super class reference
		demoThree = (DemoThree)new DemoFour();		//demoThree referring to sub class object
		demoThree.showThree();//method calls referring to sub class as super class method is overridden
		
	}

}
