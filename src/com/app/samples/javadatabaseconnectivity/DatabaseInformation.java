// Demonstrates how to find Database capabilities using DatabaseMetaData
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseInformation {
	
	// To establish connection with database
	static Connection connection = null;

	//To get the information about result into ResultSetMetaData
	static DatabaseMetaData databaseMetaData = null;
	
	//To hold information about tables or views
	static ResultSet resultSet = null;
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		try {
		
			// Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");
			
			//get the information about database into databaseMetaData
			databaseMetaData = connection.getMetaData();
			
			//display the information about database
			System.out.println("Database Name : " + databaseMetaData.getDatabaseProductName());
			System.out.println("Database version : " + databaseMetaData.getDatabaseProductVersion());
			System.out.println("Database Driver name : " + databaseMetaData.getDriverName());
			System.out.println("Database major version : " + databaseMetaData.getDatabaseMajorVersion());
			System.out.println("Database minor version : " + databaseMetaData.getDatabaseMinorVersion());
			System.out.println("URL of Database : " + databaseMetaData.getURL());
			System.out.println("Current user-name : " + databaseMetaData.getUserName());
			
			//wait till enter pressed
			System.in.read();
			
			System.out.println("<========== TABLES START ==========>");
			
			//tables
			String[] allTables = {"TABLE"};
			resultSet = databaseMetaData.getTables(null, null, null, allTables);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("TABLE_NAME"));
			}
			
			System.out.println("<========== TABLES END ==========>");
		
			//wait till enter pressed
			System.in.read();
			
			System.out.println("<========== VIEWS START ==========>");
			
			//views
			String[] allViews = {"VIEW"};
			resultSet = databaseMetaData.getTables(null, null, null, allViews);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("TABLE_NAME"));
			}
			
			System.out.println("<========== VIEWS END ==========>");
			
			// close the connection
			connection.close();
			
		} catch(Exception exception) {
			
			// TODO Auto-generated catch block
			System.out.println("exception : " + exception.getMessage());
			exception.printStackTrace();
		}
	}

}
