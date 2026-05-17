package com.app.samples.introductiontooops;

//TODO: Auto-generated Javadoc
/**
* The Class DemoPolymorphism.
*/
public class DemoPolymorphism {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square ref;
		ref = new Square();
		ref.calculate(2);
		
		ref = new Cube();
		ref.calculate(3);
		
	}

}

class Square {
	
	void calculate(int x) {
		System.out.println("square value : " + (x * x));
	}
	
}

class Cube extends Square {
	
	void calculate(int x) {
		System.out.println("cube value : " + (x * x * x));
	}
	
}