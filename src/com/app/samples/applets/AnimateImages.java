//continuous animation using multiple images
package com.app.samples.applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class AnimateImages extends Applet {
	
	Image figure1, figure2, figure3;
	
	public void paint(Graphics graphics) {
		
		//load the images into Image objects
		figure1 = getImage(getDocumentBase(), "figure1.gif");
		figure2 = getImage(getDocumentBase(), "figure2.gif");
		figure3 = getImage(getDocumentBase(), "figure3.gif");
		
		//continuous animation
		for(;;) {
			
			//display images one by one with time gap of 200 milli seconds
			try {
				graphics.drawImage(figure1, 50, 50, null);
				Thread.sleep(200);
				
				graphics.drawImage(figure2, 50, 50, null);
				Thread.sleep(200);
				
				graphics.drawImage(figure3, 50, 50, null);
				Thread.sleep(200);
				
				graphics.drawImage(figure2, 50, 50, null);
				Thread.sleep(200);
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			
		}
		
	}
	
	
}
