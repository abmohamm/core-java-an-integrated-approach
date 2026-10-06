//	Demonstrates how to call a stored procedure. Already the procedure is stored at server.
package com.app.samples.javadatabaseconnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import oracle.jdbc.driver.OracleDriver;

public class CallProcedure {

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
			
			//create CallableStatement to call stored procedure - myproc
			callableStatement = connection.prepareCall("{ call myproc(?, ?)}");
			
			//set empid to IN parameter
			callableStatement.setInt(1, 1001);
			
			//register the OUT parameter as of float type
			callableStatement.registerOutParameter(2, Types.FLOAT);
			
			//execute CallableStatement
			callableStatement.execute();
			
			//get the result into increasedSalary variable
			increasedSalary = callableStatement.getFloat(2);
			System.out.println("Incremented salary : " + increasedSalary);
			
			// close the connection
			connection.close();
			
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
	}

}
