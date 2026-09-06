//Button with an image, colors, font, border, tooltip text and short cut key
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class JButtonDemo extends JFrame {
	
	JButton button;
	
	JButtonDemo() {
		
		//create container
		Container container = this.getContentPane();
		
		//set a layout  for container
		container.setLayout(new FlowLayout());
		
		//src/com/app/samples/graphicsprogrammingusingSWING/car.gif
		//store the image into ImageIcon object
		ImageIcon imageIcon = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/car.gif");
		
		//create the button  with the image
		button = new JButton("Click Me", imageIcon);
		
		//set background color for button
		button.setBackground(Color.YELLOW);
		
		//set foreground color for button
		button.setForeground(Color.RED);
		
		//set font for the label of button
		Font font = new Font("Arial", Font.BOLD, 30);
		button.setFont(font);

		//set bevel border for button
		Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		button.setBorder(border);
		
		//set tool tip text for the button
		button.setToolTipText("This is a button");
		
		//set a short-cut key for button, Alt+C from keyboard will invoke the button
		button.setMnemonic('C');
		
		//add the button to the container
		container.add(button);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a frame
		JButtonDemo buttonDemo = new JButtonDemo();
		
		//set the title and size for frame
		buttonDemo.setTitle("My Button");
		buttonDemo.setSize(500, 400);
		
		//to open a maximized frame
		buttonDemo.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		buttonDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		buttonDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
