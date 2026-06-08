package com.app.samples.relationshipbetweenobjects;

// TODO: Auto-generated Javadoc
//Relating objects of three classes
class OneObject {
	
	//secondObject is SecondObject class reference
	SecondObject secondObject;
	
	//initialize secondObject
	OneObject(SecondObject secondObject) {
		this.secondObject = secondObject;
	}
	
	double cube(double x) {
		//call SecondObject class method using secondObject
		double result = x*secondObject.square(x);
		
		//return result to DemoRelateObjects class
		return result;
	}
	
}

class SecondObject {
	
	//threeObject is ThreeObject's reference
	ThreeObject threeObject;
	
	//initialize threeObject
	SecondObject(ThreeObject threeObject) {
		this.threeObject = threeObject;
	}
	
	double square(double x) {
		
		//call ThreeObject's method using threeObject
		double result = x*threeObject.get(x);
		
		//return result to OneObject
		return result;
	}
	
}

class ThreeObject {
	
	double get(double x) {
		//just return x value to SecondObject
		return x;
	}
}

/**
 * The Class DemoRelateObjects.
 */
public class DemoRelateObjects {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create ThreeObject's object threeObject
		ThreeObject threeObject = new ThreeObject();
		
		//create SecondObject's object secondObject and pass threeObject
		SecondObject secondObject = new SecondObject(threeObject);
		
		//create OneObject's object and pass secondObject
		OneObject oneObject = new OneObject(secondObject);
		
		//	oneObject = new OneObject(new SecondObject(new ThreeObject()));
		
		//call cube method of OneObject
		double result = oneObject.cube(5);
		System.out.println("cube of 5 : " + result);
		
		//call square method of SecondObject
		result = secondObject.square(6);
		System.out.println("square of 6 : " + result);
	}

}
