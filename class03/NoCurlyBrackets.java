package com.syntax.class03;

public class NoCurlyBrackets {

	public static void main(String[] args) {

		boolean weekend = true;

		if (weekend) {

			System.out.println("I have Java classes at Syntax.");

		} else {

			System.out.println("I might have other classes or day off.");
			System.out.println("I will enjoy this day."); //without brackets this line wouldn't be recognised by Java
		}
		System.out.println("End of the code.");

	}

}

//without curly brackets Java can identify only one statement (one line) in if else scenario.
//always try to use curly brackets for if else scenario. 