//Compressing a file using DeflaterOutputStream
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.DeflaterOutputStream;

public class DemoFileZip {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to accept filename from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/filewritertest.txt
		String fileName = bufferedReader.readLine();
		//attach the original - unzipped file to FileInputStream for reading data
		FileInputStream unzippedFile = new FileInputStream(fileName);
		
		//attach compressed file to FileOutputStream
		FileOutputStream fileOutputStream = new FileOutputStream("src/com/app/samples/streamsandfiles/strings_into_file_zip.txt");
		
		//attach fileOutputStream to DeflaterOutputStream
		DeflaterOutputStream zippedFile = new DeflaterOutputStream(fileOutputStream);
		
		//read data from unzippedFile and write it into zippedFile
		int data;
		data = unzippedFile.read();
		while(data != -1) {
			zippedFile.write(data);
			data = unzippedFile.read();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		unzippedFile.close();
		zippedFile.close();
	}

}
