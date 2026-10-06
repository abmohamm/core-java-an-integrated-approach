//To store file content into a table
package com.app.samples.javadatabaseconnectivity;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class StoreFile {

	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static PreparedStatement preparedStatement = null;

	//to hold count of updated rows.
	static int rowsEffected;
	
	//load list of files into database
	static List<File> files = null;
	
	//file number
	static int fileNumber = 1000;
	
	//fileReader to read file
	static FileReader fileReader = null;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		oracleDriver = new OracleDriver();
		
		files = new ArrayList<File>();
		
		try {
			
			//load all the files into files object
			files.add(new File("src/com/app/samples/streamsandfiles/buffer_file.txt"));
			files.add(new File("src/com/app/samples/streamsandfiles/filewritertest.txt"));
			files.add(new File("src/com/app/samples/streamsandfiles/myfile.txt"));
			files.add(new File("src/com/app/samples/streamsandfiles/strings_into_file.txt"));
	
			// register oracle driver
			DriverManager.registerDriver(oracleDriver);
			
			// establish a connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");
			
			for(File file : files) {
			
				fileNumber++;
				
				//connect the File to FileReader for reading
				fileReader = new FileReader(file);
				
				// use preparedStatement to update the table : BIGTAB
				preparedStatement = connection.prepareStatement("INSERT INTO MYCLOB (NAME, FILEDOC, NO) VALUES(?, ?, ?)");
				
				//set fileName to 1st column
				preparedStatement.setString(1, file.getName());
				
				//store the file into 2nd column as character stream
				preparedStatement.setCharacterStream(2, fileReader, (int)file.length());
				
				//store fileNumber to 3rd column
				preparedStatement.setInt(3, fileNumber);
				
				System.out.println("File size : " + file.length());
				
				//execute the statement
				rowsEffected = preparedStatement.executeUpdate();
				System.out.println("Number of rows effected : " + rowsEffected);
			}
			
			//close the connection
			connection.close();
		} catch(Exception exception) {
			
			// TODO Auto-generated catch block
			System.out.println("exception : " + exception.getMessage());
			exception.printStackTrace();
		}

	}

}
