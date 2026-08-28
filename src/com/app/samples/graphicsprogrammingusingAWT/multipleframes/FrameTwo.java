//This is Frame - 2
package com.app.samples.graphicsprogrammingusingAWT.multipleframes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTwo extends Frame implements ActionListener {
	
	//buttons
	Button next, close, back;
	
	//know the button clicked by the user
	Object clickedButton;

	FrameTwo() {
		
		this.setLayout(null);
	
		//create two buttons
		next = new Button("next");
		close = new Button("close");
		back = new Button("back");
		
		//set the location of buttons
		next.setBounds(100, 100, 70, 40);
		close.setBounds(200, 100, 70, 40);
		back.setBounds(300, 100, 70, 40);
		
		//add them to frame
		this.add(next);
		this.add(close);
		this.add(back);
		
		//add action listener to buttons
		next.addActionListener(this);
		close.addActionListener(this);
		back.addActionListener(this);
		
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
			
			//create Frame - 3
			FrameThree frameThree = new FrameThree(10, "Abid");
			
			//set size and title
			frameThree.setSize(400, 400);
			frameThree.setTitle("Frame 3");
			
			//to open a maximized frame
			frameThree.setExtendedState(MAXIMIZED_BOTH);
			
			//display the frame
			frameThree.setVisible(true);
			
		} else if(clickedButton == back) {
			
			//remove this from memory
			this.dispose();
		
		} else {
			//if close button is clicked, close application
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create Frame - 2
		//Frame - 2 creation logics are implemented in actionPerformed method Frame-1.
	}

}
