package com.app.samples.packages;

public class AccessSpecifier {

	private int a = 1;	//class scope
	public int b = 2;	//global scope
	protected int c = 3;	//package and sub class level scope
	int d = 4;	//default access specifier - package scope
}
