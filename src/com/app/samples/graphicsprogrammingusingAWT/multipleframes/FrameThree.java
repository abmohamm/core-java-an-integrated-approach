//This is Frame - 3
package com.app.samples.graphicsprogrammingusingAWT.multipleframes;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameThree extends Frame implements ActionListener {
	
	//data coming from Frame - 2
	int rollNumber;
	String studentName;
	
	//create a back, close buttons
	Button back, close;
	
	//know the button clicked by the user
	Object clickedButton;
	
	FrameThree(int rollNumer, String studentName) {
		
		//set layout to flow layout
		this.setLayout(null);
		
		this.rollNumber = rollNumer;
		this.studentName = studentName;
		
		//create the back, close buttons
		back = new Button("back");
		close = new Button("close");
		
		//set the location of buttons
		back.setBounds(100, 100, 70, 40);
		close.setBounds(200, 100, 70, 40);
		
		//add buttons to frame
		this.add(back);
		this.add(close);
		
		//add action listener to back, close buttons
		back.addActionListener(this);
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
		
		if(clickedButton == back) {
			
			//remove this from memory
			this.dispose();
		
		} else {
			//if close button is clicked, close application
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
