//This is a concrete subclass derived from Car class
package com.app.samples.abstractclasses;

//concrete subclass derived from Car class
class Maruti extends Car {

	//store registrationNumber in super class variable
	Maruti(int registrationNumber) {
		super(registrationNumber);
		// TODO Auto-generated constructor stub
	}

	//	Maruti uses ordinary steering
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		System.out.println("Take a turn!!!");
		System.out.println("Maruti uses ordinary steering!!!");
	}

	//	Maruti uses hydraulic brakes
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("Brakes applied!!!");
		System.out.println("Maruti uses hydraulic brakes!!!");
	}

}
