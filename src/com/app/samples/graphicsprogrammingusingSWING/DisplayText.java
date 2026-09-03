//A simple frame with background color and text
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	
	MyPanel() {
		this.setBackground(Color.DARK_GRAY);
	}
	
	public void paintComponent(Graphics graphics) {
		
		super.paintComponent(graphics);
		graphics.setColor(Color.BLACK);
		Font font = new Font("Helvetica", Font.BOLD, 100);
		graphics.setFont(font);
		graphics.drawString("Hello Learners", 300, 300);
	}
}

public class DisplayText extends JFrame {

	DisplayText() {
		
		//create content pane
		Container container = this.getContentPane();
		
		//create MyPanel object and add it to container
		MyPanel panel = new MyPanel();
		container.add(panel);
	
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DisplayText frame = new DisplayText();
		
		//set a title for the frame
		frame.setTitle("My swing frame");
		
		//set the size to 300 by 300 pixel
		frame.setSize(300, 300);
		
		//to open a maximized frame
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		frame.setVisible(true);
		
		//close the application upon clicking on close button of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
