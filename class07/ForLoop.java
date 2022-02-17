package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		
		/* 
		 * initialization
		 * condition
		 * increment or decrement
		 */
		
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("I  need to print numbers from 10 to 25");
		
		for (int a=10; a<=25; a++){
		System.out.print(a+" ");
		}
		System.out.println("I need to print numbers from 50 to 1");
		
		for(int b=50; b>=1; b--) {
			System.out.print(b+" ");
		}
	}

}
