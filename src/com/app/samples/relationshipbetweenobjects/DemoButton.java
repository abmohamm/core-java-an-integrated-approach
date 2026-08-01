//Creating a push button and providing action to it.
package com.app.samples.relationshipbetweenobjects;

import java.awt.Button;	//for button
import java.awt.Color;	//for button
import java.awt.Frame;	//for button
import java.awt.event.ActionEvent;	//for ActionListener
import java.awt.event.ActionListener;	//for ActionListener

// TODO: Auto-generated Javadoc
/**
 * The Class DemoButton.
 */
public class DemoButton extends Frame {
	
	/**
	 * Instantiates a new demo button.
	 */
	DemoButton() {
		//create a push button b
		Button pushButton = new Button("ok");
		
		//add pushButton to frame
		add(pushButton);
		
		//add ActionListener to button
		//MyClass is implementation class of ActionListener interface
		pushButton.addActionListener(new MyClass());
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a frame by creating DemoButton class object
		DemoButton button = new DemoButton();
		
		//set the size of frame to width: 400 px and height: 300 px
		button.setSize(100,100);
		
		//display the frame
		button.setVisible(true);

	}

}

//MyClass should implement methods of ActionListener interface
class MyClass implements ActionListener {

	//this method is executed when button is clicked
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//exit the application
		System.exit(0);
	}
	
}
