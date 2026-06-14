package com.app.samples.inheritance;

//private and protected
class Access {
	private int a;
	protected int b;
}

class SubAccess extends Access {
	public void get() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class AccessSpecifierTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SubAccess access = new SubAccess();
		access.get();
	}

}
