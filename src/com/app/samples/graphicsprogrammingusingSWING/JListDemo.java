//JList demo
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Container;
import java.awt.ScrollPane;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame implements ListSelectionListener {

	//list to hold items
	JList list;
	
	//label to display text
	JLabel label;
	
	//array to hold selected items
	Object[] selectedItemsList;
	
	String message = "";
		
	//container to hold components
	Container container;
	
	//to create a scrollable list
	JScrollPane scrollPane;
	 
	public JListDemo() {

		// TODO Auto-generated constructor stub
		//create content pane
		container = this.getContentPane();
		
		//do not set any layout to container
		container.setLayout(null);
		
		//create an array with items list
		String items[] = {"India", "America", "Germany", "Japan", "France", "Abu Dhabi", "Bahrain", "Saudi Arabia", "Dubai"};
		
		//create countries label
		label = new JLabel("Countries : ", JLabel.LEFT);
		
		//set the location of label
		label.setBounds(475+30, 200+50, 200, 40);
		
		//add label to container
		container.add(label);
		
		//create a list box with the items
		list = new JList(items);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Enable multi-select
		scrollPane = new JScrollPane(list);
		
		//set the location of list box
		scrollPane.setBounds(480+100, 175+50, 100, 100);
//		list.setBounds(480+100, 175+50, 100, 100);
		
		//add list to the container
		container.add(scrollPane);
//		container.add(list);
		
		//create an empty label - to display the selected items
		label = new JLabel();
		
		//set the location of label
		label.setBounds(480+50, 175+200, 800, 40);
		
		//add the label to content pane
		container.add(label);
		
		//attach item listener to list box
		list.addListSelectionListener(this);
		
	}
	
	public void valueChanged(ListSelectionEvent listSelectionEvent) {
		
		// TODO Auto-generated method stub
		//know which items are selected
		selectedItemsList = list.getSelectedValuesList().toArray();
		
		//retrieve the selected items and add to string message
		for(int i = 0; i < selectedItemsList.length; i++) {
			
			if(i != selectedItemsList.length - 1) {
				message = message + (String)selectedItemsList[i] + ", ";
			} else {
				message = message + (String)selectedItemsList[i];
			}
		}
		//display the selected items in the label
		label.setText("Selected : " + message);
		//reset the string
		message = "";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JListDemo listDemo = new JListDemo();
		
		//set title and size
		listDemo.setTitle("My List");
		listDemo.setSize(500, 400);
		
		//to open a maximized frame
		listDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		listDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		listDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
