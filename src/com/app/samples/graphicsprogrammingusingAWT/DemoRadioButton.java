//Radio buttons demo
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoRadioButton extends Frame implements ItemListener {

	//vars
	String message = "";
	CheckboxGroup checkboxGroup;
	Checkbox yes, no;
	
	DemoRadioButton() {
		
		//set the layout to flow layout
		this.setLayout(new FlowLayout());
		
		//create CheckboxGroup object
		checkboxGroup = new CheckboxGroup();
		
		//create 2 radio buttons
		yes = new Checkbox("yes", checkboxGroup, true);	//radio button apprears to be selected by default
		no = new Checkbox("no", checkboxGroup, false);
		
		//add the radio buttons to the frame
		this.add(yes);
		this.add(no);
		
		//add item listener to radio buttons
		yes.addItemListener(this);
		no.addItemListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}	//end of constructor
	
	//this method is called when a radio button is clicked
	public void itemStateChanged(ItemEvent itemEvent) {
		
		// TODO Auto-generated method stub
		repaint();	//call paint()
	}

	//display the selected radio button label
	public void paint(Graphics graphics) {
		
		message = "Current selection : ";
		message = message + checkboxGroup.getSelectedCheckbox().getLabel();
		graphics.drawString(message, 10, 100);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		DemoRadioButton radioButton = new DemoRadioButton();
		
		//set the size and title
		radioButton.setSize(400, 400);
		radioButton.setTitle("My Radio button");
		
		//to open a maximized frame
		radioButton.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		radioButton.setVisible(true);

	}

}
