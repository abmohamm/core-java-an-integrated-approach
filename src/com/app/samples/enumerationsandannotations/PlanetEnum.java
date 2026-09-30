//retrieving enumeration with constants and values
package com.app.samples.enumerationsandannotations;

enum Planets {
	
	//constants in the enumeration, each with 2 values planets name, planetDistanceFromSun and planetMass.
	MERCURY(57910, 3.30e23), VENUS(108200, 4.87e24), EARTH(149600, 5.98e24),
	MARS(227940, 6.42e23), JUPITER(778330, 1.90e27);
	
	//take 2 variables to represent the 2 values
	private long planetDistanceFromSun;
	private double planetMass;
	
	//initialize the 2 instance variables
	Planets(long planetDistanceFromSun, double planetMass) {
		
		// TODO Auto-generated constructor stub
		this.planetDistanceFromSun = planetDistanceFromSun;
		this.planetMass = planetMass;
	}
	
	//to retrieve planetDistanceFromSun values from enum
	long getPlanetDistanceFromSun() {
		return planetDistanceFromSun;
	}
	
	//to retrieve planetMass values from enum
	double getPlanetMass() {
		return planetMass;
	}
}

public class PlanetEnum {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//This is for heading
		System.out.println("-----------------------------------------------");
		System.out.println("PLANET" + "\t\t" + "DISTANCE(Km)" + "\t\t" + "MASS(Kg)");
		System.out.println("-----------------------------------------------");
		
		//display all constant names and values
		for(Planets planet : Planets.values()) {
			System.out.print(planet + "\t\t");
			System.out.print(planet.getPlanetDistanceFromSun() + "\t\t\t");
			System.out.print(planet.getPlanetMass() + "\n");
		}
		
		System.out.println("-----------------------------------------------");
	}

}
