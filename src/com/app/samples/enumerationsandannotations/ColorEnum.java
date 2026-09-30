//create a Color enumeration with color names as constants
package com.app.samples.enumerationsandannotations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

enum Color {
	
	RED, GREEN, BLUE, WHITE, BLACK;
}

//we want to use the Color enumeration in this class
public class ColorEnum {

	//enumeration constant is declared as instance variable
	Color color;
	
	//initialize the variable
	ColorEnum(Color color) {
		this.color = color;
	}
	
	/*This method displays the color name depending on the constant.
	  if BLACK COLOR is given, it will display 'Not a good color'*/
	void display() {
		
		switch(color) {
			
			case RED : 
				System.out.println("Red color");
				break;
				
			case GREEN : 
				System.out.println("Green color");
				break;
			
			case BLUE :
				System.out.println("Blue color");
				break;
				
			case WHITE :
				System.out.println("White color");
				break;
			
			default :
				System.out.println("Not a good color");
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a ColorEnum object and pass a color as choice
		ColorEnum colorEnum = new ColorEnum(Color.GREEN);
		
		//call display method to display the color name
		colorEnum.display();
	}

}
