//FlowLayout demo
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {

	
	//container to hold components
	Container container;
	
	//FlowLayout
	FlowLayout flowLayout;
	
	//buttons
	JButton submit, next, cancel, back;
	
	FlowLayoutDemo() {
		
		//create content pane
		container = this.getContentPane();
		
		//create FlowLayout object with RIGHT alignment, 10 px horizontal and vertical gap
		flowLayout = new FlowLayout(FlowLayout.CENTER, 100, 100);
		
		//set the layout to content pane
		container.setLayout(flowLayout);
		
		//create buttons
		submit = new JButton("submit");
		next = new JButton("next");
		cancel = new JButton("cancel");
		back = new JButton("back");
		
		//when we add buttons to container, they are added  as per flow layout
		container.add(submit);
		container.add(next);
		container.add(cancel);
		container.add(back);
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		FlowLayoutDemo flowLayoutDemo = new FlowLayoutDemo();
		
		//set title and size
		flowLayoutDemo.setTitle("Flow Layout");
		flowLayoutDemo.setSize(500, 400);
		
		//to open a maximized frame
		flowLayoutDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		flowLayoutDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		flowLayoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
