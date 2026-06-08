package com.app.samples.relationshipbetweenobjects;

//Relating ObjectTwo with ObjectOne 
class ObjectOne {
	
	//instance variables
	int x;
	ObjectTwo two;	//class ObjectTwo's reference
	
	//constructor that receives ObjectTwo's reference
	ObjectOne(ObjectTwo two) {
		//copy ObjectTwo's reference into two.
		this.two = two;
		x = 10;
	}
	
	//method to display class ObjectOne and class ObjectTwo variables
	void display() {
		System.out.println("ObjectOne's x : " + x);
		//call ObjectTwo's method
		two.display();
		//access ObjectTwo's variable
		System.out.println("ObjectTwo's y calling from ObjectOne: " + two.y);
	}
}

class ObjectTwo {
	
	//instance variable
	int y;
	//initialize y
	ObjectTwo(int y) {
		this.y =  y;
	}
	
	//method to display y
	void display() {
		System.out.println("ObjectTwo's y : " + y);
	}
}

// TODO: Auto-generated Javadoc
/**
 * The Class RelateObjects.
 */
public class RelateObjects {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create ObjectTwo object and store 22 there
		ObjectTwo two = new ObjectTwo(22);
		
		//create ObjectOne object and pass ObjectTwo object to it
		ObjectOne one = new ObjectOne(two);
		
		//call ObjectOne's method
		one.display();
	}

}
