//By default sub class members are accessible to sub class object
package com.app.samples.inheritance;

class DemoOne {
	
	//super class var
	int i = 10;
	
	//super class method
	void show() {
		System.out.println("super class method : " + i);
	}
	
}

class DemoTwo extends DemoOne{
	
	//sub class var
	int i = 20;
	
	//sub class method
	void show() {
		System.out.println("sub class method : " + i);
	}
	
}

public class WithoutSuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create sub class object
		DemoTwo two = new DemoTwo();
		
		//This will call sub class method only
		two.show();
	}

}
