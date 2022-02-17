package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkImput {

	public static void main(String[] args) {

		Scanner hw = new Scanner(System.in);

		System.out.println("Please enter the city where you currently reside in.");

		String city = hw.nextLine();

		System.out.println("Thank you, please enter the current temperature in your city.");

		int temp1 = hw.nextInt();

		int temp2 = (temp1 - 32) * 5 / 9;

		System.out.println("The temperature on the city " + city + " is " + temp2 + " Celsius.");

	}

}
