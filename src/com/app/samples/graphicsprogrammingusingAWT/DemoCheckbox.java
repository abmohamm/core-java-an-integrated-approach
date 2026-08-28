//Checkbox demo
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoCheckbox extends Frame implements ItemListener {

	//vars
	String message = "";
	Checkbox bold, italic, underline;
	
	DemoCheckbox() {
		
		//set flow layout manager
		this.setLayout(new FlowLayout());
		
		//display 3 checkboxes
		bold = new Checkbox("Bold", true);	//true represents checkbox appears as if it is selected by default.
		italic = new Checkbox("Italic");
		underline = new Checkbox("Underline");
		
		//add the checkboxes to the frame
		this.add(bold);
		this.add(italic);
		this.add(underline);
		
		//add item listener to checkboxes
		bold.addItemListener(this);
		italic.addItemListener(this);
		underline.addItemListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

	}	//end of constructor
	
	//this method is called when the user clicks on checkbox
	public void itemStateChanged(ItemEvent itemEvent) {
		
		// TODO Auto-generated method stub
		//call paint method
		repaint();
	}
	
	//display current state of checkboxes
	public void paint(Graphics graphics) {
		graphics.drawString("Current state : ", 10, 100);
		message = "Bold : " + bold.getState();
		graphics.drawString(message, 10, 120);
		message = "Italic : " + italic.getState();
		graphics.drawString(message, 10, 140);
		message = "Underline : " + underline.getState();
		graphics.drawString(message, 10, 160);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DemoCheckbox checkbox = new DemoCheckbox();
		
		//set the size and title
		checkbox.setSize(400, 400);
		checkbox.setTitle("My checkbox");
		
		//to open a maximized frame
		checkbox.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		checkbox.setVisible(true);
		
	}

}
