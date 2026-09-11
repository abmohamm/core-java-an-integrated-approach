//JToolBar demo
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class JToolBarDemo extends JFrame implements ActionListener {

	//text to display as label
	String labelText;
	
	//container to hold components
	Container container;
	
	//tool-bar
	JToolBar toolBar;
	
	//image-icons to load images into icons
	ImageIcon newFileImage, openImage, printImage;
	
	//scaling down image sizes
	Image scaledNewFileImage, scaledOpenImage, scaledPrintImage;
	
	//buttons which will be added to tool-bar
	JButton newFile, open, print;
	
	//label to display text in frame
	JLabel label;
	
	// to scale the images to tool-bar size
	int targetWidth = 16;
	int targetHeight = 16;
	
	JToolBarDemo() {
		
		//create content pane to hold all components
		container = this.getContentPane();
		
		//set border layout to container
		container.setLayout(new BorderLayout());
		
		//create tool-bar
		toolBar = new JToolBar();
		
		//set etched-border around the tool-bar
		toolBar.setBorder(BorderFactory.createEtchedBorder(Color.GREEN, Color.BLACK));
		
		//load images into ImageIcon objects
		/*
		 * src/com/app/samples/graphicsprogrammingusingSWING/new.jpg
		 * src/com/app/samples/graphicsprogrammingusingSWING/open.png
		 * src/com/app/samples/graphicsprogrammingusingSWING/print.png
		 */
		newFileImage = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/new.jpg");
		// SCALE_SMOOTH ensures high quality
		scaledNewFileImage = newFileImage.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
		//reduced image
		newFileImage = new ImageIcon(scaledNewFileImage);
		

		openImage = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/open.png");
		// SCALE_SMOOTH ensures high quality
		scaledOpenImage = openImage.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
		//reduced image
		openImage = new ImageIcon(scaledOpenImage);
		
		printImage = new ImageIcon("src/com/app/samples/graphicsprogrammingusingSWING/print.png");
		// SCALE_SMOOTH ensures high quality
		scaledPrintImage = printImage.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
		//reduced image
		printImage = new ImageIcon(scaledPrintImage);
		
		//create 3 push buttons with images
		newFile = new JButton(newFileImage);
		open = new JButton(openImage);
		print = new JButton(printImage);
		
		//add the push buttons to the tool-bar
		toolBar.add(newFile);
		toolBar.add(open);
		toolBar.add(print);
		
		//add tool-bar in container at the top - north
		container.add(BorderLayout.NORTH, toolBar);
		
		//create a label and add to container at center
		label = new JLabel();
		label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
		container.add(BorderLayout.CENTER, label);
		
		//add action listeners to buttons in tool-bar
		newFile.addActionListener(this);
		open.addActionListener(this);
		print.addActionListener(this);
	}

	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//know which button is clicked
		if(actionEvent.getSource() == newFile) {
			labelText = "New file clicked";
		}
		
		if(actionEvent.getSource() == open) {
			labelText = "Open clicked";
		}
		
		if(actionEvent.getSource() == print) {
			labelText = "Print clicked";
		}
		
		//display the string in the label
		label.setText(labelText);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JToolBarDemo toolBarDemo = new JToolBarDemo();
		
		//set title and size
		toolBarDemo.setTitle("My Tool Bar");
		toolBarDemo.setSize(500, 400);
		
		//to open a maximized frame
		toolBarDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		toolBarDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		toolBarDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
