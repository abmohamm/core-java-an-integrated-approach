//A generic interface
package com.app.samples.generictypes;

interface Fruit<T> {
	
	//method that accepts any object
	void tellTaste(T fruit);	//public and abstract by default
}

//this class implements Fruit interface
class AnyFruit<T> implements Fruit<T> {


	public void tellTaste(T fruit) {

		// TODO Auto-generated method stub
		//know the class name of the object passed to this method
		String fruitName = fruit.getClass().getSimpleName();
		
		//then decide taste and display
		if(fruitName.equals("Banana")) {
			System.out.println("Banana is sweet");
		} else if(fruitName.equals("Orange")) {
			System.out.println("Orange is sour");
		}
	}
	
}

class Banana {}

class Orange {}

public class GenericInterface {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create Banana object and pass it to AnyFruit class
		Banana banana = new Banana();
		AnyFruit<Banana> bananaFruit = new AnyFruit();
		bananaFruit.tellTaste(banana);
	
		//create Orange object and pass it to AnyFruit class
		Orange orange = new Orange();
		AnyFruit<Orange> orangeFruit = new AnyFruit();
		orangeFruit.tellTaste(orange);
	}

}
