//My Home
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DisplayHome extends Frame {

	DisplayHome() {
		
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics graphics) {
		
		//set gray background for frame
		this.setBackground(Color.GRAY);
		
		//set yellow color for rectangle - house
		graphics.setColor(Color.YELLOW);
		graphics.fillRect(300+300, 100+200, 150, 100);
		
		//set blue color for another rectangle - door
		graphics.setColor(Color.BLUE);
		graphics.fillRect(300+350, 100+210, 50, 60);
		
		//set black color for line below the door
		graphics.setColor(Color.BLACK);
		//draw a line - line below the door
		graphics.drawLine(300+350, 100+280, 300+400, 100+280);
		
		//set dark gray for polygon - roof
		graphics.setColor(Color.DARK_GRAY);
		//store x, y coordinates in x[] and y[]
		int x[] = {300+375, 300+275, 300+475};
		int y[] = {100+125, 100+200, 100+200};
		//number of pairs
		int numberOfPairs = 3;
		graphics.fillPolygon(x, y, numberOfPairs);
		
		//set cyan color for oval - moon
		graphics.setColor(Color.CYAN);
		graphics.fillOval(300+100, 100+100, 60, 60);
		
		/*
		 * RGB(34, 139, 34) — Forest Green
		 * RGB(50, 205, 50) — Lime Green
		 * RGB(76, 175, 80) — Natural/medium green
		 * RGB(0, 128, 0) — Standard Green
		 * RGB(85, 107, 47) — Olive Drab (darker grass/vegetation)		
		*/
		
		//set color : Forest Green for arcs - grass
		graphics.setColor(new Color(34, 139, 34));
		//grass on left of house
		graphics.fillArc(300+50, 100+250, 150, 100, 0, 180);
		graphics.fillArc(300+150, 100+250, 150, 100, 0, 180);
		
		//grass on right of house
		graphics.fillArc(300+450, 100+250, 150, 100, 0, 180);
		
		//set  green color for arcs - grass
		graphics.setColor(Color.BLACK);
		//draw a line - the bottom most line of drawing
		graphics.drawLine(300+50, 100+300, 300+600, 100+300);
		
		//display some text
		Font font = new Font("Times New Roman", Font.BOLD, 30);
		graphics.setFont(font);
		graphics.drawString("My Happy Home", 300+275, 100+350);
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//create the frame
		DisplayHome home = new DisplayHome();
		
		//set the size and title
		home.setSize(400, 400);
		home.setTitle("My Home");
		
		//to open a maximized frame
		home.setExtendedState(MAXIMIZED_BOTH);
		
		//display the frame
		home.setVisible(true);
	}

}
