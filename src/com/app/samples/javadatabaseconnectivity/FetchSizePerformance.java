//To retrieve 999 rows from Oracle database one at a time - using setFetchSize() method
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class FetchSizePerformance {
	
	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static Statement statement = null;

	// To hold data from database
	static ResultSet resultSet = null;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		oracleDriver = new OracleDriver();
		
		try {

			// Register the driver
			DriverManager.registerDriver(oracleDriver);

			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb", "********", "********");

			// create a SQL statement interface
			statement = connection.createStatement();
			
			//retrieve at a time 1 row only
			statement.setFetchSize(250);
			
			// count the time before retrieval
			long startTime = System.currentTimeMillis();

			// retrieve all rows from table
			resultSet = statement.executeQuery("select * from customer");

			// all rows of table - customer are in resultSet. Now retrieve column data from resultSet and display
			while (resultSet.next()) {
				System.out.println(resultSet.getString("FIRST_NAME") + "\t" + resultSet.getString("LAST_NAME") + "\t" + resultSet.getString("EMAIL"));

				System.out.println("<=======>");
			}
			
			// count the time after retrieval
			long endTime = System.currentTimeMillis();

			// display the time taken
			System.out.println("Time taken : " + (endTime - startTime));
			
			// close the connection
			connection.close();
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
	}

}
