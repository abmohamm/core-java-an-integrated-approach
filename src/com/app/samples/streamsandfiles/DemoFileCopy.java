//Copying a file contents as another file
package com.app.samples.streamsandfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileCopy {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// TODO Auto-generated method stub
		//take a var
		int ch;
		String inputFilename = args[0];
		String outputFilename = args[1];
	/*	open args[0] for reading data and args[1] for writing data into it.
		here, We are using try-with-resource which helps us to close resources automatically	*/
		try(FileInputStream inputFile = new FileInputStream(inputFilename);
			FileOutputStream outputFile = new FileOutputStream(outputFilename)) {
			//read inputFile and write into outputFile
			ch = inputFile.read();
			while(ch != -1) {
				outputFile.write(ch);
				ch = inputFile.read();
			}
		}
		System.out.println("1 file copied!!!");
	}

}
