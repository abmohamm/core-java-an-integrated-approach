//a moving banner using a thread
package com.app.samples.threads;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;

public class Banner extends Frame implements Runnable {

	//this is the banner string
	String bannerString = "DREAM TECH PUBLICATIONS ";
	
	Banner() {
	
		setLayout(null); 	//don't set Layout manager
		setBackground(Color.CYAN);
		setForeground(Color.RED);
	
	}	//end of constructor

	public void paint(Graphics graphics) {
		
		//set a font and display the banner string
		Font font = new Font("Courier", Font.BOLD, 40);
		graphics.setFont(font);
		graphics.drawString(bannerString, 10, 100);
	}
	
	public void run() {
		
		// TODO Auto-generated method stub
		for(;;) {	//move banner continuously
			repaint();	//refresh the frame contents
			try {
				Thread.sleep(400); 	//give a gap of 400 milliseconds between each movement
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
			char ch = bannerString.charAt(0);	//extract first char from string
			bannerString = bannerString.substring(1, bannerString.length());	//add to bannerString from second char till end
			bannerString = bannerString + ch;	//attach first char at the end of bannerString
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Banner banner = new Banner();	//banner represents the frame
		banner.setSize(400, 400);
		banner.setTitle("My Banner");
		banner.setVisible(true);
		//create a thread and run it
		Thread thread = new Thread(banner);
		thread.start();
	}

}
