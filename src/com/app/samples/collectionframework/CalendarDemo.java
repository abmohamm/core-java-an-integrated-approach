//To display System date and time
package com.app.samples.collectionframework;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create Calendar class object.
		//By default it contains the system date and time
		Calendar calendar = Calendar.getInstance();
		
		//display date separately
		System.out.print("Current date : ");
		int date = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH);
		++month;
		int year = calendar.get(Calendar.YEAR);
		System.out.println(date + "-" + month + "-" + year);
		
		//display time alone
		int hours = calendar.get(Calendar.HOUR);
		int minutes = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(calendar.SECOND);
		System.out.println("Current time : " + hours + ":" + minutes + ":" + seconds);
		
		int time = calendar.get(Calendar.AM_PM);
		if(time == 0) {
			System.out.println("Good morning !!!");
		} else {
			System.out.println("Good evening !!!");
		}
	}

}
