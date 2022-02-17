package com.syntax.class06;

import java.util.Scanner;

public class SwitchLimitations {

	public static void main(String[] args) {

		// String, byte, int, short, char

		/*
		 * Cannot switch on a value of type boolean. Only convertible int values,
		 * strings variables are permitted Can not work with boolean, double, float or
		 * long It also can't do Relational or Logical operations
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two strings");
		String word1=input.nextLine();
		String word2=input.nextLine();
		

		System.out.println("Please enter two numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		if (num1==num2 && word1.equalsIgnoreCase(word2)) {
			System.out.println("AND");
		} else if (num1==num2 || word1.equalsIgnoreCase(word2)) {
			System.out.println("OR");
		} else if (num1!=num2 && !word1.contentEquals(word2)) {
			System.out.println("NONE");
		} 
			
	}
}
