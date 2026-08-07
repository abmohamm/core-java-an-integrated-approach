//Creating a text file using FileWriter
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFileWriter {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//take a string
		String str = "This is a book on Java." + "\nI am a learner of Java.";
		
		//to accept filename from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/filewritertest.txt
		String fileName = bufferedReader.readLine();
		
		//attach file to FileWriter
		FileWriter fileWriter = new FileWriter(fileName, true);
		
		//To improve speed of execution
//		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		//read character wise from string and write into FileWriter
		for(char ch : str.toCharArray()) {
			fileWriter.write(ch);
		}
		
		//appending new text
		fileWriter.write("\ncore java - an integrated approach is \nbest suitable from beginners to experienced resources.");
		
		//close the file
		System.out.println("<===== closing the file =====>");
		fileWriter.close();
	}

}
