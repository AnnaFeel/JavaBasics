package com.syntax.class06;

import java.util.Scanner;

public class CleanExample {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter three numbers.");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		int largest = 0; //if we didn't finish our code with "else" we need to put = 0. 
		
		if (num1>num2 && num1>num3) {
			largest=num1;
		} else if (num2>num1 && num2>num3) {
			largest=num2;
		} else if (num3>num1 && num3>num2) {
			largest=num3;
		} 
		
		System.out.println(largest+" is the largest number");
		
		if (largest%2==0) {
			System.out.println(largest+" is even number");
		} else {
			System.out.println(largest+" is odd number");
		}

	}

}
