//Using cars
package com.app.samples.abstractclasses;

//using Car class
public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//reference to super class
		Car maruti, santro;
		
		//car to use Maruti class
		maruti = new Maruti(1001);	//1001 is registrationNumber
		
		//use the features of Maruti
		maruti.openTank();
		maruti.steering(1, 90);
		maruti.braking(500);
		
		System.out.println("<=======================================>");
		
		//car to use Santro class
		santro = new Santro(5005);	//5005 is registrationNumber;
		
		//use the features of Santro
		santro.openTank();
		santro.steering(1, 90);
		santro.braking(500);
	}

}
