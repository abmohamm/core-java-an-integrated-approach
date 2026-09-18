//An applet where a button is displayed for the user to click
package com.app.samples.applets;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonGame extends JApplet implements MouseListener, MouseMotionListener {

	//button
	JButton button;
	
	//label
	JLabel label;
	
	static int score = 0;
	
	//container to hold components
	Container container;
	
	//icons hold laugh or cry gif's
	ImageIcon laugh, cry;
	
	public void init() {
		
		//go to content-pane
		container = this.getContentPane();
		
		//set layout to null
		container.setLayout(null);
		
		//create the button with laugh image
		laugh = new ImageIcon("src/com/app/samples/applets/laugh.gif");
		button = new JButton("click me", laugh);
		
		//set font
		button.setFont(new Font("helvetica", Font.BOLD, 30));
		
		//specify location of button in frame
		button.setBounds(400, 300, 250, 75);
		
		//add button to container
		container.add(button);
		
		//create a label to display score
		label = new JLabel();
		
		//set font to label
		label.setFont(new Font("Impact", Font.PLAIN, 30));
		label.setText("Score : " + score);
		
		//specify location of label in frame
		label.setBounds(550, 20, 150, 50);
		
		//add label to container
		container.add(label);
		
		//add listeners to button
		button.addMouseListener(this);
		button.addMouseMotionListener(this);
	}
	
	//method is called when mouse is dragged on button
	public void mouseDragged(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//change the button coordinates randomly when the mouse is dragged
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		button.setBounds(x, y, 250, 75);
	}

	//method is called when mouse is moved on button
	public void mouseMoved(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//change the button coordinates randomly when mouse on it
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		button.setBounds(x, y, 250, 75);
	}

	//method is called when mouse is clicked on button
	public void mouseClicked(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		/*
		 * when user clicks on the button change the image as 
		 * crying image and add 100 to score
		 */
		cry = new ImageIcon("src/com/app/samples/applets/cry.gif");
		button.setIcon(cry);
		label.setBackground(Color.RED);
		
		score = score + 100;
		label.setText("Score : " + score);
		
	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {
		// TODO Auto-generated method stub

	}

	//method is called when mouse entered into button
	public void mouseEntered(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//change the button coordinates randomly when mouse entered it
		int x = (int)(600*Math.random());
		int y = (int)(500*Math.random());
		button.setBounds(x, y, 250, 75);
	}

	//method is called when mouse is exited from button
	public void mouseExited(MouseEvent mouseEvent) {
		
		// TODO Auto-generated method stub
		//when mouse is exited from button, display laughing image
		laugh = new ImageIcon("src/com/app/samples/applets/laugh.gif");
		button.setIcon(laugh);
	}

}
