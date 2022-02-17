package com.syntax.class02;

public class Differences {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="Bye";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b); //output will be 30HelloBye
		System.out.println(a+b+c+d); //output will be HelloBye1020 (because string first, that means that everything else will be treated as String as well.
		System.out.println(a+b+(c+d)); //but in this case, because we add brackets around int, then we have HelloBye30 

		
		/* Java reads the code from top to the bottom and from left to the right. 
		 * String is always stronger keyword then others. 
		 */
		
		int num=123;
		
		String num2="123";
		
		System.out.println(num+num2); //123123
		
		  int n1=200;
		  int n2=100;

	      int div=n1/n2;
	      
	      System.out.println(div);
	      
		
		
		
		
	}

}
