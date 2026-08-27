//Drawing a polygon with 4 coordinates
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawPolygon extends Frame {

	DrawPolygon() {
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics graphics) {
		
		//set red color
		graphics.setColor(Color.RED);
		
		//display a filled rounded rectangle
		graphics.fillRoundRect(470+30, 270+30, 250, 250, 30, 30);
		
		//set green color
		graphics.setColor(Color.GREEN);
		
		//take x and y coordinates in arrays
		int x[] = {470+40, 470+200, 470+40, 470+100};
		int y[] = {270+40, 270+40, 270+200, 270+200};
		
		//there are 4 pairs of x, y coordinates
		int number = 4;
		
		//create filled polygon with connecting the coordinates
		graphics.fillPolygon(x, y, number);
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DrawPolygon polygon = new DrawPolygon();
		
		//set the size and title
		polygon.setSize(400, 400);
		polygon.setTitle("My polygon");
		
		//to open a maximized frame
		polygon.setExtendedState(MAXIMIZED_BOTH);
		
		//display the frame
		polygon.setVisible(true);
	}

}
