package com.app.samples.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoArrayTwo.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
*/
public class DemoArrayTwo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int totalMarks = 0;
		
		InputStreamReader streamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(streamReader);
		
		//	ask how many subjects
		System.out.print("how many subjects : ");
		int numberOfSubjects = Integer.parseInt(br.readLine());
		
		//	create marks array to store marks of each subject
		int marks[] = new int[numberOfSubjects];
		
		//	store elements into the array
		for(int i = 0; i < numberOfSubjects; i++) {
			System.out.print("enter marks : ");
			marks[i] = Integer.parseInt(br.readLine());
		}
		
		//	calculate total marks
		for(int i = 0; i < numberOfSubjects; i++) {
			totalMarks = totalMarks + marks[i];
		}
		
		//	total marks
		System.out.println("Total marks : " + totalMarks);
		
		//	percentage
		float percentage = (float)totalMarks/numberOfSubjects;
		System.out.println("percentage : " + percentage);
	}

}
