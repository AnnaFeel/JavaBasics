package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
		
		String name="Anna";
		
		String lastName="Filippova";
		
		long phoneNumber=923456890l;
		String mobileNumber="049-858-1495";
		
		//anything you put inside double quotes Java treats as characters
		
		System.out.println(mobileNumber);
		
		//syso+control+space --> autocomplete print statement
		
		System.out.println(lastName);
		
		//We can use plus sign inside the brakets to pring multiple items
		System.out.println(name+" "+lastName);
		
		//We can combine String to any other value(other string, double, int, etc)
		
		int age=25;
		
		System.out.println(name+" is "+age+" years old");
		
		String address="123 Test Street";
		
		System.out.println("I live on "+address+".");
	
		

	}

}
