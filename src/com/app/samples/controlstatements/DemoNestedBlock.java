package com.app.samples.controlstatements;

// TODO: Auto-generated Javadoc
/**
 * The Class DemoNestedBlock.
 * @author: DreamTech press
 * @version: 1.0
 * @title: DreamTech project 
 */
public class DemoNestedBlock {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		boolean x = true;
		bl1:{
			bl2:{
				bl3:{
					System.out.println("block3");
					if(x) {
						break bl3;
					}
				}
				System.out.println("block2");
				if(x) {
					break bl2;
				}
			}
			System.out.println("block1");
			if(x) {
				break bl1;
			}
		}
		System.out.println("Out of all blocks");
	}

}
