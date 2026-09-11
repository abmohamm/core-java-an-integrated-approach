//To trap mouse-events
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {

	// to hold mouse-location details
	String mouseLocation = "";

	// to display mouse location
	JTextArea textArea;

	// container to hold components
	Container container;

	// co-ordinates of mouse event
	int x, y;

	MouseEvents() {

		// create content-pane
		container = this.getContentPane();

		// set flow layout to container
		container.setLayout(new BorderLayout());

		// create a text area and set some font to it
		textArea = new JTextArea("Click the mouse or move it", 5, 20);
		textArea.setFont(new Font("Consolas", Font.BOLD, 30));

		// add textArea to container
		container.add(textArea, BorderLayout.CENTER);

		// add mouse listener and mouse motion listener to text area
		textArea.addMouseListener(this);
		textArea.addMouseMotionListener(this);

	}

	// MouseListener methods - start
	@Override
	public void mouseClicked(MouseEvent mouseEvent) {

		// TODO Auto-generated method stub
		// know which button of mouse is clicked
		int i = mouseEvent.getButton();

		if (i == 1) {
			mouseLocation = mouseLocation + " Clicked Button : Left";
		} else if (i == 2) {
			mouseLocation = mouseLocation + " Clicked Button : Middle";
		} else if (i == 3) {
			mouseLocation = mouseLocation + " Clicked Button : Right";
		}
		
		//mouse clicked location
		x = mouseEvent.getX();
		y = mouseEvent.getY();
		
		mouseLocation = mouseLocation + "Mouse clicked at : " + x + "\t" + y;
		this.display();
	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//mouse pressed location
		x = mouseEvent.getX();
		y = mouseEvent.getY();
	
		mouseLocation = mouseLocation + "Mouse pressed at : " + x + "\t" + y;
		this.display();
	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//mouse released location
		x = mouseEvent.getX();
		y = mouseEvent.getY();
	
		mouseLocation = mouseLocation + "Mouse released at : " + x + "\t" + y;
		this.display();
	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		mouseLocation = mouseLocation + "Mouse entered ";
		this.display();
	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		mouseLocation = mouseLocation + "Mouse exited ";
		this.display();
	}
	// MouseListener methods - end

	// MouseMotionListener methods - start
	@Override
	public void mouseDragged(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//mouse dragged location
		x = mouseEvent.getX();
		y = mouseEvent.getY();
	
		mouseLocation = mouseLocation + "Mouse dragged at : " + x + "\t" + y;
		this.display();
	}

	@Override
	public void mouseMoved(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//mouse moved location
		x = mouseEvent.getX();
		y = mouseEvent.getY();
	
		mouseLocation = mouseLocation + "Mouse moved at : " + x + "\t" + y;
		this.display();
	}
	// MouseMotionListener methods - end

	public void display() {
		textArea.setText(mouseLocation);
		mouseLocation = "";
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		MouseEvents mouseEvents = new MouseEvents();
				
		//set title and size
		mouseEvents.setTitle("Trap Mouse location");
		mouseEvents.setSize(500, 400);
		
		//to open a maximized frame
		mouseEvents.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		mouseEvents.setVisible(true);
		
		//close the application upon clicking on close button of frame
		mouseEvents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
