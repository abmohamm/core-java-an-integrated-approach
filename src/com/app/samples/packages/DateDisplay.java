package com.app.samples.packages;

import java.util.Date;

//Create MyDate interface in the package packages
interface MyDate {
	void showDate();	//public abstract
}

//This is  implementation class of MyDate interface
class MyDateImpl implements MyDate {

	public void showDate() {
		// TODO Auto-generated method stub
		
		//Date class object by default stores system date and time
		Date date = new Date();
		System.out.println("Current date : " + date);
	}
	
}

//Using DateImpl class of my packages
public class DateDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create DateImpl object
		MyDateImpl dateImpl = new MyDateImpl();
		
		//call showDate()
		dateImpl.showDate();
	}

}
