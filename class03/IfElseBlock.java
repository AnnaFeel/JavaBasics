package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
	
		int num1=100;
		int num2=500;
		
		//which number is largest
		
		if (num1>num2) {
			
			System.out.println(num1+" is larger than "+num2);
			
		} else {
			
			System.out.println(num2+" is larger than "+num1);
		}

		int temp=45;
		
		//if temperature is more than 45 --> I am going for a walk
		// otherwise --> I am staying at home
		
		if (temp>=45) {
			System.out.println("I am going for a walk");
		} else {
			System.out.println("I am staying at home");
		}
		
		char gender='F';
		
		if (gender=='F') {
			
			System.out.println("Please use front of the train");
		} else {
			System.out.println("Please use back of the train"); //if we change char to M, then Java will execute else
		}
		
		
		
	}

}
