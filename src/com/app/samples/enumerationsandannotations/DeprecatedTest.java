//Example to understand deprecated annotation
package com.app.samples.enumerationsandannotations;

class Sample {
	
	@Deprecated
	void testDeprecated() {
		
		System.out.println("This method is deprecated!!!");
	}
}

public class DeprecatedTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		sample.testDeprecated();
	}

}
