package com.syntax.class04;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {

		Scanner homew = new Scanner(System.in);

		System.out.println("Do you have a credit card with us? Yes/No");

		String firstAnswer = homew.nextLine();

		if (firstAnswer.equals("No")) {
			System.out.println("Would you like to submit your application to get one? Yes/No");

			String secondAnswer = homew.nextLine();
			if (secondAnswer.equals("No")) {
				System.out.println("No worries. Have a lovely day!");
			} else {
				System.out.println("Please visit www.creditcards/for/dreamers.com to submit your application.");
			}
		} else {
			System.out.println("What is your current balance on the card?");
		}

		int balance = homew.nextInt();

		if (balance > 10000) {
			System.out.println("Please pay off your debt immidiately to avoid further penalties.");
		} else {
			System.out.println("Well done, you can spend more. Have a lovely day!");
		}

	}

}
