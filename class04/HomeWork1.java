package com.syntax.class04;

public class HomeWork1 {

	public static void main(String[] args) {

		System.out.println("________________TASK ONE____________________");

		int loanAmount = 200000;

		if (loanAmount <= 200000) {
			System.out.println("Congratulations, your loan application for " + loanAmount + " has been approved!");
		} else {
			System.out.println("Unfortunately, your loan application for " + loanAmount + " has been rejected.");
		}

		System.out.println("________________TASK TWO____________________");

		int age = 17;

		if (age >= 18) {
			System.out.println("Congratulations, your driver's license will be issued by DMV shortly.");
		} else {
			System.out.println(
					"We can't issue a driver's license due to a minimum age criteria. Please apply for a learners permit instead.");
		}
	}

}
