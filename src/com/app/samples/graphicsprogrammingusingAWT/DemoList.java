//List box demo
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoList extends Frame implements ItemListener {

	//vars
	int messages[];
	
	//list for languages
	List listOfLanguages;
	
	//label for languages
	Label chooseLanguage;
	
	//item selected
	String itemSelected = "";
	
	DemoList() {
		
		//set flow layout manager
		this.setLayout(new FlowLayout());
		
		//create chooseLanguage label
		chooseLanguage = new Label("Languages : ", Label.LEFT);
		
		/*
		 * create an empty list box that displays 3 items initially, 
		 * rest of rows can be seen by clicking on scroll bar.
		 * 2nd parameter enables/disables multiple selection of items in listofLanguages
		 */
		listOfLanguages = new List(3, true);
		
		//add some items to choice menu
		listOfLanguages.add("English");
		listOfLanguages.add("Hindi");
		listOfLanguages.add("Telugu");
		listOfLanguages.add("Sanskrit");
		listOfLanguages.add("French");
		
		//add labels and list box to frame
		this.add(chooseLanguage);
		this.add(listOfLanguages);
		
		//add item listener to the list box
		listOfLanguages.addItemListener(this);
		
		//close the frame
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}	//end of constructor
	
	//this method is called when any item is selected
	public void itemStateChanged(ItemEvent e) {
		
		// TODO Auto-generated method stub
		//call the paint method
		repaint();
	}
	
	//display selected items from the items menu
	public void paint(Graphics graphics) {
		
		graphics.drawString("Selected languages : ", 100, 200);
		
		//get the selected items position numbers into messages[]
		messages = listOfLanguages.getSelectedIndexes();
		
		//know each selected item's name and display
		for(int i = 0; i < messages.length; i++) {
			itemSelected = listOfLanguages.getItem(messages[i]);
			graphics.drawString(itemSelected, 100, 220+i*20);
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create the frame
		DemoList list = new DemoList();
		
		//set the size and title
		list.setSize(400, 400);
		list.setTitle("My List box");
		
		//to open a maximized frame
		list.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		list.setVisible(true);
	}

}
