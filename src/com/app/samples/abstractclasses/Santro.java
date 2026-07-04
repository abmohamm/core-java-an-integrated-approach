package com.app.samples.abstractclasses;

//concrete subclass derived from Car class
public class Santro extends Car {

	//store registrationNumber in super class variable
	Santro(int registrationNumber) {
		super(registrationNumber);
		// TODO Auto-generated constructor stub
	}

	//	Santro uses power steering
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		System.out.println("Take a turn!!!");
		System.out.println("Santro uses power steering!!!");
	}

	//	Santro uses gas brakes
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("Brakes applied!!!");
		System.out.println("Santro uses gas brakes!!!");
	}

}
