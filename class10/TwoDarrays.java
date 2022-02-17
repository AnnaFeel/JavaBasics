package com.syntax.class10;

public class TwoDarrays {

	public static void main(String[] args) {
		
		//2D Arrays is array of 1D arrays

		int[][] numbers = new int[3][4];

		// first row or first array

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		// second row or second array

		numbers[1][0] = 100;
		numbers[1][1] = 200;
		numbers[1][2] = 300;
		numbers[1][3] = 400;

		// third row or third array

		numbers[2][0] = 1000;
		numbers[2][1] = 2000;
		numbers[2][2] = 3000;
		numbers[2][3] = 4000;

		System.out.println(numbers[1][2]);
		System.out.println(numbers[0][1] + numbers[1][0]);

	}

}
