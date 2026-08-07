//Reading data from a file using FileReader
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFileReader {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//var
		int ch;
		
		FileReader fileReader = null;
		
		//to accept filename from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/filewritertest.txt
		String fileName = bufferedReader.readLine();
		
		//check if file exists or not
		try {
			fileReader = new FileReader(fileName);
			//To improve speed of execution
//			bufferedReader = new BufferedReader(fileReader);
		} catch(FileNotFoundException fileNotFoundException) {
			System.out.println("File not found!!!");
			return;
		}
		
		System.out.print(fileName + " contents : ");
		
		//read from fileReader till the end of file
		ch = fileReader.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch = fileReader.read();
		}
		
		//close the file
		System.out.println("\n<===== closing the file =====>");
		fileReader.close();
	}

}
