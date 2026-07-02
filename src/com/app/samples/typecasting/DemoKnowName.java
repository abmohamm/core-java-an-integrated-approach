package com.app.samples.typecasting;

//using getClass() to know the classname
//MyclassOne stores an int value
class MyclassOne {
	int x;
	MyclassOne(int x) {
		this.x = x;
	}
}

//class contains method to receive an object and display class name
class KnowName {
	
	static void printName(Object object) {
		//get class name into object className of class Class
		Class<?> cls = object.getClass();
		
		//get name of class using getName() method
		String name = cls.getSimpleName();
		System.out.println("class name: " + name);
		
		name = cls.getCanonicalName();
		System.out.println("canonical name : " + name);
		
		name = cls.getPackageName();
		System.out.println("package name : " + name);
		
		name = cls.getName();
		System.out.println("full class name : " + name);
	}
}

public class DemoKnowName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create MyclassOne object
		MyclassOne one = new MyclassOne(10);
		
		//know the class name of the object one by calling prineName() method
		KnowName.printName(one);
	}

}
