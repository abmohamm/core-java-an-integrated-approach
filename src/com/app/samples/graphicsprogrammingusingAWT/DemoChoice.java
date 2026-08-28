//Choice box demo
package com.app.samples.graphicsprogrammingusingAWT;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoChoice extends Frame implements ItemListener {

	
	//vars
	String message;
	
	//choice of languages
	Choice languages;
	
	DemoChoice() {
		
		//set flow layout to frame
		this.setLayout(new FlowLayout());
		
		//create an empty choice menu
		languages = new Choice();
		
		//add some items to choice menu
		languages.add("English");
		languages.add("Hindi");
		languages.add("Telugu");
		languages.add("Sanskrit");
		languages.add("French");
		
		//add choice menu to frame
		this.add(languages);
		
		//add item listener to choice menu
		languages.addItemListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	
	}
	
	//this method is called when any item is clicked
	public void itemStateChanged(ItemEvent itemEvent) {
		
		// TODO Auto-generated method stub
		//call paint() method
		repaint();
	}
	
	//display selected item from the Choice menu
	public void paint(Graphics graphics) {
		graphics.drawString("Selected language : ", 10, 100);
		message = languages.getSelectedItem();
		graphics.drawString(message, 10, 120);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DemoChoice choice = new DemoChoice();
		
		//set size and title
		choice.setSize(400, 300);
		choice.setTitle("My Choice box");
		
		//to open a maximized frame
		choice.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		choice.setVisible(true);
		
	}

}
