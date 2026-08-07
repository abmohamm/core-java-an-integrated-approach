//Reading text file using FileInputStream
package com.app.samples.streamsandfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoReadFile {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		int ch;
		//attach the file to FileInputStream
		File fileTobeRead = new File("src/com/app/samples/streamsandfiles/buffer_file.txt"); 
		FileInputStream fileInputStream = new FileInputStream(fileTobeRead);
		System.out.println(fileTobeRead.getName() + " contents : ");
		
		//read characters from fileInputStream and write them to monitor.
		//Repeat this till the end of file.
		ch = fileInputStream.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch = fileInputStream.read();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		fileInputStream.close();
	}

}
