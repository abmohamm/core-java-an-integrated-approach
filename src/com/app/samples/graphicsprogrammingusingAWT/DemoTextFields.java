//TextFields with a Labels
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoTextFields extends Frame implements ActionListener {

	//text fields for username and password
	TextField username, password;
	
	//lables for username and password
	Label un, pw;
	
	//font for username
	Font nameFont;
	
	//masking password
	String maskedPassword = "";
	
	DemoTextFields() {
		
		//set layout to flow layout
		this.setLayout(new FlowLayout());
		
		//create 2 labels
		un = new Label("Username : ", Label.LEFT);
		pw = new Label("Password : ", Label.LEFT);
		
		//create text fields for username and password
		username = new TextField(20);
		password = new TextField(20);
		
		//hide the password by *
		password.setEchoChar('*');
		
		//use background, foreground colors and font for username textfield
		username.setBackground(Color.YELLOW);
		username.setForeground(Color.RED);
		
		nameFont = new Font("Arial", Font.PLAIN, 25);
		username.setFont(nameFont);
		
		//add the labels and textfields to the frame
		this.add(un);
		this.add(username);
		this.add(pw);
		this.add(password);
		
		//add action listener to text fields
		username.addActionListener(this);
		password.addActionListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
	}	//end of constructor
	
	//this method is executed when enter is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		repaint();
	}
	
	//display the text entered into text fields
	public void paint(Graphics graphics) {
		
		graphics.drawString("Name : " + username.getText(), 10, 200);
		maskedPassword = "*".repeat(password.getText().length());
		graphics.drawString("Password : " + maskedPassword, 10, 240);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DemoTextFields texts = new DemoTextFields();
		
		//set the size and title
		texts.setSize(400, 400);
		texts.setTitle("My Text Field");
		
		//to open a maximized frame
		texts.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		texts.setVisible(true);
	}

}
