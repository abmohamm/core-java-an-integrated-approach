//GridLayout demo
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {

	//container to hold components
	Container container;
	
	//grid-layout
	GridLayout gridLayout;
	
	//buttons
	JButton submit, next, cancel, back, close;
	
	GridLayoutDemo() {
		
		//create content-pane
		container = this.getContentPane();
		
		//create grid-layout with 2-rows, 3-columns and 50 px horizontal/vertical gap between components
		gridLayout = new GridLayout(2, 3, 50, 50);
		
		//set layout to grid-layout
		container.setLayout(gridLayout);
		
		//create buttons
		submit = new JButton("submit");
		next = new JButton("next");
		cancel = new JButton("cancel");
		back = new JButton("back");
		close = new JButton("close");
		
		//add buttons to container
		container.add(submit);
		container.add(next);
		container.add(cancel);
		container.add(back);
		container.add(close);

	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();
		
		//set title and size
		gridLayoutDemo.setTitle("Grid Layout");
		gridLayoutDemo.setSize(500, 400);
		
		//to open a maximized frame
		gridLayoutDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		gridLayoutDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		gridLayoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
