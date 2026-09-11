//To catch some of the keys typed/pressed/released on the keyboard
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyBoardEvents extends JFrame implements KeyListener {

	//container to hold components
	Container container;
	
	//text-area to display key accessed
	JTextArea textArea;
	
	//To display key details
	String text = "";
	
	//to get key-details
	int keyCode = 0;
	char keyChar = ' ';
	String keyText = "";
	
	KeyBoardEvents() {
		
		//create content-pane
		container = this.getContentPane();
		
		//create a text-area and set some font to it
		textArea = new JTextArea("press a key");
		textArea.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		
		//add text-area to content-pane
		container.add(textArea);
		
		//add key listener to text area
		textArea.addKeyListener(this);

	}
	
	//below method does not works for special keys
	public void keyTyped(KeyEvent keyEvent) {
		
		// TODO Auto-generated method stub
		//get the key code of the key pressed on keyboard
		/*
		System.out.println("Key code : " + keyCode);
		keyChar = keyEvent.getKeyChar();
		System.out.println("Key char : " + keyChar);
		keyText= keyEvent.getKeyText(keyCode);
		System.out.println("Key text : " + keyText.toString());
		
		textArea.setText(keyText + " key typed");
		text = "";
		*/
	}

	
	//below method works for any key  - function keys, shift, alter, caps lock, home, end etc...
	public void keyPressed(KeyEvent keyEvent) {
		
		// TODO Auto-generated method stub
		//get the key code of the key pressed on keyboard
		keyCode = keyEvent.getKeyCode();
		System.out.println("Key code : " + keyCode);
		keyChar = keyEvent.getKeyChar();
		System.out.println("Key char : " + keyChar);
		keyText= keyEvent.getKeyText(keyCode);
		System.out.println("Key text : " + keyText);
		
		text = keyText + " key pressed";
		textArea.setText(text);
		text = "";
		keyEvent.consume();
	}

	//below method works for any key
	public void keyReleased(KeyEvent keyEvent) {
		
		// TODO Auto-generated method stub
		//get the key code of the key pressed on keyboard
		/*
		keyCode = keyEvent.getKeyCode();
		System.out.println("Key code : " + keyCode);
		keyChar = keyEvent.getKeyChar();
		System.out.println("Key char : " + keyChar);
		keyText= keyEvent.getKeyText(keyCode);
		System.out.println("Key text : " + keyText.toString());
		
		textArea.setText(keyText + " key released");
		text = "";
		*/
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		KeyBoardEvents keyBoardEvents = new KeyBoardEvents();
				
		//set title and size
		keyBoardEvents.setTitle("Keys catch");
		keyBoardEvents.setSize(500, 400);
		
		//to open a maximized frame
		keyBoardEvents.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		keyBoardEvents.setVisible(true);
		
		//close the application upon clicking on close button of frame
		keyBoardEvents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
