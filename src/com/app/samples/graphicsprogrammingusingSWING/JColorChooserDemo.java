//JColorChooser demo
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JColorChooserDemo extends JFrame implements ActionListener {

	//button to update chosen color to background
	JButton button;
	
	//container to hold components
	Container container;
	
	//take the initial color as null
	Color selectedColor = null;

	//chosen-color
	Color chosenColor = null;
	
	JColorChooserDemo() {
	
		//create content pane to hold components
		container = this.getContentPane();
		
		//set flow layout to container
		container.setLayout(new FlowLayout());
		
		//create a push button
		button = new JButton("Select a color");
		
		//add button to content-pane
		container.add(button);
		
		//add action listener to button
		button.addActionListener(this);
	}
	
	//this method will be called when push button is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//create the color chooser with dialog box to select a color
		chosenColor = JColorChooser.showDialog(this, "select a color", selectedColor);
		
		//if chosenColor is not null then some color is selected
		if(chosenColor != null) {
			selectedColor = chosenColor;
		}
		
		//show back ground color of frame with the selected color
		container.setBackground(selectedColor);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JColorChooserDemo colorChooserDemo = new JColorChooserDemo();
				
		//set title and size
		colorChooserDemo.setTitle("Color chooser");
		colorChooserDemo.setSize(500, 400);
		
		//to open a maximized frame
		colorChooserDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		colorChooserDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		colorChooserDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
