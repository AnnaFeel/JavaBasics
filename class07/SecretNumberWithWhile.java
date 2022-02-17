package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberWithWhile {

	public static void main(String[] args) {
		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		System.out.println("Please enter your number");
		guessNumber=scan.nextInt();
		
		while (guessNumber!=secretNumber) {
			System.out.println("Please enter a number to win");
			guessNumber=scan.nextInt();
		}
System.out.println("Congrats!");
	}

}
