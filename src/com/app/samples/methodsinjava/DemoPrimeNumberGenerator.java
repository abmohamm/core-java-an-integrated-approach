package com.app.samples.methodsinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
class Primes {
	
	//to test and return true if number is prime
	static boolean isPrime(long number) {
		//initially isPrime is true, it becomes false if number is not prime
		boolean isPrime = true;
		
		//from 2 to number-1, if any number divides number, it is not prime
		for(int i = 2; i <= number-1; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	//accept how many primes required into max
	//c is counter for number of primes generated
	static void generate(long max) {
		long counter = 1, number = 2;
		while(counter <= max) {
			if(isPrime(number)) {
				System.out.print(number + " ");
				++counter;
			}
			++number;
		}
	}
}

/**
 * The Class DemoPrimeNumberGenerator.
 */
public class DemoPrimeNumberGenerator {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//accept the number of primes are needed
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("how many primes ? : ");
		int max = Integer.parseInt(bufferedReader.readLine());
		
		//generate max number of primes
		Primes.generate(max);
	}

}
