//A simple frame with background color
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JFrame;

public class FrameBackground extends JFrame {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		FrameBackground frame = new FrameBackground();
		
		//create content pane which is nothing but Container object - container
		Container container = frame.getContentPane();
		
		/*
		 * glass pane - 1st pane close to monitor's screen, components displayed in foreground are attached to this frame.
		 * root pane - 2nd pane lying below glass pane, components displayed in background are attached to this frame.
		 * layered pane - lies below root pane, several components as a group are attached to this frame.
		 * content pane - bottom most pane of all, individual components are attached to this frame.
		 */
				
		//set green background color to container
		container.setBackground(Color.GRAY);
		
		//set a title for the frame
		frame.setTitle("My swing frame with background");
		
		//set the size to 200 by 200 pixels
		frame.setSize(200, 200);
		
		//to open a maximized frame
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		frame.setVisible(true);
		
		//close the application upon clicking on close button of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
