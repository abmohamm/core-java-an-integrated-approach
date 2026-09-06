//Changing the look and feel of components
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LookFeel extends JFrame implements ItemListener {

	//button
	JButton button;
	
	//check box
	JCheckBox checkBox;
	
	//text field
	JTextField textField;
	
	//radio buttons for each look and feel
	JRadioButton metal, motif, windows;
	
	//button group
	ButtonGroup buttonGroup;
	
	//container to hold components
	Container container;
	
	LookFeel() {
	
		//create content pane
		container = this.getContentPane();
		
		//set empty layout to container
		container.setLayout(null);
		
		//create components
		button = new JButton("check");
		checkBox = new JCheckBox("test");
		textField = new JTextField("test data");
		metal = new JRadioButton("metal");
		motif = new JRadioButton("motif");
		windows = new JRadioButton("windows");
		
		//create button group object and add radio buttons to specify that they belong to same group
		buttonGroup = new ButtonGroup();
		buttonGroup.add(metal);
		buttonGroup.add(motif);
		buttonGroup.add(windows);
		
		//set the location of components in content pane
		//button location
		button.setBounds(100+550, 50+100, 75, 40);
		
		//check box location
		checkBox.setBounds(100+550, 100+100, 100, 40);
		
		//text field location
		textField.setBounds(100+550, 150+100, 100, 40);
		
		//radio button - metal location
		metal.setBounds(50+500, 250+100, 100, 30);
		
		//radio button - motif location
		motif.setBounds(150+500, 250+100, 100, 30);
		
		//rado button - windows location
		windows.setBounds(250+500, 250+100, 100, 30);
		
		//add the components to content pane
		container.add(button);
		container.add(checkBox);
		container.add(textField);
		container.add(metal);
		container.add(motif);
		container.add(windows);
		
		//add item listeners to radio buttons
		metal.addItemListener(this);
		motif.addItemListener(this);
		windows.addItemListener(this);
	
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		// TODO Auto-generated method stub
		try {
			//know which radio button is selected and accordingly change look and feel
			if(metal.getModel().isSelected()) {
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			} else if(motif.getModel().isSelected()) {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			} else if(windows.getModel().isSelected()) {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}
			
			//change the look and feel in the content pane
			SwingUtilities.updateComponentTreeUI(container);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		LookFeel lookFeel = new LookFeel();
		
		//set title and size
		lookFeel.setTitle("Look and Feel");
		lookFeel.setSize(500, 400);
		
		//to open a maximized frame
		lookFeel.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		lookFeel.setVisible(true);
		
		//close the application upon clicking on close button of frame
		lookFeel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
