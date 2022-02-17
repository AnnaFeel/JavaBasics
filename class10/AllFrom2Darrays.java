package com.syntax.class10;

public class AllFrom2Darrays {

	public static void main(String[] args) {
		
		String [][] food = {
				{"redbull", "burger", "steak", "fries"},
				{"curry", "biriyani", "butter chicken"},
				{"noodles", "pad thai", "tom yum"},
				{"pizza", "pasta"}
		};
		
		for (int row=0; row<food.length; row++) {
			for (int column=0; column<food[row].length; column++) {
				System.out.print(food[row][column]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("    ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP     ");
		
		for(String[] cousine:food) {
			for(String f:cousine) {
				System.out.print(f+" ");
			}
			System.out.println(" ");
		}

	}

}
