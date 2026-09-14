//below class uses Border-layout
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel implements ActionListener  {
	
	//components
	JTextField textField;
	JCheckBox checkBox;
	JButton button;
	
	//To know details of clicked button
	Object buttonClicked;
	
	MyPanel() {
		
		//set border-layout to panel
		this.setLayout(new BorderLayout());
		
		//create components
		textField = new JTextField("text field", 15);
		button = new JButton("cancel");
		checkBox = new JCheckBox("yes/no");
		
		//add them to panel
		this.add(BorderLayout.NORTH, textField);
		this.add(BorderLayout.SOUTH, button);
		this.add(BorderLayout.EAST, checkBox);
		
		button.addActionListener(this);
	}

	//method is called when button is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		buttonClicked = actionEvent.getSource();
		
		//if close button is clicked, close application
		if(buttonClicked == button) {
			System.exit(0);
		}
	}

}
