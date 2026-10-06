//	Demonstrates how to call a function. Already the function is stored at server.
package com.app.samples.javadatabaseconnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import oracle.jdbc.driver.OracleDriver;

public class CallFunction {

	// driver to communicate with the database
	static OracleDriver oracleDriver = null;

	// To establish connection with database
	static Connection connection = null;
	
	// To execute SQL stored procedures
	static CallableStatement callableStatement = null;
	
	//To capture increased salary
	static float increasedSalary;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		oracleDriver = new OracleDriver();
		
		try {
			
			// Register the driver
			DriverManager.registerDriver(oracleDriver);

			// establish connection with the database
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb", "********", "********");
			
			//create CallableStatement to call function - myfunc. Here 1st ? is OUT parameter and 2nd ? is IN parameter
			callableStatement = connection.prepareCall("{? = call myfunc(?)}");
			
			//register the OUT parameter as INTEGER type
			callableStatement.registerOutParameter(1, Types.INTEGER);
			
			//set the IN parameter
			callableStatement.setInt(2, 1004);
			
			//execute the callableStatement
			callableStatement.execute();
			
			//get the result from OUT parameter and display
			increasedSalary = callableStatement.getInt(1);
			System.out.println("Incremented salary : " + increasedSalary);
			
			// close the connection
			connection.close();
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
	}

}
