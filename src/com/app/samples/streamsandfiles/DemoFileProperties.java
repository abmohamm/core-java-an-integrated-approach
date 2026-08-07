//Displaying the File properties
package com.app.samples.streamsandfiles;

import java.io.File;

public class DemoFileProperties {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//accept file-name or directory-name through command line arguments
		String fileOrDirectoryName =  args[0];
		
		//pass the fileOrDirectoryName to File Object
		File file = new File(fileOrDirectoryName);
		
		//apply file class methods on File object
		System.out.println("File name : " + file.getName());
		System.out.println("File path : " + file.getPath());
		System.out.println("Absolute file path : " + file.getAbsolutePath());
		System.out.println("Parent : " + file.getParent());
		System.out.println("Is file exists : " + file.exists());
		
		if(file.exists()) {
			System.out.println("Is file? : " + file.isFile());
			System.out.println("Is a directory? : " + file.isDirectory());
			System.out.println("Is writeable? : " + file.canWrite());
			System.out.println("Is readable? : " + file.canRead());
			System.out.println("Is executable? : " + file.canExecute());
			System.out.println("Size of file in bytes : " + file.length());
		}
		
	}

}
