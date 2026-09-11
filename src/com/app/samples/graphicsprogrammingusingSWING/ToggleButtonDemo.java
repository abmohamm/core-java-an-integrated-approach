//Toggle button with start and stop images
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButtonDemo extends JFrame implements ActionListener {

	//toggle button to execute start/stop
	JToggleButton toggleButton;
	
	//image-icon for start
	ImageIcon start;
	
	//image-icon for stop
	ImageIcon stop;
	
	//container to hold components
	Container container;
	
	ToggleButtonDemo() {
		
		//create content pane with flow layout
		container = this.getContentPane();
		
		//set flow layout
		container.setLayout(new FlowLayout());
		
		//image with start signal
		//src/com/app/samples/graphicsprogrammingusingSWING/start.png
		start = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/start.png");
		
		//create toggle button with start image
		toggleButton = new JToggleButton("start/stop", start);
		
		//add button to content pane
		container.add(toggleButton);
		
		//add action listener to toggle-button
		toggleButton.addActionListener(this);
	}
		
	//this method will be called when toggle button is pressed
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//image with stop signal
		//src/com/app/samples/graphicsprogrammingusingSWING/stop.png
		stop = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/stop.png");
		
		//if toggle button is selected, display stop signal image else start signal image
		if(toggleButton.isSelected()) {
			toggleButton.setIcon(stop);
		} else {
			toggleButton.setIcon(start);
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		ToggleButtonDemo toggleButtonDemo = new ToggleButtonDemo();
		
		//set title and size
		toggleButtonDemo.setTitle("Toggle Button");
		toggleButtonDemo.setSize(500, 400);
		
		//to open a maximized frame
		toggleButtonDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		toggleButtonDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		toggleButtonDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
