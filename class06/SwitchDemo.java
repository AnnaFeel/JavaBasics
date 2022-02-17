package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		char choice = 'y';
		String answer;

		switch (choice) {

		case 'y':
			answer = "Yes";
			break;
		case 'n':
			answer = "No";
			break;
		case 'm':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
			break;
		}
		System.out.println(answer);
		
		System.out.println("---------------------");
		/* declare a variable to store a car
		 * based on the value of car define the country of origin
		 */
		
		String car="LADA";
		String country1=null;
		
		switch (car.toLowerCase()) {
		
		case "bmw":
			country1="Germany";
			break;
		case "ford":
			country1="USA";
			break;
		case "lada":
			country1="Russia";
			break;
		case "toyota":
			country1="Japan";
			break;
			//if we don't have the dafault we need to write it in the begining with "=null"
		}
		System.out.println(car+" is from "+country1);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your country plz: ");
		String country=input.nextLine();
		String language;
		
		switch(country.toLowerCase()) {
		
		case "usa":
			language="english";
			break;
		case "russia":
			language="russian";
			break;
		case "germany":
			language="deutsch";
			break;
		case "china":
			language="chinese";
			break;
			default:
				language="unknown";
		}
		input.close();
		System.out.println("In "+country+" people speak "+language);
		
	}

}
