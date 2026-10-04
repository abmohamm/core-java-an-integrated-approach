//To retrieve data from MySQL database
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MySQLData {

	// driver to communicate with the database
	static Driver mySqlDriver = null;

	// To establish connection with database
	static Connection connection = null;

	// To execute SQL queries
	static Statement statement = null;

	// To hold data from database
	static ResultSet resultSet = null;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			mySqlDriver = new Driver();
			
			// Register the driver
			DriverManager.registerDriver(mySqlDriver);

			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?user=****&password=********");

			// create a SQL statement interface
			statement = connection.createStatement();

			// execute the statement
			resultSet = statement.executeQuery("select * from emptab");
			
			// all rows of table - emptab are in resultSet. Now retrieve column data from resultSet and display
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("EMPID"));
				System.out.println(resultSet.getString("NAME"));
				System.out.println(resultSet.getFloat("SALARY"));

				System.out.println("<=======>");
			}
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		
	}

}
