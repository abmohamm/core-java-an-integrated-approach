//Reading data from text file - improved version of DemoReadFile
package com.app.samples.streamsandfiles;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicFileReadDemo {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to accept filename from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter file name : ");
		//fileName could be src/com/app/samples/streamsandfiles/myfile.txt or 
		//src/com/app/samples/streamsandfiles/buffer_file.txt
		String fileName = bufferedReader.readLine();
		
		//attach the file to FileInputStream
		FileInputStream fileInputStream = null;	//assign nothing to fileInputStream
		
		//check if file exists or not
		try {
			fileInputStream = new FileInputStream(fileName);
		} catch(FileNotFoundException fileNotFoundException) {
			System.out.println("File not found");
			System.out.println("Exception occured : " + fileNotFoundException.getMessage());
			return;
		}
		
		//attach fileInputStream to BufferedInputStream
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		
		System.out.println(fileName + " contents : ");
		
		//read characters from bufferedInputStream and write them to monitor.
		//Repeat this till the end of file
		int ch;
		ch = bufferedInputStream.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch = bufferedInputStream.read();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		bufferedInputStream.close();
		
	}

}
