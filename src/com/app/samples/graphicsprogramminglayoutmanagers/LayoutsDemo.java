//Using Border-layout inside Card-layout
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutsDemo extends JFrame implements ActionListener {


	//container to hold components
	Container container;
	
	//card-layout
	CardLayout cardLayout;
	
	//buttons
	JButton submit, next, cancel, back;
	
	LayoutsDemo() {
		
		//create content-pane
		container = this.getContentPane();
		
		//create card-layout object
		cardLayout = new CardLayout();
		
		//set the layout to card layout
		container.setLayout(cardLayout);
		
		//create buttons
		submit = new JButton("submit");
		next = new JButton("next");
		cancel = new JButton("cancel");
		back = new JButton("back");
		
		//add each button to container on a separate card
		container.add("submit", submit);
		container.add("next", next);
		container.add("cancel", cancel);
		container.add("back", back);
		
		//add panel object to container on last card
		//MyPanel is the sub-class of JPanel class
		container.add("panel", new MyPanel());
		
		//add action listeners to buttons
		submit.addActionListener(this);
		next.addActionListener(this);
		cancel.addActionListener(this);
		back.addActionListener(this);
		
	}
	
	//method is called when a button is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//when a button is clicked, show the next card
		cardLayout.next(container);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		LayoutsDemo layoutsDemo = new LayoutsDemo();
		
		//set title and size
		layoutsDemo.setTitle("Layouts");
		layoutsDemo.setSize(500, 400);
		
		//to open a maximized frame
		layoutsDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		layoutsDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		layoutsDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
