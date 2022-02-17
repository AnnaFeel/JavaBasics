package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("_________________TASK FOUR_________________");
		
		System.out.println("Please enter your current time, using 24 hour format");
		int time=input.nextInt();
		
		if (time<=11 && time>=1) {
			System.out.println("Good Morning!");
		} else if (time<=15 && time>=12) {
			System.out.println("Good Afternoon :)");
		} else if (time<=20 && time>=16) {
			System.out.println("Good Evening.");
		} else if (time<=24 && time>=21) {
			System.out.println("Good Night Zzz");
		}
		System.out.println("                                           ");
		System.out.println("_________________TASK FIVE_________________");
		
		System.out.println("Please enter your quiz score.");
		int quiz=input.nextInt();
		
		System.out.println("Thank you. Please enter your mid term score.");
		int midterm=input.nextInt();
		
		System.out.println("And finally, please enter your final score.");
		int finals=input.nextInt();
		
		int score=(quiz+midterm+finals)/3;
		
		if (score>=90) {
			System.out.println("Congratulations, your grade is A.");
		} else if (score>=70 && score<90) {
			System.out.println("Your grade is B.");
		} else if (score>=50 && score<70) {
			System.out.println("Your grade is C.");
		} else if (score<50) {
			System.out.println("Your grade is F");
		} else {
			System.out.println("Unfortunately, we can't calculate your grade at this momemnt.");
		}

	}

}
