//Drawing a smile face in a frame filled with colors
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawSmileywithColors extends Frame {
	
	DrawSmileywithColors() {
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	//To refresh the Frame contents
	public void paint(Graphics graphics) {
		
		//set blue color
		graphics.setColor(Color.BLUE);
		
		//display a rectangle to contain drawing
		graphics.fillRect(100, 100, 200, 200);
		
		//set Yellow color
		graphics.setColor(Color.YELLOW);
		
		//face
		graphics.fillOval(160, 160, 80, 80);
		
		//set black color
		graphics.setColor(Color.BLACK);
		
		//eyes
		graphics.fillOval(180, 185, 5, 5);
		graphics.fillOval(215, 185, 5, 5);
		
		//nose
		graphics.drawLine(200, 185, 200, 205);
		
		//set red color
		graphics.setColor(Color.RED);
		
		//mouth
		graphics.fillArc(183, 200, 35, 20, 0, 180);
		graphics.fillArc(183, 200, 35, 20, 0, -180);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DrawSmileywithColors colors = new DrawSmileywithColors();
		
		//set the size and title
		colors.setSize(400, 400);
		colors.setTitle("My drawing filled with colors");
		
		//to open a maximized frame
		colors.setExtendedState(MAXIMIZED_BOTH);
		
		//display the frame
		colors.setVisible(true);
	}

}
