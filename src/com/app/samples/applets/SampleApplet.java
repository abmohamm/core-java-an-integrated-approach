//A simple applet
package com.app.samples.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class SampleApplet extends Applet {

	//set a background color for the frame
	public void init() {
		
		setBackground(Color.YELLOW);
	}
	
	//display message in Applet window
	public void paint(Graphics graphics) {
		
		graphics.drawString("Hello Applets!!!", 50, 100);
	}
}
