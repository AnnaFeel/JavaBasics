package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("___________TASK ONE_______________");
		
		System.out.println("Please enter your height in inches.");
		int height=input.nextInt();
		
		if (height<=60) {
			System.out.println("You are short person.");
		} else if (height>=60 && height<=72) {
			System.out.println("Your are medium height person.");
		} else if (height>=72) {
			System.out.println("You are tall person.");
		} else {
			System.out.println("Who are you? lol");
		}

		System.out.println("___________TASK TWO_______________");
		
		System.out.println("Please enter today's day of the week number");
		int day=input.nextInt();
		
		
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It's a weekday.");
		} else if (day==6 || day==7) {
			System.out.println("It's a weekend.");
		} else {
			System.out.println("Invalid day.");
		}
		
		System.out.println("                  ");
		System.out.println("___________TASK THREE_______________");
		
		System.out.println("Please enter a number.");
		int num=input.nextInt();
		
		if (num<=10 && num>=1) {
			System.out.println("You entered a small number.");
		}else if (num<=100 && num>=11) {
			System.out.println("You entered a mediun number.");
		}else if (num<=1000 && num>=101) {
			System.out.println("You entered a large number.");
		} else {
			System.out.println("You entered unknown number.");
		}
		
	}

}
