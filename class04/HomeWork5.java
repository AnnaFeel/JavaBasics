package com.syntax.class04;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		
		Scanner bon=new Scanner(System.in);
		
		System.out.println("Please enter how many years you have been working in our company.");
		
		int years=bon.nextInt();
		
		if (years>=5) {
			System.out.println("Wow, you are eligible for years of service bonus!");
			System.out.println("Please enter your annual salary before taxes.");
			
			int salary=bon.nextInt();
			
			if (salary>50000) {
				System.out.println("Your bonus is equal to 5000! Well done, champ.");
			} else {
				System.out.println("Your bonus is equal to 3000, legend.");
			}
			
		} else {
			System.out.println("Ops, it looks like you are not eligible for years of service bonus yet.");
		}
		
	}

}
