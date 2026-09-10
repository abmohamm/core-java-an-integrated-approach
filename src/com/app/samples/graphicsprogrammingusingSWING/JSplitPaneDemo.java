//Split pane with text area and button
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class JSplitPaneDemo extends JFrame implements ActionListener {

	//text 
	String text = "This is my text displayed in the text area"
				+ "and this text will be wrapped accordingly";
	
	//button
	JButton button;
	
	//text area
	JTextArea textArea;
	
	//split pane
	JSplitPane splitPane;
	
	//container to hold the components'
	Container container;
	
	JSplitPaneDemo() {
		
		//create content pane
		container = this.getContentPane();
		
		//set border layout to content pane
		container.setLayout(new BorderLayout());
		
		//create a push button
		button = new JButton("My button");
		
		//create a text area
		textArea = new JTextArea();
		
		//set wrapping of line for text area
		textArea.setLineWrap(true);
		
		//create horizontal split that contains button, text area
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, button, textArea);

		//set the divider location at 300 pixels in split pane
		splitPane.setDividerLocation(500);
		
		//add action listener to button
		button.addActionListener(this);
		
		//add split pane in the center of container
		container.add("Center", splitPane);
	
	}
	
	public void actionPerformed(ActionEvent actionEvent) {
	
		// TODO Auto-generated method stub
		//when button clicked, set the string to the text area
		textArea.setText(text);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JSplitPaneDemo splitPaneDemo = new JSplitPaneDemo();
		
		//set title and size
		splitPaneDemo.setTitle("My Split pane");
		splitPaneDemo.setSize(500, 400);
		
		//to open a maximized frame
		splitPaneDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		splitPaneDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		splitPaneDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
