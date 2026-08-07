//Uncompressing a file using an InflaterInputStream
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class DemoFileUnzip {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to accept filename from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/filewritertest_zip.txt
		String fileName = bufferedReader.readLine();
		
		//attach zippedFile to FileInputStream for reading data
		FileInputStream zippedFile = new FileInputStream(fileName);
		
		//attach unzippedFile to FileOutputStream for writing data into it
		FileOutputStream unzippedFile = new FileOutputStream("src/com/app/samples/streamsandfiles/strings_into_file_unzip.txt");
		
		//attach InflaterInputStream to zippedFile for uncompressing the data
		InflaterInputStream inflaterInputStream = new InflaterInputStream(zippedFile);
		
		//read data from inflaterInputStream and write it into unzippedFile
		int data;
		data = inflaterInputStream.read();
		while(data != -1) {
			unzippedFile.write(data);
			data = inflaterInputStream.read();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		unzippedFile.close();
		inflaterInputStream.close();
		
	}

}
