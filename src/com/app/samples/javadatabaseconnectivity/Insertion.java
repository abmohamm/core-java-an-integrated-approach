/* INSERT INTO EMPTAB (EMPID, NAME, SALARY) VALUES(1005, 'Nageswara rao', 8900.95);
 * In the above case, a row with id - 1005, name and salary will be inserted into emptab.
 * We insert another row with all column names as - INSERT INTO EMPTAB (EMPID, NAME, SALARY) VALUES(1006, 'Satyaraj', 9000.00);
 */
//This program demonstrates how to insert rows into a table
package com.app.samples.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Insertion {
	
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

		oracleDriver = new OracleDriver();
		
		try {
			
			// register oracle driver
			DriverManager.registerDriver(oracleDriver);
			
			// get a connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",  "********", "********");

			// create a statement to insert rows into emptab table
			statement = connection.createStatement();

			// execute the statement
			rowsEffected = statement.executeUpdate("INSERT INTO EMPTAB (EMPID, NAME, SALARY) VALUES(1005, 'Nageswara rao', 8900.95)");
			System.out.println("Number of rows effected : " + rowsEffected);
			
			//insert a row with empid, name and salary values
			rowsEffected = statement.executeUpdate("INSERT INTO EMPTAB (EMPID, NAME, SALARY) VALUES(1006, 'Satyaraj', 9000.00)");
			System.out.println("Number of rows effected : " + rowsEffected);
			
			//close the connection
			connection.close();
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

		
	}

}
