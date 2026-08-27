//Creating a Frame and closing it - Using WindowAdapter
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CloseFrameWindowAdapter extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
}

public class FrameClosingWindowAdapter extends Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a Frame with title
		FrameClosingWindowListener frame = new FrameClosingWindowListener();
		
		//set a title for the Frame
		frame.setTitle("My AWT Frame");
		
		//set the size of the Frame
		frame.setSize(300, 250);
		
		//to open a maximized frame
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the Frame
		frame.setVisible(true);
		
		//close the Frame - Add listener implementation class to close the Frame
		frame.addWindowListener(new CloseFrameWindowAdapter());
		
	}

}
