package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		/* create a variable and assign value
		 * declare a variable and initialize
		 */
		//First way below
		int age=25;
		
		//another way of doing this below(two lines)
		int num; //declare variable
		num=10; //intialize it
		
		int n1, n2, n3; //all 3 variables are on the int type
		
		n1=10;
		n2=20;
		n3=30;
		
		//cmd+d --> will remove remove entire line
		
		age=26; //reassigning the value of variable age
		System.out.println(age);
		
		//structure for code is Type(int) then Name(box)=Value(number or word)
		//Java is case sensitive 
		
		//Java Rules:
		//Do not use keyword as identifier(name)
		//Do not start the name with numbers or special characters
		//Java allows to use _(underscore) or $(dollar sign) as name
		//Do not use space in name that consist with more then 1 word
		
		
		/* NOT rules but we prefer to follow
		 * variable and methods names should start with lower case
		 * give variable a meaningful name
		 * 
		 * class name should start with upper case
		 * 
		 * if name has two or more words --> follow camel casing
		 */

	}

}
