package com.app.samples.typecasting;

//equals() method
//Myclass that stores integer value
class Myclass {
	int x;
	
	Myclass(int x) {
		this.x = x;
	}
}

public class DemoObjectMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create two objects of Myclass with same content
		//In this case, references of objects will be different
		Myclass object1 = new Myclass(15);
		Myclass object2 = new Myclass(15);
		
		//create two wrapper class objects and store same content
		//In this case, references of objects will be different
		Integer object3 = Integer.valueOf(15);
		Integer object4 = Integer.valueOf(15);

		if(object1.equals(object2)) {
			System.out.println("object1 & object2 are same!!!");
		} else {
			System.out.println("object1 & object2 are not same!!!");
		}
		
		if(object3.equals(object4)) {
			System.out.println("object3 & object4 are same");
		} else {
			System.out.println("object3 & object4 are not same");
		}
	}

}
