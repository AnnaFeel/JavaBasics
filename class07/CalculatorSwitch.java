package com.syntax.class07;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		char oper;

		System.out.println("Please enter your first number");
		num1 = input.nextInt();
		System.out.println("Please enter your second number");
		num2 = input.nextInt();
		System.out.println("What is the operator");
		oper = input.next().charAt(0);

		int result = 0;

		switch (oper) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2!=0) {
				result=num1 / num2;
			}else {
				System.out.println("We cannot devide a number by "+num2);
			}
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
System.out.println(result);
	}

}
