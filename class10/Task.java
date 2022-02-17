package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// create an array and retrive all elements in reverse order

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println(" another way of doing this task ");

		int[] arrs = { 10, 20, 30, 40 };

		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[arrs.length - i - 1] + " ");
		}

	}

}
