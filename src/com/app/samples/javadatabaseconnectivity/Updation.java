//This program demonstrates how to delete/update rows
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Updation {
	
	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static Statement statement = null;

	//to hold count of updated rows.
	static int rowsEffected;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			
			//create an object to driver class - registers the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//connect to oracle database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");
			
			//create SQL statement
			statement = connection.createStatement();
			
			//executed SQL statement to update query
			rowsEffected = statement.executeUpdate("update emptab set salary = 10000 where salary = 8900.95");
			System.out.println("Number of rows effected : " + rowsEffected);
			
			//press any key to continue
			System.out.println("press any key to continue...");
			System.in.read();
			
			//execute SQL statement to delete a row
			rowsEffected = statement.executeUpdate("delete emptab where empid > 1004");
			System.out.println("Number of rows effected : " + rowsEffected);
			
			//close the connection
			connection.close();
			
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
	}

}
