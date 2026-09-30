//Let us write a super class with a method inside it.
package com.app.samples.enumerationsandannotations;

class One {
	
	void doSomething() {
		System.out.println("super class");
	}
}

//sub-class method should override the super-class method
class Two extends One {
	
	@Override
	void doSomething() {
		System.out.println("overriding sub class");
	}
	
	//@Override - enabling this annotation gives error
	void dosomething() {
		System.out.println("sub class");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Two two = new Two();
		two.dosomething();
	}

}
