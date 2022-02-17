package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		System.out.println("Enter operation you would like to perform");
		char oper = input.next().charAt(0);

		int answer;

		if (oper == '+') {
			answer = num1 + num2;
		} else if (oper == '-') {
			answer = num1 - num2;
		} else if (oper == '*') {
			answer = num1 * num2;
		} else if (oper == '/') {
			answer = num1 / num2;
		} else {
			answer = 0;
		}
		System.out.println("Your answer is " + answer);
		System.out.println("-------------------");
		System.out.println("SAME TASK. OPTION 2");

		System.out.println("Enter the first number");
		int n1 = input.nextInt();
		System.out.println("Enter the second number");
		int n2 = input.nextInt();
		System.out.println("Enter operation you would like to perform");
		char operation = input.next().charAt(0);

		int result=0;

		switch (operation) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}
System.out.println("Your answer is "+result);
	}

}
