package com.app.samples.typecasting;

//narrowing using super class object
class DemoFive {
	
	void showFive() {
		System.out.println("<===== super class method =====>");
	}
}

class DemoSix extends DemoFive {
	
	void showSix() {
		System.out.println("<===== sub class method =====>");
	}
}

public class DemoNarrowingCasting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DemoSix demoSix;	//sub class reference
		demoSix = (DemoSix)new DemoFive();	//sub class reference referring to super class object - narrowing
		demoSix.showSix();
		
		
	}

}
