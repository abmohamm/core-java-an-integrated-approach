//interface example - Connecting to any Database
package com.app.samples.interfaces;

import java.lang.reflect.InvocationTargetException;

//interface example - Connecting to any Database
interface MyInterface {
	
	//interface methods are public and abstract by default
	void connect();	//abstract public
	void disconnect();
}

class OracleDB implements MyInterface {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connecting to Oracle Database...");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected from Oracle Database");
	}
	
}

class SybaseDB implements MyInterface {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connecting to Sybase Database...");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected from Sybase Database");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		// TODO Auto-generated method stub
		//accept implementation class name from Command line argument and store it in object clazz
		Class<?> clazz = Class.forName(args[0]);
		System.out.println(clazz.getSimpleName());
		//create an object to the class whose name is in clazz, Let reference variable of interface point to it.
		MyInterface mi = (MyInterface)clazz.getDeclaredConstructor().newInstance();
		//call methods of object using mi
		mi.connect();
		mi.disconnect();
	}

}
