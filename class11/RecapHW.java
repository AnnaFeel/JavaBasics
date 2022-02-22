package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class RecapHW {

	public static void main(String[] args) {
		// Task one. 
		/*
		 * Create an array on int values using a scanner and calculate 
		 * the sum of all stored elements in that array.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the size of the array");
		//we are taking the size of the array from user
		int size = input.nextInt();
		System.out.println("Size of the array is "+size);
		int [] array = new int[size];
		//we are creating int array with mentioned by user size
		//now we need to fill our array with values from the user
		System.out.println("Please enter "+size+" elements");
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter the element for index "+i);
			array[i]=input.nextInt();
		}
		//now we need to print elements of the array outside the loop
		System.out.println(Arrays.toString(array));
		
		int sum=0;
		//now we need to calculate the sum
		for (int x=0; x<size; x++) { //here we could also use x<array.length
			sum+=array[x];
		}
		System.out.println("The sum of the arrays is "+sum);

	}

}
