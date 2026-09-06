//JTable demo
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.JTableHeader;

public class JTableDemo extends JFrame {
	
	//vector object to represent data of table
	Vector<Vector> data;
	
	//vector object to represent a row
	Vector<String> row;
	
	//vector object to represent columns
	Vector<String> columns;
	
	//table to hold data and columns
	JTable table;
	
	//table border
	Border border;
	
	//table font
	Font tableFont;
	
	//table header for alignment
	JTableHeader tableHeader;
	
	//container to hold components
	Container container;
	
	JTableDemo() {
		
		//create content pane
		container = this.getContentPane();
		
		//set border layout to content pane
		container.setLayout(new BorderLayout());
		
		//take vector object to represent data of table
		data = new Vector<Vector>();
		
		//take another vector object to represent a row
		row = new Vector<String>();
		
		//add 3 column's data to row
		//1st row
		row.add("Rama Rao");
		row.add("Analyst");
		row.add("22,000.00");
		
		//add 1st row to data of the table
		data.add(row);
		
		//create another row - 2nd row
		row = new Vector<String>();
		
		//add 3 column's data to row
		//2nd row
		row.add("Srinivas Kumar");
		row.add("Programmer");
		row.add("18,000.00");
		
		//add 2nd row to data of the table
		data.add(row);
		
		//create another row - 3rd row
		row = new Vector<String>();
		
		//add 3 column's data to row
		//3rd row
		row.add("Vinaya Devi");
		row.add("QA Tester");
		row.add("16,000.75");
		
		//add 3rd row to data of the table
		data.add(row);
		
		//create another vector object for column names
		columns = new Vector<String>();
		columns.add("Employee Name");
		columns.add("Designation");
		columns.add("Salary");
		
		//do not add columns to data of table
		
		//create the table
		table = new JTable(data, columns);
		
		//set green line border to the table
		border = BorderFactory.createLineBorder(Color.GREEN, 2);
		table.setBorder(border);
		
		//set some font to the table
		tableFont = new Font("Arial", Font.BOLD, 20);
		table.setFont(tableFont);
		
		//set row height to 30 px
		table.setRowHeight(30);
		
		//set grid color to RED
		table.setGridColor(Color.RED);
		
		//get the table header into tableHeader
		tableHeader = table.getTableHeader();
		
		// ensures it uses the entire height even with few rows.
        table.setFillsViewportHeight(true);
		
		//add head of the table at top and remaining table below the top
		container.add("North", tableHeader);
		container.add("Center", table);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JTableDemo tableDemo = new JTableDemo();
		
		//set title and size
		tableDemo.setTitle("My Table");
		tableDemo.setSize(500, 400);
		
		//to open a maximized frame
		tableDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		tableDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		tableDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
