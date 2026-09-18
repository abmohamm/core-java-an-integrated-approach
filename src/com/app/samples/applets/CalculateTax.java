//calculating tax by taking name and salary from param tags
package com.app.samples.applets;

import java.applet.Applet;
import java.awt.Graphics;

public class CalculateTax extends Applet {

	//name
	String username;
	
	//salary, tax
	float salary, tax;
	
	public void init() {
		
		//accept name from name parameter
		username = getParameter("username");
		
		//accept salary from applet and convert it into float type salary
		salary = Float.parseFloat(getParameter("salary"));
		
		calculateTax(salary);
	}

	public void calculateTax(float salary2) {
		
		// TODO Auto-generated method stub
		//calculate  tax value based on salary
		if(salary <= 100000) {
			tax = 0.0f;
		} else if(salary <= 200000) {
			tax = salary * 0.1f;
		} else {
			tax = salary * 0.2f;
		}
	}
	
	public void paint(Graphics graphics) {
		
		//display the tax details
		graphics.drawString("Hello : " + username, 20, 100);
		graphics.drawString("Your salary : " + salary, 20, 120);
		graphics.drawString("Pay the tax : " + tax, 20, 140);
	}
	
}
