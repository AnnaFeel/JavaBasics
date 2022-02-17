package com.syntax.class06;

import java.util.Scanner;

public class HomeWork {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		char grade=input.next().charAt(0);
		String result;
		
		switch(grade) {
		case 'A':
			result="Excellent";
			break;
		case 'B':
			result="Good";
			break;
		case'C':
			result="Average";
			break;
		case'D':
			result="Bad";
			break;
		default:
			result="Not Acceptable";
			break;
		}
		System.out.println("You entered "+grade+" which is "+result+" result.");
	}

}
