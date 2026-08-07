//User defined exception 
//to throw whenever balance amount is below Rs. 1000
package com.app.samples.exceptionhandling;

//User defined exception to throw whenever balance amount is below Rs. 1000
// TODO: Auto-generated Javadoc
/**
 * The Class DemoCustomExceptionV2.
 */
public class DemoCustomExceptionV2 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//store account information
	private static int accountNumbers[] = {1001, 1002, 1003, 1004, 1005};
	
	private static String names[] = {"Raja rao", "Rama rao", "Subba rao", "Appa rao", "Laxmi devi"};
	
	private static double balance[] = {10000.00, 12000.00, 5600.50, 999.00, 1100.55};
	
	private static String headers[] = {"Account Number", "Name", "Balance"};
	
	//default constructor
	DemoCustomExceptionV2() {
		
	}
	
	//parameterized constructor
	DemoCustomExceptionV2(String exception) {
		super(exception);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
		StringBuilder table = new StringBuilder();
		int count = 0;
		//Open the main table tag
		table.append("<table border=\"1\">\n");
		
		//1. Create the header row using <tr> and <th> - To display the heading for the table
		table.append("  <tr>\n");
		for(String header : headers) {
			table.append("    <th>")
				 .append(header)
				 .append("</th>\n");
		}
		table.append("  </tr>\n");
		// TODO Auto-generated method stub
		try {
			//display actual account information - Create the Data Rows using <tr> and <td>
			for(int i = 0; i < 5; i++) {
				table.append("  <tr>\n");
				table.append("    <td>")
				     .append(accountNumbers[i])
				     .append("</td>\n")
				     .append("    <td>")
				     .append(names[i])
				     .append("</td>\n")
				     .append("    <td>")
				     .append(balance[i])
				     .append("</td>\n");
			    table.append("  </tr>\n");
				
				//display the exception if balance < 1000
				if(balance[i] < 1000.00) {
					DemoCustomExceptionV2 exception = new DemoCustomExceptionV2("balance amount is less!!!");
					throw exception;
				}
			}	//end of for-loop
			System.out.println(table.toString());
		}	//end of try block 
		catch(DemoCustomExceptionV2 exception) {
			exception.printStackTrace();
		}
		finally {
			table.append("</table>");
			System.out.println(table.toString());
		}
	}	//end of main
}	//end of DemoCustomExceptionV2 class