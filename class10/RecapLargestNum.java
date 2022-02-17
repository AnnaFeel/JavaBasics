package com.syntax.class10;

public class RecapLargestNum {

	public static void main(String[] args) {
		// Find the largest number from the array
		
		int[] number = { 15, 45, 10, 32 };
		int largest = number[0];
		
		for (int n=1; n<number.length; n++) { //we put n=1 because we don't want first number to campare itself.
			if (number[n] > largest) {
				largest=number[n];
			}
		}
		System.out.println(largest);
		
		largest = number[0];
		
		for (int num:number) {
			if (num>largest) {
				largest=num;
			}
		}
		System.out.println("New largest is "+largest);

	}

}
