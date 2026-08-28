//Catching which key is pressed
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoKeys extends Frame implements KeyListener {

	//vars
	TextArea textArea;
	
	String message = "";
	
	Font font;
	
	DemoKeys() {
		
		//set flow layout
		this.setLayout(new FlowLayout());
		
		//create a text area to display the key code
		textArea = new TextArea(5, 25);
		
		//set some font and foreground color to text area
		font = new Font("SansSerif", Font.BOLD, 25);
		textArea.setFont(font);
		textArea.setForeground(Color.RED);
		
		//add the text area to the frame
		this.add(textArea);
		
		//add keylistener to text area
		textArea.addKeyListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	
	//this method is called when a key on the keyboard is typed
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	//this method is called when a key on the keyboard is pressed
	public void keyPressed(KeyEvent keyEvent) {
		
		// TODO Auto-generated method stub
		//get the code of the key pressed
		int keycode = keyEvent.getKeyCode();
		message = message + "\nKey code : " + keycode;
		
		//get the name of the key from the code
		String keyname = keyEvent.getKeyText(keycode);
		message = message + "\nKey pressed : " + keyname;
		
		//display the key code and key name in text area
		textArea.setText(message);
		message = "";
	}

	//this method is called when a key on the keyboard is released
	public void keyReleased(KeyEvent keyEvent) {
		
		// TODO Auto-generated method stub
		//get the code of the key released
		int keycode = keyEvent.getKeyCode();
		message = message + "\nKey code : " + keycode;
		
		//get the key name from the code
		String keyname = keyEvent.getKeyText(keycode);
		message = message + "\nKey released : " + keyname;
		
		//display the key code and key name in text area
		textArea.setText(message);
		message = "";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DemoKeys keys = new DemoKeys();
		
		//set the size and title
		keys.setSize(400, 400);
		keys.setTitle("Catch the key");
		
		//to open a maximized frame
		keys.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		keys.setVisible(true);
	}

}
