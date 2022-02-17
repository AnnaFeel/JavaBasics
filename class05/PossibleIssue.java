package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Capturing values using next");

		String value = scan.next(); // nextInt(); nextDouble; nextBoolean(); next().charAt(0);
		System.out.println(value);

		System.out.println("Capturing values using nextLine");

		String anotherValue = scan.nextLine();
		System.out.println(anotherValue);

		System.out.println("End of the program");

		// Another example, where we need to add extra line for code to work.

		System.out.println("Please enter temperature");

		int temp = scan.nextInt();
		System.out.println(temp);
		
		scan.nextLine(); //adding this line will help to fix the code and enter data and also will resolve skipping

		System.out.println("Please enter the city");

		String city = scan.nextLine();
		System.out.println(city);

		System.out.println("End of the program");

	}

}
