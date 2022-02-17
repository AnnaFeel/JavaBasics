package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String firstName="Anna";
		String lastName="Feel";
		char grade='A';
		String city="Sydney";
		String state="New South Wales";
		String phoneNumber="0498 581 495";
		
		System.out.println("My name is "+firstName+" and my last name is "+lastName+".");
		System.out.println("I am "+grade+" student.");
		System.out.println("I live in city "+city+" and state "+state+".");
		System.out.println("And my phone number is "+phoneNumber+".");
		
		city="Melbourne";
		state="Victoria";
		phoneNumber="0417 864 571";
		grade='B';
		
		System.out.println("My name is "+firstName+" and I moved to new city "+city+" and new state "+state+". My new phone number is "+phoneNumber+".");

	}

}
