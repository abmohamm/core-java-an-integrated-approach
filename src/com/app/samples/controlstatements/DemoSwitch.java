package com.app.samples.controlstatements;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoSwitch.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoSwitch {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	switch
		System.out.println();
		char color = 'g';
		switch(color) {
			case 'r':
				System.out.println("red");
				break;
			case 'g':
				System.out.println("green");
				break;
			case 'b':
				System.out.println("blue");
				break;
			case 'w':
				System.out.println("white");
				break;
			default :
				System.out.println("no color");
		}
		
		String day = "Tue";
		switch(day) {
			case "Sun":
				System.out.println("Sunday");
				break;
			case "Mon":
				System.out.println("Monday");
				break;
			case "Tue":
				System.out.println("Tuesday");
				break;
			case "Wed":
				System.out.println("Wednesday");
				break;
			case "Thu":
				System.out.println("Thursday");
				break;
			case "Fri":
				System.out.println("Friday");
				break;
			case "Sat":
				System.out.println("Saturday");
				break;
			default :
				System.out.println("Wrong day!!!");
		}
	}

}
