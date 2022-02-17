package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Sunday";
		if (day.equals("Saturday") || day.equals("Sunday")) {  // logical OR is || 
			System.out.println("I have java class today");
		}
		System.out.println("Code outside of if statement");

		/* with OR || at least one statement needs to be True
		 * that code would be executed. It's oposite to AND &&
		 */
		
		//based on a day let's define which class we have
		//if (monday or friday) --> there is no class today
		//else if (tuesday or wednesday) --> manual
		//else if (thursday) --> review class
		//else if (saturday or sunday) --> java class
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a day of the week.");
		
		String day1=input.nextLine();
		
		if (day1.equalsIgnoreCase("Monday") || day1.equalsIgnoreCase("Friday")) {
			System.out.println("The is no class today.");
		} else if (day1.equalsIgnoreCase("Tuesday") || day1.equalsIgnoreCase("Wednesday")) {
			System.out.println("You have manual testing calss today.");
		} else if (day1.equalsIgnoreCase("Thursday")) {
			System.out.println("You have a review class today.");
		} else if (day1.equalsIgnoreCase("Saturday") || day1.equalsIgnoreCase("Sunday")) {
			System.out.println("You have a Java class today.");
		} else {
			System.out.println("Invalid entry.");
		}
		
	}

}
