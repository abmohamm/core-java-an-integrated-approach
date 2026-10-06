//demonstrates how to retrieve binary data (image)
package com.app.samples.javadatabaseconnectivity;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class RetrieveImage {

	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static PreparedStatement preparedStatement = null;

	// To hold data from database
	static ResultSet resultSet = null;
	
	// To capture image from database table
	static Blob blob = null;
	
	//file name
	static String fileName = "";
	
	// To store image from database table into byteArray of same size
	static byte[] byteArray = null;
	
	//fileOutputStream to write byte array data into outputFile
	static FileOutputStream fileOutputStream = null;
	
	//file from database table
	static File fileFromDatabase = null;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		oracleDriver = new OracleDriver();
		
		try {
			
			// Register the driver
			DriverManager.registerDriver(oracleDriver);

			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");

			// create a SQL preparedStatement interface
			preparedStatement = connection.prepareStatement("SELECT * FROM BIGTAB");

			// execute the statement
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				fileName = resultSet.getString(1);
				
				//get the image from table into blob object
				blob = resultSet.getBlob("PHOTO");
				
				//store image from blob object into byte array
				byteArray = blob.getBytes(1, (int)blob.length());
				
				System.out.println("Image length : " + blob.length());
				
				//write this byteArray into a file - fileName
				fileFromDatabase = new File(fileName);
				System.out.println("File path : " + fileFromDatabase.getAbsolutePath());
				fileOutputStream = new FileOutputStream(fileFromDatabase);
				fileOutputStream.write(byteArray);
				
				//close the file
				fileOutputStream.close();
				
			}
			
			// close the connection
			connection.close();
			
		} catch(Exception exception) {
			
			// TODO Auto-generated catch block
			System.out.println("exception : " + exception.getMessage());
			exception.printStackTrace();
		}
	}

}
