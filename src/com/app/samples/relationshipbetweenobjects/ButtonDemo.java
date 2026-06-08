package com.app.samples.relationshipbetweenobjects;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;

//creating push button and providing action to it using Inner class
public class ButtonDemo extends Frame{
	
	ButtonDemo() {
		//create a push button b
		Button button = new Button("ok");
		
		//add push button to frame
		add(button);
		
		//add action listener to button
		//MyClass is hidden Inner class of ActionListener interface whose name is not written but an object is created.
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//exit the application
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a frame by creating ButtonDemo class
		ButtonDemo buttonDemo = new ButtonDemo();
		
		//set size of frame to width: 400 px and height: 300 px
		buttonDemo.setSize(400, 300);
		
		//display the frame
		buttonDemo.setVisible(true);
		
	}

}
