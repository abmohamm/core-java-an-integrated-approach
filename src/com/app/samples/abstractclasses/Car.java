package com.app.samples.abstractclasses;

//this is an abstract class
abstract class Car {
	
	//every car will have registration number
	int registrationNumber;
	
	//initialize the value of registrationNumber
	Car(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	//all cars will have a fuel tank and same mechanism to open the tank
	void openTank() {
		System.out.println("fill the tank!!!");
	}
	
	//all cars will have steering but different cars will have different steering mechanisms
	abstract void steering(int direction, int angle);
	
	//all cars will have brakes but different cars will have different braking mechanisms
	abstract void braking(int force);
}
