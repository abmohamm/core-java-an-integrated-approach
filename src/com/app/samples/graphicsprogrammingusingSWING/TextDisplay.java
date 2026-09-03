//A simple frame with background color and  text - Using Label
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextDisplay extends JFrame {

	//vars - label to hold text which needs to be displayed
	JLabel label;
	
	TextDisplay() {
		
		//create content pane
		Container container =  this.getContentPane();
		
		//set layout manager to container
		container.setLayout(new FlowLayout());
		
		//set background color for content pane - container
		container.setBackground(Color.GRAY);
		
		//create a Label with some text
		label = new JLabel("Hello Learners!!!");
		
		//set font for label
		Font font = new Font("Helvetica", Font.BOLD, 100);
		label.setFont(font);
		
		//set red color for label
		label.setForeground(Color.BLACK);
		
		//add the label to content pane
		container.add(label);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		TextDisplay display = new TextDisplay();
		
		//set a title for the frame
		display.setTitle("My swing frame");
		
		//set the size to 300 by 300 pixels
		display.setSize(300, 300);
		
		//to open a maximized frame
		display.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		display.setVisible(true);
		
		//close the application upon clicking on close button of frame
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
