package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		// do whole loop --> repeats block of code as long as condition is true;
		
		int num=1;
		
		while (num<=5) { //is more used than do while
			System.out.println("Hello"); //5 time will be printed
			num++;
		}
		System.out.println("---------------------");
		int num1=1;
		
		do { //is less used than while
			System.out.println("Bye");
			num1++;
		} while (num1<=3);
		
		System.out.println("I want to print numbers from 1 to 30 using do while loop");
		
		int a=1;
		
		do {
			System.out.print(a+" ");
			a++;
		} while (a<=30);

	}

}
