package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("I am code inside for loop");
			if (i==3) { //the code would be running for 3 times instead of 5
				break;
			}
		}
		System.out.println("End of the code");
		
		boolean winter=true;
		int temp=0;
		
		while(winter) {
			System.out.println("It is cold");
			if (temp==20) {
				break;
			}
		}
	}

}
