package com.app.samples.methodsinjava;

//demo of varargs method to find biggest number
public class DemoVariableArguments {

	//This is varargs method, It can accept arbitrary number of arguments.
	static int maximum(int ... x) {
		int maximum = x[0];
		//compare the biggest number with other numbers
		for(int i = 1; i < x.length; i++) {
			//If the biggest is less than other number then take that number as the biggest
			if(maximum < x[i]) {
				maximum = x[i];
			}
		}
		return maximum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pass an array of 5 elements to varargs method
		int arr1[] = {20, 10, 5, 35, 40};
		int result = maximum(arr1);
		System.out.println("maximum number : " + result);
		//pass an array of 3 elements to varargs method
		int arr2[] = {1, 2, 3};
		result = maximum(arr2);
		System.out.println("maximum number : " + result);
		//pass 2 individual elements to varargs method
		result = maximum(10, 30);
		System.out.println("maximum number : " + result);
	}

}
