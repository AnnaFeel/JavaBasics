package com.syntax.class04;

import java.util.Scanner;

public class ExtraHw {

	public static void main(String[] args) {

		Scanner extra = new Scanner(System.in);

		System.out.println("Please enter your first number");
		int num1 = extra.nextInt();

		System.out.println("Please enter your second number");
		int num2 = extra.nextInt();

		System.out.println("Please enter your third number");
		int num3 = extra.nextInt();

		if (num1 >= num2) {
			if (num1 >= num3)
				System.out.println(num1 + " is the largest number.");
			else
				System.out.println(num3 + " is the largest number.");
		} else {
			if (num2 >= num3)
				System.out.println(num2 + " is the largest number.");
			else
				System.out.println(num3 + " is the largest number.");
		}

	}

}
