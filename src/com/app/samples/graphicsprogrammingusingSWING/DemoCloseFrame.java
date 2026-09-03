//A simple frame
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Frame;

import javax.swing.JFrame;

public class DemoCloseFrame extends JFrame {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DemoCloseFrame demoCloseFrame = new DemoCloseFrame();
		
		//set the title for the frame
		demoCloseFrame.setTitle("My swing frame");
		
		//set the size to 200 by 200 pixels
		demoCloseFrame.setSize(200, 200);
		
		//to open a maximized frame
		demoCloseFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		demoCloseFrame.setVisible(true);
		
		/*
		 * JFrame.EXIT_ON_CLOSE - close the application upon clicking on close button of frame
		 * JFrame.DISPOSE_ON_CLOSE - Disposes the present frame which is visible on the screen
		 * JFrame.DO_NOTHING_ON_CLOSE - Will not perform any operation upon clicking on close button
		 * JFrame.HIDE_ON_CLOSE - Hides  the frame upon clicking on close button
		 */
		//close the application upon clicking on close button of frame
		demoCloseFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				
	}

}
