package com.app.samples.wrapperclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Accept a character from keyboard and display what it is
public class DemoCharacterTest {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to accept a char from keyboard
		char ch;
		Character character;
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		
		while(true) {	//execute repeatedly
			System.out.print("enter a character : ");
			ch = (char)bufferedReader.read();
			character = Character.valueOf(ch);
			//test and display the type of character
			System.out.print("You entered : ");
			if(Character.isDigit(ch)) {
				System.out.println("a digit");
			} else if(Character.isUpperCase(ch)) {
				System.out.println("an uppercase letter");
			} else if(Character.isLowerCase(ch)) {
				System.out.println("a lowercase letter");
			} else if(Character.isSpaceChar(ch)) {
				System.out.println("a spacebar character");
			} else if(Character.isWhitespace(ch)) {
				System.out.println("a whitespace character");
				return;
			} else {
				System.out.println("Sorry, I don't know that character");
			}
			bufferedReader.skip(2);	//to  skip \n code from bufferedReader			
		}
	}
}
