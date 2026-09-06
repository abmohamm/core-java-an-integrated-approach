//Components - Check boxes, Radio buttons and Text area in SWING
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Components extends JFrame implements ActionListener {

	
	//check boxes
	JCheckBox java, j2ee;
	
	//radio buttons
	JRadioButton male, female;
	
	//text area
	JTextArea textArea;
	
	//button group
	ButtonGroup buttonGroup;
	
	String message = "";
	
	Components() {
		
		//create the content pane
		Container container = this.getContentPane();
		
		//set flow layout to content pane
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//create a text area with 10 rows and 20 characters per row
		textArea = new JTextArea(10, 20);
		
		//create two check boxes - true state displays the component as selected by default
		java = new JCheckBox("Java", true);
		j2ee = new JCheckBox("J2EE");
		
		//create two radio buttons - true state displays the component as selected by default 
		male = new JRadioButton("Male", true);
		female = new JRadioButton("Female");
		
		//create a button group and add the radio buttons to it
		buttonGroup = new ButtonGroup();
		buttonGroup.add(male);
		buttonGroup.add(female);
		
		//add the check boxes to the container
		container.add(java);
		container.add(j2ee);
		
		//add the radio buttons to the container
		container.add(male);
		container.add(female);
		
		//add the text area to the container
		container.add(textArea);
		
		/*
		 * add action listeners. We need not add listener to text area since the 
		 * user clicks on the check boxes and radio buttons only
		 */
		java.addActionListener(this);
		j2ee.addActionListener(this);
		male.addActionListener(this);
		female.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		//know which components are selected by user
		if(java.getModel().isSelected()) {
			message = message + "\nJava";
		}
		
		if(j2ee.getModel().isSelected()) {
			message = message + "\nJ2EE";
		}
		
		if(male.getModel().isSelected()) {
			message = message + "\nMale";
		} else if(female.getModel().isSelected()) {
			message = message + "\nFemale";
		}
		
		//display the selected message in text area
		textArea.setText(message);
		
		//reset the message to empty string
		message = "";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a frame
		Components components = new Components();
		
		//set the title and size of frame
		components.setTitle("My check boxes and Radio buttons");
		components.setSize(500, 400);
		
		//to open a maximized frame
		components.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		components.setVisible(true);
		
		//close the application upon clicking on close button of frame
		components.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
