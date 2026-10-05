//To store 999 rows into oracle database - Oracle (Thin) driver
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class ThinDriverPerformance {

	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static Statement statement = null;

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

			// create a SQL statement interface
			statement = connection.createStatement();

			// count the time before insertion
			long startTime = System.currentTimeMillis();

			// insert 999 rows into mytab table
			for (int i = 1000; i < 2000; i++) {
				// INSERT INTO ABMOHAMM.MYTAB(A, B) VALUES(0, 0);
				sqlQuery = "INSERT INTO ABMOHAMM.MYTAB(A, B) VALUES(" + i + ", " + i + ")";
				statement.execute(sqlQuery);
			}

			// count the time after insertion
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
