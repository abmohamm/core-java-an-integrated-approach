//Creating a Frame and closing it - Using WindowListener
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class CloseFrameWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("<===== windowOpened =====>");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("<===== windowClosed =====>");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("<===== windowIconified =====>");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("<===== windowDeiconified =====>");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("<===== windowActivated =====>");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("<===== windowDeactivated =====>");
	}
	
}

public class FrameClosingWindowListener extends Frame {

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
		frame.addWindowListener(new CloseFrameWindowListener());
	}

}
