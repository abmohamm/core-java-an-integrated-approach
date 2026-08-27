//Drawing a smile face in a Frame
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawSmiley extends Frame {
	
	DrawSmiley() {
		
		//close the Frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	//To refresh the Frame contents
	public void paint(Graphics graphics) {
		
		//set blue color for drawing
		graphics.setColor(Color.BLUE);
		
		//display a rectangle to contain drawing
		graphics.drawRect(60+40, 60+40, 200, 200);
		
		//face
		graphics.drawOval(160, 160, 80, 80);
		
		//eyes - 2
		graphics.drawOval(180, 185, 5, 5);
		graphics.drawOval(215, 185, 5, 5);
		
		//nose
		graphics.drawLine(200, 185, 200, 205);
		
		//mouth
		graphics.drawArc(183, 200, 35, 20, 0, -180);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the Frame
		DrawSmiley smiley = new DrawSmiley();
		
		//set the size and title
		smiley.setSize(400, 400);
		smiley.setTitle("My drawing");
		
		//to open a maximized frame
		smiley.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the Frame
		smiley.setVisible(true);
	}

}
