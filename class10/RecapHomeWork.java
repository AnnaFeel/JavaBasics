package com.syntax.class10;

public class RecapHomeWork {

	public static void main(String[] args) {
		// Another way of doing calculations array

		int[] numbers = { 15, 45, 10, 32 };
		int size = numbers.length;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
//another option with inhanced loop

		sum = 0;

		for (int num : numbers) {
			sum += num;
		}
		System.out.println("New sum is " + sum);
	}

}
