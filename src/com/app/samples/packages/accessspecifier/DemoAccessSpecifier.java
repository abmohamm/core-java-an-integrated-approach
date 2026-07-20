package com.app.samples.packages.accessspecifier;

import com.app.samples.packages.AccessSpecifier;

//class DemoAccessSpecifier of another package
public class DemoAccessSpecifier extends AccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//access the members of AccessSpecifier
		AccessSpecifier accessSpecifier = new AccessSpecifier();
		System.out.println(accessSpecifier.a);
		System.out.println(accessSpecifier.b);
		System.out.println(accessSpecifier.c);
		System.out.println(accessSpecifier.d);
		
	}

}
