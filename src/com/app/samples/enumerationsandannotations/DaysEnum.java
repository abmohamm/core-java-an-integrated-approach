//create an enumeration with day names
package com.app.samples.enumerationsandannotations;

enum Days {
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,  SATURDAY;
}

public class DaysEnum {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//using values() method to retrieve all enum constants into alldays[] array 
		Days allDays[] = Days.values();		
		
		//using for-each loop to retrieve the enum constants from allDays and display them
		for(Days day : allDays) {
			System.out.println(day);
		}
	}

}
