package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		
		boolean diploma=true;
		
		if (diploma) {
			System.out.println("Congratulations!");
			double gpa=3.5; 
			
			if (gpa>=3.5) {
				System.out.println("You are eligble for scholarship.");
			}else {
				System.out.println("You should have studied harder.");
			}
			
		} else {
			System.out.println("You should get a degree.");
		}

	}

}
