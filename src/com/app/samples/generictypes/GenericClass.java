//A generic class - to store any type of object
//here, T is generic parameter which determines the datatype
package com.app.samples.generictypes;

class MyClass<T> {
	
	//declare T type object
	T object;
	
	//constructor to initiate T type object
	MyClass(T object) {
		this.object = object;
	}
	
	//A method which returns T type object
	T getObject() {
		return object;
	}
}

public class GenericClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//create Integer class object
		Integer integerValue = 12;	//same as : Integer integerValue = new Integer(12);
		//create MyClass object and store Integer object in it
		MyClass<Integer> integerObject = new MyClass<>(integerValue);
		//retrieve Integer object by calling getObject method
		System.out.println("U stored : " + integerObject.getObject());
		
		//In the same way, Use MyClass for storing Float object and retrieve it
		Float floatValue = 12.123f;	//same as : Float floatValue = new Float(12.123f);
		MyClass<Float> floatObject = new MyClass<>(floatValue);
		System.out.println("U stored : " + floatObject.getObject());
		
		//In the same way, Use MyClass for storing String object and retrieve it
		String stringValue = "Abid Md";
		MyClass<String> stringObject = new MyClass<>(stringValue);
		System.out.println("U stored : " + stringObject.getObject());
	}

}
