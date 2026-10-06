// Demonstrates how to find out ResultSet information using ResultSetMetaData
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class ResultSetInformation {

	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static Statement statement = null;

	// To hold data from database
	static ResultSet resultSet = null;
	
	//To get the information about result into ResultSetMetaData
	static ResultSetMetaData resultSetMetaData = null;
	
	//number of columns in ResultSet
	static int numberOfColumns;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		oracleDriver = new OracleDriver();
		
		try {
			
			// Register the driver
			DriverManager.registerDriver(oracleDriver);

			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");

			// create a SQL statement interface
			statement = connection.createStatement();

			// execute the statement
			resultSet = statement.executeQuery("select * from emptab");
		
			//get information about resultSet into resultSetMetaData
			resultSetMetaData = resultSet.getMetaData();
			
			//count number of columns in resultSet
			numberOfColumns = resultSetMetaData.getColumnCount();
			
			for(int i = 1 ; i <= numberOfColumns ; i++) {
				
				System.out.println("<===================================>");
				System.out.println("Column number : " + i);
				System.out.println("Column name : " + resultSetMetaData.getColumnName(i));
				System.out.println("Column type : " + resultSetMetaData.getColumnTypeName(i));
				System.out.println("Column width : " + resultSetMetaData.getColumnDisplaySize(i));
				System.out.println("Column precision : " + resultSetMetaData.getPrecision(i));
				System.out.println("Is currency : " + resultSetMetaData.isCurrency(i));
				System.out.println("Is Read only : " + resultSetMetaData.isReadOnly(i));
				System.out.println("Is Writable : " + resultSetMetaData.isWritable(i));
				System.out.println("Is Searchable : " + resultSetMetaData.isSearchable(i));
				System.out.println("Is Signed : " + resultSetMetaData.isSigned(i));
				
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
