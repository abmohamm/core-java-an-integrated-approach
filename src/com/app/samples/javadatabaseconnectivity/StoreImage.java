//This program demonstrates how to store binary data(image) into database
package com.app.samples.javadatabaseconnectivity;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class StoreImage {

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
	
	//fileInputStream to read Image 
	static FileInputStream fileInputStream = null;
	
	//file number
	static int fileNumber = 1000;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		oracleDriver = new OracleDriver();
		
		files = new ArrayList<File>();
		
		try {
			
			//load all the files into files object
			files.add(new File("src/com/app/samples/graphicsprogrammingusingSWING/car.gif"));
			files.add(new File("src/com/app/samples/graphicsprogrammingusingSWING/new.jpg"));
			files.add(new File("src/com/app/samples/graphicsprogrammingusingSWING/open.png"));
			files.add(new File("src/com/app/samples/graphicsprogrammingusingSWING/print.png"));
			files.add(new File("src/com/app/samples/graphicsprogrammingusingSWING/start.PNG"));
			files.add(new File("src/com/app/samples/graphicsprogrammingusingSWING/stop.PNG"));
			
			// register oracle driver
			DriverManager.registerDriver(oracleDriver);
			
			// establish a connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");
			
			
			for(File imageFile : files) {
								
				fileNumber++;
				
				//Attach the file to FileInputStream for reading the image
				fileInputStream = new FileInputStream(imageFile);
				
				// use preparedStatement to update the table : BIGTAB
				preparedStatement = connection.prepareStatement("INSERT INTO BIGTAB (NAME, PHOTO, NO) VALUES(?, ?, ?)");
				
				preparedStatement.setString(1, imageFile.getName());
				
				//write the file contents into the table
				preparedStatement.setBinaryStream(2, fileInputStream, (int)imageFile.length());
				preparedStatement.setInt(3, fileNumber);
			
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
