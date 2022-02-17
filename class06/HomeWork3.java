package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Do you have anything on sale at this moment?");
		boolean answer = input.nextBoolean();

		if (answer) {
			System.out.println("What is the price of the item?");
			int price1 = input.nextInt();
			int discount=0;
			int discount2 = 0;

			if (price1 < 20) {
				discount = 10;
				discount2 = (price1 * 10) / 100;
			} else if (price1 >= 20 && price1 < 100) {
				discount = 20;
				discount2 = (price1 * 10) / 100;
			} else if (price1 >= 100 && price1 < 500) {
				discount=30;
				discount2 = (price1 * 30) / 100;
			} else {
				discount=50;
				discount2 = (price1 * 50) / 100;
			}
			int price2 = price1 - discount2;
			System.out.println(
					"After discount " + discount + "% the price of the item reduce from " + price1 + " to " + price2);
		} else {
			System.out.println("I am not going for shopping.");
		}

	}

}
