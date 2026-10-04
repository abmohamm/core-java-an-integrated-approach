//To retrieve data from Oracle database using jdbc-odbc bridge driver
package com.app.samples.javadatabaseconnectivity;

public class OracleDSNAccess {

	/*	DSN should be created in Administrative tools in Windows, upload sample mdb files which contains tables.
	 public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//Register the driver
		DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
		
		//Establish connection with the database
		Connection connection = DriverManager.getConnection("jdbc:odbc:oradsn", "scott", "tiger");
		
		//Create a SQL statement
		Statement statement = connection.createStatement();
		
		//Execute the statement
		ResultSet resultSet = statement.executeQuery("select * from emptab");
		
		// all rows of table - emptab are in resultSet. Now retrieve column data from resultSet and display
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("EMPID"));
			System.out.println(resultSet.getString("NAME"));
			System.out.println(resultSet.getFloat("SALARY"));

			System.out.println("<=======>");
		}
		
		// close the connection
		connection.close();
	}
	 */

}
