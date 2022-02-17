package com.syntax.class09;

public class HomeWork1 {

	public static void main(String[] args) {

		System.out.println("---TASK ONE. OPTION 1---");
		String[] cars = { "BMW", "Porshe", "Acura", "Lexus", "Audi", "Tesla" };
		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		System.out.println("---TASK ONE. OPTION 2---");
		String[] cars2 = { "BMW", "Porshe", "Acura", "Lexus", "Audi", "Tesla" };
		for (int a = 0; a < cars2.length; a++) {
			System.out.print(cars2[a] + " ");
		}
		System.out.println();
		System.out.println("---TASK TWO. OPTION 1---");
		String[] animals = { "Dog", "Cat", "Bird", "Bunny", "Fish" };
		for (String animal : animals) {
			System.out.print(animal + " ");
		}
		System.out.println();
		System.out.println("---TASK TWO. OPTION 2---");
		String[] animals2 = { "Dog", "Cat", "Bird", "Bunny", "Fish" };
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals2[i] + " ");
		}
		System.out.println();
		System.out.println("---TASK THREE---");
		int[] numbers = { 10, 20, 30, 40, 50 };
		int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		System.out.println(sum);

		System.out.println();
		System.out.println("---TASK FOUR---");
		int[] num = { 1, 3, 5, 7, 12 };
		int large = 0;
		for (int b = 0; b < num.length; b++) {
			if (num[b] > large) {
				large = num[b];
			}
		}
		System.out.println("The largest number is " + large);
	}

}
