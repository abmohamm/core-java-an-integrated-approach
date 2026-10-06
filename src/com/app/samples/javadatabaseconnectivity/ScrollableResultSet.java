// Demonstrates how to use Scrollable Result Sets
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class ScrollableResultSet {

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
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");
			
			//create scroll sensitive, scrollable Result Set - Resultset can be iterated forward/backward and also updatable
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			//execute the query
			resultSet = statement.executeQuery("select * from emptab");
			
			//display all the rows from resultSet - should be disabled for larger data-sets
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				
				System.out.println("<==========>");
			}
			
			//display only first row
			resultSet.first();
			System.out.println("<========== 1st row - start  ==========>");
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println("<========== 1st row - end  ==========>");
			
			//display 3rd row
			resultSet.absolute(3);
			System.out.println("<========== 3rd row - start  ==========>");
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println("<========== 3rd row - end  ==========>");
			
			System.out.println("<=======================================================>");
			
			//wait till enter pressed
			System.in.read();
			
			//find how many rows are there in this resultSet - move to last row and get row number
			resultSet.last();
			System.out.println("Number of rows : " + resultSet.getRow());
			
			//wait till enter pressed
			System.in.read();
			
			//execute query again, update 3rd row in the resultSet and store it into database
			resultSet = statement.executeQuery("select empid, name, salary from emptab");
			resultSet.absolute(3);
			resultSet.updateInt(1, 1006);
			resultSet.updateString(2, "Arshan Mohammad");
			resultSet.updateFloat(3, 20000);
			resultSet.updateRow();
			
			//wait till enter pressed
			System.in.read();
			
			//insert a new row
			resultSet.moveToInsertRow();
			resultSet.updateInt(1, 1007);
			resultSet.updateString(2, "Inara");
			resultSet.updateFloat(3, 20000);
			resultSet.insertRow();
			
			//wait till enter pressed
			System.in.read();
			
			//delete the nth row
			resultSet.absolute(1);
			resultSet.deleteRow();
			
			//close the resultSet
			resultSet.close();
			
			// close the connection with the database
			connection.close();
			
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
	}

}
