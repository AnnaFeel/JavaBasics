package com.syntax.class02;

public class TaskTwo {
	public static void main(String[] args) {

		System.out.println("*TASK 1*");

		double n1 = 5.5;
		double n2 = 3.2;

		double sum = n1 + n2;
		double sub = n1 - n2;
		double mul = n1 * n2;
		double div = n1 / n2;

		System.out.println("The summation of 2 numbers " + n1 + " and " + n2 + " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " + n1 + " and " + n2 + " is equal to " + sub);
		System.out.println("The multiplication of 2 numbers " + n1 + " and " + n2 + " is equal to " + mul);
		System.out.println("The division of 2 numbers " + n1 + " and " + n2 + " is equal to " + div);

		System.out.println("*TASK 2*");

		double num = 3.9;
		double square = num * num;

		System.out.println("The square of the number " + num + " is " + square + ".");

		System.out.println("*TASK 3*");

		int width = 5;
		int height = 8;
		int perimeter = 2 * width + 2 * height;
		int area = width * height;

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area + ".");

	}

}
