package com.syntax.class06;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your quiz score.");
		int quiz=input.nextInt();
		
		System.out.println("Thank you. Please enter your mid term score.");
		int midterm=input.nextInt();
		
		System.out.println("And finally, please enter your final score.");
		int finals=input.nextInt();
		
		int score=(quiz+midterm+finals)/3;
		
		char grade; //we need to declare that first
		
		if (score>=90) {
			grade='A'; //instead of pint out command and keep it inside the program
		} else if (score>=70 && score<90) {
			grade='B';
		} else if (score>=50 && score<70) {
			grade='C';
		} else {
			grade='F';
		} 
		
		System.out.println("Your grade is "+grade);
		
		//This way everything is cleaner and easier to understand.
		
		if (grade=='A' || grade=='B') {
			System.out.println("You are a good student.");
		} else {
			System.out.println("You should study more.");
			
		}


	}

}
