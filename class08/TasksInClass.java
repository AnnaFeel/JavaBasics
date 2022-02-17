package com.syntax.class08;

import java.util.Scanner;

public class TasksInClass {

	public static void main(String[] args) {
		
		// Print numbers from 1 to 50 except those that are divisible by 3
		
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		//Create a program that will keep asking user to apply for a credit card. As
		//soon you get "yes" from a user program should stop asking.
		
		Scanner input=new Scanner(System.in);
		String answer=null;
		
		do {
			System.out.println("Do you want to apply for a credit card?");
			answer=input.nextLine();
			} while (!answer.equals("yes"));
		System.out.println("Congrats! Here your card");

	}

}
