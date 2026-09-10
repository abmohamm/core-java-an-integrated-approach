//JComboBox demo
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxDemo extends JFrame implements ItemListener {


	//JComboBox
	JComboBox comboBox;
	
	//label
	JLabel label;
	
	//Ccontainer to hold component
	Container container;
	
	public JComboBoxDemo() {
		
		// TODO Auto-generated constructor stub
		//create content pane
		container = this.getContentPane();
		
		//do not set any layout to container
		container.setLayout(null);
		
		//create countries label
		label = new JLabel("Countries : ", JLabel.LEFT);
		
		//create an empty combo box
		comboBox = new JComboBox();
		
		//add items to it
		comboBox.addItem("India");
		comboBox.addItem("America");
		comboBox.addItem("Germany");
		comboBox.addItem("Japan");
		comboBox.addItem("France");
		
		//set the location of label
		label.setBounds(550+30, 175+50, 200, 40);
		
		//set the location of comboBox
		comboBox.setBounds(550+100, 175+50, 100, 40);
		
		//add label to container
		container.add(label);
		
		//add comboBox to the container
		container.add(comboBox);
		
		//create an empty label
		label = new JLabel();
		
		//set the location of label
		label.setBounds(550+100, 175+200, 200, 40);
		
		//add the label to content pane
		container.add(label);
		
		//attach item listener to combo box
		comboBox.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent itemEvent) {
		
		// TODO Auto-generated method stub
		//know which item is selected
		String item = (String)comboBox.getSelectedItem();
		
		//display the selected item in the label
		label.setText("You selected : " + item);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JComboBoxDemo comboBoxDemo = new JComboBoxDemo();
		
		//set title and size
		comboBoxDemo.setTitle("My Combo Box");
		comboBoxDemo.setSize(500, 400);
		
		//to open a maximized frame
		comboBoxDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		comboBoxDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		comboBoxDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
