//Displaying an image in the frame and also in the title bar
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DisplayImage extends Frame {

	//take a static type Image class object
	static Image image;
	
	DisplayImage() {
		
		//load an image into Image
		
		//set background 
		setBackground(Color.GRAY);
		
		//file - src/com/app/samples/graphicsprogrammingusingAWT/diamonds.gif
		image = Toolkit.getDefaultToolkit().getImage("src/com/app/samples/graphicsprogrammingusingAWT/diamonds.gif");
		
		//wait till the image is loaded into image object
		//for this purpose, create MediaTracker
		MediaTracker mediaTracker = new MediaTracker(this);
		
		//add image to MediaTracker
		mediaTracker.addImage(image, 0);
		
		try {
			//let the JVM wait till the image is loaded completely
			mediaTracker.waitForID(0);
		} catch(InterruptedException interruptedException) {
			interruptedException.printStackTrace();
		}
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics graphics) {
				
		//display the image in the frame at 50, 50 pixels
		graphics.drawImage(image, 550, 275, 300, 300, null);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//create the frame
		DisplayImage displayImage = new DisplayImage();
		
		//set the size and title
		displayImage.setSize(500, 400);
		displayImage.setTitle("My Images");
		
		//display the same image in the title bar of frame
		displayImage.setIconImage(image);
		
		//to open a maximized frame
		displayImage.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		displayImage.setVisible(true);
	}

}
