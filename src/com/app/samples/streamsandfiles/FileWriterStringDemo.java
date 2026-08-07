//storing strings into a file
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterStringDemo {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/strings_into_file.txt
		String fileName = bufferedReader.readLine();		
		
		String str;
		
		//open file for writing - attach file to FileWriter
		FileWriter fileWriter = new FileWriter(fileName, true);
		
		//read strings and store into file till exit is entered
		System.out.println("Enter data : ");
		str = bufferedReader.readLine();
		while(!str.equals("exit")) {
			fileWriter.write(str + "\n");
			str = bufferedReader.readLine();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		fileWriter.close();
	}

}
