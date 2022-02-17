package com.syntax.class05;

import java.util.Scanner;

public class LastTask {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("_________________TASK SIX__________________");
		
		System.out.println("Please enter your birthday month.");
		String month=input.nextLine();
		
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December")) {
			System.out.println("Your birthday is in summer.");
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("Your birthday is in autumn.");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("Your birthday is in winter.");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("Your birthday is in spring.");
		}
 System.out.println("*please note, current analysis was made, using Southern Hemisphere seasons :P");
	}

}
