package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// Control Flow Statements:
		/*
		 * 1. conditional statements: if statement switch statement
		 * 
		 * 2. Loop statements - repeats block of code as long as condition is true.
		 * 
		 * 4 types of Loops in Java: while do while for loop enhanced for loop /
		 * advanced for loop / for each loop
		 * 
		 * while is loop --> repeats block of code as long as condition is true; Example
		 * below
		 */
		int time = 11;
		
		if (time < 12) {
			System.out.println("Morning");
		}
		
		System.out.println("----------------------------");
		
		while (time < 12) {
			System.out.println("Morning"); //infinite loop
			time++;
		}

	}

}
