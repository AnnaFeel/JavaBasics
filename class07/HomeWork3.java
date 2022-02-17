package com.syntax.class07;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		for (int qty = 1; qty <= 5; qty++) {

			System.out.println("Please enter your first name");
			String fname = input.next();

			System.out.println("Please enter your last name");
			String lname = input.next();

			System.out.println("Please enter your age");
			int age = input.nextInt();

			System.out.println("You name is " + fname + " " + lname + " and your are " + age + " years old");
		}

	}

}
