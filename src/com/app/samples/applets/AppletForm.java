//An Applet with SWING components - Online shopping form
package com.app.samples.applets;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppletForm extends JApplet implements ActionListener {
	
	//vars
	String clickedButton = "", nameAddressText = "", itemsText = "";
	
	//selected items
	Object[] selectedItems;
	
	//labels
	JLabel nameLabel, addressLabel, itemsLabel, headingLabel;
	
	//name text field
	JTextField name;
	
	//address text area
	JTextArea address;
	
	//itels
	JList items;
	
	//submit, cancel buttons
	JButton submit, cancel;
	
	//container to hold components
	Container container;
	
	//Jframe
	JFrame frame;
	
	//font
	Font font;
	
	public void init() {
		
		//create JFrame
		frame = new JFrame();
		
		//create content-pane
		container = frame.getContentPane();
		
		//display YELLOW background color in container
		container.setBackground(Color.YELLOW);
		
		//do not set any layout to container
		container.setLayout(null);
		
		//set the size and title for frame
		frame.setSize(500, 400);
		frame.setTitle("My Form");
		
		//to open a maximized frame
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				
		//display the frame
		frame.setVisible(true);
		
		//display heading in the frame using a Label
		font = new Font("Dialog", Font.BOLD, 26);
		
		//heading label
		headingLabel = new JLabel();
		headingLabel.setFont(font);
		headingLabel.setForeground(Color.RED);
		headingLabel.setText("Z-ELECTRONICS ONLINE SHOP");
		headingLabel.setBounds(200, 10, 500, 50);
		
		//add heading label to container
		container.add(headingLabel);
		
		//name text-field and nameLabel for entering name
		nameLabel = new JLabel("Name : ", JLabel.LEFT);
		name = new JTextField(30);
		nameLabel.setBounds(50, 100, 100, 30);
		name.setBounds(200, 100, 200, 30);
		
		//add nameLabel and name text-field to container
		container.add(nameLabel);
		container.add(name);
		
		//addressLabel and address text-area for entering address
		addressLabel = new JLabel("Address : ", JLabel.LEFT);
		address = new JTextArea(5, 50);
		addressLabel.setBounds(50, 150, 100, 30);
		address.setBounds(200, 150, 200, 100);
		
		//add addressLabel and address text-area to container
		container.add(addressLabel);
		container.add(address);
		
		//itemsLabel and items list-box for multiple-selection
		itemsLabel = new JLabel("Select items : ", JLabel.LEFT);
		String data[] = {"TVs", "Washing machines", "DVD Players", "Refrigerators"};
		items = new JList(data);
		itemsLabel.setBounds(50, 270, 100, 30);
		items.setBounds(200, 270, 200, 100);
		
		//add itemsLabel and items list-box to container
		container.add(itemsLabel);
		container.add(items);
		
		//add two push buttons : submit and cancel
		submit = new JButton("submit");
		cancel = new JButton("cancel");
		
		//specify the location of buttons in the frame
		submit.setBounds(200, 400, 100, 30);
		cancel.setBounds(350, 400, 100, 30);
		
		//add buttons to container
		container.add(submit);
		container.add(cancel);
		
		//add action listeners to buttons
		submit.addActionListener(this);
		cancel.addActionListener(this);
		
		//close the application upon clicking on close button of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//this method is executed when the buttons are clicked
 	public void actionPerformed(ActionEvent actionEvent) {
 		
		// TODO Auto-generated method stub
 		//know which button is clicked
 		clickedButton = actionEvent.getActionCommand();
 		
 		//if submit-button is clicked then
 		if(clickedButton.equals("submit")) {
 			
 			//retrieve data from text-field, text-area and list-boxes
 			nameAddressText = name.getText() + "\n";
 			nameAddressText = nameAddressText + address.getText() + "\n";
 			selectedItems = items.getSelectedValuesList().toArray();
 			
 			for(int i = 0; i < selectedItems.length; i++) {
 				itemsText = itemsText + (String)selectedItems[i] + "\n";
 			}
 			
 			//display the data in text-area
 			address.setText(nameAddressText + itemsText);
 			
 			//make the strings empty
 			nameAddressText = "";
 			itemsText = "";
 		
 		} else {
 			
 			//if cancel-button is clicked, clear the data in the form
 			name.setText("");
 			address.setText("");
 			items.clearSelection();
 		}
 		
	}

}
