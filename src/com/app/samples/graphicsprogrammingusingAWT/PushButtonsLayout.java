//Push buttons using Layouts - Version 2
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PushButtonsLayout extends Frame implements ActionListener {

	//buttons
	Button yellow, blue, pink;
	Object clickedButton;
	
	PushButtonsLayout() {
		
		//set FlowLayout
		this.setLayout(new FlowLayout());
		
		//create 3 push buttons
		yellow = new Button("yellow");
		blue = new Button("blue");
		pink = new Button("pink");
		
		//add buttons to the frame
		this.add(yellow);
		this.add(blue);
		this.add(pink);
		
		//add action listener to the buttons
		yellow.addActionListener(this);
		blue.addActionListener(this);
		pink.addActionListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}	//end of constructor

	//this method is called when a button is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//know the button clicked by the user
		clickedButton = actionEvent.getSource();
		
		if(clickedButton == yellow) {
			this.setBackground(Color.YELLOW);
		}
		
		if(clickedButton == blue) {
			this.setBackground(Color.BLUE);
		}
		
		if(clickedButton == pink) {
			this.setBackground(Color.PINK);
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		PushButtonsLayout buttons = new PushButtonsLayout();
		
		//set the size and title
		buttons.setSize(400, 400);
		buttons.setTitle("My buttons");
		
		//to open a maximized frame
		buttons.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		buttons.setVisible(true);
	}

}
