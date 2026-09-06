//Tabbed Pane
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo extends JFrame {

	//container to hold tabs or components
	Container container;
	
	//tabbed pane
	JTabbedPane tabbedPane;
	
	JTabbedPaneDemo() {
		
		//create content pane
		container = this.getContentPane();
		
		//create tabbed pane - tabplacement can be TOP, BOTTOM, RIGHT or LEFT
		tabbedPane = new JTabbedPane();
		
		/*
		 * add two sheets, CapitalsPanel and CountriesPanel are classes which extends
		 * JPanel class and contain group of components
		 */
		tabbedPane.addTab("Capitals", new CapitalsPanel());
		tabbedPane.addTab("Countries", new CountriesPanel());
		
		//add the tabbed pane to content pane
		container.add(tabbedPane);
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JTabbedPaneDemo tabbedPaneDemo = new JTabbedPaneDemo();
		
		//set title and size
		tabbedPaneDemo.setTitle("My Table");
		tabbedPaneDemo.setSize(500, 400);
		
		//to open a maximized frame
		tabbedPaneDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		tabbedPaneDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		tabbedPaneDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

}

//The components of this class go into Capitals tab sheet
class CapitalsPanel extends JPanel {
	
	
	//buttons
	JButton washington, london, tokyo;
	
	CapitalsPanel() {
		
		//create 3 push buttons and add to panel
		washington = new JButton("Washington");
		london = new JButton("London");
		tokyo = new JButton("Tokyo");
		
		//add to panel
		this.add(washington);
		this.add(london);
		this.add(tokyo);
	}
}

//The components of this class appear in Countries tab sheet
class CountriesPanel extends JPanel {
	
	//check boxes
	JCheckBox unitedStates, britain, japan;
	
	CountriesPanel() {
		
		//create 3 check boxes and add to panel
		unitedStates = new JCheckBox("United States of America");
		britain = new JCheckBox("Britain");
		japan = new JCheckBox("Japan");
		
		//add to panel
		this.add(unitedStates);
		this.add(britain);
		this.add(japan);
	}
	
}
