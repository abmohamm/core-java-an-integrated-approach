//CardLayout demo
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener {
	
	//container to hold components
	Container container;
	
	//card layout
	CardLayout cardLayout;
	
	//buttons
	JButton submit, next, cancel, back;
	
	//to know clicked button
	Object clickedButton;

	CardLayoutDemo() {
		
		//create container
		container = this.getContentPane();
		
		//create CardLayout object with 50px horizontal space and 10px vertical space
		cardLayout = new CardLayout(50, 10);
		
		//set the layout to cardLayout
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
		
		//add action listeners to button
		submit.addActionListener(this);
		next.addActionListener(this);
		cancel.addActionListener(this);
		back.addActionListener(this);
	}

	//method is called when any button is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//when a button is clicked, show the next card
		cardLayout.next(container);
		
		//to show a particular card, e.g : 3rd card, We can use as
		//cardLayout.show(container, "cancel");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		CardLayoutDemo cardLayoutDemo = new CardLayoutDemo();
		
		//set title and size
		cardLayoutDemo.setTitle("Card Layout");
		cardLayoutDemo.setSize(500, 400);
		
		//to open a maximized frame
		cardLayoutDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		cardLayoutDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		cardLayoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
