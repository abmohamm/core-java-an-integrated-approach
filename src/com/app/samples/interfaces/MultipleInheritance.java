package com.app.samples.interfaces;

//multiple inheritance using interfaces
interface Father {
	float HEIGHT = 6.2f;
	void height();
}

interface Mother {
	float HEIGHT = 5.8f;
	void height();
}

class Child implements Father, Mother {

	public void height() {
		// TODO Auto-generated method stub
		//child got average height of his parents
		float averageHeight = (Father.HEIGHT + Mother.HEIGHT)/2;
		System.out.println("Child's height : " + averageHeight);
	}	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.height();
	}

}
