package com.app.samples.typecasting;

//narrowing using sub class object
class DemoSeven {
	
	void showSeven() {
		System.out.println("<===== super class method =====>");
	}
}

class DemoEight extends DemoSeven{
	
	void showEight() {
		System.out.println("<===== sub class method =====>");
	}
}

public class DemoNarrowingCastingfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSeven demoSeven;	//super class reference
		demoSeven = new DemoEight();	//super class reference referring to sub class object
		DemoEight demoEight = (DemoEight)demoSeven;	//converting super class reference - narrowing
		demoEight.showSeven();
		demoEight.showEight();
	}

}
