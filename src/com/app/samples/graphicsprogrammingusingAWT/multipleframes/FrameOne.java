//This is Frame - 1
package com.app.samples.graphicsprogrammingusingAWT.multipleframes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameOne extends Frame implements ActionListener {

	//buttons
	Button next, close;
	
	//know the button clicked by the user
	Object clickedButton;
	
	FrameOne() {
		
		this.setLayout(null);
	
		//create two buttons
		next = new Button("next");
		close = new Button("close");
		
		//set the location of buttons
		next.setBounds(100, 100, 70, 40);
		close.setBounds(200, 100, 70, 40);
		
		//add them to frame
		this.add(next);
		this.add(close);
		
		//add action listener to buttons
		next.addActionListener(this);
		close.addActionListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
	}
	
	//this method is called when a button is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//know the button clicked by the user
		clickedButton = actionEvent.getSource();
		
		//if next button is clicked, display frame - 2
		if(clickedButton == next) {
			
			//create Frame - 2
			FrameTwo frameTwo = new FrameTwo();
			
			//set size and title
			frameTwo.setSize(400, 400);
			frameTwo.setTitle("Frame 2");
			
			//to open a maximized frame
			frameTwo.setExtendedState(MAXIMIZED_BOTH);
			
			//display the frame
			frameTwo.setVisible(true);
			
		} else {
			//if close button is clicked, close application
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create Frame - 1
		FrameOne frameOne = new FrameOne();
		
		//set size and title
		frameOne.setSize(400, 400);
		frameOne.setTitle("Frame 1");
		
		//to open a maximized frame
		frameOne.setExtendedState(MAXIMIZED_BOTH);
		
		//display the frame
		frameOne.setVisible(true);
		
	}

}
