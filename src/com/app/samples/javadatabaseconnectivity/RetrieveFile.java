//To retrieve file content from table
package com.app.samples.javadatabaseconnectivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.OracleDriver;

public class RetrieveFile {
	
		// driver to communicate with the database
		static OracleDriver oracleDriver = null;

		// To establish connection with database
		static Connection connection = null;

		// To execute SQL queries
		static PreparedStatement preparedStatement = null;

		// To hold data from database
		static ResultSet resultSet = null;
		
		// To capture image from database table
		static Clob clob = null;
		
		//file name
		static String fileName = "";
		
		//file from database table
		static File fileFromDatabase = null;
		
		//To read data from Reader and write to a file
		static FileWriter fileWriter = null;
		
		//To read file data from clob object
		static Reader reader = null;
		
		//characters in file content
		static int ch;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		oracleDriver = new OracleDriver();
		
		try {
			
			// Register the driver
			DriverManager.registerDriver(oracleDriver);

			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");

			// create a SQL preparedStatement interface
			preparedStatement = connection.prepareStatement("SELECT * FROM MYCLOB");

			// execute the statement
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				fileName = resultSet.getString(1);
				
				//get the file from table into clob object
				clob = resultSet.getClob("FILEDOC");
		
				//To read data from CLOB object
				reader = clob.getCharacterStream();
				
				//To write file data from reader to a file
				fileFromDatabase = new File(fileName);
				fileWriter = new FileWriter(fileFromDatabase);
				
				ch = reader.read();
				
				while(ch != -1) {
					fileWriter.write(ch);
					ch = reader.read();
				}
				
				//close the file
				fileWriter.close();
				
			}
			
		} catch(Exception exception) {
			
			// TODO Auto-generated catch block
			System.out.println("exception : " + exception.getMessage());
			exception.printStackTrace();
		}

	}

}
