package com.app.samples.strings;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoStringMethods.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoStringMethods {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	create strings in 3 ways
		String s1 = "A book on Java";
		String s2 = new String("I like it");
		char arr[] = {'D', 'r', 'e', 'a', 'm', 't', 'e', 'c', 'h', ' ', 'p', 'r', 'e', 's', 's'};
		String s3 = new String(arr);
		String s4 = "publisher";
		
		String c1 = "test";
		String c2 = "text";
		String c3 = "tent";
		String c4 = "TEXT";
		
		//	display all the 3 strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//	find length of string
		System.out.println("length of s1 : " + s1.length());
		
		//	concatenates 2 strings
		System.out.println("s1 & s2 joined : " + s1.concat(", " + s2));
			
		//	concatenates with + operator
		System.out.println(s3 + " " + s4);
		System.out.println(s1 + " from " + s3);
		
		//	compare 2 strings
		System.out.println("comparing c1 & c2 : " + c1.compareTo(c2));
		System.out.println("comparing c2 & c3 : " + c2.compareTo(c3));
		System.out.println("comparing c3 & c4 : " + c2.compareToIgnoreCase(c4));
		
		//	test if a string s1 starts with a character
		boolean x = s1.startsWith("A");
		if(x) {
			System.out.println("s1 starts with \'A\'");
		} else {
			System.out.println("s1 does not start with \'A\'");
		}
		
		//	tests occurrence of a string
		String st1 = "This is a book";
		System.out.println(st1.indexOf("x"));
		System.out.println(st1.indexOf("b"));
		
		System.out.println(st1.lastIndexOf("i"));
		System.out.println(st1.lastIndexOf("y"));
		
		String str1 = "hello";
		System.out.println(str1.replace("l", "x"));
		
		//	extract the substring from s2, starting from 0th char to 6th char
		String p = s2.substring(0, 7);
		
		//	extract the substring from s3, starting from 0th char to 8th char
		String q = s3.substring(0, 9);
		
		System.out.println(p + q);
		
		System.out.println(st1.substring(5));
		
		//	convert s1 into upper-case and lower-case
		System.out.println("Upper s1 : " + s1.toUpperCase());
		System.out.println("Lower s1 : " + s1.toLowerCase());
	}

}
