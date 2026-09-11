//JProgressBar demo
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarDemo extends JFrame {

	//progress-bar to visually display the task's percentage of completion
	JProgressBar progressBar;
	
	//container to hold components
	Container container;
	
	JProgressBarDemo() {
		
		//create content pane with flow layout
		container = this.getContentPane();
		
		//set flow layout
		container.setLayout(null);
		
		//create progress-bar with 0 as minimum value and 2000 as maximum value
		progressBar = new JProgressBar(0, 2000);
		
		//specify location of progressBar in container
		progressBar.setBounds(550, 350, 200, 40);
		
		
		//set foreground color as GREEN
		progressBar.setForeground(Color.RED);
		
		//to display percentage of progress
		progressBar.setStringPainted(true);
		
		//add the progress-bar to content pane
		container.add(progressBar);
	}
	
	void increase() {
		
		//repeat the loop in steps of 10
		//if step size is less, slow progress
		for(int i = 0; i <= 2000; i = i + 10) {
			
			//set the value of progress-bar to i
			progressBar.setValue(i);
			
			//delay for 20 milli seconds
			try {
				Thread.sleep(20);
			} catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JProgressBarDemo progressBarDemo = new JProgressBarDemo();
		
		//set title and size
		progressBarDemo.setTitle("My Progress");
		progressBarDemo.setSize(500, 400);
		
		//to open a maximized frame
		progressBarDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		progressBarDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		progressBarDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//show the progress in the progress-bar
		progressBarDemo.increase();

	}

}
