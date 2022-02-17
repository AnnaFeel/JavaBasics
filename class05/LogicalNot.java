package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {

		// Logical not is used to revert the condition

		boolean value = !true; // ! - means you are reverting the condition
		System.out.println(value);

		boolean traffic = false;

		if (!traffic) {
			System.out.println("I will come on time to work.");
		}
		
		boolean checkboxChecked=false;
		
		if (!checkboxChecked) {
			System.out.println("I will click on that checkbox.");
		}
		System.out.println("-----------THE END----------------");
	}

}
