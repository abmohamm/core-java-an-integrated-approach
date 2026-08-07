//class UseAccessSpecifier of same package
package com.app.samples.packages;

public class UseAccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//access members of class AccessSpecifier
		AccessSpecifier accessSpecifier = new AccessSpecifier();
		
		System.out.println(accessSpecifier.b);
		System.out.println(accessSpecifier.c);
		System.out.println(accessSpecifier.d);
		System.out.println(accessSpecifier.a);
	}

}
