package com.app.samples.wrapperclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Convert int into binary, hexadecimal and octal format
public class DemoConvert {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to accept data from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.print("Enter an integer : ");
		String str = bufferedReader.readLine();
		
		//convert string into int
		int num = Integer.parseInt(str);
		System.out.println("In decimal : " + num);
		
		//convert int into other systems
		str = Integer.toBinaryString(num);
		System.out.println("In binary : " + str);
		
		str = Integer.toHexString(num);
		System.out.println("In hexadecimal : " + str);
		
		str = Integer.toOctalString(num);
		System.out.println("In octal : " + str);
	}

}
