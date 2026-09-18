//Applet creation - life cycle methods
package com.app.samples.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class AppletLifeCycle extends Applet {

	//vars
	String message = "";
	
	//this method is executed when an Applet is loaded
	public void init() {
		
		//set background color for Applet frame
		setBackground(Color.YELLOW);
		
		//set foreground for text in frame
		setForeground(Color.RED);
		
		//set font for text in Applet
		Font font = new Font("Arial", Font.BOLD, 20);
		setFont(font);
		
		//store method name in message
		message = message + " init ";
	}
	
	//this method is executed after init()
	public void start() {
		
		//add this method name to message
		message = message + " start ";
	}
	
	//to stop the Applet
	public void stop() {
		
		//add this method name to message
		message = message + " stop ";
	}
	
	//to remove Applet from memory
	public void destroy() {
		
		//add this method name to message
		message = message + " destroy ";
	}
	
	//to display the message string
	public void paint(Graphics graphics) {
		
		graphics.drawString(message, 10, 100);
	}
}
