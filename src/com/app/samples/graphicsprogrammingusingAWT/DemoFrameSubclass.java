//Creating a frame - version 2 using subclass
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Frame;

public class DemoFrameSubclass extends Frame {

	//call super class constructor to store title
	DemoFrameSubclass(String str) {
		super(str);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a Frame with title
		DemoFrameSubclass frame = new DemoFrameSubclass("My AWT Frame using Subclass");
		
		//set the size of the Frame
		frame.setSize(300, 250);
		
		//to open a maximized frame
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
				
		//display the Frame
		frame.setVisible(true);
		
	}

}
