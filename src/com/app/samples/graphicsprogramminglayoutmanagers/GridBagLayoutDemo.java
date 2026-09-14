//Grid bag layout demo
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {
	
	//container to hold components
	Container container;
	
	//gridbag-layout
	GridBagLayout gridBagLayout;
	
	//constraints
	GridBagConstraints gridBagConstraints;
	
	//buttons
	JButton submit, next, cancel, back, close;
	
	GridBagLayoutDemo() {
		
		//get the content-pane
		container = this.getContentPane();
		
		//create GridBagLayout object
		gridBagLayout = new GridBagLayout();
				
		//set gridbag-layout to container
		container.setLayout(gridBagLayout);
		
		//create GridBagConstraints object - default values
		gridBagConstraints = new GridBagConstraints();
		
		//create buttons
		submit = new JButton("submit");
		next = new JButton("next");
		cancel = new JButton("cancel");
		back = new JButton("back");
		close = new JButton("close");
		
		//fill-constraint to resize component according to space available in display area
		//stretch components and fill the display area horizontally
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		
		//display submit button at x, y coordinates - 0, 0
		//gridx, gridy represents row and column positions of component
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		//resize all components when the frame is resized
		//resizing components horizontally when the frame is resized
		gridBagConstraints.weightx = 0.7;
//		gridBagConstraints.weighty = 0.7;
		
		//set the above constraints to submit button
		gridBagLayout.setConstraints(submit, gridBagConstraints);
		
		//add submit button to container
		container.add(submit);
		
		//display next button at x, y coordinates - 1, 0
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		
		//remaining constraints applicable as set for submit button
		//set constraints to  next button
		gridBagLayout.setConstraints(next, gridBagConstraints);
		
		//add next button to container
		container.add(next);
		
		//display cancel button at x, y coordinates - 2, 0
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		
		//remaining constraints applicable as set for submit button
		//set constraints to cancel button
		gridBagLayout.setConstraints(cancel, gridBagConstraints);
		
		//add cancel button to container
		container.add(cancel);
		
		//display back button at x, y coordinates - 0, 1
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		
		//add 100 px height-wise
		gridBagConstraints.ipadx = 100;
		
		//let back button occupy 3 columns width-wise
		gridBagConstraints.gridwidth = 3;
		
		//remaining constraints are applicable as set for cancel, next, submit buttons
		gridBagLayout.setConstraints(back, gridBagConstraints);
		
		//add cancel button to container
		container.add(back);
		
		//display close button at x, y coordinates - 1, 2
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		
		//reset the ipady value to 0
		gridBagConstraints.ipady = 0;
		
		//leave space above the button for resizing vertically
		gridBagConstraints.weighty = 0.8;
		
		//position the close button starting from center of bottom line
		gridBagConstraints.anchor = GridBagConstraints.PAGE_END;
		
		//leave 50 px space at the bottom of close button
		gridBagConstraints.insets = new Insets(0, 0, 50, 0);
		
		//let the button occupy 2 columns width
		gridBagConstraints.gridwidth = 2;
		
		//remaining constraints are applicable as set for cancel, next, submit, back buttons
		//set constraints to close button
		gridBagLayout.setConstraints(close, gridBagConstraints);
		
		//add close button to container
		container.add(close);
				
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		GridBagLayoutDemo gridBagLayoutDemo = new GridBagLayoutDemo();
		
		//set title and size
		gridBagLayoutDemo.setTitle("Grid-Bag Layout");
		gridBagLayoutDemo.setSize(500, 400);
		
		//to open a maximized frame
		gridBagLayoutDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		gridBagLayoutDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		gridBagLayoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
