//Hashtable with cricket player names and their scores
package com.app.samples.collectionframework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//create Hashtable with names and scores
		Hashtable<String, Integer> cricketScores = new Hashtable<String, Integer>();
		cricketScores.put("Ajay", 50);
		cricketScores.put("Sachin", 77);
		cricketScores.put("Gavaskar", 44);
		cricketScores.put("Kapil", 60);
		cricketScores.put("Dhoni", 88);
		
		//display all player names using enumerator
		System.out.println("Player names : ");
		Enumeration<String> names = cricketScores.keys();
		
		while(names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
		
		//accept player name from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter player name : ");
		String name = bufferedReader.readLine();
		name = name.trim();	//remove unnecessary spaces
		
		//get score of the player
		Integer score = cricketScores.get(name);
		if(score != null) {
			//convert score from Integer object to int value
			int scoree = score.intValue();
			System.out.println(name + " scored : " + scoree);
		} else {
			System.out.println("Player not found!!!");
		}
	}

}
