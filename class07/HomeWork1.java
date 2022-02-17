package com.syntax.class07;

public class HomeWork1 {

	public static void main(String[] args) {
		
		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		for (int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		System.out.println(" ");
		System.out.println("Print numbers from 100 to 1");
		for (int b=100; b>=1; b--) {
			System.out.print(b+" ");
		}
		System.out.println(" ");
		System.out.println("Print even numbers from 20 to 1 (first way)");
		for (int c=20; c>=1; c-=2) {
			System.out.print(c+" ");
		}
		System.out.println(" ");
		System.out.println("Print even numbers from 20 to 1 (second way)");
		for (int c=20; c>=1; c--) {
			if (c% 2 == 0)
				System.out.print(c+" ");
		}
		System.out.println(" ");
		System.out.println("Print odd numbers between 20 and 50 (first way)");
		for (int d=21; d<=50; d+=2) {
			System.out.print(d+" ");
		}
		System.out.println(" ");
		System.out.println("Print odd numbers between 20 and 50 (second way)");
		for (int d=21; d<=49; d++) {
			if (d%2!=0)
				System.out.print(d+" ");
		}
		
	}

}
