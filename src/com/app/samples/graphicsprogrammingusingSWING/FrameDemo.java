//A simple frame
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Frame;

import javax.swing.JFrame;

public class FrameDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame with title
		JFrame frame = new JFrame("My Frame");
		
		//set the size to 200 by 200 pixels
		frame.setSize(200, 200);
		
		//to open a maximized frame
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		frame.setVisible(true);
		
	}

}
