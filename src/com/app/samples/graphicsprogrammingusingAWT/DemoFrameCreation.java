//Creating a frame - version 1
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Frame;

public class DemoFrameCreation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a Frame
		Frame frame = new Frame("My AWT Frame");
		//set the size of the Frame
		frame.setSize(300, 250);
		//to open a maximized frame
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		//display the Frame
		frame.setVisible(true);
	}

}
