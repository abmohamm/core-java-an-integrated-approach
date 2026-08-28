//Creating a vertical scrollbar
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoScrollbar extends Frame implements AdjustmentListener {
	
	//vars
	String message = "";
	
	//scrollbar for vertical alignment
	Scrollbar scrollbar;
	
	DemoScrollbar() {
		
		//do not set any layout
		this.setLayout(null);
		
		//create a vertical scrollbar
		scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 30, 0, 400);
		
		//specify the location of component : scrollbar in the frame
		scrollbar.setBounds(250, 50, 30, 200);
		
		//add it to the frame
		this.add(scrollbar);
		
		//add adjustment listener to the scrollbar
		scrollbar.addAdjustmentListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
	}

	//this method is called when scrollbar is dragged up or down
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		// TODO Auto-generated method stub
		//call paint()
		repaint();
	}
	
	//display the position of scrollbar
	public void paint(Graphics graphics) {

		//display the position of scrollbar
		graphics.drawString("SCROLLBAR POSITION : ", 20, 150);
		message = message + scrollbar.getValue();
		graphics.drawString(message, 20, 180);
		message = "";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DemoScrollbar scrollbar = new DemoScrollbar();
		
		//set the size and title
		scrollbar.setSize(400, 400);
		scrollbar.setTitle("My Scroll bar");
		
		//to open a maximized frame
		scrollbar.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		scrollbar.setVisible(true);
	}

}
