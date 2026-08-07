//reading string wise from file
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderStringDemo {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		String str;
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/strings_into_file.txt
		String fileName = bufferedReader.readLine();		
		
		//connect fileReader to text file
		FileReader fileReader = new FileReader(fileName);
		
		//connect BufferedReader to fileReader
		bufferedReader = new BufferedReader(fileReader);
		
		//read string by string from bufferedReader and display
		str = bufferedReader.readLine();
		while(str != null) {
			System.out.println(str);
			str = bufferedReader.readLine();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		fileReader.close();
	}

}
