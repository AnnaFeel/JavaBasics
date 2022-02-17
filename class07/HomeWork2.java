package com.syntax.class07;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		System.out.println("--- TASK TWO ---");
		
		Scanner input=new Scanner(System.in);
		
		int price=3;
		System.out.println("Please pay for a coffee");
		int pay;
		
		do {
			pay=input.nextInt();
			if (pay>price) {
				System.out.println("Please pay less money");
			} else if (pay<price) {
				System.out.println("Please pay more money"); 
				}
		} while (pay!=price);
		System.out.println("Please enjoy your coffee");
		
	}

}
