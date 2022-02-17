package com.syntax.class04;

import java.util.Scanner; //cmd+shift+letter o (shortcut)

public class TakeImput {

	public static void main(String[] args) {

		// 1. create a Scanner and assign to a variable

		Scanner scan = new Scanner(System.in);

		// 2. specify instructions

		System.out.println("Please enter country where you are from.");

		// 3. we need to capture String value -> use next();

		String country = scan.next();
		System.out.println("You are from " + country);

		// if you are from USA -> you speak english

		if (country.equalsIgnoreCase("USA")) {            //if someone type in lowercase 
			System.out.println("You speak english.");
		} else if (country.equals("France")) {
			System.out.println("You speak french.");
		} else {
			System.out.println("I don't know which language you speak.");
		}

	}

}
