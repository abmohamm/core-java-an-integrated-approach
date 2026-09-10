//Menu creation
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FileMenu extends JFrame implements ActionListener {


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
	
	//chosen file
	File chosenFile;
	
	//chosen file name
	String fileName;
	
	FileMenu() {
		
		//create container
		container = this.getContentPane();
		
		//set borderlayout to container
		container.setLayout(new BorderLayout());
	
		//create a menu-bar
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
	
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
		//file-menu actions - start
		if(open.isArmed()) {
			this.openFile();
		}
		if(save.isArmed()) {
//			this.saveFile();
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
	
	//this method is called when File->Open is selected
	void openFile() {
		
		//create an object to JFileChooser class
		JFileChooser fileChooser = new JFileChooser();
		
		//display file open dialog box
		int i = fileChooser.showOpenDialog(this);
		
		//if the user selected a file name then
		if(i == JFileChooser.APPROVE_OPTION) {
			
			//get the selected file into File object
			chosenFile = fileChooser.getSelectedFile();
		
			//file-name is given by file.getName()
			//file-name with path is given by file.getPath()
			fileName = chosenFile.getPath();
			
			System.out.println("Chosen file-name : " + fileName);
			
			//open another frame and pass fileName to it
			OpenFrame openFrame = new OpenFrame(fileName);
			
			//set title and size
			openFrame.setTitle(fileName);
			openFrame.setSize(500, 400);
			
			//to open a maximized frame
			openFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			
			//display the frame
			openFrame.setVisible(true);
			
			//close the application upon clicking on close button of frame
			openFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		FileMenu fileMenu = new FileMenu();
		
		//set title and size
		fileMenu.setTitle("File Menu");
		fileMenu.setSize(500, 400);
		
		//to open a maximized frame
		fileMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		fileMenu.setVisible(true);
		
		//close the application upon clicking on close button of frame
		fileMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
