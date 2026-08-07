//Display the contents of directory
package com.app.samples.streamsandfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class DirectoryOrFileContents {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//to accept path and directoryName from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.print("Enter directory path : ");
		String directoryPath = bufferedReader.readLine();
		
		System.out.print("Enter directory name : ");
		String directoryName = bufferedReader.readLine();
		
		//create file object with directoryPath and directoryName
		File file = new File(directoryPath, directoryName);
		
		//if directory exists, then
		if(file.exists()) {
			
			//get the contents into filesList[]
			//now filesList[i] represents either a file or sub directory
			String filesList[] = file.list();
			
			//find number of entries in the directory
			int numberOfFiles = filesList.length;
			
			//display the entries
			for(String fileName : filesList) {
				System.out.println(fileName);
				//create File object with the entry and test if it is a file or directory
				File fileInDirectory = new File(fileName);
				if(fileInDirectory.isFile()) {
					System.out.println(fileInDirectory.getName() + " : is a file!!!");
				}
				
				if(fileInDirectory.isDirectory()) {
					System.out.println(fileInDirectory.getName() + " : is a directory!!!");
				}
				
			}
			System.out.println("Number of entries in this directory : " + numberOfFiles);
		} else {
			System.out.println("Directory does not exist!!!");
		}
	}

}
