package com.app.samples.wrapperclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Creating Byte class objects and comparing them
public class DemoByteTest {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to accept data from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//accept a byte number as string s1
		System.out.print("Enter a byte no : ");
		String s1 = bufferedReader.readLine();
		//create byte object b1 using s1
		Byte b1 = Byte.valueOf(s1);
		System.out.println("s1 in primitive byte representation : " + Byte.parseByte(s1));
		
		//accept another byte number as s2
		System.out.print("Enter a byte no : ");
		String s2 = bufferedReader.readLine();
		//create byte object b2 using s2
		Byte b2 = Byte.valueOf(s2);
		System.out.println("s2 in primitive byte representation : " + Byte.parseByte(s2));
		
		//compare both the Byte objects contents
		int n = b1.compareTo(b2);
		
		if(n == 0) {
			System.out.println("Both bytes are same");
		} else if(n < 0) {
			System.out.println(b1 + " is lesser!!!");
		} else {
			System.out.println(b2 + " is lesser");
		}
		
	}

}
