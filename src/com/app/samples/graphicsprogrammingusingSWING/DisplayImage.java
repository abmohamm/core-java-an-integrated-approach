//Button which displays Image when clicked
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class DisplayImage extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	
	DisplayImage() {
		
		//create a container
		Container container = this.getContentPane();
		
		//set a layout for container
		container.setLayout(new FlowLayout());
		
		//src/com/app/samples/graphicsprogrammingusingSWING/car.gif
		//store the image into ImageIcon object
		ImageIcon imageIcon = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/car.gif");
		
		//create the button with the image
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
		
		//set tool tip text for button
		button.setToolTipText("This is a button");
		
		//set a short-cut key for button, Alt+C will invoke the button
		button.setMnemonic('C');
		
		//add the button to the container
		container.add(button);
		
		//add action listener to button
		button.addActionListener(this);
		
		//create an empty label and add to the content pane
		label = new JLabel();
		container.add(label);
		
	}
	
	public void actionPerformed(ActionEvent actionEvent) {

		// TODO Auto-generated method stub
		//set some image to the label, This image is displayed when the button is clicked
		ImageIcon imageIcon = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/car.gif");
		label.setIcon(imageIcon);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a frame
		DisplayImage displayImage = new DisplayImage();
		
		//set title and size of frame
		displayImage.setTitle("My Image display");
		displayImage.setSize(500, 400);
		
		//to open a maximized frame
		displayImage.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		displayImage.setVisible(true);
		
		//close the application upon clicking on close button of frame
		displayImage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
