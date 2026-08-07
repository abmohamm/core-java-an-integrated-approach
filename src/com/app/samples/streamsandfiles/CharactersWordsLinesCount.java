//Counting number of characters, words and lines in a file
package com.app.samples.streamsandfiles;

import java.io.FileInputStream;
import java.io.IOException;

public class CharactersWordsLinesCount {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		//vars
		int ch;
		boolean previous = true;
		
		//counters
		int char_count = 0;
		int word_count = 0;
		int line_count = 0;
		
		FileInputStream fileInputStream = null;
		String[] fileNames = args;
		
		for(String fileName : fileNames) {
			//attach the file : args[0] to FileInputStream to read data
			fileInputStream = new FileInputStream(fileName);
			//read characters from file till the end
			ch = fileInputStream.read();
			while(ch != -1) {
				if(ch != ' ') {
					++char_count;
				}
				if(!previous && ch == ' ') {
					++word_count;
				}
				//don't count if previous char is space
				if(ch == ' ') {
					previous = true;
				} else {
					previous = false;
				}
				if(ch == '\n') {
					++line_count;
				}
				ch = fileInputStream.read();
			}
			//display the count of characters, words and lines
			char_count = char_count - line_count * 2;
			word_count = word_count - line_count;
			System.out.println(fileName + " metrics : ");
			System.out.println("Number of Characters : " + char_count);
			System.out.println("Number of Words : " + word_count);
			System.out.println("Number of Lines : " + line_count);	
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		fileInputStream.close();
	}

}
