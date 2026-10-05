//To store 999 rows into oracle database(DSN) - jdbc-odbc driver
package com.app.samples.javadatabaseconnectivity;

public class JdbcOdbcDriverPerformance {

	/*	DSN should be created in Administrative tools in Windows, upload sample mdb files which contains tables.
	 public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//Register the driver
		DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
		
		//Establish connection with the database
		Connection connection = DriverManager.getConnection("jdbc:odbc:oradsn", "scott", "tiger");
		
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
	}
	 */

}
