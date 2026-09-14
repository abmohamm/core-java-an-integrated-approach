//BorderLayout demo
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo extends JFrame {

	//container to hold components
		Container container;
		
		//FlowLayout
		BorderLayout borderLayout;
		
		//buttons
		JButton submit, next, cancel, back;
		
		BorderLayoutDemo() {
			
			//create content pane
			container = this.getContentPane();
			
			//create BorderLayout with 10px horizontal and vertical gap between components
			borderLayout = new BorderLayout(20, 20);
			
			//set the layout to content pane
			container.setLayout(borderLayout);
			
			//create buttons
			submit = new JButton("submit");
			next = new JButton("next");
			cancel = new JButton("cancel");
			back = new JButton("back");
			
			//add buttons to container
			container.add(BorderLayout.NORTH, submit);
			container.add(BorderLayout.EAST, next);
			container.add(BorderLayout.WEST, cancel);
			container.add(BorderLayout.SOUTH, back);
		}
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		BorderLayoutDemo borderLayoutDemo = new BorderLayoutDemo();
		
		//set title and size
		borderLayoutDemo.setTitle("Border Layout");
		borderLayoutDemo.setSize(500, 400);
		
		//to open a maximized frame
		borderLayoutDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		borderLayoutDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		borderLayoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
