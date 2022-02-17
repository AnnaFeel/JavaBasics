package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {

		int age = 38;
		int weight = 100;

		if (age >= 18) {

			System.out.println("You are eligible, let's check weight.");

			if (weight >= 110) {
				System.out.println("You are eligible to donate the blood!");

			} else {
				System.out.println("Sorry, you are not eligible to donate the blood.");
			}
		} else {
			System.out.println("Sorry, you are not eligible by age requirement.");

		}

	}
}
