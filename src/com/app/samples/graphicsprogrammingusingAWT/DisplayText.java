//Frame with background color and message
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DisplayText extends Frame {

	DisplayText() {
		
		//close the frame when close button clicked
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}	//end of constructor
	
	public void paint(Graphics graphics) {
		
		//set background color for frame
		this.setBackground(new Color(100, 20, 20));
		
		//set font for the text
		Font font = new Font("Arial", Font.BOLD + Font.ITALIC, 30);
		graphics.setFont(font);
		
		//set foreground color
		graphics.setColor(Color.GREEN);
		
		//display the message
		graphics.drawString("Hello, How are You? " , 500, 400);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		DisplayText displayText = new DisplayText();
		
		//set the size and title for frame
		displayText.setSize(400, 300);
		displayText.setTitle("Sample text");
		
		//to open a maximized frame
		displayText.setExtendedState(MAXIMIZED_BOTH);
		
		//display the frame
		displayText.setVisible(true);
		
	}

}
