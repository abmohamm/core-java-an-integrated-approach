//box layout manager
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BoxDemo extends JFrame implements ActionListener{

	//label for username
	JLabel name;
	
	//text field
	JTextField nameText;
	
	//label for password
	JLabel password;
	
	//text field
	JPasswordField passwordField;
	
	//container to hold components
	Container container;
	
	//boxes to accommodate components
	Box nameBox, passwordBox, buttonsBox, combinedBoxes;
	
	//buttons
	JButton submit, cancel;
	
	BoxDemo(){
		
		//create content-pane
		container = this.getContentPane();
		
		//create a label and a text field, set preferred size to text-field for name
		name = new JLabel("Enter Name : ");
		nameText = new JTextField(20);
		nameText.setPreferredSize(nameText.getPreferredSize());
		
		//create a top horizontal box and add above components to it
		nameBox = Box.createHorizontalBox();
		
		//add label and text field in sequence along with a horizontal gap - horizontal strut
		nameBox.add(name);
		nameBox.add(Box.createHorizontalStrut(45));	//gap of 20px
		nameBox.add(nameText);
		
		//create a label and a text field, set preferred size to text-field for password
		password = new JLabel("Enter Password : ");
		passwordField = new JPasswordField(20);
		passwordField.setPreferredSize(passwordField.getPreferredSize());
		//hide the password by *
		passwordField.setEchoChar('*');
		
		//create a middle horizontal box and add above components to it
		passwordBox = Box.createHorizontalBox();
		
		//add label and text field in sequence along with a horizontal gap - horizontal strut
		passwordBox.add(password);
		passwordBox.add(Box.createHorizontalStrut(20));	//gap of 20 px
		passwordBox.add(passwordField);
		
		//create two push buttons and add it to vertical box
		submit = new JButton("submit");
		cancel = new JButton("cancel");
		
		//create a bottom horizontal box and add components to it
		buttonsBox = Box.createHorizontalBox();
		
		//add buttons to buttonsBox
		buttonsBox.add(submit);
		buttonsBox.add(Box.createHorizontalStrut(50));
		buttonsBox.add(cancel);
		
		//add the three horizontal boxes inside a vertical box with a gap of 100 px - vertical strut
		combinedBoxes = Box.createVerticalBox();
		combinedBoxes.add(nameBox);
		combinedBoxes.add(Box.createVerticalStrut(100));
		combinedBoxes.add(passwordBox);
		combinedBoxes.add(Box.createVerticalStrut(100));
		combinedBoxes.add(buttonsBox);
		
		//add the vertical box - combinedBoxes to the content-pane
		container = this.getContentPane();
		container.add(combinedBoxes);
		
		//add action listeners to submit, cancel buttons
		submit.addActionListener(this);
		cancel.addActionListener(this);
	}
	
	//close the application when anyone of submit, cancel buttons is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		BoxDemo boxDemo = new BoxDemo();
		
		//set title and size
		boxDemo.setTitle("Box Layout");
		boxDemo.setSize(400, 400);
		
		//to open a maximized frame
		boxDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		boxDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		boxDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
