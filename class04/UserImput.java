package com.syntax.class04;

import java.util.Scanner; //we need to import Scanner into our class (need to type manually)

public class UserImput {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); //creating a Scanner (always need to type this line and line no 3)
		
		System.out.println("Please enter your name.");
		
		//if you want to capture single String -> use next();
		
		String name=input.next(); //this line is campturing input -> name and hit Enter
		
		System.out.println("Your name is "+name+".");
		
		//if you want to capture int --> use nextInt();
		
		System.out.println(name+" please enter your age.");
		
		int age=input.nextInt();
		
		System.out.println("Your name is "+name+" and your age is "+age+".");
		
		

	}

}
