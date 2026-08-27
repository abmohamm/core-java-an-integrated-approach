//Creating a Frame and closing it - Anonymous Inner class
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousInnerClass extends Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a Frame with title
		AnonymousInnerClass frame = new AnonymousInnerClass();
		
		//set a title for the Frame
		frame.setTitle("My AWT Frame");
		
		//set the size of the Frame
		frame.setSize(300, 250);
		
		//to open a maximized frame
		frame.setExtendedState(MAXIMIZED_BOTH);
		
		//display the Frame
		frame.setVisible(true);
		
		//close the Frame. Here inner class name is not mentioned but it's object is passed to the method
		frame.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}
