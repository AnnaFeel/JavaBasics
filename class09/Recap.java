package com.syntax.class09;

public class Recap {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) { //outer loop controls number of complete iteration of inner loop
			for (int j=1; j<=3; j++) { //inner loops always depends on outer loops 
				System.out.println("Hello"); // this line will be executed first three times
				break;
			}
			System.out.println("Good morning"); // then this line once and back to inner loop
		}
		
	}

}
