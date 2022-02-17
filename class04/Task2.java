package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		
		double rate=3.5;
		int price=50000;
		
		if (rate<=4.5) {
			System.out.println("You can buy a house");
			if (price<=50000) {
				System.out.println("You can pay cash.");
			}else {
				System.out.println("You should take a loan.");
			}
		}else {
			System.out.println("You can not buy a house");
		}

		//other way of doing this task below (teacher's sample)
		
		double mortgageRate=4.5;
		int mortgagePrice=51000;
		
		if (mortgageRate > 4.5) {
			System.out.println("You can not buy a house.");
		} else {
			System.out.println("You can buy a house.");
			
			if (mortgagePrice > 50000) {
				System.out.println("You should take a loan.");
			}else {
				System.out.println("You can pay cash.");
			}
			
		}
		
		
	}

}
