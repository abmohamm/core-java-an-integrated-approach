package com.app.samples.arrays;

//TODO: Auto-generated Javadoc
/**
* The Class DemoThreeDimensionalArrays.
* @author: DreamTech press
* @version: 1.0
* @title: DreamTech project 
*/
public class DemoThreeDimensionalArrays {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int department, student, marks, total = 0;
		//	marks of each student in each array - department, student and marks
		int arr[][][] = {{{40, 41, 42}, {50, 51, 52}},	//	department-1
						 {{60, 61, 62}, {70, 71, 72}},	//	department-2
						 {{80, 81, 82}, {90, 91, 92}}};	//	department-3
		
		//	display marks from 3D array
		for(department = 0; department < 3; department++) {
			System.out.println("Department " + (department + 1) + " : ");
			for(student = 0; student < 2; student++) {
				System.out.print("Student " + (student + 1) + " marks : ");
				for(marks = 0; marks < 3; marks++) {
					System.out.print(arr[department][student][marks] + " ");
					total = total + arr[department][student][marks];
				}
				System.out.println("total : " + total);	//	display total marks of each student
				total = 0;
			}
			System.out.println();
		}
	}

}
