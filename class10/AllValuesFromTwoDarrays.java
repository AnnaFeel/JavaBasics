package com.syntax.class10;

public class AllValuesFromTwoDarrays {

	public static void main(String[] args) {
		
		int[][] numbers = { 
				{ 10, 20, 30 }, 
				{ 100, 200, 300, 400 }, 
				{ 1000, 2000 } };
		int size=numbers.length;//it give us number of rows we have in 2D Arrays
		System.out.println(size);
		
		int sizeOf1Array=numbers[0].length;
		System.out.println("The size of first array = "+sizeOf1Array);
		
		int sizeOf2Array=numbers[1].length;
		System.out.println("The size of second array = "+sizeOf2Array);
		
		//Please note, we don't have to have the same amount of arrays per each row. For example, third array has only two int stored.
		
		int sizeOf3Array=numbers[2].length;
		System.out.println("The size of third array = "+sizeOf3Array);
		
		//Retrieving all elements from 2D Array
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}

	}

}
