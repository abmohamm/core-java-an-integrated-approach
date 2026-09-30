//create enumeration with the name Icecream
package com.app.samples.enumerationsandannotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Icecream {
	
	//constants with values
	VANILLA(20.00), CHOCOLATE(22.50), STRAWBERRY(23.00), RASPBERRY(25.00);
	
	//an instance variable
	private double price;

	//A parameterized constructor which initializes price with price
	Icecream(double price) {
		
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	
	//A static method to display the price upon taking the sequence number
	static void getPrice(int itemNumber) {
		
		Icecream icecreams[] = Icecream.values();
		System.out.println("Pay Rs. " + icecreams[itemNumber].price);
	}
}	//end of enumeration

public class IcecreamEnum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		//display all the icecreams available from the enumeration
		System.out.println("AVAILABLE ICECREAMS : ");
		for(Icecream icecream : Icecream.values()) {
			
			//ordinal method starts counting from 0
			int itemNumber = icecream.ordinal();
			System.out.println(itemNumber + " " + icecream);
		}
		
		//get the user choice as a number
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Your choice : ");
		int choice = Integer.parseInt(bufferedReader.readLine());
		Icecream.getPrice(choice);
	}

}
