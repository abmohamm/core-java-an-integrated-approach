//Displaying a group of dots on the blank screen
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DisplayPoints extends Frame {
	
	DisplayPoints() {
		
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics graphics) {
		
		//set black color for dots
		graphics.setColor(Color.RED);
		
		//display dots forever
		for(;;) {
			
			//generate x, y coordinates randomly. Maximum 800 and 600 pixels
			int x = (int)(Math.random() * 800);
			int y = (int)(Math.random() * 600);
			
			//use drawLine to display a dot
			graphics.drawLine(x, y, x, y);
			
			try {
				//make a time delay of 1 seconds
				Thread.sleep(500);
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		DisplayPoints pointsFrame = new DisplayPoints();
		
		//set background color for frame
		pointsFrame.setBackground(Color.WHITE);
		
		//set the size and title for frame
		pointsFrame.setSize(500, 400);
		pointsFrame.setTitle("Random dots");
		
		//to open a maximized frame
		pointsFrame.setExtendedState(MAXIMIZED_BOTH);
		
		//display the frame
		pointsFrame.setVisible(true);
	}

}
