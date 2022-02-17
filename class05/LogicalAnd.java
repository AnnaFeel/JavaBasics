package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean understandJava=true;
		boolean practice=true;
		boolean likeJava=true;
		
		if (likeJava && practice && understandJava) { //when we need to analyse multiple statements we use && - AND
			System.out.println("This is best combinatation");
			
			System.out.println("End of code");
			
			/*we want to compare 3 numbers and find the largest
			 * 
			 * if      num1 > num2 && num2 > num3 --> num1 us the largest
			 * else if num2 > num1 && num2 > num3 --> num2 is the largest
			 * else if num3 > num1 && num3 > num3 --> num3 is the largest 
			 */
			
			int num1=10;
			int num2=20;
			int num3=30;
			
			if (num1>num2 && num1>num3) {
				System.out.println(num1+" is the largest number");
			} else if (num2>num1 && num2>num3) {
				System.out.println(num2+" is the largest number");
			} else if (num3>num1 && num3>num2) {
				System.out.println(num3+" is the largest number");
			}
			
			
		}
 
	}

}
