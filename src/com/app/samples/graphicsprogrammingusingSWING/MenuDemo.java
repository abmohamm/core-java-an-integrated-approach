//Menu creation
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDemo extends JFrame implements ActionListener {

	//menu-bar
	JMenuBar menuBar;
	
	//menu, edit, --font for sub-menu--
	JMenu file, edit, font;
	
	//menu-items
	JMenuItem open, save, close, copy, paste, arial, calibri, consolas, sansSerif, timesNewRoman;
	
	//menu checkbox item for print
	JCheckBoxMenuItem print;
	
	//container to hold components
	Container container;
	
	MenuDemo() {
		
		//create container
		container = this.getContentPane();
		
		//set borderlayout to container
		container.setLayout(new BorderLayout());
		
		//create a menu-bar - to hold file, edit menu-items
		menuBar = new JMenuBar();
		
		//add menu-bar to container
		container.add(BorderLayout.NORTH, menuBar);
		
		//create file, edit menus and attach them to menu-bar
		file = new JMenu("File");
		edit = new JMenu("Edit");
		menuBar.add(file);
		menuBar.add(edit);
		
		//create menu-items
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		close = new JMenuItem("Close");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		
		//add open, save, close menu-items to File menu
		file.add(open);
		file.add(save);
		file.add(close);
		
		//add copy, paste menu-items to Edit menu
		edit.add(copy);
		edit.add(paste);
		
		//disable close menu
		close.setEnabled(false);
		
		//create print check-box and add it to File menu
		print = new JCheckBoxMenuItem("Print");
		file.add(print);
		
		//add a separator (horizontal line) to File menu
		file.addSeparator();
		
		//create a font sub-menu and add it to File menu
		font = new JMenu("Font");
		file.add(font);
		
		//create menu-items
		arial = new JMenuItem("Arial");
		calibri = new JMenuItem("Calibri");
		consolas = new JMenuItem("Consolas");
		sansSerif = new JMenuItem("SansSerif");
		timesNewRoman = new JMenuItem("Times New Roman");
		
		//add menu-items to sub-menu
		font.add(arial);
		font.add(calibri);
		font.add(consolas);
		font.add(sansSerif);
		font.add(timesNewRoman);
		
		//attach action listeners to  all menu-items
		open.addActionListener(this);
		save.addActionListener(this);
		close.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		print.addActionListener(this);
		arial.addActionListener(this);
		calibri.addActionListener(this);
		consolas.addActionListener(this);
		sansSerif.addActionListener(this);
		timesNewRoman.addActionListener(this);
		
	}
	
	//this method is executed when a menu-item is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//file-menu actions - start
		if(open.isArmed()) {
			System.out.println("Open is selected");
		}
		if(save.isArmed()) {
			System.out.println("Save is selected");
		}
		if(close.isArmed()) {
			System.out.println("Close is selected");
		}
		//file-menu actions - end
		
		//edit-menu actions - start
		if(copy.isArmed()) {
			System.out.println("Copy is selected");
		}
		if(paste.isArmed()) {
			System.out.println("Paste is selected");
		}
		//edit-menu actions - end
		
		if(print.getModel().isSelected()) {
			System.out.println("printing on...");
		} else {
			System.out.println("printing off...");
		}
		
		//font actions - start
		if(arial.isArmed()) {
			System.out.println("Arial font is selected");
		}
		if(calibri.isArmed()) {
			System.out.println("Calibri font is selected");
		}
		if(consolas.isArmed()) {
			System.out.println("Consolas font is selected");
		}
		if(sansSerif.isArmed()) {
			System.out.println("SansSerif font is selected");
		}
		if(timesNewRoman.isArmed()) {
			System.out.println("Times New Roman is selected");
		}
		//font actions - end
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		MenuDemo menuDemo = new MenuDemo();
		
		//set title and size
		menuDemo.setTitle("My Menu");
		menuDemo.setSize(500, 400);
		
		//to open a maximized frame
		menuDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		menuDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		menuDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
