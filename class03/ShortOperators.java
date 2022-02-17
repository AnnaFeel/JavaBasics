package com.syntax.class03;

public class ShortOperators {

	public static void main(String[] args) {

		// +, -, *, /, %

		int num = 100;

		num = num + 100;
		System.out.println(num);

		num += 100; // this exact means --> this num=num+100
		System.out.println(num);

		num -= 20;
		System.out.println(num);

		num /= 10; // shorter way of num=num/10
		System.out.println(num);

		num %= 3;
		System.out.println(num); //1

	}

}
