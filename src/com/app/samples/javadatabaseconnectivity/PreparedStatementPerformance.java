//Using PreparedStatement interface - to insert into database
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import oracle.jdbc.driver.OracleDriver;

public class PreparedStatementPerformance {

	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static PreparedStatement preparedStatement = null;

	// To build query
	static String sqlQuery = "";
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		oracleDriver = new OracleDriver();

		try {
			
			// Register the driver
			DriverManager.registerDriver(oracleDriver);

			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb", "********", "********");

			// create a SQL PreparedStatement interface - Time taken : 795
			preparedStatement = connection.prepareStatement("INSERT INTO ABMOHAMM.MYTAB(A, B) VALUES(?, ?)");
			
			// count the time before insertion
			long startTime = System.currentTimeMillis();

			// insert 999 rows into mytab table
			for (int i = 1; i < 1000; i++) {

				//set values for ?, ?
				preparedStatement.setInt(1, i);
				preparedStatement.setInt(2, i);
				
				//execute the statement
				preparedStatement.executeUpdate();
			}

			// count the time after insertion
			long endTime = System.currentTimeMillis();

			// display the time taken
			System.out.println("Time taken using PreparedStatement interface : " + (endTime - startTime));

			// close the connection
			connection.close();
			
		} catch(Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
	}

}
