//Animation in Applets
package com.app.samples.applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Animate extends Applet {

	//image
	Image image;
	
	public void paint(Graphics graphics) {
		
		//load the image into Image object image
		image = getImage(getDocumentBase(), "plane.gif");
		
		/*
		 * move the image from left to right by changing x coordinates 
		 * from 0 to 800 px and take y coordinate as 0
		 */
		for(int x = 0; x < 800; x++) {
			graphics.drawImage(image, x, 0, null);
			
			try {
				Thread.sleep(20);	//delay for 20 milliseconds
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}
		
	}
}
