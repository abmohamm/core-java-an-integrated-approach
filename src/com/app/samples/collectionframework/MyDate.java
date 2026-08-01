//Display System date and time using Date class
package com.app.samples.collectionframework;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class MyDate {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Create Date class object - this contains system date and time
		Date date = new Date();
		
		//Format the date to medium format and time to short format
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, Locale.UK);
		
		//Apply the above format to the Date object
		String formattedDate = dateFormat.format(date);
		
		//Now display the formatted date and time
		System.out.println("Current date : " + formattedDate);
	}

}
