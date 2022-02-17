package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		//first, we need to create a variable=box=container
		
		/* to create a variable we need:
		 * 1. specify data type
		 * 2. give a name
		 */
		
		byte box1=127;
		
		short box2=32767;
		
		int box3=327677865;
		
		long box4=405757575876546l;
		//we need to use letter "l" after number for long number
		
		//data types to represent decimals
		
		float price=12.99f;
		//to identify that it's float, put "f" at the end of number
		
		double price1=13.99; //most used
		
		//the difference between float and double is the size
		
		char gender='f';
		
		//to represent a single character we have char
		
		char currency='$';
		
		//to represent yes or no we have boolean 
		
		boolean snow=false;
		boolean tired=true;
		
		//I want to print 13.99
		System.out.println(price1);
		System.out.println("price1");
		System.out.println(currency);
		

	}

}
