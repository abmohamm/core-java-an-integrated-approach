//Push buttons
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PushButtons extends Frame implements ActionListener {

	//buttons
	Button yellow, blue, pink;
	
	PushButtons() {
		
		//do not set any layout
		this.setLayout(null);
		
		//create 3 push buttons
		yellow = new Button("yellow");
		blue = new Button("blue");
		pink = new Button("pink");
		
		//set the locations of buttons in the frame
		yellow.setBounds(100, 100, 70, 40);
		blue.setBounds(100, 160, 70, 40);
		pink.setBounds(100, 220, 70, 40);
		
		//add the buttons to the frame
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
		
		//know the label of the button clicked by the user
		String label = actionEvent.getActionCommand();
		
		//change the frame's background color depending on the button clicked
		if(label.equals("yellow")) {
			this.setBackground(Color.YELLOW);
		}
		
		if(label.equals("blue")) {
			this.setBackground(Color.BLUE);
		}
		
		if(label.equals("pink")) {
			this.setBackground(Color.PINK);
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		PushButtons buttons = new PushButtons();
		
		//set size and title
		buttons.setSize(400, 400);
		buttons.setTitle("My buttons");
		
		//to open a maximized frame
		buttons.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		buttons.setVisible(true);
	}

}
